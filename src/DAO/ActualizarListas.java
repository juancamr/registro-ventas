package DAO;

import Formato.Messages;
import Modelo.*;
import Principal.Main;
import java.util.ArrayList;

public class ActualizarListas extends ConectarBD {

    public ActualizarListas() {}
    
    public void actualizarListaProveedores() {
        Main.listaProveedores = new ArrayList<>();
        try {
            rs = st.executeQuery("select * from proveedor");
            while (rs.next()) {
                Proveedor prov = new Proveedor();
                prov.setIdProveedor(rs.getInt(1));
                prov.setNombre(rs.getString(2));
                prov.setTelefono(rs.getInt(3));
                prov.setRuc(rs.getString(4));
                Main.listaProveedores.add(prov);
            }
            rs.close();
        } catch (Exception e) {
            System.out.println("Error, no se pudo actualizar la lista proveedores " + e);
        }
    }
}
