package Modelo;

public class DetalleBoleta {
    private int idDetalle;
    private Producto producto;
    private int idBoleta;
    private int cantidad;
    private double total;
    
    public DetalleBoleta() {}

    public int getIdDetalle() {
        return idDetalle;
    }
    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }
    public int getIdBoleta() {
        return idBoleta;
    }
    public void setIdBoleta(int idBoleta) {
        this.idBoleta = idBoleta;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    public Object[] registroDatos() {
        Object[] lista = {cantidad, producto.getNombre(), producto.getPrecioVenta(), total};
        return lista;
    }
    
}
