package Vista;

import java.awt.Color;

public class Login extends javax.swing.JFrame {

    int xMouse, yMouse;
    
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        nombreEmpresa_1 = new javax.swing.JLabel();
        nombreEmpresa_2 = new javax.swing.JLabel();
        nombreEmpresa_3 = new javax.swing.JLabel();
        banner = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        botonSalir = new javax.swing.JPanel();
        botonSalirLabel = new javax.swing.JLabel();
        faviconEmpresa = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        separador_1 = new javax.swing.JSeparator();
        userTxT = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        separador_2 = new javax.swing.JSeparator();
        passwordTxT = new javax.swing.JPasswordField();
        botonInicio = new javax.swing.JPanel();
        botonIniciarLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoFerreteria.png"))); // NOI18N
        background.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 290, 150));

        nombreEmpresa_1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        nombreEmpresa_1.setForeground(new java.awt.Color(255, 255, 255));
        nombreEmpresa_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreEmpresa_1.setText("GUMISA");
        background.add(nombreEmpresa_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 290, -1));

        nombreEmpresa_2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        nombreEmpresa_2.setForeground(new java.awt.Color(255, 255, 255));
        nombreEmpresa_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreEmpresa_2.setText("SAC");
        background.add(nombreEmpresa_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 290, -1));

        nombreEmpresa_3.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        nombreEmpresa_3.setForeground(new java.awt.Color(255, 255, 255));
        nombreEmpresa_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreEmpresa_3.setText("DISTRIBUCIONES");
        background.add(nombreEmpresa_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, 290, -1));

        banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BannerFerreteria.png"))); // NOI18N
        background.add(banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 290, 500));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        botonSalir.setBackground(new java.awt.Color(255, 255, 255));
        botonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonSalirMouseExited(evt);
            }
        });

        botonSalirLabel.setFont(new java.awt.Font("Roboto Light", 1, 24)); // NOI18N
        botonSalirLabel.setForeground(new java.awt.Color(0, 0, 0));
        botonSalirLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonSalirLabel.setText("X");

        javax.swing.GroupLayout botonSalirLayout = new javax.swing.GroupLayout(botonSalir);
        botonSalir.setLayout(botonSalirLayout);
        botonSalirLayout.setHorizontalGroup(
            botonSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonSalirLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
        );
        botonSalirLayout.setVerticalGroup(
            botonSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonSalirLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 774, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(botonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        background.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 50));

        faviconEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        faviconEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FaviconFerreteria.png"))); // NOI18N
        background.add(faviconEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 40, 40));

        titulo.setBackground(new java.awt.Color(255, 255, 255));
        titulo.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 0, 0));
        titulo.setText("INICIAR SESIÓN");
        background.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        userLabel.setBackground(new java.awt.Color(255, 255, 255));
        userLabel.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        userLabel.setForeground(new java.awt.Color(0, 0, 0));
        userLabel.setText("USUARIO");
        background.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));
        background.add(separador_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 257, 420, -1));

        userTxT.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        userTxT.setForeground(new java.awt.Color(153, 153, 153));
        userTxT.setText("Ingrese su nombre de usuario");
        userTxT.setBorder(null);
        userTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userTxTMousePressed(evt);
            }
        });
        background.add(userTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 420, 30));

        passwordLabel.setBackground(new java.awt.Color(255, 255, 255));
        passwordLabel.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(0, 0, 0));
        passwordLabel.setText("CONTRASEÑA");
        background.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));
        background.add(separador_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 420, 10));

        passwordTxT.setForeground(new java.awt.Color(204, 204, 204));
        passwordTxT.setText("***************");
        passwordTxT.setBorder(null);
        passwordTxT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passwordTxTMousePressed(evt);
            }
        });
        background.add(passwordTxT, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 420, 30));

        botonInicio.setBackground(new java.awt.Color(255, 102, 0));
        botonInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonInicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonInicioMouseExited(evt);
            }
        });

        botonIniciarLabel.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        botonIniciarLabel.setForeground(new java.awt.Color(255, 255, 255));
        botonIniciarLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botonIniciarLabel.setText("ENTRAR");

        javax.swing.GroupLayout botonInicioLayout = new javax.swing.GroupLayout(botonInicio);
        botonInicio.setLayout(botonInicioLayout);
        botonInicioLayout.setHorizontalGroup(
            botonInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonIniciarLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );
        botonInicioLayout.setVerticalGroup(
            botonInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botonIniciarLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        background.add(botonInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 420, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void botonSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalirMouseEntered
        botonSalir.setBackground(Color.red);
        botonSalirLabel.setForeground(Color.white);
    }//GEN-LAST:event_botonSalirMouseEntered

    private void botonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_botonSalirMouseClicked

    private void botonSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalirMouseExited
        botonSalir.setBackground(Color.white);
        botonSalirLabel.setForeground(Color.black);
    }//GEN-LAST:event_botonSalirMouseExited

    private void botonInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonInicioMouseExited
        botonInicio.setBackground(new Color(255,102,0));
    }//GEN-LAST:event_botonInicioMouseExited

    private void botonInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonInicioMouseEntered
        botonInicio.setBackground(new Color(255,102,0));
    }//GEN-LAST:event_botonInicioMouseEntered

    private void userTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTxTMousePressed
        if(userTxT.getText().equals("Ingrese su nombre de usuario")){
           userTxT.setText("");
           userTxT.setForeground(Color.black);
        }
        
        if (String.valueOf(passwordTxT.getPassword()).isEmpty()){
            passwordTxT.setText("***************");
            passwordTxT.setForeground(Color.gray);
        }
    }//GEN-LAST:event_userTxTMousePressed

    private void passwordTxTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordTxTMousePressed
        if(String.valueOf(passwordTxT.getPassword()).equals("***************")){
            passwordTxT.setText("");
            passwordTxT.setForeground(Color.black);
        }
  
        if (userTxT.getText().isEmpty()){
            userTxT.setText("Ingrese su nombre de usuario");
            userTxT.setForeground(Color.gray);
        }
    }//GEN-LAST:event_passwordTxTMousePressed

    private void botonInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonInicioMouseClicked
        //BOTON DE INICIO
    }//GEN-LAST:event_botonInicioMouseClicked

    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLabel banner;
    private javax.swing.JLabel botonIniciarLabel;
    private javax.swing.JPanel botonInicio;
    private javax.swing.JPanel botonSalir;
    private javax.swing.JLabel botonSalirLabel;
    private javax.swing.JLabel faviconEmpresa;
    private javax.swing.JPanel header;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel nombreEmpresa_1;
    private javax.swing.JLabel nombreEmpresa_2;
    private javax.swing.JLabel nombreEmpresa_3;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordTxT;
    private javax.swing.JSeparator separador_1;
    private javax.swing.JSeparator separador_2;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel userLabel;
    private javax.swing.JTextField userTxT;
    // End of variables declaration//GEN-END:variables
}
