/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import DAO.CRUDProductos;
import Formato.FormatoBoleta;
import Modelo.Producto;
import Vista.VentanaProductos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import utils.FrameUtils;

public class ControladorVentanaProducto implements ActionListener {
    VentanaProductos vista;
    CRUDProductos crudProducto = new CRUDProductos();
    DefaultTableModel modelo;
    public String[] titulosTabla = {"Código", "Nombre", "Precio Costo", "Precio venta", "Proveedor", "Stock"};
    
    public ControladorVentanaProducto(VentanaProductos v) {
        vista = v;
        JTextField inputCodigo = vista.jtxtCodigoBusqueda;
        modelo = new DefaultTableModel(null, FormatoBoleta.titulos);
        vista.jtblProductos.setModel(modelo);
        inputCodigo.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void changedUpdate(DocumentEvent e) {
                handleChange();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                handleChange();
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                handleChange();
            }

            public void handleChange() {
                System.out.println(inputCodigo.getText());
            }
        });
        
        List<Producto> listaProductos = crudProducto.getAllProducts();
        for (Producto producto : listaProductos) {
            System.out.println(producto.getCodigo());
            modelo.addRow(producto.showAll());
        }
        utils.ManejadorTabla.formatoTablaTodosLosProductos(vista.jtblProductos);
        FrameUtils.showWindow(vista);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
