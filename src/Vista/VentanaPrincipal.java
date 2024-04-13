
package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.io.InputStream;

public class VentanaPrincipal extends javax.swing.JFrame {
    
    Color base = new Color(20,23,31);
    Color focus = new Color(55, 58, 64);
    Color foregroundColorFocus = new Color(255, 255, 254);
    Color foregroundColorBase = new Color(170,170,170);
    
    boolean botonHome = true;
    boolean botonNuevaVenta = false;
    public boolean botonRepuestos = false;
    boolean botonReporte = false;
    public boolean botonClientes = false;
    boolean consultarReporte = false;
    boolean consultarBoleta = false;
    
    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(this);
    }
    
    public void turnAllFalse() {
        botonHome = false;
        botonNuevaVenta = false;
        botonRepuestos = false;
        botonReporte = false;
        botonClientes = false;
        consultarReporte = false;
        consultarBoleta = false;
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

        jpnlBarra = new javax.swing.JPanel();
        try(InputStream is = getClass().getResourceAsStream("/Recursos/Font Awesome 6 Free-Solid-900.otf")){
            Font fontAwesome = Font.createFont(Font.TRUETYPE_FONT, is);
            fontAwesome = fontAwesome.deriveFont(Font.PLAIN, 14f);
            jlblHomeIcon = new javax.swing.JLabel();
            jlblHomeIcon.setFont(fontAwesome);
        }catch (IOException | FontFormatException exp) {
            exp.printStackTrace();
        }
        jbtnHome = new javax.swing.JButton();
        jbtnClientes = new javax.swing.JButton();
        jbtnRepuestos = new javax.swing.JButton();
        jbtnReporteDia = new javax.swing.JButton();
        jbtnConsultarReporte = new javax.swing.JButton();
        jbtnConsultarBoleta = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbtnNuevaVenta = new javax.swing.JButton();
        try(InputStream is = getClass().getResourceAsStream("/Recursos/Font Awesome 6 Free-Solid-900.otf")){
            Font fontAwesome = Font.createFont(Font.TRUETYPE_FONT, is);
            fontAwesome = fontAwesome.deriveFont(Font.PLAIN, 14f);
            jlblConsultaBoleta = new javax.swing.JLabel();
            jlblConsultaBoleta.setFont(fontAwesome);
        }catch (IOException | FontFormatException exp) {
            exp.printStackTrace();
        }
        try(InputStream is = getClass().getResourceAsStream("/Recursos/Font Awesome 6 Free-Solid-900.otf")){
            Font fontAwesome = Font.createFont(Font.TRUETYPE_FONT, is);
            fontAwesome = fontAwesome.deriveFont(Font.PLAIN, 14f);
            jlblVentaIcon = new javax.swing.JLabel();
            jlblVentaIcon.setFont(fontAwesome);
        }catch (IOException | FontFormatException exp) {
            exp.printStackTrace();
        }
        try(InputStream is = getClass().getResourceAsStream("/Recursos/Font Awesome 6 Free-Solid-900.otf")){
            Font fontAwesome = Font.createFont(Font.TRUETYPE_FONT, is);
            fontAwesome = fontAwesome.deriveFont(Font.PLAIN, 14f);
            jlblRepuestosIcon = new javax.swing.JLabel();
            jlblRepuestosIcon.setFont(fontAwesome);
        }catch (IOException | FontFormatException exp) {
            exp.printStackTrace();
        }
        try(InputStream is = getClass().getResourceAsStream("/Recursos/Font Awesome 6 Free-Solid-900.otf")){
            Font fontAwesome = Font.createFont(Font.TRUETYPE_FONT, is);
            fontAwesome = fontAwesome.deriveFont(Font.PLAIN, 14f);
            jlblReporteIcon = new javax.swing.JLabel();
            jlblReporteIcon.setFont(fontAwesome);
        }catch (IOException | FontFormatException exp) {
            exp.printStackTrace();
        }
        try(InputStream is = getClass().getResourceAsStream("/Recursos/Font Awesome 6 Free-Solid-900.otf")){
            Font fontAwesome = Font.createFont(Font.TRUETYPE_FONT, is);
            fontAwesome = fontAwesome.deriveFont(Font.PLAIN, 14f);
            jlblClientesIcon = new javax.swing.JLabel();
            jlblClientesIcon.setFont(fontAwesome);
        }catch (IOException | FontFormatException exp) {
            exp.printStackTrace();
        }
        try(InputStream is = getClass().getResourceAsStream("/Recursos/Font Awesome 6 Free-Solid-900.otf")){
            Font fontAwesome = Font.createFont(Font.TRUETYPE_FONT, is);
            fontAwesome = fontAwesome.deriveFont(Font.PLAIN, 14f);
            jlblConsultarReporte = new javax.swing.JLabel();
            jlblConsultarReporte.setFont(fontAwesome);
        }catch (IOException | FontFormatException exp) {
            exp.printStackTrace();
        }
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(getIconImage());
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpnlBarra.setBackground(new java.awt.Color(20, 23, 31));
        jpnlBarra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblHomeIcon.setBackground(new java.awt.Color(55, 58, 64));
        jlblHomeIcon.setForeground(new java.awt.Color(255, 255, 255));
        jlblHomeIcon.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblHomeIcon.setText("\uf015");
        jlblHomeIcon.setOpaque(true);
        jpnlBarra.add(jlblHomeIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 30, 50));

        jbtnHome.setBackground(new java.awt.Color(55, 58, 64));
        jbtnHome.setFont(new java.awt.Font("Malgun Gothic", 1, 16)); // NOI18N
        jbtnHome.setForeground(new java.awt.Color(255, 255, 255));
        jbtnHome.setText("    Home");
        jbtnHome.setBorder(null);
        jbtnHome.setFocusable(false);
        jbtnHome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtnHome.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jbtnHomeMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jbtnHomeMouseMoved(evt);
            }
        });
        jbtnHome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jbtnHomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jbtnHomeFocusLost(evt);
            }
        });
        jbtnHome.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jbtnHomeMouseWheelMoved(evt);
            }
        });
        jbtnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnHomeMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnHomeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbtnHomeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbtnHomeMouseReleased(evt);
            }
        });
        jbtnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnHomeActionPerformed(evt);
            }
        });
        jpnlBarra.add(jbtnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 130, 50));

        jbtnClientes.setBackground(new java.awt.Color(20, 23, 31));
        jbtnClientes.setFont(new java.awt.Font("Malgun Gothic", 0, 16)); // NOI18N
        jbtnClientes.setForeground(new java.awt.Color(205, 207, 208));
        jbtnClientes.setText("    Clientes");
        jbtnClientes.setBorder(null);
        jbtnClientes.setFocusable(false);
        jbtnClientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtnClientes.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jbtnClientesMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jbtnClientesMouseMoved(evt);
            }
        });
        jbtnClientes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jbtnClientesFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jbtnClientesFocusLost(evt);
            }
        });
        jbtnClientes.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jbtnClientesMouseWheelMoved(evt);
            }
        });
        jbtnClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnClientesMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbtnClientesMouseReleased(evt);
            }
        });
        jbtnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnClientesActionPerformed(evt);
            }
        });
        jpnlBarra.add(jbtnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 130, 50));

        jbtnRepuestos.setBackground(new java.awt.Color(20, 23, 31));
        jbtnRepuestos.setFont(new java.awt.Font("Malgun Gothic", 0, 16)); // NOI18N
        jbtnRepuestos.setForeground(new java.awt.Color(205, 207, 208));
        jbtnRepuestos.setText("    Repuestos");
        jbtnRepuestos.setBorder(null);
        jbtnRepuestos.setFocusable(false);
        jbtnRepuestos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtnRepuestos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jbtnRepuestosMouseMoved(evt);
            }
        });
        jbtnRepuestos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnRepuestosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnRepuestosMouseExited(evt);
            }
        });
        jbtnRepuestos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRepuestosActionPerformed(evt);
            }
        });
        jpnlBarra.add(jbtnRepuestos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 130, 50));

        jbtnReporteDia.setBackground(new java.awt.Color(20, 23, 31));
        jbtnReporteDia.setFont(new java.awt.Font("Malgun Gothic", 0, 16)); // NOI18N
        jbtnReporteDia.setForeground(new java.awt.Color(205, 207, 208));
        jbtnReporteDia.setText("    Reporte");
        jbtnReporteDia.setBorder(null);
        jbtnReporteDia.setFocusable(false);
        jbtnReporteDia.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtnReporteDia.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jbtnReporteDiaMouseMoved(evt);
            }
        });
        jbtnReporteDia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnReporteDiaMouseExited(evt);
            }
        });
        jbtnReporteDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnReporteDiaActionPerformed(evt);
            }
        });
        jpnlBarra.add(jbtnReporteDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 130, 50));

        jbtnConsultarReporte.setBackground(new java.awt.Color(20, 23, 31));
        jbtnConsultarReporte.setFont(new java.awt.Font("Malgun Gothic", 0, 16)); // NOI18N
        jbtnConsultarReporte.setForeground(new java.awt.Color(205, 207, 208));
        jbtnConsultarReporte.setText("    Reporte");
        jbtnConsultarReporte.setBorder(null);
        jbtnConsultarReporte.setFocusable(false);
        jbtnConsultarReporte.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtnConsultarReporte.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jbtnConsultarReporteMouseMoved(evt);
            }
        });
        jbtnConsultarReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnConsultarReporteMouseExited(evt);
            }
        });
        jbtnConsultarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnConsultarReporteActionPerformed(evt);
            }
        });
        jpnlBarra.add(jbtnConsultarReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 130, 50));

        jbtnConsultarBoleta.setBackground(new java.awt.Color(20, 23, 31));
        jbtnConsultarBoleta.setFont(new java.awt.Font("Malgun Gothic", 0, 16)); // NOI18N
        jbtnConsultarBoleta.setForeground(new java.awt.Color(205, 207, 208));
        jbtnConsultarBoleta.setText("    Boleta");
        jbtnConsultarBoleta.setBorder(null);
        jbtnConsultarBoleta.setFocusable(false);
        jbtnConsultarBoleta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtnConsultarBoleta.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jbtnConsultarBoletaMouseMoved(evt);
            }
        });
        jbtnConsultarBoleta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnConsultarBoletaMouseExited(evt);
            }
        });
        jbtnConsultarBoleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnConsultarBoletaActionPerformed(evt);
            }
        });
        jpnlBarra.add(jbtnConsultarBoleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, 130, 50));

        jLabel4.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(101, 101, 116));
        jLabel4.setText("Servimotos S.A.C");
        jpnlBarra.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 730, -1, -1));

        jLabel2.setBackground(new java.awt.Color(241, 240, 243));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(241, 240, 243));
        jLabel2.setText("servimotos");
        jpnlBarra.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jbtnNuevaVenta.setBackground(new java.awt.Color(20, 23, 31));
        jbtnNuevaVenta.setFont(new java.awt.Font("Malgun Gothic", 0, 16)); // NOI18N
        jbtnNuevaVenta.setForeground(new java.awt.Color(205, 207, 208));
        jbtnNuevaVenta.setText("    Venta");
        jbtnNuevaVenta.setBorder(null);
        jbtnNuevaVenta.setFocusable(false);
        jbtnNuevaVenta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtnNuevaVenta.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jbtnNuevaVentaMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jbtnNuevaVentaMouseMoved(evt);
            }
        });
        jbtnNuevaVenta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jbtnNuevaVentaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jbtnNuevaVentaFocusLost(evt);
            }
        });
        jbtnNuevaVenta.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jbtnNuevaVentaMouseWheelMoved(evt);
            }
        });
        jbtnNuevaVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnNuevaVentaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnNuevaVentaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbtnNuevaVentaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jbtnNuevaVentaMouseReleased(evt);
            }
        });
        jbtnNuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNuevaVentaActionPerformed(evt);
            }
        });
        jpnlBarra.add(jbtnNuevaVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 130, 50));

        jlblConsultaBoleta.setBackground(new java.awt.Color(20, 23, 31));
        jlblConsultaBoleta.setForeground(new java.awt.Color(205, 207, 208));
        jlblConsultaBoleta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblConsultaBoleta.setText("\uf46c");
        jlblConsultaBoleta.setOpaque(true);
        jpnlBarra.add(jlblConsultaBoleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 30, 50));

        jlblVentaIcon.setBackground(new java.awt.Color(20, 23, 31));
        jlblVentaIcon.setForeground(new java.awt.Color(205, 207, 208));
        jlblVentaIcon.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblVentaIcon.setText("\uf788");
        jlblVentaIcon.setOpaque(true);
        jpnlBarra.add(jlblVentaIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 30, 50));

        jlblRepuestosIcon.setBackground(new java.awt.Color(20, 23, 31));
        jlblRepuestosIcon.setForeground(new java.awt.Color(205, 207, 208));
        jlblRepuestosIcon.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblRepuestosIcon.setText("\uf1c0");
        jlblRepuestosIcon.setOpaque(true);
        jpnlBarra.add(jlblRepuestosIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 30, 50));

        jlblReporteIcon.setBackground(new java.awt.Color(20, 23, 31));
        jlblReporteIcon.setForeground(new java.awt.Color(205, 207, 208));
        jlblReporteIcon.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblReporteIcon.setText("\uf201");
        jlblReporteIcon.setOpaque(true);
        jpnlBarra.add(jlblReporteIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 30, 50));

        jlblClientesIcon.setBackground(new java.awt.Color(20, 23, 31));
        jlblClientesIcon.setForeground(new java.awt.Color(205, 207, 208));
        jlblClientesIcon.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblClientesIcon.setText("\uf007");
        jlblClientesIcon.setOpaque(true);
        jpnlBarra.add(jlblClientesIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 30, 50));

        jlblConsultarReporte.setBackground(new java.awt.Color(20, 23, 31));
        jlblConsultarReporte.setForeground(new java.awt.Color(205, 207, 208));
        jlblConsultarReporte.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlblConsultarReporte.setText("\uf073");
        jlblConsultarReporte.setOpaque(true);
        jpnlBarra.add(jlblConsultarReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 30, 50));

        jLabel6.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(181, 181, 186));
        jLabel6.setText("CONSULTAS");
        jpnlBarra.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        jLabel7.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(181, 181, 186));
        jLabel7.setText("Administrador");
        jpnlBarra.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 710, -1, -1));

        jLabel8.setFont(new java.awt.Font("Malgun Gothic", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(181, 181, 186));
        jLabel8.setText("Administrador");
        jpnlBarra.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 710, -1, -1));

        jLabel9.setFont(new java.awt.Font("Malgun Gothic", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(181, 181, 186));
        jLabel9.setText("MAIN MENU");
        jpnlBarra.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        getContentPane().add(jpnlBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 790));

        content.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 840, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnHomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jbtnHomeFocusGained
        
    }//GEN-LAST:event_jbtnHomeFocusGained

    private void jbtnHomeMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnHomeMouseDragged

    }//GEN-LAST:event_jbtnHomeMouseDragged

    private void jbtnHomeMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnHomeMouseMoved
        if (botonHome == false) {
            jbtnHome.setBackground(focus);
            jlblHomeIcon.setBackground(focus);
        }
    }//GEN-LAST:event_jbtnHomeMouseMoved

    private void jbtnHomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jbtnHomeFocusLost
        //
    }//GEN-LAST:event_jbtnHomeFocusLost

    private void jbtnHomeMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jbtnHomeMouseWheelMoved
        
    }//GEN-LAST:event_jbtnHomeMouseWheelMoved

    private void jbtnHomeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnHomeMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnHomeMouseReleased

    private void jbtnHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnHomeMouseExited
        if (botonHome == false) {
            jbtnHome.setBackground(base);
            jlblHomeIcon.setBackground(base);
        }
    }//GEN-LAST:event_jbtnHomeMouseExited

    private void jbtnRepuestosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnRepuestosMouseMoved
        if (botonRepuestos == false) {
            jbtnRepuestos.setBackground(focus);
            jlblRepuestosIcon.setBackground(focus);
        }
    }//GEN-LAST:event_jbtnRepuestosMouseMoved

    private void jbtnRepuestosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnRepuestosMouseExited
        if (botonRepuestos == false) {
            jbtnRepuestos.setBackground(base);
            jlblRepuestosIcon.setBackground(base);
        }
    }//GEN-LAST:event_jbtnRepuestosMouseExited

    private void jbtnConsultarBoletaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnConsultarBoletaMouseMoved
        if (consultarBoleta == false) {
            jbtnConsultarBoleta.setBackground(focus);
            jlblConsultaBoleta.setBackground(focus);
        }
    }//GEN-LAST:event_jbtnConsultarBoletaMouseMoved

    private void jbtnConsultarBoletaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnConsultarBoletaMouseExited
        if (consultarBoleta == false) {
            jbtnConsultarBoleta.setBackground(base);
            jlblConsultaBoleta.setBackground(base);
        }
    }//GEN-LAST:event_jbtnConsultarBoletaMouseExited

    private void jbtnConsultarReporteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnConsultarReporteMouseExited
        if (consultarReporte == false) {
            jbtnConsultarReporte.setBackground(base);
            jlblConsultarReporte.setBackground(base);
        }
    }//GEN-LAST:event_jbtnConsultarReporteMouseExited

    private void jbtnConsultarReporteMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnConsultarReporteMouseMoved
        if (consultarReporte == false) {
            jbtnConsultarReporte.setBackground(focus);
            jlblConsultarReporte.setBackground(focus);
        }
    }//GEN-LAST:event_jbtnConsultarReporteMouseMoved

    private void jbtnReporteDiaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnReporteDiaMouseExited
        if (botonReporte == false) {
            jbtnReporteDia.setBackground(base);
            jlblReporteIcon.setBackground(base);
        }
    }//GEN-LAST:event_jbtnReporteDiaMouseExited

    private void jbtnReporteDiaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnReporteDiaMouseMoved
        if (botonReporte == false) {
            jbtnReporteDia.setBackground(focus);
            jlblReporteIcon.setBackground(focus);
        }
    }//GEN-LAST:event_jbtnReporteDiaMouseMoved

    private void jbtnClientesMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnClientesMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnClientesMouseDragged

    private void jbtnClientesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnClientesMouseMoved
        if (botonClientes == false) {
            jbtnClientes.setBackground(focus);
            jlblClientesIcon.setBackground(focus);
        }
    }//GEN-LAST:event_jbtnClientesMouseMoved

    private void jbtnClientesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jbtnClientesFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnClientesFocusGained

    private void jbtnClientesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jbtnClientesFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnClientesFocusLost

    private void jbtnClientesMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jbtnClientesMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnClientesMouseWheelMoved

    private void jbtnClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnClientesMouseExited
       if (botonClientes == false) {
            jbtnClientes.setBackground(base);
            jlblClientesIcon.setBackground(base);
        }
    }//GEN-LAST:event_jbtnClientesMouseExited

    private void jbtnClientesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnClientesMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnClientesMouseReleased

    private void jbtnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnHomeActionPerformed
        turnAllFalse();
        botonHome = true;
    }//GEN-LAST:event_jbtnHomeActionPerformed

    private void jbtnNuevaVentaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnNuevaVentaMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnNuevaVentaMouseDragged

    private void jbtnNuevaVentaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnNuevaVentaMouseMoved
        if (botonNuevaVenta == false) {
            jbtnNuevaVenta.setBackground(focus);
            jlblVentaIcon.setBackground(focus);
        }
    }//GEN-LAST:event_jbtnNuevaVentaMouseMoved
    
    private void jbtnNuevaVentaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jbtnNuevaVentaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnNuevaVentaFocusGained

    private void jbtnNuevaVentaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jbtnNuevaVentaFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnNuevaVentaFocusLost

    private void jbtnNuevaVentaMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jbtnNuevaVentaMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnNuevaVentaMouseWheelMoved

    private void jbtnNuevaVentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnNuevaVentaMouseExited
        if (botonNuevaVenta == false) {
            jbtnNuevaVenta.setBackground(base);
            jlblVentaIcon.setBackground(base);
        }
    }//GEN-LAST:event_jbtnNuevaVentaMouseExited

    private void jbtnNuevaVentaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnNuevaVentaMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnNuevaVentaMouseReleased

    private void jbtnNuevaVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnNuevaVentaMouseClicked
        //
    }//GEN-LAST:event_jbtnNuevaVentaMouseClicked

    private void jbtnRepuestosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnRepuestosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnRepuestosMouseClicked

    private void jbtnNuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevaVentaActionPerformed
        turnAllFalse();
        botonNuevaVenta = true;
    }//GEN-LAST:event_jbtnNuevaVentaActionPerformed

    private void jbtnRepuestosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRepuestosActionPerformed
        turnAllFalse();
        botonRepuestos = true;
    }//GEN-LAST:event_jbtnRepuestosActionPerformed

    private void jbtnReporteDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnReporteDiaActionPerformed
        turnAllFalse();
        botonReporte = true;
    }//GEN-LAST:event_jbtnReporteDiaActionPerformed

    private void jbtnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnClientesActionPerformed
        turnAllFalse();
        botonClientes = true;
    }//GEN-LAST:event_jbtnClientesActionPerformed

    private void jbtnConsultarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnConsultarReporteActionPerformed
        turnAllFalse();
        consultarReporte = true;
    }//GEN-LAST:event_jbtnConsultarReporteActionPerformed

    private void jbtnConsultarBoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnConsultarBoletaActionPerformed
        turnAllFalse();
        consultarBoleta = true;
    }//GEN-LAST:event_jbtnConsultarBoletaActionPerformed

    private void jbtnHomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnHomeMousePressed
        
    }//GEN-LAST:event_jbtnHomeMousePressed

    private void jbtnNuevaVentaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnNuevaVentaMousePressed
        
    }//GEN-LAST:event_jbtnNuevaVentaMousePressed

    private void jbtnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnHomeMouseClicked
        
    }//GEN-LAST:event_jbtnHomeMouseClicked

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel content;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JButton jbtnClientes;
    public javax.swing.JButton jbtnConsultarBoleta;
    public javax.swing.JButton jbtnConsultarReporte;
    public javax.swing.JButton jbtnHome;
    public javax.swing.JButton jbtnNuevaVenta;
    public javax.swing.JButton jbtnReporteDia;
    public javax.swing.JButton jbtnRepuestos;
    public javax.swing.JLabel jlblClientesIcon;
    public javax.swing.JLabel jlblConsultaBoleta;
    public javax.swing.JLabel jlblConsultarReporte;
    public javax.swing.JLabel jlblHomeIcon;
    public javax.swing.JLabel jlblReporteIcon;
    public javax.swing.JLabel jlblRepuestosIcon;
    public javax.swing.JLabel jlblVentaIcon;
    private javax.swing.JPanel jpnlBarra;
    // End of variables declaration//GEN-END:variables
}