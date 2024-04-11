package Controlador;
import DAO.CRUDReporte;
import Formato.FormatoConsultarReporte;
import Formato.ManejadorTabla;
import Formato.Messages;
import Principal.Main;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.*;
import javax.swing.table.DefaultTableModel;

public class ControladorConsultarReporte implements ActionListener {
    ConsultarReporte panel;
    DefaultTableModel modelo;
    CRUDReporte crudReporte = new CRUDReporte();
    
    public ControladorConsultarReporte(VentanaPrincipal vista, ConsultarReporte pan) {
        panel = pan;
        panel.jbtnBuscarReportes.addActionListener(this);
        modelo = new DefaultTableModel(null, FormatoConsultarReporte.titulos);
        panel.jtblTablaReportes.setModel(modelo);
        Formato.ManejadorTabla.formatoTablaConsultarReporte(panel.jtblTablaReportes);
        ManejadorTabla.formatoTablaConsultarReporte(panel.jtblTablaReportes);
        FormatoConsultarReporte.Presentacion(vista, panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panel.jbtnBuscarReportes) {
            if (panel.jdchFechaInicial.getDate() == null) {
                Messages.show("Por favor, elija una fecha inicial");
            } else if (panel.jdchFechaFinal.getDate() == null) {
                Messages.show("Por favor, elija una fecha final");
            } else {
                //llenando la lista del main
                crudReporte.llenarListaReportes(FormatoConsultarReporte.leerFechas(panel).get(0), FormatoConsultarReporte.leerFechas(panel).get(1));
                if (Main.listaReportes.isEmpty()) {
                    Messages.show("No existen reportes en ese intervalo de fecha");
                }
                for (int i = 0; i < Main.listaReportes.size(); i++) {
                    modelo.addRow(Main.listaReportes.get(i).registrarDatos());
                }
            }
        }
    }
}
