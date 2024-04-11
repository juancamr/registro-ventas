package Principal;
import Controlador.ControladorPanelPrincipal;
import Modelo.*;
import Vista.*;
import java.util.ArrayList;

public class Main {
    
    //colecciones
    public static ArrayList<Boleta> listaBoletas;
    public static ArrayList<DetalleBoleta> listaDetallesBoleta;
    public static ArrayList<Reporte> listaReportes;
    public static ArrayList<Proveedor> listaProveedores;
    public static ArrayList<Producto> listaProductosSinStock;

    public static void main(String[] Stringargs) {
        VentanaPrincipal ventana = new VentanaPrincipal();
        ControladorPanelPrincipal controller = new ControladorPanelPrincipal(ventana);
    }
    
}