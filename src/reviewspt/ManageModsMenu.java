package reviewspt;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.text.*;

public class ManageModsMenu extends javax.swing.JFrame {
    
    ArrayList<Role> roles;
    ArrayList<Moderator> Moderators;
    DecimalFormat formatter;

  
    public ManageModsMenu() {
        initComponents();
        roles = new ArrayList<Role>();
        Moderators = new ArrayList<Moderator>();
        formatter = new DecimalFormat("#,###.00");
        populateArrayList();
        
        String [] rolesArray = new String[roles.size()];
        for (int i=0; i<roles.size(); i++){
            rolesArray[i] = roles.get(i).getRoleName();
        }
        cbModeratorRole.setModel(new javax.swing.DefaultComboBoxModel<>(rolesArray));
        
        String [] moderatorsArray = new String[Moderators.size()];
        for (int i=0; i<Moderators.size(); i++){
            moderatorsArray[i] = Moderators.get(i).getUsername();
        }
        cbModerator.setModel(new javax.swing.DefaultComboBoxModel<>(moderatorsArray));
        cbModerator.setSelectedIndex(0);
    }
    
    public void populateArrayList(){
        try {
            FileInputStream fileRole = new FileInputStream("Role.dat");
            ObjectInputStream inputFileRole = new ObjectInputStream(fileRole);
            
            boolean endOfFile = false;
            while (!endOfFile){
                try {
                    roles.add((Role) inputFileRole.readObject());
                } catch (EOFException e){
                    endOfFile = true;
                } catch (Exception f) {
                    JOptionPane.showMessageDialog(null, f.getMessage());
                }
            }
            inputFileRole.close();            
        } catch (IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        try {
            FileInputStream fileModerator = new FileInputStream("Moderators.dat");
            ObjectInputStream inputFileModerator = new ObjectInputStream(fileModerator);
            
            boolean endOfFile = false;
            while (!endOfFile){
                try {
                    Moderators.add((Moderator) inputFileModerator.readObject());
                } catch (EOFException e){
                    endOfFile = true;
                } catch (Exception f) {
                    JOptionPane.showMessageDialog(null, f.getMessage());
                }
            }
            inputFileModerator.close();            
        } catch (IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void saveModeratorsToFile(){
        try {
            FileOutputStream fileModerator = new FileOutputStream("Moderators.dat");
            ObjectOutputStream outputFileModerator = new ObjectOutputStream(fileModerator);
            
            for (int i = 0; i<Moderators.size(); i++){
                outputFileModerator.writeObject(Moderators.get(i));
            }
            outputFileModerator.close();
            JOptionPane.showMessageDialog(null, "Action completed successfully!");
            this.dispose();
        } catch (IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tfModeratorUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbModeratorRole = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbModerator = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("Role:");

        cbModeratorRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel1.setText("MANAGE ACTIVE MODERATORS");

        jLabel2.setText("Moderator:");

        cbModerator.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbModerator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbModeratorActionPerformed(evt);
            }
        });

        jLabel3.setText("Username:");

        saveButton.setText("SAVE");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        removeButton.setText("REMOVE");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pngwing.com.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbModerator, 0, 130, Short.MAX_VALUE)
                            .addComponent(tfModeratorUsername)
                            .addComponent(cbModeratorRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(saveButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(removeButton)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbModerator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfModeratorUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbModeratorRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(removeButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jButton1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbModeratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbModeratorActionPerformed
         int selectedIndexEmp = cbModerator.getSelectedIndex();
        tfModeratorUsername.setText(Moderators.get(selectedIndexEmp).getUsername());
        
        Role role = Moderators.get(selectedIndexEmp).getRole();
        int empRoleIndex=0;
        for (int i=0; i<roles.size(); i++){
            if (roles.get(i).equals(role)){
                empRoleIndex = i;
                break;
            }                
        }
        cbModeratorRole.setSelectedIndex(empRoleIndex);
    }//GEN-LAST:event_cbModeratorActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        if (this.tfModeratorUsername.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter all the details");
        } else {
            int selectedIndexEmp = cbModerator.getSelectedIndex();
            Moderators.get(selectedIndexEmp).setUsername(tfModeratorUsername.getText().trim());
            
            Role role = roles.get(cbModeratorRole.getSelectedIndex());
            Moderators.get(selectedIndexEmp).setRole(role);
            
            saveModeratorsToFile();
            ManageModsMenu mmm = new ManageModsMenu();
            mmm.setVisible(true);
            setVisible(false);
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        int selectedIndexEmp = cbModerator.getSelectedIndex();
        Moderators.remove(selectedIndexEmp);
        saveModeratorsToFile();
        ManageModsMenu mmm = new ManageModsMenu();
        mmm.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_removeButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AdminScreen as = new AdminScreen();
        as.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ManageModsMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageModsMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageModsMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageModsMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageModsMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbModerator;
    private javax.swing.JComboBox<String> cbModeratorRole;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField tfModeratorUsername;
    // End of variables declaration//GEN-END:variables
}
