package Controlador;
import utils.Messages;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.*;
import DAO.*;
import Vista.*;
import Formato.*;
import java.awt.Color;
import java.util.List;
import utils.FrameUtils;

public class ControladorProducto implements ActionListener{
    PanelProducto panel;
    CRUDProductos crudProducto = new CRUDProductos();
    String codigo;
    Producto prod;
    boolean flag = false;

    public ControladorProducto(VentanaPrincipal vista, PanelProducto pan, boolean flag, String codigo){
        panel = pan;
        panel.jbtnBuscarProducto.addActionListener(this);
        panel.jbtnAgregar.addActionListener(this);
        panel.jbtnEditar.addActionListener(this);
        panel.jbtnDelete.addActionListener(this);
        panel.jbtnTodosLosProductos.addActionListener(this);
        FormatoProductos.cargarComboProveedores(panel.jcbxProveedorBusqueda);
        FormatoProductos.cargarComboProveedores(panel.jcbxProveedorRegistro);
        
        if (flag) {
            buscarProducto(codigo);
        }
        FrameUtils.showPanel(vista, panel);
        panel.jtxtCodigoBusqueda.requestFocus();
    }
    
    public void buscarProducto(String codigo) {
        prod = crudProducto.obtenerProducto(crudProducto.obtenerIdProducto(codigo));
        if (prod.getNombre() == null) {
            Messages.show("El repuesto no esta registrado");
            panel.jtxtCodigoBusqueda.setText("");
            panel.jtxtCodigoBusqueda.requestFocus();
        } else {
            panel.jtxtCodigoBusqueda.setText(prod.getCodigo());
            panel.jtxtNombreBusqueda.setText(prod.getNombre());
            panel.jcbxMarcaBusqueda.setSelectedItem(prod.getMarca());
            panel.jcbxProveedorBusqueda.setSelectedItem(prod.getProveedor().getNombre());
            panel.jtxtCostoBusqueda.setText(String.valueOf(prod.getCostoUnidad()));
            panel.jtxtPrecioVentaBusqueda.setText(String.valueOf(prod.getPrecioVenta()));
            panel.jtxtStockBusqueda.setText(String.valueOf(prod.getStock()));
        }
    }

    @Override
    public void actionPerformed(ActionEvent e){
        //BUSCAR EL PRODUCTO
        if (e.getSource() == panel.jbtnBuscarProducto) {
            if (panel.jtxtCodigoBusqueda.getText().equals("")) {
                Messages.show("Ingrese un codigo");
            } else {
                buscarProducto(panel.jtxtCodigoBusqueda.getText());
            }
        }
        //ACTUALIZAR PRODUCTO
        if(e.getSource() == panel.jbtnEditar) {
            if (panel.jtxtNombreBusqueda.getText().equals("") || panel.jtxtCodigoBusqueda.getText().equals("")) {
                Messages.show("Ingrese un producto a editar");
            } else {
                if (flag) {
                    FormatoProductos.leerProductoBusqueda(panel, prod);
                    crudProducto.actualizarProducto(prod);
                    Messages.show("Datos actualizados");
                    panel.jbtnEditar.setText("EDITAR");
                    FormatoProductos.limpiarEntradasBusqueda(panel);
                    flag = false;
                    FormatoProductos.isFocusable(panel, false);
                    panel.jbtnEditar.setForeground(new Color(255, 255, 254));
                    panel.jbtnEditar.setBackground(new Color(20,23,31));
                } else {
                    flag = true;
                    FormatoProductos.isFocusable(panel, true);
                    Messages.show("Modo edicion activado");
                    panel.jbtnEditar.setText("ACTUALIZAR");
                    panel.jbtnEditar.setForeground(new Color(0, 0, 0));
                    panel.jbtnEditar.setBackground(new Color(255, 255, 254));
                }
            }
        }

        //ELIMINAR PRODUCTO
        if(e.getSource() == panel.jbtnDelete){
            if (panel.jtxtNombreBusqueda.getText().equals("") || panel.jtxtCodigoBusqueda.getText().equals("")) {
                Messages.show("Ingrese un producto a eliminar");
            } else {
                int respuesta = Messages.confirm("¿Desea eliminar el producto?", "Confirmar");
                if (respuesta == 0){
                    crudProducto.eliminarProducto(prod.getIdProducto());
                    Messages.show("Producto eliminado");
                    FormatoProductos.limpiarEntradasBusqueda(panel);
                }
            }
        }
        
        if (e.getSource() == panel.jbtnTodosLosProductos) {
            new ControladorVentanaProducto(new VentanaProductos());
        }
        
        if(e.getSource()==panel.jbtnAgregar){
            if (FormatoProductos.isNotEverythingFull(panel)) {
                Messages.show("Complete todos los campos");
            } else {
                prod = FormatoProductos.leerProductoRegistro(panel);
                crudProducto.ingresarProducto(prod);
                FormatoProductos.limpiarEntradas(panel);
                panel.jlblExito.setText("Repuesto " + prod.getCodigo() + " registrado con exito");
            }
        }
    }
}