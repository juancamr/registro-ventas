package DAO;
import java.sql.*;

public class ConectarBD {
    public Connection connect;
    public Statement st;
    public PreparedStatement ps;
    public ResultSet rs;
    
    public ConectarBD() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://172.17.0.2:3306/servimotos", "root", "dev");
            st = connect.createStatement();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("No se pudo realizar la conexion a la base de datos");
            System.exit(0);
        }
    }
}
