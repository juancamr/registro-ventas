package DAO;

import Formato.Messages;
import Modelo.Cliente;

public class CRUDClientes extends ConectarBD {
    
    public void ingresarCliente(Cliente cli) {
        String consulta = "INSERT INTO cliente(dni, nombre, telefono, direccion, indicador) VALUES(?, ?, ?, ?, 'S')";
        try {
            ps = connect.prepareStatement(consulta);
            ps.setInt(1, cli.getDni());
            ps.setString(2, cli.getNombre());
            ps.setString(3, cli.getTelefono());
            ps.setString(4, cli.getDireccion());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            Messages.show("Ya existe un cliente registrado con ese DNI");
        }
    }
    
    public int obtenerIdCliente(int dni) {
        String consulta = "SELECT id_cliente FROM cliente WHERE dni=" + dni;
        try {
            rs = st.executeQuery(consulta);
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            Messages.show("Error, no se pudo obtener el id cliente" + e);
        }
        return 0;
    }
    public Cliente obtenerCliente(int idCliente) {
        Cliente cli = null;
        String consulta = "SELECT dni, nombre, telefono, direccion FROM cliente WHERE indicador='S' AND id_cliente=" + idCliente;
        try {
            cli = new Cliente();
            rs = st.executeQuery(consulta);
            if (rs.next()) {
                cli.setIdCliente(idCliente);
                cli.setDni(rs.getInt(1));
                cli.setNombre(rs.getString(2));
                cli.setTelefono(rs.getString(3));
                cli.setDireccion(rs.getString(4));
            }
        } catch (Exception e) {
            Messages.show("Error, no se pudo obtener el cliente" + e);
        }
        return cli;
    }
    
    public void actualizarCliente(Cliente cli) {
        String consulta = "UPDATE cliente SET dni=?, nombre=?, direccion=?, telefono=? WHERE id_cliente=?";
        try {
            ps = connect.prepareStatement(consulta);
            ps.setInt(1, cli.getDni());
            ps.setString(2, cli.getNombre());
            ps.setString(3, cli.getDireccion());
            ps.setString(4, cli.getTelefono());
            ps.setInt(5, cli.getIdCliente());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            System.out.println("Error, no se pudo actualizar el cliente " + e);
        }
    }
}