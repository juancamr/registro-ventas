package Controlador.auth;

import Vista.auth.PanelLogin;
import Vista.auth.VentanaSesion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import utils.FrameUtils;

public class ControladorLogin implements ActionListener {
    VentanaSesion vista;
    
    public ControladorLogin(VentanaSesion v, PanelLogin panel) {
        vista = v;
        FrameUtils.showPanel(vista, panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
