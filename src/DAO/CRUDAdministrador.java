/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Modelo.Administrador;
import Principal.Main;
import utils.Messages;

public class CRUDAdministrador extends ConectarBD {
    
    public boolean registrar(Administrador admin) {
        String consulta = "INSERT INTO administrador(nombres, username, password) VALUES(?, ?, ?)";
        try {
            ps = connect.prepareStatement(consulta);
            ps.setString(1, admin.getNombres());
            ps.setString(2, admin.getUsername());
            ps.setString(3, admin.getPassword());
            ps.executeUpdate();
            ps.close();
            Main.admin = admin;
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    
    public boolean verificar(String username, String password) {
        String consulta = "SELECT nombres FROM administrador WHERE username='<username>' AND password='<password>'";
        consulta = consulta.replace("<username>", username);
        consulta = consulta.replace("<password>", password);
        
        try {
            Administrador admin = new Administrador();
            rs = st.executeQuery(consulta);
            if (rs.next()) {
                admin.setNombres(rs.getString(1));
                Main.admin = admin;
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}