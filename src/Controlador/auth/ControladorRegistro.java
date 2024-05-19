package Controlador.auth;

import Controlador.ControladorPanelPrincipal;
import DAO.CRUDAdministrador;
import Modelo.Administrador;
import Modelo.Response;
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
            String usernameRegex = "^[a-z]{3,15}$";
            String passwordRegex = "^[a-z]{8,}$";
            
            String nombres = panel.jtxtNombresCompletos.getText();
            String userName = panel.jtxtNombreUsuario.getText();
            String password = String.valueOf(panel.jPassword.getPassword());
            
            if (!userName.isEmpty() || !password.isEmpty() || !nombres.isEmpty()) {
                if (userName.matches(usernameRegex)) {
                   if (password.matches(passwordRegex)) {
                       password = StringUtils.sha256(password);
                       Response<Administrador> response = crudAdministrador.registrar(new Administrador(nombres, userName, password));
                       
                       if (response.isSuccess()) {
                           vista.dispose();
                           new ControladorPanelPrincipal(new VentanaPrincipal()).screen();
                       }
                       Messages.show(response.getMessage());
                   } else Messages.show("Contraseña invalida, recuerda que debe ser almenos de 8 caracteres");
                } else Messages.show("Ingrese un nombre de usuario valido");
            } else Messages.show("Complete todos los campos");
        }
    }

}
