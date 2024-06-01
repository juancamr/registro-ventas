package Principal;
import Controlador.auth.ControladorInicio;
import Controlador.ControladorPanelPrincipal;
import Modelo.*;
import Vista.*;
import Vista.auth.VentanaSesion;
import java.util.ArrayList;
import utils.StringUtils;

public class Main {
    
    //colecciones
    public static ArrayList<Boleta> listaBoletas;
    public static ArrayList<DetalleBoleta> listaDetallesBoleta;
    public static ArrayList<Reporte> listaReportes;
    public static ArrayList<Proveedor> listaProveedores;
    public static ArrayList<Producto> listaProductosSinStock;
    
    public static Administrador admin;

    public static void main(String[] Stringargs) {
        new ControladorInicio(new VentanaSesion());
    }
}