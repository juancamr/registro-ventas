
package Controlador.auth;

import Vista.auth.PanelLogin;
import Vista.auth.VentanaSesion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import utils.FrameUtils;

public class ControladorInicio implements ActionListener {
    VentanaSesion vista;
    
    public ControladorInicio(VentanaSesion v) {
        vista = v;
        new ControladorLogin(vista, new PanelLogin());
        FrameUtils.showWindow(vista, "Auth");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
