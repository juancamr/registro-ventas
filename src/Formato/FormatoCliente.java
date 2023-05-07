package Formato;

import Modelo.Cliente;
import Vista.PanelClientes;
import Vista.VentanaPrincipal;
import java.awt.BorderLayout;

public class FormatoCliente {
    public static void presentacion(VentanaPrincipal vista, PanelClientes panel) {
        panel.setSize(840, 790);
        panel.setLocation(0, 0);        
        vista.content.removeAll();
        vista.content.add(panel, BorderLayout.CENTER);
        vista.content.revalidate();
        vista.content.repaint();
    }
    
    public static void isFocusable(PanelClientes panel, boolean flag) {
        panel.jtxtNombreCliente.setFocusable(flag);
        panel.jtxtDireccionCliente.setFocusable(flag);
        panel.jtxtTelefonoCliente.setFocusable(flag);
    }
    public static void leerClienteBusqueda(PanelClientes panel, Cliente cli) {
        cli.setDni(Integer.parseInt(panel.jtxtDniCliente.getText()));
        cli.setNombre(panel.jtxtNombreCliente.getText());
        cli.setDireccion(panel.jtxtDireccionCliente.getText());
        cli.setTelefono(panel.jtxtTelefonoCliente.getText());
    }
    public static Cliente leerClienteRegistro(PanelClientes panel) {
        Cliente cli = new Cliente();
        cli.setDni(Integer.parseInt(panel.jtxtDniClienteAgregar.getText()));
        cli.setNombre(panel.jtxtNombreClienteAgregar.getText());
        cli.setDireccion(panel.jtxtDireccionClienteAdd.getText());
        cli.setTelefono(panel.jtxtTelefonoClienteAdd.getText());
        return cli;
    }
    public static void limpiarEntradasRegistro(PanelClientes panel) {
        panel.jtxtNombreClienteAgregar.setText("");
        panel.jtxtDireccionClienteAdd.setText("");
        panel.jtxtTelefonoClienteAdd.setText("");
        panel.jtxtDniClienteAgregar.requestFocus();
    }
    public static void limpiarEntradasBusqueda(PanelClientes panel) {
        panel.jtxtDniCliente.setText("");
        panel.jtxtNombreCliente.setText("");
        panel.jtxtDireccionCliente.setText("");
        panel.jtxtTelefonoCliente.setText("");
        panel.jtxtDniCliente.requestFocus();
    }
}
