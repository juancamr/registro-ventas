package Formato;

import Vista.PanelHome;
import Vista.VentanaPrincipal;
import java.awt.BorderLayout;

public class FormatoHome {
    public static String[] titulos = {"Codigo", "Descripcion"};
    
    public static void presentacion(VentanaPrincipal vista, PanelHome panel) {
        panel.setSize(840, 790);
        panel.setLocation(0, 0);        
        vista.content.removeAll();
        vista.content.add(panel, BorderLayout.CENTER);
        vista.content.revalidate();
        vista.content.repaint();
    }
}
