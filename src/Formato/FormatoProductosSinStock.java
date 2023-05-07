package Formato;

import Vista.VentanaProductosSinStock;

public class FormatoProductosSinStock {
    public static String[] titulos = {"Codigo", "Descripcion", "Stock"};
    
    public static void presentacion(VentanaProductosSinStock ventana) {
        ventana.setTitle("Repuestos sin stock");
        ventana.setLocationRelativeTo(ventana);
        ventana.setVisible(true);
    }
}
