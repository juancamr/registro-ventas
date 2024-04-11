/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Programmer
 */
public class VentanaBoleta extends javax.swing.JFrame {

    /**
     * Creates new form VentanaBoleta
     */
    public VentanaBoleta() {
        initComponents();
    }
    
    @Override
    public Image getIconImage() {
       Image icono = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/servimotos_icon.png"));
       return icono;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jtxtNombreCliente = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jtxtDniClienteBoleta = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblCompras = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jtxtFecha = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jtxtDireccionCliente = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jtxtNombreEmpresa = new javax.swing.JLabel();
        jtxtDireccion = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jtxtRuc = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jtxtNumeroBoleta = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jlblMontoTotal = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(105, 105, 118));
        jLabel10.setText("Cliente:");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 53, 40));

        jtxtNombreCliente.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jtxtNombreCliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxtNombreCliente.setBorder(null);
        jtxtNombreCliente.setFocusable(false);
        jtxtNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNombreClienteActionPerformed(evt);
            }
        });
        jPanel4.add(jtxtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 420, 20));

        jLabel12.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(105, 105, 118));
        jLabel12.setText("Documento de identidad:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 40));

        jtxtDniClienteBoleta.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jtxtDniClienteBoleta.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxtDniClienteBoleta.setBorder(null);
        jtxtDniClienteBoleta.setFocusable(false);
        jtxtDniClienteBoleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDniClienteBoletaActionPerformed(evt);
            }
        });
        jPanel4.add(jtxtDniClienteBoleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 140, 20));

        jLabel13.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(105, 105, 118));
        jLabel13.setText("Fecha: ");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, 40));

        jtblCompras.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        jtblCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtblCompras);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 480, 430));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 140, 20));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 420, 10));

        jtxtFecha.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jtxtFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtFecha.setBorder(null);
        jtxtFecha.setFocusable(false);
        jtxtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtFechaActionPerformed(evt);
            }
        });
        jPanel4.add(jtxtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 130, 20));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel4.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 130, 20));

        jLabel18.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(105, 105, 118));
        jLabel18.setText("Direccion:");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 60, 40));

        jtxtDireccionCliente.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jtxtDireccionCliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxtDireccionCliente.setBorder(null);
        jtxtDireccionCliente.setFocusable(false);
        jtxtDireccionCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDireccionClienteActionPerformed(evt);
            }
        });
        jPanel4.add(jtxtDireccionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 400, 20));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel4.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 400, 10));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, 580));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtNombreEmpresa.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jPanel5.add(jtxtNombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 130, 19));

        jtxtDireccion.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jPanel5.add(jtxtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 260, 20));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtRuc.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jtxtRuc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtRuc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtxtRuc.setFocusable(false);
        jtxtRuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtRucActionPerformed(evt);
            }
        });
        jPanel3.add(jtxtRuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 30));

        jTextField2.setBackground(new java.awt.Color(20, 23, 31));
        jTextField2.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("BOLETA DE VENTA");
        jTextField2.setBorder(null);
        jTextField2.setFocusable(false);
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 170, 30));

        jtxtNumeroBoleta.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jtxtNumeroBoleta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtNumeroBoleta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtxtNumeroBoleta.setFocusable(false);
        jPanel3.add(jtxtNumeroBoleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 170, 30));

        jPanel5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 170, -1));

        jLabel17.setBackground(new java.awt.Color(14, 14, 23));
        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 26)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(14, 14, 23));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("servimotos");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 23, 140, 40));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 530, -1));

        jlblMontoTotal.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jPanel2.add(jlblMontoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 700, 60, 30));

        jLabel11.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jLabel11.setText("Total: S/");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 700, 60, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNombreClienteActionPerformed

    private void jtxtDniClienteBoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDniClienteBoletaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtDniClienteBoletaActionPerformed

    private void jtxtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtFechaActionPerformed

    private void jtxtDireccionClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDireccionClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtDireccionClienteActionPerformed

    private void jtxtRucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtRucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtRucActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaBoleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaBoleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaBoleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaBoleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaBoleta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField jTextField2;
    public javax.swing.JLabel jlblMontoTotal;
    public javax.swing.JTable jtblCompras;
    public javax.swing.JLabel jtxtDireccion;
    public javax.swing.JTextField jtxtDireccionCliente;
    public javax.swing.JTextField jtxtDniClienteBoleta;
    public javax.swing.JTextField jtxtFecha;
    public javax.swing.JTextField jtxtNombreCliente;
    public javax.swing.JLabel jtxtNombreEmpresa;
    public javax.swing.JTextField jtxtNumeroBoleta;
    public javax.swing.JTextField jtxtRuc;
    // End of variables declaration//GEN-END:variables
}
