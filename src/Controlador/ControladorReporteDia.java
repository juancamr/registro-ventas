package Controlador;
import Formato.*;
import DAO.*;
import Principal.Main;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Vista.*;
import java.text.DecimalFormat;

public class ControladorReporteDia implements ActionListener {
    PanelReporteDia panel;
    DefaultTableModel modelo;
    CRUDReporte crudReporte = new CRUDReporte();
    CRUDBoleta crudBoleta = new CRUDBoleta();
    
    public ControladorReporteDia(VentanaPrincipal vista, PanelReporteDia pan) {
        panel = pan;
        modelo = new DefaultTableModel(null, FormatoReporteDia.titulosTabla);
        panel.jtblTablaBoletas.setModel(modelo);
        utils.ManejadorTabla.formatoTablaReportesDia(panel.jtblTablaBoletas);
        FormatoReporteDia.Presentacion(vista, panel);
        int idReporte = crudReporte.obtenerIdReporteToday();
        if (idReporte != 0) {
            crudBoleta.llenarListaBoletasParaReporte(idReporte);
            panel.jlblMontoTotal.setText(String.valueOf(new DecimalFormat("0.00").format(crudReporte.obtenerMontoReporte(idReporte))));
            for (int i = 0; i < Main.listaBoletas.size(); i++) {
                modelo.addRow(Main.listaBoletas.get(i).registrarDatosTablaReporte());
            }
        } else {
            panel.jlblMontoTotal.setText("0.00");
            panel.jlblEmpty.setText("No hay ventas realizadas el dia de hoy");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //
    }
}
