/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facebookprueba;

import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
import facebook4j.Post;
import facebook4j.PostUpdate;
import facebook4j.ResponseList;
import facebook4j.User;
import facebook4j.auth.AccessToken;
import facebook4j.conf.ConfigurationBuilder;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nabor
 */
public class JFrame extends javax.swing.JFrame {

       
    public JFrame() {
        initComponents();
       
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textMensaje = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        areaId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        idPost = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        comentarioPost = new javax.swing.JTextField();
        enviarEstado = new javax.swing.JButton();
        enviarLike = new javax.swing.JButton();
        enviarComentario = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        areaLink = new javax.swing.JTextField();
        enviarLink = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        comField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        fieldBusc = new javax.swing.JTextField();
        busEnviar = new javax.swing.JButton();
        extender = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMensajeActionPerformed(evt);
            }
        });

        jLabel1.setText("Que estas pensando =>");

        areaId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaIdActionPerformed(evt);
            }
        });

        jLabel2.setText("Introduce ID para dar like=>");

        jLabel3.setText("Introduce ID de post =>");

        idPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idPostActionPerformed(evt);
            }
        });

        jLabel4.setText("Introduce comentario en post =>");

        comentarioPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comentarioPostActionPerformed(evt);
            }
        });

        enviarEstado.setText("Enviar");
        enviarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarEstadoActionPerformed(evt);
            }
        });

        enviarLike.setText("Like");
        enviarLike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarLikeActionPerformed(evt);
            }
        });

        enviarComentario.setText("Comentar");
        enviarComentario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarComentarioActionPerformed(evt);
            }
        });

        jLabel5.setText("Postear Link/Foto      =>");

        enviarLink.setText("Cometar");
        enviarLink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarLinkActionPerformed(evt);
            }
        });

        jLabel6.setText("Comentario link/foto  =>");

        jLabel7.setText("Buscar persona  =>");

        busEnviar.setText("Buscar");
        busEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busEnviarActionPerformed(evt);
            }
        });

        extender.setText("Extender Tokens");
        extender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(105, 105, 105))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(134, 134, 134))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(jLabel3)))
                        .addGap(119, 119, 119)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(comField, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                        .addComponent(areaLink, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                        .addComponent(comentarioPost, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                        .addComponent(idPost, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                        .addComponent(areaId, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                        .addComponent(fieldBusc)))
                .addGap(189, 189, 189)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(extender)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(busEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(enviarLink, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(enviarComentario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(enviarEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(enviarLike, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(enviarEstado)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(enviarLike))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(areaId, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enviarComentario)
                    .addComponent(idPost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comentarioPost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(areaLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(enviarLink, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(fieldBusc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(busEnviar))
                .addGap(238, 238, 238)
                .addComponent(extender)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMensajeActionPerformed
     
        
    }//GEN-LAST:event_textMensajeActionPerformed

    private void areaIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaIdActionPerformed
      
    }//GEN-LAST:event_areaIdActionPerformed

    private void idPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idPostActionPerformed
        
    }//GEN-LAST:event_idPostActionPerformed

    private void comentarioPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comentarioPostActionPerformed
     
    }//GEN-LAST:event_comentarioPostActionPerformed
/**
 * Send a message that can be seen in the facebook profile
 * @param evt 
 */
    private void enviarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarEstadoActionPerformed
         ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
  .setOAuthAppId("949180598530284")
  .setOAuthAppSecret("88a4340650a3d5a20a4152a41553f5a4")
  .setOAuthAccessToken("EAANfRlRnMOwBAAo8ZCKNURfwRqBOtRdcsdawFVQByOVL8Ux9U3QXTnVgWm7rH4GnymvUn9ZAcvwdUMM51CVCjaEiRA7X9wzydiIgMBZAZBkIQ2YP8hueeKOZAqnCNtu3YWdB2iBg6GSdZBLxvfWQJMVgBFzOZAbTNSEw70f9iSl6czh47kJXdQF")
  .setOAuthPermissions("email,publish_stream,...");
FacebookFactory ff = new FacebookFactory(cb.build());
Facebook facebook = ff.getInstance();   
        try {
            facebook.postStatusMessage(textMensaje.getText());
        } catch (FacebookException ex) {
            Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
             
    }//GEN-LAST:event_enviarEstadoActionPerformed
/**
 * Via id photo you can give a like to it.
 * @param evt 
 */
    private void enviarLikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarLikeActionPerformed
                 ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
  .setOAuthAppId("949180598530284")
  .setOAuthAppSecret("88a4340650a3d5a20a4152a41553f5a4")
  .setOAuthAccessToken("EAANfRlRnMOwBAAo8ZCKNURfwRqBOtRdcsdawFVQByOVL8Ux9U3QXTnVgWm7rH4GnymvUn9ZAcvwdUMM51CVCjaEiRA7X9wzydiIgMBZAZBkIQ2YP8hueeKOZAqnCNtu3YWdB2iBg6GSdZBLxvfWQJMVgBFzOZAbTNSEw70f9iSl6czh47kJXdQF")
  .setOAuthPermissions("publish_actions,user_status");
FacebookFactory ff = new FacebookFactory(cb.build());
Facebook facebook = ff.getInstance();
            try {
                facebook.likePost(areaId.getText());
            } catch (FacebookException ex) {
                Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_enviarLikeActionPerformed
/**
 * Via photo id you can comment a own photo.
 * @param evt 
 */
    private void enviarComentarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarComentarioActionPerformed
               ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
  .setOAuthAppId("949180598530284")
  .setOAuthAppSecret("88a4340650a3d5a20a4152a41553f5a4")
  .setOAuthAccessToken("EAANfRlRnMOwBAAo8ZCKNURfwRqBOtRdcsdawFVQByOVL8Ux9U3QXTnVgWm7rH4GnymvUn9ZAcvwdUMM51CVCjaEiRA7X9wzydiIgMBZAZBkIQ2YP8hueeKOZAqnCNtu3YWdB2iBg6GSdZBLxvfWQJMVgBFzOZAbTNSEw70f9iSl6czh47kJXdQF")
  .setOAuthPermissions("email,publish_stream,...");
FacebookFactory ff = new FacebookFactory(cb.build());
Facebook facebook = ff.getInstance();
        try {
            facebook.commentPhoto(idPost.getText(),comentarioPost.getText());
        } catch (FacebookException ex) {
            Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_enviarComentarioActionPerformed
/**
 * Post a link, if it's a image you can see the image in the profile
 * @param evt 
 */
    private void enviarLinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarLinkActionPerformed
          ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
  .setOAuthAppId("949180598530284")
  .setOAuthAppSecret("88a4340650a3d5a20a4152a41553f5a4")
  .setOAuthAccessToken("EAANfRlRnMOwBAAo8ZCKNURfwRqBOtRdcsdawFVQByOVL8Ux9U3QXTnVgWm7rH4GnymvUn9ZAcvwdUMM51CVCjaEiRA7X9wzydiIgMBZAZBkIQ2YP8hueeKOZAqnCNtu3YWdB2iBg6GSdZBLxvfWQJMVgBFzOZAbTNSEw70f9iSl6czh47kJXdQF")
  .setOAuthPermissions("email,publish_stream,...");
        FacebookFactory ff = new FacebookFactory(cb.build());
Facebook facebook = ff.getInstance();
        try {
            facebook.postLink(new URL(areaLink.getText()), comField.getText());
        } catch (MalformedURLException ex) {
            Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FacebookException ex) {
            Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_enviarLinkActionPerformed
/**
 * Find a list of people whose name is similar to the word that you are searching
 * @param evt 
 */
    private void busEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busEnviarActionPerformed
        // TODO add your handling code here:
         ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
  .setOAuthAppId("949180598530284")
  .setOAuthAppSecret("88a4340650a3d5a20a4152a41553f5a4")
  .setOAuthAccessToken("EAANfRlRnMOwBAAo8ZCKNURfwRqBOtRdcsdawFVQByOVL8Ux9U3QXTnVgWm7rH4GnymvUn9ZAcvwdUMM51CVCjaEiRA7X9wzydiIgMBZAZBkIQ2YP8hueeKOZAqnCNtu3YWdB2iBg6GSdZBLxvfWQJMVgBFzOZAbTNSEw70f9iSl6czh47kJXdQF")
  .setOAuthPermissions("email,publish_stream,...");
        FacebookFactory ff = new FacebookFactory(cb.build());
Facebook facebook = ff.getInstance();
        try {
            ResponseList<User> results = facebook.searchUsers(fieldBusc.getText());
            for(int i=0;i<results.size();i++){
                System.out.println(results.get(i));
            }
        } catch (FacebookException ex) {
            Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_busEnviarActionPerformed
/**
 * Extends tokens time //NotFunctional
 * @param evt 
 */
    private void extenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extenderActionPerformed
      ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
  .setOAuthAppId("949180598530284")
  .setOAuthAppSecret("88a4340650a3d5a20a4152a41553f5a4")
  .setOAuthAccessToken("EAANfRlRnMOwBAAo8ZCKNURfwRqBOtRdcsdawFVQByOVL8Ux9U3QXTnVgWm7rH4GnymvUn9ZAcvwdUMM51CVCjaEiRA7X9wzydiIgMBZAZBkIQ2YP8hueeKOZAqnCNtu3YWdB2iBg6GSdZBLxvfWQJMVgBFzOZAbTNSEw70f9iSl6czh47kJXdQF")
  .setOAuthPermissions("email,publish_stream,...");
        FacebookFactory ff = new FacebookFactory(cb.build());
Facebook facebook = ff.getInstance();
        String shortLivedToken = "your-short-lived-token";
        try {
            AccessToken extendedToken = facebook.extendTokenExpiration(shortLivedToken);
        } catch (FacebookException ex) {
            Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_extenderActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame().setVisible(true);
        
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField areaId;
    private javax.swing.JTextField areaLink;
    private javax.swing.JButton busEnviar;
    private javax.swing.JTextField comField;
    private javax.swing.JTextField comentarioPost;
    private javax.swing.JButton enviarComentario;
    private javax.swing.JButton enviarEstado;
    private javax.swing.JButton enviarLike;
    private javax.swing.JButton enviarLink;
    private javax.swing.JButton extender;
    private javax.swing.JTextField fieldBusc;
    private javax.swing.JTextField idPost;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textMensaje;
    // End of variables declaration//GEN-END:variables
}

