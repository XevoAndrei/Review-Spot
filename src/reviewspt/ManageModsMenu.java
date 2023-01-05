
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
            rolesArray[i] = roles.get(i).getRoleName() + ", (Authority: " + 
                    formatter.format(roles.get(i).getAuthority()) + ")";
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
            FileInputStream fileRole = new FileInputStream("Roles.dat");
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbModerator = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        tfModeratorUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbModeratorRole = new javax.swing.JComboBox<>();
        saveButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("MANAGE CURRENT MODERATORS");

        jLabel2.setText("Moderator:");

        cbModerator.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbModerator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbModeratorActionPerformed(evt);
            }
        });

        jLabel3.setText("Username:");

        jLabel4.setText("Role:");

        cbModeratorRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        saveButton.setText("SAVE");

        removeButton.setText("REMOVE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbModeratorRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfModeratorUsername))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbModerator, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(saveButton)
                        .addGap(26, 26, 26)
                        .addComponent(removeButton)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbModerator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(tfModeratorUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbModeratorRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(removeButton))
                .addGap(43, 43, 43))
        );

        pack();
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField tfModeratorUsername;
    // End of variables declaration//GEN-END:variables
}
