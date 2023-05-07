package Modelo;

public class Producto {
    private int idProducto;
    private Proveedor proveedor;
    private String codigo;
    private String nombre;
    private String marca;
    private double costoUnidad;
    private double precioVenta;
    private int stock;
    private String indicador;
    
    public Producto() {}

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getIdProducto() {
        return idProducto;
    }
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    public Proveedor getProveedor() {
        return proveedor;
    }
    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigoProducto) {
        this.codigo = codigoProducto;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombreProducto) {
        this.nombre = nombreProducto;
    }
    public double getCostoUnidad() {
        return costoUnidad;
    }
    public void setCostoUnidad(double costoUnidad) {
        this.costoUnidad = costoUnidad;
    }
    public double getPrecioVenta() {
        return precioVenta;
    }
    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public String getIndicador() {
        return indicador;
    }
    public void setIndicador(String indicador) {
        this.indicador = indicador;
    }
    
    public Object[] registrarDatos() {
        Object[] lista = {nombre, precioVenta};
        return lista;
    }
    public Object[] registroDatosStock() {
        Object[] lista = {codigo, nombre, stock};
        return lista;
    }
}
