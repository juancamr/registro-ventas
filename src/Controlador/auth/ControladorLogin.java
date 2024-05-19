package Controlador.auth;

import Controlador.ControladorPanelPrincipal;
import DAO.CRUDAdministrador;
import Modelo.Administrador;
import Principal.Main;
import Vista.VentanaPrincipal;
import Vista.auth.PanelLogin;
import Vista.auth.PanelRegister;
import Vista.auth.VentanaSesion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import utils.FrameUtils;
import utils.Messages;
import utils.StringUtils;

public class ControladorLogin implements ActionListener {
    VentanaSesion vista;
    PanelLogin panel;
    CRUDAdministrador crudAdministrador = new CRUDAdministrador();
    
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
            password = StringUtils.sha256(password);
            boolean adminExist = crudAdministrador.verificar(userName, password);
            if (adminExist) {
                if (Main.admin == null) System.out.println("something went wrong");
                vista.dispose();
                new ControladorPanelPrincipal(new VentanaPrincipal()).screen();
            } else {
                Messages.show("Credenciales incorrectas");
            }
        }
    }
    
}
