package Controlador;
import DAO.CRUDBoleta;
import DAO.CRUDProductos;
import DAO.CRUDReporte;
import Principal.Main;
import Vista.PanelHome;
import Vista.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import utils.FrameUtils;

public class ControladorHome implements ActionListener {
    PanelHome panel;
    VentanaPrincipal vista;
    ArrayList<String> listaCodigos;
    CRUDProductos crudProducto = new CRUDProductos();
    CRUDReporte crudReporte = new CRUDReporte();
    CRUDBoleta crudBoleta = new CRUDBoleta();
    
    public ControladorHome(VentanaPrincipal v, PanelHome pan) {
        panel = pan;
        vista = v;
        //mostrar ingreso diario
        int idReporte = crudReporte.obtenerIdReporteToday();
        if (idReporte != 0) {
            panel.jlblIngresoDiario.setText("S/" + crudReporte.obtenerMontoReporte(idReporte));
        } else {
            panel.jlblIngresoDiario.setText("S/0.00");
        }
        //mostrar lista de 4 repuestos sin stock
        crudProducto.llenarListaProductosSinStock();
        int number = Main.listaProductosSinStock.size();
        if (number > 4) number = 4;
        if (!Main.listaProductosSinStock.isEmpty()) {
            panel.jpnlWithOut.setVisible(true);
            panel.jlblRepuestosSinStock.setVisible(true);
            panel.jlblProducto1.setText(Main.listaProductosSinStock.get(0).getCodigo());
            if (number >= 2) {
                panel.jlblProducto2.setText(Main.listaProductosSinStock.get(1).getCodigo());
            }
            if (number >= 3) {
                panel.jlblProducto3.setText(Main.listaProductosSinStock.get(2).getCodigo());
            }
            if (number == 4) {
                panel.jlblProducto4.setText(Main.listaProductosSinStock.get(3).getCodigo());
            }
        } else {
            panel.jlblCheck.setVisible(true);
            panel.jlblStockVerificado.setVisible(true);
        }
        //mostrar la cantidad de repuestos en la base de datos
        panel.jlblInventario.setText(String.valueOf(crudProducto.obtenerCantidadRepuestos()));
        //mostrar el monto de la ultima boleta generada
        int idBoleta = crudBoleta.obtenerActualIdBoleta();
        if (idBoleta != 0) {
            panel.jlblUltimaBoleta.setText("S/" + crudBoleta.obtenerBoleta(idBoleta).getMontoTotal());
        } else {
            panel.jlblUltimaBoleta.setText("Sin ventas");
        }
        
        FrameUtils.showPanel(vista, panel);
        panel.jtxtBuscarRepuesto.requestFocus();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
    
}
