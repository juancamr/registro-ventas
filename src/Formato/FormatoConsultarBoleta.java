package Formato;

import Vista.*;
import java.awt.BorderLayout;

public class FormatoConsultarBoleta {
    public static String[] titulos = {"Nro Boleta", "Fecha", "Monto"};
    
    public static void Presentacion (VentanaPrincipal vista, ConsultarBoleta panel) {
        panel.setSize(840, 790);
        panel.setLocation(0, 0);
        vista.content.removeAll();
        vista.content.add(panel, BorderLayout.CENTER);
        vista.content.revalidate();
        vista.content.repaint();
    }
}
