/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Formato.Messages;
import java.awt.Color;
import Controlador.*;
import java.awt.event.KeyEvent;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author Programmer
 */
public class PanelVenta extends javax.swing.JPanel {

    /**
     * Creates new form NuevaVenta
     */
    public PanelVenta() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnlInterfaz = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtxtCodigoProducto = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jbtnBuscarProducto = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jtxtNombreProducto = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jtxtPrecioUnidad = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jspnCantidad = new javax.swing.JSpinner();
        jbtnAgregarCompra = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtDniBusqueda = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jbtnBuscarCliente = new javax.swing.JButton();
        jbtnRegistrarCliente = new javax.swing.JButton();
        jbtnSaberMas = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jtxtNombreCliente = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jtxtDniCliente = new javax.swing.JTextField();
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
        jbtnDelete = new javax.swing.JButton();
        jbtnClear = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jtxtNombreEmpresa = new javax.swing.JLabel();
        jtxtDireccion = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jtxtRuc = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jtxtNumeroBoleta = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jlblTotalBoleta = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jbtnGenerarBoleta = new javax.swing.JButton();

        jpnlInterfaz.setBackground(new java.awt.Color(255, 255, 255));
        jpnlInterfaz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpnlInterfazMouseClicked(evt);
            }
        });
        jpnlInterfaz.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel6MousePressed(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Malgun Gothic", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(105, 105, 118));
        jLabel2.setText("Codigo");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 282, -1, 30));

        jtxtCodigoProducto.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        jtxtCodigoProducto.setBorder(null);
        jPanel6.add(jtxtCodigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 130, 30));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel6.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 130, 10));

        jbtnBuscarProducto.setBackground(new java.awt.Color(255, 255, 254));
        jbtnBuscarProducto.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jbtnBuscarProducto.setText("BUSCAR");
        jPanel6.add(jbtnBuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 90, 30));

        jLabel4.setFont(new java.awt.Font("Malgun Gothic", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(105, 105, 118));
        jLabel4.setText("Descripcion");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 372, -1, 30));

        jtxtNombreProducto.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        jtxtNombreProducto.setBorder(null);
        jtxtNombreProducto.setFocusable(false);
        jPanel6.add(jtxtNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 230, 30));

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel6.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 230, 10));

        jLabel5.setFont(new java.awt.Font("Malgun Gothic", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(105, 105, 118));
        jLabel5.setText("Cantidad");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 552, -1, 30));

        jtxtPrecioUnidad.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        jtxtPrecioUnidad.setBorder(null);
        jtxtPrecioUnidad.setFocusable(false);
        jPanel6.add(jtxtPrecioUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 130, 30));

        jSeparator6.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel6.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 130, 10));

        jLabel6.setFont(new java.awt.Font("Malgun Gothic", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(105, 105, 118));
        jLabel6.setText("Precio");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 462, -1, 30));
        jPanel6.add(jspnCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, 120, 30));

        jbtnAgregarCompra.setBackground(new java.awt.Color(255, 255, 254));
        jbtnAgregarCompra.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jbtnAgregarCompra.setForeground(new java.awt.Color(16, 44, 84));
        jbtnAgregarCompra.setText("+");
        jbtnAgregarCompra.setBorder(null);
        jPanel6.add(jbtnAgregarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, 80, 90));

        jLabel22.setFont(new java.awt.Font("Malgun Gothic", 0, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(14, 14, 23));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Repuesto");
        jPanel6.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 140, 40));

        jLabel23.setFont(new java.awt.Font("Malgun Gothic", 0, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(14, 14, 23));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Cliente");
        jPanel6.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 100, 40));

        jLabel3.setFont(new java.awt.Font("Malgun Gothic", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(105, 105, 118));
        jLabel3.setText("DNI");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 92, -1, 30));

        jtxtDniBusqueda.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        jtxtDniBusqueda.setBorder(null);
        jPanel6.add(jtxtDniBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 150, 30));

        jSeparator7.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel6.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 150, 10));

        jbtnBuscarCliente.setBackground(new java.awt.Color(255, 255, 254));
        jbtnBuscarCliente.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jbtnBuscarCliente.setText("SET");
        jPanel6.add(jbtnBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 70, 30));

        jbtnRegistrarCliente.setBackground(new java.awt.Color(255, 255, 254));
        jbtnRegistrarCliente.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jbtnRegistrarCliente.setForeground(new java.awt.Color(0, 51, 153));
        jbtnRegistrarCliente.setText("No esta registrado? Registralo.");
        jbtnRegistrarCliente.setBorder(null);
        jPanel6.add(jbtnRegistrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 190, 30));

        jbtnSaberMas.setBackground(new java.awt.Color(255, 255, 254));
        jbtnSaberMas.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jbtnSaberMas.setForeground(new java.awt.Color(0, 51, 153));
        jbtnSaberMas.setText("Saber mas del repuesto...");
        jbtnSaberMas.setBorder(null);
        jbtnSaberMas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel6.add(jbtnSaberMas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 650, 180, 30));

        jpnlInterfaz.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 790));

        jPanel2.setBackground(new java.awt.Color(252, 252, 252));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 243, 243)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(105, 105, 118));
        jLabel10.setText("Cliente:");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 53, 40));

        jtxtNombreCliente.setBackground(new java.awt.Color(252, 252, 252));
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

        jLabel12.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(105, 105, 118));
        jLabel12.setText("Documento de identidad:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 40));

        jtxtDniCliente.setBackground(new java.awt.Color(252, 252, 252));
        jtxtDniCliente.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jtxtDniCliente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtxtDniCliente.setBorder(null);
        jtxtDniCliente.setFocusable(false);
        jtxtDniCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDniClienteActionPerformed(evt);
            }
        });
        jPanel4.add(jtxtDniCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 140, 20));

        jLabel13.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
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
        jtblCompras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtblComprasKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtblComprasKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtblCompras);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 480, 420));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 140, 20));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 420, 10));

        jtxtFecha.setBackground(new java.awt.Color(252, 252, 252));
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

        jLabel18.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(105, 105, 118));
        jLabel18.setText("Direccion:");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 60, 40));

        jtxtDireccionCliente.setBackground(new java.awt.Color(252, 252, 252));
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

        jbtnDelete.setBackground(new java.awt.Color(255, 255, 254));
        jbtnDelete.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jbtnDelete.setText("X");
        jPanel4.add(jbtnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 50, 30));

        jbtnClear.setBackground(new java.awt.Color(255, 255, 254));
        jbtnClear.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jbtnClear.setText("CLEAR");
        jPanel4.add(jbtnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 70, 30));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, 580));

        jPanel5.setBackground(new java.awt.Color(252, 252, 252));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtNombreEmpresa.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jPanel5.add(jtxtNombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 130, 19));

        jtxtDireccion.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jPanel5.add(jtxtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 260, 20));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtRuc.setBackground(new java.awt.Color(252, 252, 252));
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

        jtxtNumeroBoleta.setBackground(new java.awt.Color(252, 252, 252));
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

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, 530, -1));

        jlblTotalBoleta.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jPanel2.add(jlblTotalBoleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 710, 60, 30));

        jLabel11.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        jLabel11.setText("Total: S/");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 710, 60, 30));

        jbtnGenerarBoleta.setBackground(new java.awt.Color(255, 255, 254));
        jbtnGenerarBoleta.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        jbtnGenerarBoleta.setText("GENERAR BOLETA");
        jPanel2.add(jbtnGenerarBoleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 710, 200, 40));

        jpnlInterfaz.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 540, 790));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlInterfaz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlInterfaz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jpnlInterfazMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnlInterfazMouseClicked

    }//GEN-LAST:event_jpnlInterfazMouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        //
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MousePressed

    }//GEN-LAST:event_jPanel6MousePressed

    private void jtxtNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNombreClienteActionPerformed

    private void jtxtDniClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDniClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtDniClienteActionPerformed

    private void jtxtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtFechaActionPerformed

    private void jtxtDireccionClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDireccionClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtDireccionClienteActionPerformed

    private void jtxtRucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtRucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtRucActionPerformed

    private void jtblComprasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtblComprasKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtblComprasKeyPressed

    private void jtblComprasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtblComprasKeyReleased
