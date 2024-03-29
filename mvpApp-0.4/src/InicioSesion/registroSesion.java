/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package InicioSesion;

import java.awt.BorderLayout;
import java.awt.Color;
import Automatizacion.boton;
import Home.Interface;

/**
 *
 * @author daniel
 */
public class registroSesion extends javax.swing.JPanel {

    /**
     * Creates new form registroSesion
     */
    public registroSesion() {
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

        PanelRegistro = new javax.swing.JPanel();
        bInicoSesion = new javax.swing.JButton();
        pLogo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pRegister = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tMail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tPass = new javax.swing.JPasswordField();
        tPassConfirm = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        PanelRegistro.setPreferredSize(new java.awt.Dimension(280, 470));

        bInicoSesion.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        bInicoSesion.setText("<");
        bInicoSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInicoSesionActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("Registrate en");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("MVP app");

        javax.swing.GroupLayout pLogoLayout = new javax.swing.GroupLayout(pLogo);
        pLogo.setLayout(pLogoLayout);
        pLogoLayout.setHorizontalGroup(
            pLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLogoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pLogoLayout.setVerticalGroup(
            pLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLogoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel3.setText("Imagen");

        jLabel4.setText("Imagen");

        tMail.setText("Email addres");
        tMail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tMailMousePressed(evt);
            }
        });

        jLabel5.setText("Imagen");

        tPass.setText("******");
        tPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tPassMousePressed(evt);
            }
        });
        tPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tPassActionPerformed(evt);
            }
        });

        tPassConfirm.setText("******");
        tPassConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tPassConfirmMousePressed(evt);
            }
        });
        tPassConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tPassConfirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pRegisterLayout = new javax.swing.GroupLayout(pRegister);
        pRegister.setLayout(pRegisterLayout);
        pRegisterLayout.setHorizontalGroup(
            pRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pRegisterLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pRegisterLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(tMail, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                    .addGroup(pRegisterLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(tPassConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                    .addGroup(pRegisterLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(tPass, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pRegisterLayout.setVerticalGroup(
            pRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pRegisterLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(pRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(tPassConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jButton3.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jButton3.setText(">");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/twitter.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/face.png"))); // NOI18N

        javax.swing.GroupLayout PanelRegistroLayout = new javax.swing.GroupLayout(PanelRegistro);
        PanelRegistro.setLayout(PanelRegistroLayout);
        PanelRegistroLayout.setHorizontalGroup(
            PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRegistroLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bInicoSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRegistroLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        PanelRegistroLayout.setVerticalGroup(
            PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRegistroLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(bInicoSesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addGroup(PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bInicoSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInicoSesionActionPerformed
        IniciarSesion bIniciarSesion = new IniciarSesion();
        
        boton.pboton(PanelRegistro, bIniciarSesion);
//        
//        bIniciarSesion.setSize(280, 470);
//        bIniciarSesion.setLocation(0, 0);
//        
//        PanelRegistro.removeAll();
//        PanelRegistro.add(bIniciarSesion, BorderLayout.CENTER );
//        PanelRegistro.revalidate();
//        PanelRegistro.repaint();  
    }//GEN-LAST:event_bInicoSesionActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Interface bInterface= new Interface();
        
        boton.pboton(PanelRegistro, bInterface);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tPassMousePressed

        // Si la contraseña está por defecto, borra el campo
        if(String.valueOf(tPass.getPassword()).equals("******")){
            tPass.setText("");
            tPass.setForeground(Color.black);
        }
        //Si el eMail no hay eMail, restauralo por defecto
        if(String.valueOf(tMail.getText()).isEmpty()){
            tMail.setText("Email addres");
            tMail.setForeground(Color.gray);
        }
         //Si el eMail no hay eMail, restauralo por defecto
        if(String.valueOf(tPassConfirm.getText()).isEmpty()){
            tPassConfirm.setText("******");
            tPassConfirm.setForeground(Color.gray);
        }
    }//GEN-LAST:event_tPassMousePressed

    private void tPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tPassActionPerformed

    private void tPassConfirmMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tPassConfirmMousePressed
        // Si la contraseña está por defecto, borra el campo
        if(String.valueOf(tPassConfirm.getPassword()).equals("******")){
            tPassConfirm.setText("");
            tPassConfirm.setForeground(Color.black);
        }
        //Si el eMail no hay eMail, restauralo por defecto
        if(String.valueOf(tMail.getText()).isEmpty()){
            tMail.setText("Email addres");
            tMail.setForeground(Color.gray);
        }
         //Si el eMail no hay eMail, restauralo por defecto
        if(String.valueOf(tPass.getText()).isEmpty()){
            tPass.setText("******");
            tPass.setForeground(Color.gray);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_tPassConfirmMousePressed

    private void tPassConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tPassConfirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tPassConfirmActionPerformed

    private void tMailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tMailMousePressed
        if(tMail.getText().equals("Email addres")){
            tMail.setText("");
            tMail.setForeground(Color.black);
        }
        //Si no hay contraseña, resetea la contraseña por defecto
        if(String.valueOf(tPass.getPassword()).isEmpty()){
            tPass.setText("******");
            tPass.setForeground(Color.gray);
        }
        //Si no hay contraseña, resetea la contraseña por defecto
        if(String.valueOf(tPassConfirm.getPassword()).isEmpty()){
            tPassConfirm.setText("******");
            tPassConfirm.setForeground(Color.gray);
        }
    }//GEN-LAST:event_tMailMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelRegistro;
    private javax.swing.JButton bInicoSesion;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel pLogo;
    private javax.swing.JPanel pRegister;
    private javax.swing.JTextField tMail;
    private javax.swing.JPasswordField tPass;
    private javax.swing.JPasswordField tPassConfirm;
    // End of variables declaration//GEN-END:variables
}
