package reviewspt;

public class AdminScreen extends javax.swing.JFrame {

    public AdminScreen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        returnButton = new javax.swing.JButton();
        addNewModsButton = new javax.swing.JButton();
        manageModsButton = new javax.swing.JButton();
        addNewRoleButton = new javax.swing.JButton();
        addNewGameButton = new javax.swing.JButton();
        manageGamesButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Panel");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.black);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setForeground(new java.awt.Color(51, 102, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Review Spot Admin Panel");

        returnButton.setBackground(new java.awt.Color(0, 0, 0));
        returnButton.setForeground(new java.awt.Color(255, 255, 255));
        returnButton.setText("BACK");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        addNewModsButton.setBackground(new java.awt.Color(0, 0, 0));
        addNewModsButton.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        addNewModsButton.setForeground(new java.awt.Color(255, 255, 255));
        addNewModsButton.setText("Add New Moderators");
        addNewModsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewModsButtonActionPerformed(evt);
            }
        });

        manageModsButton.setBackground(new java.awt.Color(0, 0, 0));
        manageModsButton.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        manageModsButton.setForeground(new java.awt.Color(255, 255, 255));
        manageModsButton.setText("Manage Moderators");
        manageModsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageModsButtonActionPerformed(evt);
            }
        });

        addNewRoleButton.setBackground(new java.awt.Color(0, 0, 0));
        addNewRoleButton.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        addNewRoleButton.setForeground(new java.awt.Color(255, 255, 255));
        addNewRoleButton.setText("Add New Role");
        addNewRoleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewRoleButtonActionPerformed(evt);
            }
        });

        addNewGameButton.setBackground(new java.awt.Color(0, 0, 0));
        addNewGameButton.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        addNewGameButton.setForeground(new java.awt.Color(255, 255, 255));
        addNewGameButton.setText("Add New Game");
        addNewGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewGameButtonActionPerformed(evt);
            }
        });

        manageGamesButton.setBackground(new java.awt.Color(0, 0, 0));
        manageGamesButton.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        manageGamesButton.setForeground(new java.awt.Color(255, 255, 255));
        manageGamesButton.setText("Manage Games");
        manageGamesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageGamesButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(addNewModsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(addNewRoleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(addNewGameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(manageModsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(manageGamesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(returnButton))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGap(45, 45, 45)
                .addComponent(addNewModsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(addNewRoleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(addNewGameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(manageModsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(manageGamesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(returnButton))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        HomeScreen hs = new HomeScreen();
        hs.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_returnButtonActionPerformed

    private void addNewModsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewModsButtonActionPerformed
        AddNewModsMenu anmm = new AddNewModsMenu();
        anmm.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_addNewModsButtonActionPerformed

    private void manageModsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageModsButtonActionPerformed
        ManageModsMenu mmm = new ManageModsMenu();
        mmm.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_manageModsButtonActionPerformed

    private void addNewRoleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewRoleButtonActionPerformed
        AddNewRoleMenu anrm = new AddNewRoleMenu();
        anrm.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_addNewRoleButtonActionPerformed

    private void addNewGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewGameButtonActionPerformed
        AddNewGamesMenu angm = new AddNewGamesMenu();
        angm.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_addNewGameButtonActionPerformed

    private void manageGamesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageGamesButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manageGamesButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AdminScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewGameButton;
    private javax.swing.JButton addNewModsButton;
    private javax.swing.JButton addNewRoleButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton manageGamesButton;
    private javax.swing.JButton manageModsButton;
    private javax.swing.JButton returnButton;
    // End of variables declaration//GEN-END:variables
}
