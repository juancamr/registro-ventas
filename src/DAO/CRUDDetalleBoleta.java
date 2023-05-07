package DAO;

import Formato.Messages;
import Modelo.DetalleBoleta;
import Principal.Main;
import java.util.ArrayList;

public class CRUDDetalleBoleta extends ConectarBD{
    
    public void llenarListaDetallesBoleta(int idBoleta) {
        CRUDProductos crudProductos = new CRUDProductos();
        Main.listaDetallesBoleta = new ArrayList<>();
        String consulta = "SELECT id_producto, cantidad, monto_total FROM detalle_boleta WHERE id_boleta=" + idBoleta;
        try {
            rs = st.executeQuery(consulta);
            while (rs.next()) {
                DetalleBoleta det = new DetalleBoleta();
                det.setProducto(crudProductos.obtenerProducto(rs.getInt(1)));
                det.setCantidad(rs.getInt(2));
                det.setTotal(rs.getDouble(3));
                Main.listaDetallesBoleta.add(det);
            }
            rs.close();
        } catch (Exception e) {
            Messages.show("Error, no se pudo obtener el detalle de boleta" + e);
        }
    }
    
    public void ingresarDetalleBoleta(DetalleBoleta det) {
        String consulta = "INSERT INTO detalle_boleta(id_producto, id_boleta, cantidad, monto_total) values(?, ?, ?, ?)";
        try {
            ps = connect.prepareStatement(consulta);
            ps.setInt(1, det.getProducto().getIdProducto());
            ps.setInt(2, det.getIdBoleta());
            ps.setInt(3, det.getCantidad());
            ps.setDouble(4, det.getTotal());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            Messages.show("Error, no se pudo ingresar el detalle boleta" + e);
        }
    }
}
