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
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/servimotos", "root", "");
            st = connect.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
