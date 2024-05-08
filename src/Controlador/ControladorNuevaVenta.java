package Controlador;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Formato.FormatoNuevaVenta;
import Vista.*;
import DAO.*;
import Formato.*;
import Modelo.*;
import Principal.Main;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Date;

public class ControladorNuevaVenta implements ActionListener {
    VentanaPrincipal vista;
    public static PanelVenta panel;
    public static DefaultTableModel modelo;
    CRUDClientes crudCliente = new CRUDClientes();
    CRUDReporte crudReporte = new CRUDReporte();
    CRUDBoleta crudBoleta = new CRUDBoleta();
    CRUDDetalleBoleta crudDetalle = new CRUDDetalleBoleta();
    CRUDProductos crudProductos= new CRUDProductos();
    public static ArrayList<DetalleBoleta> listaDetallesBoleta = new ArrayList<>();
    Date today = new Date();
    double montoTotal = 0;
    Cliente cli;
    Producto prod;
    
    public ControladorNuevaVenta (VentanaPrincipal v, PanelVenta pan) {
        vista = v;
        panel = pan;
        panel.jbtnAgregarCompra.addActionListener(this);
        panel.jbtnBuscarCliente.addActionListener(this);
        panel.jbtnBuscarProducto.addActionListener(this);
        panel.jbtnGenerarBoleta.addActionListener(this);
        panel.jbtnRegistrarCliente.addActionListener(this);
        panel.jbtnSaberMas.addActionListener(this);
        panel.jbtnDelete.addActionListener(this);
        panel.jbtnClear.addActionListener(this);
        modelo = new DefaultTableModel(null, FormatoNuevaVenta.titulosTabla);
        panel.jtblCompras.setModel(modelo);
        utils.ManejadorTabla.formatoTablaBoleta(panel.jtblCompras);
        FormatoNuevaVenta.Presentacion(vista, panel);
        panel.jtxtDniBusqueda.requestFocus();
    }
    
