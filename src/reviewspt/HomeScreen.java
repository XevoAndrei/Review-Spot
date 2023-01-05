package reviewspt;

public class HomeScreen extends javax.swing.JFrame {

    public HomeScreen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        SPGButton = new javax.swing.JButton();
        MPGButton = new javax.swing.JButton();
        IGButton = new javax.swing.JButton();
        UCButton = new javax.swing.JButton();
        HButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        jMenuBar3 = new javax.swing.JMenuBar();
        AdminPanel = new javax.swing.JMenu();
        loginScreen = new javax.swing.JMenuItem();
        ModPanel = new javax.swing.JMenu();
        loginScreen1 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Review Spot Gaming Community Entertaintment App");

        jPanel1.setBackground(new java.awt.Color(51, 0, 0));

        SPGButton.setBackground(new java.awt.Color(102, 0, 0));
        SPGButton.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        SPGButton.setForeground(new java.awt.Color(204, 153, 0));
        SPGButton.setText("Singleplayer Games");
        SPGButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SPGButtonActionPerformed(evt);
            }
        });

        MPGButton.setBackground(new java.awt.Color(102, 0, 0));
        MPGButton.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        MPGButton.setForeground(new java.awt.Color(255, 153, 0));
        MPGButton.setText("Multiplayer Games");
        MPGButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MPGButtonActionPerformed(evt);
            }
        });

        IGButton.setBackground(new java.awt.Color(102, 0, 0));
        IGButton.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        IGButton.setForeground(new java.awt.Color(255, 153, 0));
        IGButton.setText("Indie Game ");
        IGButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IGButtonActionPerformed(evt);
            }
        });

        UCButton.setBackground(new java.awt.Color(102, 0, 0));
        UCButton.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        UCButton.setForeground(new java.awt.Color(255, 153, 0));
        UCButton.setText("Price Converter");
        UCButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UCButtonActionPerformed(evt);
            }
        });

        HButton.setBackground(new java.awt.Color(102, 0, 0));
        HButton.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        HButton.setForeground(new java.awt.Color(255, 153, 0));
        HButton.setText("Help");
        HButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REVIEW SPOT");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Gaming Community");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Entertaintment App");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(HButton, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UCButton, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IGButton, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MPGButton, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SPGButton, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(83, 83, 83)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(117, 117, 117)
                            .addComponent(jLabel2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(59, 59, 59)
                .addComponent(SPGButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MPGButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IGButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UCButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(HButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        logo.setBackground(new java.awt.Color(0, 0, 0));
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/REVIEW SPOT.png"))); // NOI18N

        jMenuBar3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        AdminPanel.setBackground(new java.awt.Color(0, 0, 0));
        AdminPanel.setText("Admin Panel");
        AdminPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminPanelActionPerformed(evt);
            }
        });

        loginScreen.setText("Login");
        loginScreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginScreenActionPerformed(evt);
            }
        });
        AdminPanel.add(loginScreen);

        jMenuBar3.add(AdminPanel);

        ModPanel.setText("Moderator Panel");

        loginScreen1.setText("Login");
        loginScreen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginScreen1ActionPerformed(evt);
            }
        });
        ModPanel.add(loginScreen1);

        jMenuBar3.add(ModPanel);

        setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SPGButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SPGButtonActionPerformed
        SPGMenu m1 = new SPGMenu();
        m1.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_SPGButtonActionPerformed

    private void UCButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UCButtonActionPerformed
        UCMenu m4 = new UCMenu();
        m4.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_UCButtonActionPerformed

    private void MPGButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MPGButtonActionPerformed
        MPGMenu m2 = new MPGMenu();
        m2.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_MPGButtonActionPerformed

    private void HButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HButtonActionPerformed
        HMenu m5 = new HMenu();
        m5.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_HButtonActionPerformed

    private void IGButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IGButtonActionPerformed
        IGMenu m3 = new IGMenu();
        m3.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_IGButtonActionPerformed

    private void AdminPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminPanelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdminPanelActionPerformed

    private void loginScreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginScreenActionPerformed
        LoginScreen m6 = new LoginScreen();
        m6.setVisible(true);;
        setVisible(false);

    }//GEN-LAST:event_loginScreenActionPerformed

    private void loginScreen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginScreen1ActionPerformed
        ModLoginScreen mls = new ModLoginScreen();
        mls.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_loginScreen1ActionPerformed

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
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeScreen().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AdminPanel;
    private javax.swing.JButton HButton;
    private javax.swing.JButton IGButton;
    private javax.swing.JButton MPGButton;
    private javax.swing.JMenu ModPanel;
    private javax.swing.JButton SPGButton;
    private javax.swing.JButton UCButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem loginScreen;
    private javax.swing.JMenuItem loginScreen1;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