//      
    }//GEN-LAST:event_jtblComprasKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField jTextField2;
    public javax.swing.JButton jbtnAgregarCompra;
    public javax.swing.JButton jbtnBuscarCliente;
    public javax.swing.JButton jbtnBuscarProducto;
    public javax.swing.JButton jbtnClear;
    public javax.swing.JButton jbtnDelete;
    public javax.swing.JButton jbtnGenerarBoleta;
    public javax.swing.JButton jbtnRegistrarCliente;
    public javax.swing.JButton jbtnSaberMas;
    public javax.swing.JLabel jlblTotalBoleta;
    private javax.swing.JPanel jpnlInterfaz;
    public javax.swing.JSpinner jspnCantidad;
    public javax.swing.JTable jtblCompras;
    public javax.swing.JTextField jtxtCodigoProducto;
    public javax.swing.JLabel jtxtDireccion;
    public javax.swing.JTextField jtxtDireccionCliente;
    public javax.swing.JTextField jtxtDniBusqueda;
    public javax.swing.JTextField jtxtDniCliente;
    public javax.swing.JTextField jtxtFecha;
    public javax.swing.JTextField jtxtNombreCliente;
    public javax.swing.JLabel jtxtNombreEmpresa;
    public javax.swing.JTextField jtxtNombreProducto;
    public javax.swing.JTextField jtxtNumeroBoleta;
    public javax.swing.JTextField jtxtPrecioUnidad;
    public javax.swing.JTextField jtxtRuc;
    // End of variables declaration//GEN-END:variables
}