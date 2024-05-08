
package utils;

import Vista.VentanaPrincipal;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrameUtils {
    
    public static void showWindow(JFrame vista) {
        vista.setTitle("Boleta de Venta");
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
    
    public static void showPanel(VentanaPrincipal vista, JPanel panel) {
        panel.setSize(840, 790);
        panel.setLocation(0, 0);
        vista.content.removeAll();
        vista.content.add(panel, BorderLayout.CENTER);
        vista.content.revalidate();
        vista.content.repaint();
    }
}
