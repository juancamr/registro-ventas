package Controlador.auth;

import Controlador.ControladorPanelPrincipal;
import DAO.CRUDAdministrador;
import Modelo.Administrador;
import Vista.VentanaPrincipal;
import Vista.auth.PanelLogin;
import Vista.auth.PanelRegister;
import Vista.auth.VentanaSesion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import utils.FrameUtils;
import utils.Messages;
import utils.StringUtils;

public class ControladorRegistro implements ActionListener {

    VentanaSesion vista;
    PanelRegister panel;
    CRUDAdministrador crudAdministrador = new CRUDAdministrador();

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
            String password = String.valueOf(panel.jPassword.getPassword());
            password = StringUtils.sha256(password);
            boolean success = crudAdministrador.registrar(new Administrador(nombres, userName, password));
            if (success) {
                vista.dispose();
                new ControladorPanelPrincipal(new VentanaPrincipal()).screen();
            } else {
                Messages.show("Error al intentar registrar");
            }
        }
    }

}
