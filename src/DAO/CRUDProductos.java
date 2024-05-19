package DAO;
import utils.Messages;
import Modelo.Producto;
import Principal.Main;
import java.util.List;
import java.util.ArrayList;

public class CRUDProductos extends ConectarBD {
    
    public CRUDProductos() {}
    
    public void ingresarProducto (Producto prod) {
        //metodo que ingresa un nuevo producto a la base de datos
        String consulta = "INSERT INTO producto(id_proveedor, codigo, marca, nombre, costo_unidad, precio_venta, stock, indicador) VALUES(?, ?, ?, ?, ?, ?, ?, 'S')";
        try {
            ps = connect.prepareStatement(consulta);
            ps.setInt(1, prod.getProveedor().getIdProveedor());
            ps.setString(2, prod.getCodigo());
            ps.setString(3, prod.getMarca());
            ps.setString(4, prod.getNombre());
            ps.setDouble(5, prod.getCostoUnidad());
            ps.setDouble(6, prod.getPrecioVenta());
            ps.setInt(7, prod.getStock());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            Messages.show("Ya existe un repuesto registrado con ese codigo");
        }
    }
    
    public void eliminarProducto (int idProducto) {
        //metodo que actualiza el indicador de visibilidad
        String consulta = "UPDATE producto SET indicador='N' WHERE id_producto=?";
        try {
            ps = connect.prepareStatement(consulta);
            ps.setInt(1, idProducto);
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            Messages.show("Error, no se pudo eliminar el producto" + e);
        }
    }
    
    public int obtenerIdProducto (String codigo) {
        //metodo que retorna el id producto haciendo la busqueda con el codigo de producto
        String consulta = "SELECT id_producto FROM producto WHERE codigo=\"" + codigo + "\"";
        try {
            rs = st.executeQuery(consulta);
            if (rs.next()) {
                return rs.getInt(1);
            }
            rs.close();
        } catch (Exception e) {
            Messages.show("Error, no se pudo obtener el id del producto..." + e);
        }
        return 0;
    }
    
    public Producto obtenerProducto (int idProducto) {
        //metodo que retorna un producto haciendo la busqueda con el codigo de producto
        String consulta = "SELECT id_proveedor, codigo, marca, nombre, costo_unidad, precio_venta, stock FROM producto WHERE indicador='S' AND id_producto=" + idProducto;
        Producto prod = null;
        try {
            prod = new Producto();
            CRUDProveedor crud = new CRUDProveedor();
            rs = st.executeQuery(consulta);
            if (rs.next()) {
                prod.setIdProducto(idProducto);
                prod.setProveedor(crud.obtenerProveedor(rs.getInt(1)));
                prod.setCodigo(rs.getString(2));
                prod.setMarca(rs.getString(3));
                prod.setNombre(rs.getString(4));
                prod.setCostoUnidad(rs.getDouble(5));
                prod.setPrecioVenta(rs.getDouble(6));
                prod.setStock(rs.getInt(7));
            }
            rs.close();
        } catch (Exception e) {
            Messages.show("Error, no se pudo obtener el producto..." + e);
        }
        return prod;
    }
    
    public void actualizarProducto (Producto prod) {
        //metodo que edita/actualiza los datos de un producto
        String consulta = "UPDATE producto SET id_proveedor=?, codigo=?, marca=?, nombre=?, costo_unidad=?, precio_venta=?, stock=? WHERE id_producto=?";
        try {
            ps = connect.prepareStatement(consulta);
            ps.setInt(1, prod.getProveedor().getIdProveedor());
            ps.setString(2, prod.getCodigo());
            ps.setString(3, prod.getMarca());
            ps.setString(4, prod.getNombre());
            ps.setDouble(5, prod.getCostoUnidad());
            ps.setDouble(6, prod.getPrecioVenta());
            ps.setInt(7, prod.getStock());
            ps.setInt(8, prod.getIdProducto());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            Messages.show("Error, no se pudo actualizar el producto" + e);
        }
    }
    
