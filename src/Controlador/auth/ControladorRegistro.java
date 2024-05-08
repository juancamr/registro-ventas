package Controlador.auth;

import Vista.auth.PanelLogin;
import Vista.auth.PanelRegister;
import Vista.auth.VentanaSesion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import utils.FrameUtils;

public class ControladorRegistro implements ActionListener {

    VentanaSesion vista;
    PanelRegister panel;

    public ControladorRegistro(VentanaSesion v, PanelRegister pan) {
        vista = v;
        panel = pan;
        panel.jbtnInicioSesion.addActionListener(this);
        panel.jbtnRegistro.addActionListener(this);
        FrameUtils.showPanel(vista, panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panel.jbtnInicioSesion) {
            new ControladorLogin(vista, new PanelLogin());
        }

        if (e.getSource() == panel.jbtnRegistro) {
            String nombres = panel.jtxtNombresCompletos.getText();
            String userName = panel.jtxtNombreUsuario.getText();
            char[] password = panel.jPassword.getPassword();
            System.out.println(userName);
            System.out.println(password);
            System.out.println(nombres);
        }
    }

}
