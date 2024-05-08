package DAO;
import utils.Messages;
import Modelo.*;

public class CRUDProveedor extends ConectarBD {
    
    public CRUDProveedor() {}
    
    public Proveedor obtenerProveedor(int idProveedor) {
        String consulta = "SELECT id_proveedor, nombre, telefono, ruc FROM proveedor WHERE id_proveedor=" + idProveedor;
        Proveedor prov = null;
        try {
            rs = st.executeQuery(consulta);
            prov = new Proveedor();
            if (rs.next()) {
                prov.setIdProveedor(rs.getInt(1));
                prov.setNombre(rs.getString(2));
                prov.setTelefono(rs.getInt(3));
                prov.setRuc(rs.getString(4));
            }
            rs.close();
        } catch (Exception e) {
            Messages.show("Error, no se pudo obtener el proveedor " + e);
        }
        return prov;
    }
    
    public int obtenerIdProveedor(String nombre) {
        String consulta = "SELECT id_proveedor FROM proveedor WHERE nombre=\"" + nombre + "\"";
        try {
            rs = st.executeQuery(consulta);
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            Messages.show("Error, no se pudo obtener el id del proveedor " + e);
        }
        return 0;
    }
    
}
