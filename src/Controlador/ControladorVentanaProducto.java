/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import DAO.CRUDProductos;
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

public final class ControladorVentanaProducto implements ActionListener {
    VentanaProductos vista;
    CRUDProductos crudProducto = new CRUDProductos();
    DefaultTableModel modelo;
    public String[] titulosTabla = {"Código", "Nombre", "Precio Costo", "Precio venta", "Proveedor", "Stock"};
    List<Producto> listaProductos = crudProducto.getAllProducts();
    
    public ControladorVentanaProducto(VentanaProductos v) {
        vista = v;
        JTextField inputCodigo = vista.jtxtCodigoBusqueda;
        modelo = new DefaultTableModel(null, titulosTabla);
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
                String query = inputCodigo.getText();
                listaProductos.clear();
                modelo.setRowCount(0);
                listaProductos = crudProducto.findProductByNameOrCode(query);
                setDataInTable(listaProductos);
            }
        });
        setDataInTable(listaProductos);
        utils.TablaUtils.formatoTablaTodosLosProductos(vista.jtblProductos);
        FrameUtils.showWindow(vista, "Buscar productos");
    }
    
    public void setDataInTable(List<Producto> listaProductos) {
        for (Producto producto : listaProductos) {
            modelo.addRow(producto.showAll());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
