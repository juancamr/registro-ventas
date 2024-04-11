package Modelo;

public class Cliente {
    private int idCliente;
    private int dni;
    private String nombre;
    private String telefono;
    private String Direccion;
    private String indicador;
    
    public Cliente() {}

    public int getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getDireccion() {
        return Direccion;
    }
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    public String getIndicador() {
        return indicador;
    }
    public void setIndicador(String indicador) {
        this.indicador = indicador;
    }
    
    
}
