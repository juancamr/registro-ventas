package Formato;
import static Controlador.ControladorNuevaVenta.panel;
import DAO.*;
import Modelo.*;
import Vista.PanelVenta;
import Vista.VentanaPrincipal;
import java.awt.BorderLayout;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class FormatoNuevaVenta {
    
    public static String[] titulosTabla = {"Cantidad", "Descripcion", "Precio Unid.", "Total"};
    static DecimalFormat df;
    static CRUDBoleta crud = new CRUDBoleta();
    
    public static void Presentacion (VentanaPrincipal vista, PanelVenta panel) {
        Boleta bol = new Boleta();
        panel.jspnCantidad.setValue(1);
        panel.jtxtDireccion.setText(bol.DIRECCION);
        panel.jtxtNombreEmpresa.setText(bol.NOMBRE_EMPRESA);
        panel.jtxtRuc.setText(bol.RUC);
        panel.jtxtNumeroBoleta.setText(new DecimalFormat("00000000000").format(crud.obtenerActualIdBoleta() + 1));
        panel.jtxtFecha.setText(new SimpleDateFormat("dd-MM-yyyy").format(new Date()));
        
        panel.setSize(840, 790);
        panel.setLocation(0, 0);        
        vista.content.removeAll();
        vista.content.add(panel, BorderLayout.CENTER);
        vista.content.revalidate();
        vista.content.repaint();
    }
    
    public static boolean isNotCompraRepetida(ArrayList<DetalleBoleta> listaCompras, int idProducto) {
        for (int i = 0; i < listaCompras.size(); i++) {
            if (listaCompras.get(i).getProducto().getIdProducto() == idProducto) {
                return false;
            }
        }
        return true;
    }
    
    public static void limpiarEntradasCompras(PanelVenta panel) {
        panel.jtxtCodigoProducto.setText("");
        panel.jspnCantidad.setValue(1);
        panel.jtxtNombreProducto.setText("");
        panel.jtxtPrecioUnidad.setText("");
        panel.jtxtCodigoProducto.requestFocus();
    }
    
    public static void limpiarEntradas(PanelVenta panel) {
        panel.jtxtDniBusqueda.setText("");
        panel.jtxtDniCliente.setText("");
        panel.jtxtDireccionCliente.setText("");
        panel.jtxtNombreCliente.setText("");
        panel.jtxtNumeroBoleta.setText(new DecimalFormat("00000000000").format(crud.obtenerActualIdBoleta() + 1));
    }
    
    public static DetalleBoleta leerDetalleBoleta(PanelVenta panel) {
        CRUDProductos crudProducto = new CRUDProductos();
        DetalleBoleta det = new DetalleBoleta();
        det.setProducto(crudProducto.obtenerProducto(crudProducto.obtenerIdProducto(panel.jtxtCodigoProducto.getText())));
        det.setCantidad(Integer.parseInt(panel.jspnCantidad.getValue().toString()));
        det.setTotal(det.getCantidad() * det.getProducto().getPrecioVenta());
        return det;
    }
}
