/*
 * 
 */
package securityproject;

import javax.swing.JFrame;

/**
 *
 * 
 */
public class design extends javax.swing.JFrame {

    SecurityProject spro;

    /**
     * Crée une nouvelle conception de formulaire
     */
    public design() {
        initComponents();
        this.setSize(1100, 600);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }
    

    /**
     *Cette méthode est appelée depuis le constructeur pour initialiser le formulaire.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel16 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 100), new java.awt.Dimension(0, 100), new java.awt.Dimension(32767, 100));
        jLabel8 = new javax.swing.JLabel();
        privatet1A = new javax.swing.JLabel();
        ciphertextA = new javax.swing.JLabel();
        publict1 = new javax.swing.JLabel();
        privatet1 = new javax.swing.JLabel();
        ciphertext = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        p1 = new javax.swing.JTextField();
        q1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        m1 = new javax.swing.JTextField();
        e1 = new javax.swing.JTextField();
        encryption = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        publict1A = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        privatet2A = new javax.swing.JLabel();
        plaintextA = new javax.swing.JLabel();
        decryption = new javax.swing.JButton();
        e2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        p2 = new javax.swing.JTextField();
        plaintext = new javax.swing.JLabel();
        q2 = new javax.swing.JTextField();
        publict2 = new javax.swing.JLabel();
        m2 = new javax.swing.JTextField();
        privatet2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        publict2A = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel16.setBackground(new java.awt.Color(255, 0, 0));
        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 204, 204));
        jLabel16.setText("Algorithme RSA de Cryptage et Décryptage");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(370, 0, 470, 30);
        getContentPane().add(filler1);
        filler1.setBounds(675, 77, 0, 457);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Entrer E:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(90, 190, 69, 22);

        privatet1A.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        privatet1A.setText("Clée privée");
        getContentPane().add(privatet1A);
        privatet1A.setBounds(320, 260, 60, 15);

        ciphertextA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ciphertextA.setText("texte  crypter");
        getContentPane().add(ciphertextA);
        ciphertextA.setBounds(170, 450, 290, 17);

        publict1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        publict1.setText("CLé public");
        getContentPane().add(publict1);
        publict1.setBounds(220, 240, 55, 15);

        privatet1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        privatet1.setText("Clé privée");
        getContentPane().add(privatet1);
        privatet1.setBounds(220, 260, 53, 15);

        ciphertext.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ciphertext.setText("cryptage");
        getContentPane().add(ciphertext);
        ciphertext.setBounds(50, 450, 55, 17);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("generer ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(110, 230, 81, 49);
        getContentPane().add(p1);
        p1.setBounds(200, 80, 218, 37);
        getContentPane().add(q1);
        q1.setBounds(200, 130, 218, 37);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Entrer P:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 90, 69, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Entrer Q:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 140, 72, 22);
        getContentPane().add(m1);
        m1.setBounds(70, 330, 330, 35);
        getContentPane().add(e1);
        e1.setBounds(200, 190, 222, 33);

        encryption.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        encryption.setText("cryptage");
        encryption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encryptionActionPerformed(evt);
            }
        });
        getContentPane().add(encryption);
        encryption.setBounds(110, 390, 113, 49);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Confirmer le message a cryptage");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(100, 300, 258, 22);

        publict1A.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        publict1A.setText("CLé public");
        getContentPane().add(publict1A);
        publict1A.setBounds(320, 240, 55, 15);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Entrer E:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(530, 180, 69, 22);

        privatet2A.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        privatet2A.setText("clé privée");
        getContentPane().add(privatet2A);
        privatet2A.setBounds(760, 260, 52, 15);

        plaintextA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        plaintextA.setText("texte:");
        getContentPane().add(plaintextA);
        plaintextA.setBounds(610, 460, 490, 17);

        decryption.setFont(new java.awt.Font("Urdu Typesetting", 1, 24)); // NOI18N
        decryption.setText("decriptage");
        decryption.setAutoscrolls(true);
        decryption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decryptionActionPerformed(evt);
            }
        });
        getContentPane().add(decryption);
        decryption.setBounds(630, 380, 151, 39);

        e2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e2ActionPerformed(evt);
            }
        });
        getContentPane().add(e2);
        e2.setBounds(620, 180, 209, 31);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("generer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(540, 230, 77, 41);
        getContentPane().add(p2);
        p2.setBounds(620, 80, 210, 34);

        plaintext.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        plaintext.setText("Décryptage");
        getContentPane().add(plaintext);
        plaintext.setBounds(530, 460, 72, 17);

        q2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q2ActionPerformed(evt);
            }
        });
        getContentPane().add(q2);
        q2.setBounds(620, 130, 209, 34);

        publict2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        publict2.setText("clé public");
        getContentPane().add(publict2);
        publict2.setBounds(680, 230, 50, 15);

        m2.setText("texte a décrypter");
        m2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m2ActionPerformed(evt);
            }
        });
        getContentPane().add(m2);
        m2.setBounds(520, 330, 310, 34);

        privatet2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        privatet2.setText("clé privée");
        getContentPane().add(privatet2);
        privatet2.setBounds(680, 260, 52, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Entrer P:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(540, 90, 69, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Entrer Q:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(530, 130, 72, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Confirmer le message a décrypter");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(540, 300, 264, 22);

        publict2A.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        publict2A.setText("clé public");
        getContentPane().add(publict2A);
        publict2A.setBounds(760, 230, 50, 15);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(490, 60, 0, 510);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("RECEPTION");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(640, 40, 170, 29);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("ENVOYER");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(240, 40, 130, 29);

        jLabel11.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 204));
        jLabel11.setText("CRYPTOSYSTEMES");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(860, 50, 210, 29);

        jLabel12.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 204));
        getContentPane().add(jLabel12);
        jLabel12.setBounds(800, 80, 37, 0);

        jLabel13.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 204));
        getContentPane().add(jLabel13);
        jLabel13.setBounds(770, 140, 110, 0);

        jLabel14.setBackground(new java.awt.Color(51, 0, 153));
        jLabel14.setForeground(new java.awt.Color(204, 0, 102));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securityproject/background.png"))); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(850, 40, 250, 500);

        jButton1.setText("ENVOYER LE TEXTE CRYPTER POUR DECRIPTAGE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 500, 380, 23);

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setText("Précedent");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(960, 0, 150, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        spro = new SecurityProject(p1.getText(), q1.getText(), e1.getText());
        spro.check();
        publict1A.setText("(" + spro.Emath + "," + spro.nmath + ")");
        privatet1A.setText("(" + spro.dmath + "," + spro.nmath + ")");
        spro.getalphabet();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void encryptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encryptionActionPerformed
        spro = new SecurityProject(p2.getText(), q2.getText(), e2.getText());
        spro.check();
        spro.getMessageandEncrypt(m1.getText());
        ciphertextA.setText(spro.cipher.toString());
    }//GEN-LAST:event_encryptionActionPerformed

    private void decryptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decryptionActionPerformed
        spro = new SecurityProject(p2.getText(), q2.getText(), e2.getText());
        spro.check();
        spro.getMessageandDecrypt(m2.getText());
        plaintextA.setText(spro.cipher.toString());

    }//GEN-LAST:event_decryptionActionPerformed

    private void e2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_e2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        spro = new SecurityProject(p2.getText(), q2.getText(), e2.getText());
        spro.check();
        publict2A.setText("(" + spro.Emath + "," + spro.nmath + ")");
        privatet2A.setText("(" + spro.dmath + "," + spro.nmath + ")");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void q2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_q2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        m2.setText(ciphertextA.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void m2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_m2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       vue.Menu ob =new vue.Menu();
       ob.setLocationRelativeTo(null);
       ob.setVisible(true);
       this.hide();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new design().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ciphertext;
    private javax.swing.JLabel ciphertextA;
    private javax.swing.JButton decryption;
    private javax.swing.JTextField e1;
    private javax.swing.JTextField e2;
    private javax.swing.JButton encryption;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField m1;
    private javax.swing.JTextField m2;
    private javax.swing.JTextField p1;
    private javax.swing.JTextField p2;
    private javax.swing.JLabel plaintext;
    private javax.swing.JLabel plaintextA;
    private javax.swing.JLabel privatet1;
    private javax.swing.JLabel privatet1A;
    private javax.swing.JLabel privatet2;
    private javax.swing.JLabel privatet2A;
    private javax.swing.JLabel publict1;
    private javax.swing.JLabel publict1A;
    private javax.swing.JLabel publict2;
    private javax.swing.JLabel publict2A;
    private javax.swing.JTextField q1;
    private javax.swing.JTextField q2;
    // End of variables declaration//GEN-END:variables
}
