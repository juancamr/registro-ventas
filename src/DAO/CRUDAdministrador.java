/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Modelo.Administrador;
import Modelo.Response;
import Principal.Main;
import utils.Messages;

public class CRUDAdministrador extends ConectarBD {
    
    public Response<Administrador> registrar(Administrador admin) {
        String con = "SELECT * FROM administrador WHERE username='<username>'";
        con = con.replace("<username>", admin.getUsername());
        try {
            rs = st.executeQuery(con);
            if (!rs.next()) {
                String consulta = "INSERT INTO administrador(nombres, username, password) VALUES(?, ?, ?)";
                try {
                    ps = connect.prepareStatement(consulta);
                    ps.setString(1, admin.getNombres());
                    ps.setString(2, admin.getUsername());
                    ps.setString(3, admin.getPassword());
                    ps.executeUpdate();
                    ps.close();
                    return new Response(true, "Registro exitoso", admin);
                } catch (Exception e) {
                    System.out.println(e);
                    return new Response(false, "Algo salio mal al registrar al administrador");
                }
            } else return new Response(false, "El nombre de usuario se encuentra en uso");
        } catch (Exception e) {
            System.out.println(e);
            return new Response(false, "Algo salio mal");
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