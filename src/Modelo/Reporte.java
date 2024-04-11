package Modelo;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Reporte {
    private int idReporte;
    private Date fecha;
    private double montoTotal;
    
    public Reporte() {}

    public int getIdReporte() {
        return idReporte;
    }
    public void setIdReporte(int idReporte) {
        this.idReporte = idReporte;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public double getMontoTotal() {
        return montoTotal;
    }
    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }
    
    public Object[] registrarDatos() {
        Object[] lista = {idReporte, new SimpleDateFormat("dd-MM-yyyy").format(fecha), montoTotal};
        return lista;
    }
    
}