    public static PanelVenta getPanelVenta() {
        if (panel != null) {
            return panel;
        } else {
            return null;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panel.jbtnBuscarCliente) {
            if (panel.jtxtDniBusqueda.getText().equals("")) {
                Messages.show("Por favor, digite un DNI");
            } else {
                try {
                    cli = crudCliente.obtenerCliente(crudCliente.obtenerIdCliente(Integer.parseInt(panel.jtxtDniBusqueda.getText())));
                    if (cli.getNombre() == null) {
                        Messages.show("El cliente no esta registrado");
                    } else {
                        panel.jtxtNombreCliente.setText(cli.getNombre());
                        panel.jtxtDniCliente.setText(String.valueOf(cli.getDni()));
                        panel.jtxtDireccionCliente.setText(cli.getDireccion());
                    }
                } catch (NumberFormatException exception) {
                    Messages.show("Error, digite un numero");
                    panel.jtxtDniCliente.setText("");
                    panel.jtxtDniCliente.requestFocus();
                }
            }
        }
        if (e.getSource() == panel.jbtnBuscarProducto) {
            if (panel.jtxtCodigoProducto.getText().equals("")) {
                Messages.show("Ingrese un codigo de producto");
            } else {
                prod = crudProductos.obtenerProducto(crudProductos.obtenerIdProducto(panel.jtxtCodigoProducto.getText()));
                if (prod.getNombre() == null) {
                    Messages.show("El producto no esta registrado");
                } else {
                    panel.jtxtNombreProducto.setText(prod.getNombre());
                    panel.jtxtPrecioUnidad.setText(String.valueOf(prod.getPrecioVenta()));
                }
            }
        }
        if (e.getSource() == panel.jbtnAgregarCompra) {
            if (panel.jtxtPrecioUnidad.getText().equals("")) {
                Messages.show("Ingrese un producto");
            } else if (Integer.parseInt(panel.jspnCantidad.getValue().toString()) <= 0) {
                Messages.show("Ingrese una cantidad valida");
                panel.jspnCantidad.setValue(1);
            } else {
                DetalleBoleta det = FormatoNuevaVenta.leerDetalleBoleta(panel);
                if (FormatoNuevaVenta.isNotCompraRepetida(listaDetallesBoleta, det.getProducto().getIdProducto())) {
                    if (crudProductos.isEnoughInventory(det.getProducto().getIdProducto(), det.getCantidad())) {
                        det.setIdBoleta(crudBoleta.obtenerActualIdBoleta() + 1);
                        montoTotal += det.getTotal();
                        panel.jlblTotalBoleta.setText(String.valueOf(montoTotal));
                        modelo.addRow(det.registroDatos());
                        listaDetallesBoleta.add(det);
                        FormatoNuevaVenta.limpiarEntradasCompras(panel);
                        panel.jbtnGenerarBoleta.setBackground(new Color(16,44,84));
                        panel.jbtnGenerarBoleta.setForeground(new Color(255, 255, 254));
                    } else {
                        Messages.show("No hay suficiente stock del repuesto " + det.getProducto().getNombre());
                    }
                } else {
                    Messages.show("Compra repetida, por favor, elimine la compra y vuelva a registrarla");
                }
            }
        }
        if (e.getSource() == panel.jbtnDelete) {
            int row = panel.jtblCompras.getSelectedRow();
            if (row == -1) {
                Messages.show("Seleccione una fila");
            } else {
                modelo.removeRow(row);
                listaDetallesBoleta.remove(row);
                if (listaDetallesBoleta.isEmpty()) {
                    panel.jbtnGenerarBoleta.setBackground(new Color(255, 255, 254));
                    panel.jbtnGenerarBoleta.setForeground(new Color(0, 0, 0));
                }
            }
        }
        if (e.getSource() == panel.jbtnGenerarBoleta) {
            if (crudReporte.isNotReportToday()) {
                crudReporte.crearReporte();
            }
            if (panel.jtxtNombreCliente.getText().equals("")) {
                Messages.show("Ingrese un cliente");
            } else if (listaDetallesBoleta.isEmpty()) {
                Messages.show("Ingrese una compra");
            } else {
                Boleta bol = new Boleta();
                bol.setIdReporte(crudReporte.obtenerActualIdReporte());
                bol.setCliente(cli);
                bol.setFecha(today);
                bol.setMontoTotal(montoTotal);
                crudBoleta.ingresarBoleta(bol);
                for (int i = 0; i < listaDetallesBoleta.size(); i++) {
                    crudDetalle.ingresarDetalleBoleta(listaDetallesBoleta.get(i));
                    crudProductos.bajarInventario(listaDetallesBoleta.get(i).getProducto().getIdProducto(), listaDetallesBoleta.get(i).getCantidad());
                }
                listaDetallesBoleta.clear();
                crudReporte.actualizarMontoReporte(montoTotal);
                Messages.show("Boleta generada con exito");
                FormatoNuevaVenta.limpiarEntradas(panel);
                modelo.setRowCount(0);
                montoTotal = 0;
                panel.jlblTotalBoleta.setText("");
                panel.jbtnGenerarBoleta.setBackground(new Color(255, 255, 254));
                panel.jbtnGenerarBoleta.setForeground(new Color(0, 0, 0));
            }
        }
        if (e.getSource() == panel.jbtnClear) {
            listaDetallesBoleta.clear();
            modelo.setRowCount(0);
        }
        if (e.getSource() == panel.jbtnRegistrarCliente) {
            if (!panel.jtxtDniBusqueda.getText().equals("")) {
                new ControladorCliente(vista, new PanelClientes(), true, Integer.parseInt(panel.jtxtDniBusqueda.getText()));
                ControladorPanelPrincipal.setFocusButton(vista.jbtnClientes, vista.jlblClientesIcon);
                vista.turnAllFalse();
                vista.botonClientes = true;
            } else {
                Messages.show("Digite un DNI");
            }
        }
        if (e.getSource() == panel.jbtnSaberMas) {
            if (!(panel.jtxtCodigoProducto.getText().equals("") || panel.jtxtNombreProducto.getText().equals(""))) {
                new ControladorProducto(vista, new PanelProducto(), true, panel.jtxtCodigoProducto.getText());
                ControladorPanelPrincipal.setFocusButton(vista.jbtnRepuestos, vista.jlblRepuestosIcon);
                vista.turnAllFalse();
                vista.botonRepuestos = true;
            } else {
                Messages.show("Ingrese un producto");
            }
        }
    }
}
