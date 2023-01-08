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
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
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
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        SPGButton.setBackground(new java.awt.Color(255, 102, 102));
        SPGButton.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        SPGButton.setText("Singleplayer Game Reviews");
        SPGButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SPGButtonActionPerformed(evt);
            }
        });

        MPGButton.setBackground(new java.awt.Color(255, 102, 102));
        MPGButton.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        MPGButton.setText("Multiplayer Game Reviews");
        MPGButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MPGButtonActionPerformed(evt);
            }
        });

        IGButton.setBackground(new java.awt.Color(255, 102, 102));
        IGButton.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        IGButton.setText("Indie Game of our Choice");
        IGButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IGButtonActionPerformed(evt);
            }
        });

        UCButton.setBackground(new java.awt.Color(255, 102, 102));
        UCButton.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        UCButton.setText("Price Converter");
        UCButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UCButtonActionPerformed(evt);
            }
        });

        HButton.setBackground(new java.awt.Color(255, 102, 102));
        HButton.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        HButton.setText("FAQ");
        HButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HButtonActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/feedback.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setText("Review Spot Entertaintment App");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(157, 157, 157))))
            .addComponent(SPGButton, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
            .addComponent(MPGButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(IGButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(UCButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(HButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(SPGButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MPGButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IGButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UCButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(HButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuBar3.setBorder(null);
        jMenuBar3.setMinimumSize(new java.awt.Dimension(50, 24));

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuItem loginScreen;
    private javax.swing.JMenuItem loginScreen1;
    // End of variables declaration//GEN-END:variables
}
