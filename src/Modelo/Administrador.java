
package Modelo;

public class Administrador {
    String nombres;
    String username;
    String password;
    
    public Administrador() {}
    
    public Administrador(String nombres, String username, String password) {
        this.nombres = nombres;
        this.username = username;
        this.password = password;
    }
    
    public String getNombres() {
        return this.nombres;
    }
    
    public void setNombres(String nombre) {
        this.nombres = nombre;
    }
    
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
