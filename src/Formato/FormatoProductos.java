package Formato;
import DAO.*;
import Vista.*;
import Modelo.*;
import Principal.Main;
import com.mysql.cj.conf.IntegerProperty;
import java.awt.BorderLayout;
import javax.swing.JComboBox;

public class FormatoProductos {
    
     public static void Presentacion(VentanaPrincipal vista, PanelProducto panel){
        panel.setSize(840, 790);
        panel.setLocation(0, 0);        
        vista.content.removeAll();
        vista.content.add(panel, BorderLayout.CENTER);
        vista.content.revalidate();
        vista.content.repaint();
    }
    
    public static void cargarComboProveedores(JComboBox combo) {
        ActualizarListas al = new ActualizarListas();
        al.actualizarListaProveedores();
        for (int i = 0; i < Main.listaProveedores.size(); i++) {
            combo.addItem(Main.listaProveedores.get(i).getNombre());
        }
    }
    
    public static boolean isNotEverythingFull(PanelProducto panel) {
        boolean codigo = panel.jtxtCodigoRegistro.getText().equals("");
        boolean nombre = panel.jtxtNombreRegistro.getText().equals("");
        boolean marca = panel.jcbxMarcaRegistro.getSelectedItem().toString().equals("");
        boolean proveedor = panel.jcbxProveedorRegistro.getSelectedItem().toString().equals("");
        boolean stock = panel.jtxtStockRegistro.getText().equals("");
        boolean costo = panel.jtxtCostoRegistro.getText().equals("");
        boolean precio = panel.jtxtPrecioVentaRegistro.getText().equals("");
        if (codigo || nombre || marca || proveedor || stock || costo || precio) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void isFocusable(PanelProducto panel, boolean flag) {
        panel.jtxtNombreBusqueda.setFocusable(flag);
        panel.jcbxMarcaBusqueda.setEnabled(flag);
        panel.jcbxProveedorBusqueda.setEnabled(flag);
        panel.jtxtCostoBusqueda.setFocusable(flag);
        panel.jtxtPrecioVentaBusqueda.setFocusable(flag);
        panel.jtxtStockBusqueda.setFocusable(flag);
        panel.jbtnBuscarProducto.setEnabled(!flag);
    }
     
    public static void leerProductoBusqueda(PanelProducto panel, Producto pro){
        CRUDProveedor crud = new CRUDProveedor();
        pro.setCodigo(panel.jtxtCodigoBusqueda.getText());
        pro.setMarca(panel.jcbxMarcaBusqueda.getSelectedItem().toString());
        int idProveedor = crud.obtenerIdProveedor(panel.jcbxProveedorBusqueda.getSelectedItem().toString());
        pro.setProveedor(crud.obtenerProveedor(idProveedor));
        pro.setNombre(panel.jtxtNombreBusqueda.getText());
        pro.setCostoUnidad(Double.parseDouble(panel.jtxtCostoBusqueda.getText()));
        pro.setPrecioVenta(Double.parseDouble(panel.jtxtPrecioVentaBusqueda.getText()));
        pro.setStock(Integer.parseInt(panel.jtxtStockBusqueda.getText()));
    }
    
    public static Producto leerProductoRegistro(PanelProducto panel){
        Producto pro= new Producto();
        CRUDProveedor crud = new CRUDProveedor();
        CRUDProductos crudp = new CRUDProductos();
        pro.setCodigo(panel.jtxtCodigoRegistro.getText());
        pro.setNombre(panel.jtxtNombreRegistro.getText());
        pro.setMarca(panel.jcbxMarcaRegistro.getSelectedItem().toString());
        int idProveedor = crud.obtenerIdProveedor(panel.jcbxProveedorRegistro.getSelectedItem().toString());
        pro.setProveedor(crud.obtenerProveedor(idProveedor));
        pro.setStock(Integer.parseInt(panel.jtxtStockRegistro.getText()));
        pro.setCostoUnidad(Double.parseDouble(panel.jtxtCostoRegistro.getText()));
        pro.setPrecioVenta(Double.parseDouble(panel.jtxtPrecioVentaRegistro.getText()));
        return pro;
    }

    //va limpiar cada vez que se inserte o actualize un registro
    public static void limpiarEntradas(PanelProducto panel){
        panel.jtxtCodigoRegistro.setText("");
        panel.jtxtNombreRegistro.setText("");
        panel.jcbxMarcaRegistro.setSelectedIndex(0);
        panel.jcbxProveedorRegistro.setSelectedIndex(0);
        panel.jtxtCostoSinIgvRegistro.setText("");
        panel.jtxtCostoRegistro.setText("");
        panel.jtxtPrecioVentaRegistro.setText("");
        panel.jtxtStockRegistro.setText("");
        panel.jtxtCodigoRegistro.requestFocus();
    }
    
    public static void limpiarEntradasBusqueda(PanelProducto panel){
        panel.jtxtCodigoBusqueda.setText("");
        panel.jtxtNombreBusqueda.setText("");
        panel.jcbxMarcaBusqueda.setSelectedIndex(0);
        panel.jcbxProveedorBusqueda.setSelectedIndex(0);
        panel.jtxtCostoBusqueda.setText("");
        panel.jtxtPrecioVentaBusqueda.setText("");
        panel.jtxtStockBusqueda.setText("");
        panel.jtxtCodigoBusqueda.requestFocus();
    }
    
    public static void limpiarEntradasAumento(PanelProducto panel) {
        panel.jtxtCodigoAumento.setText("");
        panel.jtxtStockAumento.setText("");
        panel.jtxtCodigoAumento.requestFocus();
    }
}