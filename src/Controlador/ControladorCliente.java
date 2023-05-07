package Controlador;
import DAO.CRUDClientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Formato.FormatoCliente;
import Formato.Messages;
import Modelo.Cliente;
import Vista.PanelClientes;
import Vista.VentanaPrincipal;
import java.awt.Color;

public class ControladorCliente implements ActionListener {
    VentanaPrincipal vista;
    PanelClientes panel;
    CRUDClientes crudCliente = new CRUDClientes();
    Cliente cli;
    boolean flag = false;
    
    public ControladorCliente(VentanaPrincipal v, PanelClientes pan, boolean flag, int dni) {
        vista = v;
        panel = pan;
        panel.jbtnAgregar.addActionListener(this);
        panel.jbtnBuscarCliente.addActionListener(this);
        panel.jbtnEditar.addActionListener(this);
        FormatoCliente.presentacion(vista, panel);
        panel.jtxtDniClienteAgregar.requestFocus();
        if (flag) {
            panel.jtxtDniClienteAgregar.setText(String.valueOf(dni));
            panel.jtxtNombreClienteAgregar.requestFocus();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panel.jbtnAgregar) {
            if (panel.jtxtDniClienteAgregar.getText().equals("")) {
                Messages.show("Por favor, digite un DNI");
            } else if (panel.jtxtNombreClienteAgregar.getText().equals("")) {
                Messages.show("Por favor, digite un nombre");
            } else {
                try {
                    Cliente cli = FormatoCliente.leerClienteRegistro(panel);
                    crudCliente.ingresarCliente(cli);
                    FormatoCliente.limpiarEntradasRegistro(panel);
                    panel.jlblExito.setText("Cliente " + cli.getNombre() + " registrado con exito!");
                } catch (NumberFormatException exception) {
                    Messages.show("Error, el DNI debe ser un numero");
                    panel.jtxtDniClienteAgregar.setText("");
                    panel.jtxtDniClienteAgregar.requestFocus();
                }
            }
        }
        if (e.getSource() == panel.jbtnBuscarCliente) {
            if (panel.jtxtDniCliente.getText().equals("")) {
                Messages.show("Por favor, digite un DNI");
            } else {
                try {
                    cli = crudCliente.obtenerCliente(crudCliente.obtenerIdCliente(Integer.parseInt(panel.jtxtDniCliente.getText())));
                    if (cli.getNombre() == null) {
                        Messages.show("El cliente no esta registrado");
                    } else {
                        panel.jtxtNombreCliente.setText(cli.getNombre());
                        panel.jtxtDniCliente.setText(String.valueOf(cli.getDni()));
                        panel.jtxtDireccionCliente.setText(cli.getDireccion());
                        panel.jtxtTelefonoCliente.setText(cli.getTelefono());
                    }
                } catch (NumberFormatException exception) {
                    Messages.show("Error, el DNI debe ser un numero");
                    panel.jtxtDniCliente.setText("");
                    panel.jtxtDniCliente.requestFocus();
                }
            }
        }
        if (e.getSource() == panel.jbtnEditar) {
            if (panel.jtxtNombreCliente.getText().equals("") || panel.jtxtDniCliente.getText().equals("")) {
                Messages.show("Ingrese un cliente");
            } else {
                if (flag) {
                    FormatoCliente.leerClienteBusqueda(panel, cli);
                    crudCliente.actualizarCliente(cli);
                    Messages.show("Datos actualizados");
                    panel.jbtnEditar.setText("EDITAR");
                    FormatoCliente.limpiarEntradasBusqueda(panel);
                    flag = false;
                    FormatoCliente.isFocusable(panel, false);
                    panel.jbtnEditar.setForeground(new Color(255, 255, 254));
                    panel.jbtnEditar.setBackground(new Color(20,23,31));
                } else {
                    flag = true;
                    FormatoCliente.isFocusable(panel, true);
                    Messages.show("Modo edicion activado");
                    panel.jbtnEditar.setText("ACTUALIZAR");
                    panel.jbtnEditar.setForeground(new Color(0, 0, 0));
                    panel.jbtnEditar.setBackground(new Color(255, 255, 254));
                }
            }
        }
    }
    
}
