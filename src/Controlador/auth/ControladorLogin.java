package Controlador.auth;

import Vista.auth.PanelLogin;
import Vista.auth.PanelRegister;
import Vista.auth.VentanaSesion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import utils.FrameUtils;

public class ControladorLogin implements ActionListener {
    VentanaSesion vista;
    PanelLogin panel;
    
    public ControladorLogin(VentanaSesion v, PanelLogin pan) {
        vista = v;
        panel = pan;
        panel.jbtnRegistro.addActionListener(this);
        panel.jbtnIniciar.addActionListener(this);
        FrameUtils.showPanel(vista, panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panel.jbtnRegistro) {
            new ControladorRegistro(vista, new PanelRegister());
        }
        
        if (e.getSource() == panel.jbtnIniciar) {
            String userName = panel.jtxtNombreUsuario.getText();
            String password = String.valueOf(panel.jPassword.getPassword());
            
        }
    }
    
}
