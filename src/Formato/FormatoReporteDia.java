package Formato;
import Vista.*;
import java.awt.BorderLayout;

public class FormatoReporteDia {
    public static String[] titulosTabla = {"Nro Boleta", "Nombre Cliente", "Monto"};
    
    public static void Presentacion(VentanaPrincipal vista, PanelReporteDia panel) {
        panel.setSize(840, 790);
        panel.setLocation(0, 0);        
        vista.content.removeAll();
        vista.content.add(panel, BorderLayout.CENTER);
        vista.content.revalidate();
        vista.content.repaint();
    }
}
