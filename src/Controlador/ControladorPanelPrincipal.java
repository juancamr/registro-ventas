package Controlador;
import Formato.FormatoNuevaVenta;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Formato.FormatoPanelPrincipal;
import Formato.Messages;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;

public class ControladorPanelPrincipal implements ActionListener {
    public static VentanaPrincipal vista;
    
    static Color base = new Color(20,23,31);
    static Color focus = new Color(55, 58, 64);
    static Color foregroundColorFocus = new Color(255, 255, 254);
    static Color foregroundColorBase = new Color(170,170,170);
    static Font fontFocus = new Font("Malgun Gothic", 1, 16);
    static Font fontBase = new Font("Malgun Gothic", 4, 16);
    
    public static boolean isCorrectPassword;
    public static int panelReporte; //0 panelReporteDia 1 panelConsultarReporte

    public ControladorPanelPrincipal(VentanaPrincipal v){ 
        vista = v;
        vista.jbtnConsultarBoleta.addActionListener(this);
        vista.jbtnNuevaVenta.addActionListener(this);
        vista.jbtnClientes.addActionListener(this);
        vista.jbtnReporteDia.addActionListener(this);
        vista.jbtnConsultarReporte.addActionListener(this);
        vista.jbtnRepuestos.addActionListener(this);
        vista.jbtnHome.addActionListener(this);
        new ControladorHome(vista, new PanelHome());
    }
    
    public void screen() {
        FormatoPanelPrincipal.Presentacion(vista);
    }
    
    public static void quitarFondosBotones() {
        vista.jbtnHome.setBackground(base);
        vista.jbtnHome.setForeground(foregroundColorBase);
        vista.jbtnHome.setFont(fontBase);
        vista.jlblHomeIcon.setBackground(base);
        vista.jlblHomeIcon.setForeground(foregroundColorBase);
        
        vista.jbtnNuevaVenta.setBackground(base);
        vista.jbtnNuevaVenta.setForeground(foregroundColorBase);
        vista.jbtnNuevaVenta.setFont(fontBase);
        vista.jlblVentaIcon.setBackground(base);
        vista.jlblVentaIcon.setForeground(foregroundColorBase);
        
        vista.jbtnRepuestos.setBackground(base);
        vista.jbtnRepuestos.setForeground(foregroundColorBase);
        vista.jbtnRepuestos.setFont(fontBase);
        vista.jlblRepuestosIcon.setBackground(base);
        vista.jlblRepuestosIcon.setForeground(foregroundColorBase);
        
        vista.jbtnReporteDia.setBackground(base);
        vista.jbtnReporteDia.setForeground(foregroundColorBase);
        vista.jbtnReporteDia.setFont(fontBase);
        vista.jlblReporteIcon.setBackground(base);
        vista.jlblReporteIcon.setForeground(foregroundColorBase);
        
        vista.jbtnClientes.setBackground(base);
        vista.jbtnClientes.setForeground(foregroundColorBase);
        vista.jbtnClientes.setFont(fontBase);
        vista.jlblClientesIcon.setBackground(base);
        vista.jlblClientesIcon.setForeground(foregroundColorBase);
        
        vista.jbtnConsultarBoleta.setBackground(base);
        vista.jbtnConsultarBoleta.setForeground(foregroundColorBase);
        vista.jbtnConsultarBoleta.setFont(fontBase);
        vista.jlblConsultaBoleta.setBackground(base);
        vista.jlblConsultaBoleta.setForeground(foregroundColorBase);
        
        vista.jbtnConsultarReporte.setBackground(base);
        vista.jbtnConsultarReporte.setForeground(foregroundColorBase);
        vista.jbtnConsultarReporte.setFont(fontBase);
        vista.jlblConsultarReporte.setBackground(base);
        vista.jlblConsultarReporte.setForeground(foregroundColorBase);
    }
    
    public static void setFocusButton(JButton boton, JLabel label) {
        quitarFondosBotones();
        boton.setBackground(focus);
        boton.setForeground(foregroundColorFocus);
        boton.setFont(fontFocus);
        label.setBackground(focus);
        label.setForeground(foregroundColorFocus);
    }
    
    public static VentanaPrincipal getVentanaPrincipal() {
        return vista;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.jbtnHome) {
            new ControladorHome(vista, new PanelHome());
            setFocusButton(vista.jbtnHome, vista.jlblHomeIcon);
        }
        if (e.getSource() == vista.jbtnNuevaVenta) {
            if (ControladorNuevaVenta.getPanelVenta() == null) {
                new ControladorNuevaVenta(vista, new PanelVenta());
            } else {
                FormatoNuevaVenta.Presentacion(vista, ControladorNuevaVenta.getPanelVenta());
            }
            setFocusButton(vista.jbtnNuevaVenta, vista.jlblVentaIcon);
        }
        if (e.getSource() == vista.jbtnClientes) {
            new ControladorCliente(vista, new PanelClientes(), false, 0);
            setFocusButton(vista.jbtnClientes, vista.jlblClientesIcon);
        }
        if (e.getSource() == vista.jbtnConsultarBoleta) {
            new ControladorConsultaBoleta(vista, new ConsultarBoleta(), false);
            setFocusButton(vista.jbtnConsultarBoleta, vista.jlblConsultaBoleta);
        }
        if (e.getSource() == vista.jbtnReporteDia) {
            setFocusButton(vista.jbtnReporteDia, vista.jlblReporteIcon);
            panelReporte = 0;
            new VentanaPass();
        }
        if (e.getSource() == vista.jbtnConsultarReporte) {
            setFocusButton(vista.jbtnConsultarReporte, vista.jlblConsultarReporte);
            panelReporte = 1;
            new VentanaPass();
        }        
        if (e.getSource() == vista.jbtnRepuestos) {
            new ControladorProducto(vista, new PanelProducto(), false, "");
            setFocusButton(vista.jbtnRepuestos, vista.jlblRepuestosIcon);
        }        
    }
    public static void openPanelReporteDia() {
        if (isCorrectPassword) {
            new ControladorReporteDia(vista, new PanelReporteDia());
            isCorrectPassword = false;
        }
    }
    public static void openPanelConsultarReporte() {
        if (isCorrectPassword) {
            new ControladorConsultarReporte(vista, new ConsultarReporte());
            isCorrectPassword = false;
        }
    }
}
