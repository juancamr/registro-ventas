package Controlador;
import DAO.CRUDReporte;
import utils.TablaUtils;
import utils.Messages;
import Principal.Main;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import utils.FrameUtils;

public class ControladorConsultarReporte implements ActionListener {
    ConsultarReporte panel;
    DefaultTableModel modelo;
    CRUDReporte crudReporte = new CRUDReporte();
    public static String[] titulos = {"Nro Reporte", "Fecha", "Total"};
    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    
    public ControladorConsultarReporte(VentanaPrincipal vista, ConsultarReporte pan) {
        panel = pan;
        panel.jbtnBuscarReportes.addActionListener(this);
        modelo = new DefaultTableModel(null, titulos);
        panel.jtblTablaReportes.setModel(modelo);
        utils.TablaUtils.formatoTablaConsultarReporte(panel.jtblTablaReportes);
        TablaUtils.formatoTablaConsultarReporte(panel.jtblTablaReportes);
        FrameUtils.showPanel(vista, panel);
    }
    
    public static ArrayList<String> leerFechas(ConsultarReporte panel) {
        ArrayList<String> fechas = new ArrayList<>();
        fechas.add(sdf.format(panel.jdchFechaInicial.getDate()));
        fechas.add(sdf.format(panel.jdchFechaFinal.getDate()));
        return fechas;
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
                crudReporte.llenarListaReportes(leerFechas(panel).get(0), leerFechas(panel).get(1));
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
