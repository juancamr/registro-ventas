package DAO;

import utils.Messages;
import java.util.Date;
import Modelo.Reporte;
import Principal.Main;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class CRUDReporte extends ConectarBD {
    Date today = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    
    public boolean isNotReportToday() {
        String fecha = sdf.format(today);
        String consulta = "SELECT id_reporte FROM reporte where fecha=\"" + fecha + "\"";
        int idReporte = 0;
        try {
            rs = st.executeQuery(consulta);
            if (rs.next()) {
                idReporte = rs.getInt(1);
            }
            rs.close();
        } catch (Exception e) {
            Messages.show("Error, no se pudo comprobar el reporte" + e);
        }
        if (idReporte == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public void crearReporte() {
        String consulta = "INSERT INTO reporte(fecha, monto_total) VALUES(?, ?)";
        try {
            ps = connect.prepareStatement(consulta);
            ps.setString(1, sdf.format(today));
            ps.setDouble(2, 0);
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            Messages.show("Error, no se pudo crear el reporte" + e);
        }
    }
    
    public void actualizarMontoReporte(double monto) {
        String consulta = "UPDATE reporte SET monto_total=monto_total+? WHERE fecha=?";
        try {
            ps = connect.prepareStatement(consulta);
            ps.setDouble(1, monto);
            ps.setString(2, sdf.format(today));
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            Messages.show("Error, no se pudo actualizar el monto reporte" + e);
        }
    }
    
    public int obtenerActualIdReporte() {
        String consulta = "SELECT MAX(id_reporte) FROM reporte";
        try {
            rs = st.executeQuery(consulta);
            if (rs.next()) {
                return rs.getInt(1);
            }
            rs.close();
        } catch (Exception e) {
            Messages.show("Error, no se pudo obtener el actual id" + e);
        }
        return 0;
    }
    
    //metodo que se usa para obtener el id reporte de hoy
    public int obtenerIdReporteToday() {
        String fecha = sdf.format(new Date());
        String consulta = "SELECT id_reporte FROM reporte WHERE fecha=\"" + fecha + "\"";
        int idReporte = 0;
        try {
            rs = st.executeQuery(consulta);
            if (rs.next()) {
                idReporte = rs.getInt(1);
            }
            rs.close();
        } catch (Exception e) {
            System.out.println("Error, no se pudo obtener el id reporte del dia de hoy" + e);
        }
        return idReporte;
    }
    
    public void llenarListaReportes(String fechaInicial, String fechaFinal) {
        String consulta = "SELECT id_reporte, fecha, monto_total FROM reporte WHERE fecha BETWEEN \"" + fechaInicial + "\" AND \"" + fechaFinal + "\"";
        Main.listaReportes = new ArrayList<>();
        try {
            rs = st.executeQuery(consulta);
            while (rs.next()) {
                Reporte rep = new Reporte();
                rep.setIdReporte(rs.getInt(1));
                rep.setFecha(rs.getDate(2));
                rep.setMontoTotal(rs.getDouble(3));
                Main.listaReportes.add(rep);
            }
            rs.close();
        } catch (Exception e) {
            Messages.show("Error, no se pudo llenar la lista reportes" + e);
        }
    }
    
    public double obtenerMontoReporte(int idReporte) {
        String consulta = "SELECT monto_total FROM reporte WHERE id_reporte=" + idReporte;
        try {
            rs = st.executeQuery(consulta);
            if (rs.next()) {
                return rs.getDouble(1);
            }
            rs.close();
        } catch (Exception e) {
            Messages.show("Error, no se pudo obtener el actual monto reporte" + e);
        }
        return 0;
    }
}