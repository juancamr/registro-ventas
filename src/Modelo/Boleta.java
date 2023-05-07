package Modelo;

import java.text.DecimalFormat;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Boleta implements DatosTienda {
    private int idBoleta;
    private int idReporte;
    private Cliente cliente;
    private Date fecha;
    private double montoTotal;
    
    public Boleta() {}

    public int getIdBoleta() {
        return idBoleta;
    }
    public void setIdBoleta(int idBoleta) {
        this.idBoleta = idBoleta;
    }
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
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cli) {
        this.cliente = cli;
    }
    public double getMontoTotal() {
        return montoTotal;
    }
    public void setMontoTotal(double monto_total) {
        this.montoTotal = monto_total;
    }
    
    public Object[] registrarDatos() {
        Object[] lista = {new DecimalFormat("0000000000").format(idBoleta), new SimpleDateFormat("dd-MM-yyyy").format(fecha), montoTotal};
        return lista;
    }
    
    public Object[] registrarDatosTablaReporte() {
        Object[] lista = {new DecimalFormat("0000000000").format(idBoleta), cliente.getNombre(), montoTotal};
        return lista;
    }
}
