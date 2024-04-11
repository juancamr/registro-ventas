package Formato;
import Vista.*;
import java.awt.BorderLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class FormatoConsultarReporte {
    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    public static String[] titulos = {"Nro Reporte", "Fecha", "Total"};
    
    public static void Presentacion(VentanaPrincipal vista, ConsultarReporte panel) {
        panel.setSize(840, 790);
        panel.setLocation(0, 0);        
        vista.content.removeAll();
        vista.content.add(panel, BorderLayout.CENTER);
        vista.content.revalidate();
        vista.content.repaint();
    }
    
    public static ArrayList<String> leerFechas(ConsultarReporte panel) {
        ArrayList<String> fechas = new ArrayList<>();
        fechas.add(sdf.format(panel.jdchFechaInicial.getDate()));
        fechas.add(sdf.format(panel.jdchFechaFinal.getDate()));
        return fechas;
    }
}