    public void ingresarInventario (int idProducto, int stock) {
        //metodo que agrega stock a un producto existente
        String consulta = "UPDATE producto SET stock=stock+? WHERE id_producto=?";
        try {
            ps = connect.prepareStatement(consulta);
            ps.setInt(1, stock);
            ps.setInt(2, idProducto);
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            Messages.show("Error, no se pudo ingresar stock" + e);
        }
    }
    
    public void bajarInventario (int idProducto, int stock) {
        String consulta = "UPDATE producto SET stock=stock-? WHERE id_producto=?";
        try {
            ps = connect.prepareStatement(consulta);
            ps.setInt(1, stock);
            ps.setInt(2, idProducto);
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            Messages.show("Error, no se pudo bajar el inventario" + e);
        }
    }
    
    public boolean isEnoughInventory(int idProducto, int stock) {
        String consulta = "SELECT stock FROM producto WHERE id_producto=" + idProducto;
        int stockRecogido = 0;
        try {
            rs = st.executeQuery(consulta);
            if (rs.next()) {
                stockRecogido = rs.getInt(1);
            }
            rs.close();
        } catch (Exception e) {
            System.out.println("Error, no se pudo comprobar inventario" + e);
        }
        if (stockRecogido >= stock) {
            return true;
        } else {
            return false;
        }
    }
    
    public void llenarListaProductosSinStock() {
        Main.listaProductosSinStock = new ArrayList();
        String consulta = "SELECT codigo, nombre, stock FROM producto WHERE stock<" + 2;
        try {
            rs = st.executeQuery(consulta);
            while (rs.next()) {
                Producto prod = new Producto();
                prod.setCodigo(rs.getString(1));
                prod.setNombre(rs.getString(2));
                prod.setStock(rs.getInt(3));
                Main.listaProductosSinStock.add(prod);
            }
            rs.close();
        } catch (Exception e) {
            System.out.println("Error, no se pudo llenar la lista de productos sin stock " + e);
        }
    }
    
    public int obtenerCantidadRepuestos() {
        String consulta = "SELECT COUNT(id_producto) FROM producto WHERE indicador='S'";
        try {
            rs = st.executeQuery(consulta);
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            System.out.println("No se pudo obtener la cantidad de repuestos " + e);
        }
        return 0;
    }
    
    public List<Producto> getAllProducts() {
        List<Producto> listaProductos = new ArrayList();
        String consulta = "SELECT * FROM producto";
        
        try {
            CRUDProveedor crud = new CRUDProveedor();
            rs = st.executeQuery(consulta);
            while (rs.next()) {
                Producto prod = new Producto();
                prod.setIdProducto(rs.getInt(1));
                prod.setProveedor(crud.obtenerProveedor(rs.getInt(2)));
                prod.setCodigo(rs.getString(3));
                prod.setMarca(rs.getString(4));
                prod.setNombre(rs.getString(5));
                prod.setCostoUnidad(rs.getDouble(6));
                prod.setPrecioVenta(rs.getDouble(7));
                prod.setStock(rs.getInt(8));
                listaProductos.add(prod);
            }
            rs.close();
        } catch (Exception e) {
            Messages.show("Error, no se pudo obtener el producto..." + e);
        }
        
        return listaProductos;
    }
    
    public List<Producto> findProductByNameOrCode(String query) {
        List<Producto> listaProductos = new ArrayList();
        String consulta = "SELECT * FROM producto WHERE nombre LIKE '%<query>%' OR codigo LIKE '%<query>%'";
        consulta = consulta.replace("<query>", query);
        CRUDProveedor crud = new CRUDProveedor();
        
        try {
            rs = st.executeQuery(consulta);
            while (rs.next()) {
                Producto prod = new Producto();
                prod.setIdProducto(rs.getInt(1));
                prod.setProveedor(crud.obtenerProveedor(rs.getInt(2)));
                prod.setCodigo(rs.getString(3));
                prod.setMarca(rs.getString(4));
                prod.setNombre(rs.getString(5));
                prod.setCostoUnidad(rs.getDouble(6));
                prod.setPrecioVenta(rs.getDouble(7));
                prod.setStock(rs.getInt(8));
                listaProductos.add(prod);
            }
            rs.close();
        } catch (Exception e) {
            Messages.show("We can't search in products, query by name or code");
        }
        
        return listaProductos;
    }
}
