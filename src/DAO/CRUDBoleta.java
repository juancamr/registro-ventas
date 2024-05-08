package DAO;

import utils.Messages;
import Modelo.Boleta;
import Principal.Main;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class CRUDBoleta extends ConectarBD {
    
    public Boleta obtenerBoleta(int idBoleta) {
        CRUDClientes crudClientes = new CRUDClientes();
        String consulta = "SELECT id_cliente, id_reporte, monto_total, fecha FROM boleta WHERE id_boleta=" + idBoleta;
        Boleta bol = null;
		String saludo = "holamundo";
        try {
            rs = st.executeQuery(consulta);
            bol = new Boleta();
            if (rs.next()) {
                bol.setIdBoleta(idBoleta);
                bol.setCliente(crudClientes.obtenerCliente(rs.getInt(1)));
                bol.setIdReporte(rs.getInt(2));
                bol.setMontoTotal(rs.getDouble(3));
                bol.setFecha(rs.getDate(4));
            }
            rs.close();
        } catch (Exception e) {
            Messages.show("Error, no se pudo obtener la boleta" + e);
        }
        return bol;
    }
    
    public void ingresarBoleta(Boleta bol) {
        //metodo que ingresa una boleta a la base de datos
        String consulta = "INSERT INTO boleta(id_cliente, id_reporte, monto_total, fecha) VALUES(?, ?, ?, ?)";
        try {
            ps = connect.prepareStatement(consulta);
            ps.setInt(1, bol.getCliente().getIdCliente());
            ps.setInt(2, bol.getIdReporte());
            ps.setDouble(3, bol.getMontoTotal());
            ps.setString(4, new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            Messages.show("Error, no se pudo registrar la boleta " + e);
        }
    }
    
    public int obtenerActualIdBoleta() {
        String consulta = "SELECT MAX(id_boleta) FROM boleta";
        try {
            rs = st.executeQuery(consulta);
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            Messages.show("Error, no se pudo obtener el actual id boleta");
        }
        return 0;
    }
    
    public void llenarListaBoletas(int idCliente) {
        String consulta = "SELECT id_boleta, id_reporte, monto_total, fecha FROM boleta WHERE id_cliente=" + idCliente;
        try {
            Main.listaBoletas = new ArrayList<>();
            rs = st.executeQuery(consulta);
            while (rs.next()) {
                Boleta bol = new Boleta();
                bol.setIdBoleta(rs.getInt(1));
                bol.setIdReporte(rs.getInt(2));
                bol.setMontoTotal(rs.getDouble(3));
                bol.setFecha(rs.getDate(4));
                Main.listaBoletas.add(bol);
            }
        } catch (Exception e) {
            Messages.show("Error, no se pudo obtener la lista de boletas" + e);
        }
    }
    
    public void llenarListaBoletasParaReporte(int idReporte) {
        String consulta = "SELECT id_boleta, id_cliente, monto_total, fecha FROM boleta WHERE id_reporte=" + idReporte;
        CRUDClientes crud = new CRUDClientes();
        try {
            Main.listaBoletas = new ArrayList<>();
            rs = st.executeQuery(consulta);
            while (rs.next()) {
                Boleta bol = new Boleta();
                bol.setIdBoleta(rs.getInt(1));
                bol.setCliente(crud.obtenerCliente(rs.getInt(2)));
                bol.setMontoTotal(rs.getDouble(3));
                bol.setFecha(rs.getDate(4));
                Main.listaBoletas.add(bol);
            }
        } catch (Exception e) {
            Messages.show("Error, no se pudo obtener la lista de boletas" + e);
        }
    }
}