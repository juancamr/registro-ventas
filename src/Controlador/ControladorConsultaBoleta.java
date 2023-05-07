package Controlador;
import DAO.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Formato.*;
import Modelo.Cliente;
import Principal.Main;
import Vista.*;
import java.awt.Color;
import java.util.Collections;
import javax.swing.table.DefaultTableModel;

public class ControladorConsultaBoleta implements ActionListener {
    ConsultarBoleta panel;
    DefaultTableModel modelo;
    CRUDClientes crudCliente = new CRUDClientes();
    CRUDBoleta crudBoleta = new CRUDBoleta();
    boolean band;
    
    public ControladorConsultaBoleta(VentanaPrincipal vista, ConsultarBoleta pan, boolean flag) {
        panel = pan;
        modelo = new DefaultTableModel(null, FormatoConsultarBoleta.titulos);
        panel.jbtnBuscarBoletas.addActionListener(this);
        panel.jtblTablaBoletas.setModel(modelo);
        ManejadorTabla.formatoTablaConsultarBoleta(panel.jtblTablaBoletas);
        panel.jtblTablaBoletas.setBackground(Color.WHITE);
        FormatoConsultarBoleta.Presentacion(vista, panel);
        panel.jtxtDniCliente.requestFocus();
        if (flag) {
            panel.jtxtDniCliente.setEnabled(false);
            panel.jtxtDniCliente.setBackground(new Color(204, 204, 204));
            for (int i = 0; i < Main.listaBoletas.size(); i++) {
                modelo.addRow(Main.listaBoletas.get(i).registrarDatos());
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panel.jbtnBuscarBoletas) {
            modelo.setRowCount(0);
            if (panel.jtxtDniCliente.getText().equals("")) {
                Messages.show("Por favor, digite un DNI");
            } else {
                try {
                    Cliente cli = crudCliente.obtenerCliente(crudCliente.obtenerIdCliente(Integer.parseInt(panel.jtxtDniCliente.getText())));
                    crudBoleta.llenarListaBoletas(cli.getIdCliente());
                    if (cli.getNombre() != null) {
                        if (Main.listaBoletas.isEmpty()) {
                            Messages.show("No existe un registro de compras del cliente con DNI " + panel.jtxtDniCliente.getText());
                        } else {
                            Collections.reverse(Main.listaBoletas);
                            for (int i = 0; i < Main.listaBoletas.size(); i++) {
                                modelo.addRow(Main.listaBoletas.get(i).registrarDatos());
                            }
                        }
                    } else {
                        Messages.show("El cliente no esta registrado");
                    }
                } catch (NumberFormatException exception) {
                    Messages.show("Error, el DNI debe ser un numero");
                    panel.jtxtDniCliente.setText("");
                    panel.jtxtDniCliente.requestFocus();
                }
            }
        }
    }
}
