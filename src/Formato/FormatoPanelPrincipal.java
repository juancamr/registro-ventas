
package Formato;

import Vista.VentanaPrincipal;

public class FormatoPanelPrincipal {
    public static void Presentacion(VentanaPrincipal ventana) {
        ventana.setSize(1076, 825);
        ventana.setTitle("Servimotos");
        ventana.setLocationRelativeTo(ventana);
        ventana.setVisible(true);
    }
}
