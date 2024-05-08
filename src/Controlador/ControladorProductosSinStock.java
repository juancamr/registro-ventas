package Controlador;
import DAO.CRUDProductos;
import Formato.FormatoProductosSinStock;
import utils.ManejadorTabla;
import Principal.Main;
import Vista.VentanaProductosSinStock;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

public class ControladorProductosSinStock implements ActionListener {
    VentanaProductosSinStock vista;
    DefaultTableModel modelo;
    CRUDProductos crudProducto = new CRUDProductos();
    
    public ControladorProductosSinStock(VentanaProductosSinStock v) {
        vista = v;
        modelo = new DefaultTableModel(null, FormatoProductosSinStock.titulos);
        vista.jtblProductos.setModel(modelo);
        crudProducto.llenarListaProductosSinStock();
        if (!Main.listaProductosSinStock.isEmpty()) {
            for (int i = 0; i < Main.listaProductosSinStock.size(); i++) {
                modelo.addRow(Main.listaProductosSinStock.get(i).registroDatosStock());
            }
        }
        ManejadorTabla.formatoTablaProductosSinStock(vista.jtblProductos);
        FormatoProductosSinStock.presentacion(vista);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
