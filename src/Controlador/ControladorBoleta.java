package Controlador;
import Vista.VentanaBoleta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import Formato.FormatoBoleta;
import java.text.SimpleDateFormat;
import DAO.*;
import Modelo.Boleta;
import Principal.Main;
import java.text.DecimalFormat;

public class ControladorBoleta implements ActionListener {
    VentanaBoleta vista;
    DefaultTableModel modelo;
    CRUDDetalleBoleta crudDetalle = new CRUDDetalleBoleta();
    CRUDBoleta crudBoleta = new CRUDBoleta();
    Boleta bol;
    
    public ControladorBoleta(VentanaBoleta vista, int idBoleta) {
        vista = vista;
        bol = crudBoleta.obtenerBoleta(idBoleta);
        vista.jtxtNombreCliente.setText(bol.getCliente().getNombre());
        vista.jtxtDireccionCliente.setText(bol.getCliente().getDireccion());
        vista.jtxtDniClienteBoleta.setText(String.valueOf(bol.getCliente().getDni()));
        vista.jtxtFecha.setText(new SimpleDateFormat("dd-MM-yyyy").format(bol.getFecha()));
        vista.jtxtNumeroBoleta.setText(new DecimalFormat("00000000000").format(bol.getIdBoleta()));
        vista.jtxtDireccion.setText(bol.DIRECCION);
        vista.jtxtNombreEmpresa.setText(bol.NOMBRE_EMPRESA);
        vista.jtxtRuc.setText(bol.RUC);
        vista.jlblMontoTotal.setText(String.valueOf(bol.getMontoTotal()));
        modelo = new DefaultTableModel(null, FormatoBoleta.titulos);
        vista.jtblCompras.setModel(modelo);
        crudDetalle.llenarListaDetallesBoleta(idBoleta);
        for (int i = 0; i < Main.listaDetallesBoleta.size(); i++) {
            modelo.addRow(Main.listaDetallesBoleta.get(i).registroDatos());
        }
        utils.ManejadorTabla.formatoTablaBoleta(vista.jtblCompras);
        FormatoBoleta.Presentacion(vista);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
    
}
