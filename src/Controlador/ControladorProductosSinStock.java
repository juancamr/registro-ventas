package Controlador;
import DAO.CRUDProductos;
import utils.TablaUtils;
import Principal.Main;
import Vista.VentanaProductosSinStock;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import utils.FrameUtils;

public class ControladorProductosSinStock implements ActionListener {
    VentanaProductosSinStock vista;
    DefaultTableModel modelo;
    CRUDProductos crudProducto = new CRUDProductos();
    public static String[] titulos = {"Codigo", "Descripcion", "Stock"};
    
    public ControladorProductosSinStock(VentanaProductosSinStock v) {
        vista = v;
        modelo = new DefaultTableModel(null, titulos);
        vista.jtblProductos.setModel(modelo);
        crudProducto.llenarListaProductosSinStock();
        if (!Main.listaProductosSinStock.isEmpty()) {
            for (int i = 0; i < Main.listaProductosSinStock.size(); i++) {
                modelo.addRow(Main.listaProductosSinStock.get(i).registroDatosStock());
            }
        }
        TablaUtils.formatoTablaProductosSinStock(vista.jtblProductos);
        FrameUtils.showWindow(vista, "Productos sin stock");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
