package Formato;

import Vista.VentanaBoleta;

public class FormatoBoleta {
    public static String[] titulos = {"Cantidad", "Descripcion", "Precio Unidad", "Total"};
    
    public static void Presentacion(VentanaBoleta vista) {
        vista.setTitle("Boleta de Venta");
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
}
