package Modelo;

public class Proveedor {
    private int idProveedor;
    private String nombre;
    private int telefono;
    private String ruc;
    
    public Proveedor() {}

    public int getIdProveedor() {
        return idProveedor;
    }
    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public String getRuc() {
        return ruc;
    }
    public void setRuc(String ruc) {
        this.ruc = ruc;
    }
    
}
