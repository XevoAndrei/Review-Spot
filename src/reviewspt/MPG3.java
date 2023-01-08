package reviewspt;

import java.awt.Desktop;
import java.net.URL;

public class MPG3 extends javax.swing.JFrame {

    /**
     * Creates new form SPG1
     */
    public MPG3() {
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        mainWallpaper = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        steam = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        playstation = new javax.swing.JLabel();
        xbox = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tom Clancy's Rainbow Six: Siege Review");
        setResizable(false);

        jButton1.setText("HOME");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setText("RAINBOW SIX: SIEGE");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("In Rainbow Six Siege, small tactical choices always lead to big consequences. Every round is a new lesson in what you could have done better, with your mistakes acting as a stern teacher. Taking these lessons to heart and adjusting your team's strategy accordingly keeps each match feeling fresh and exciting, and a drip-feed of new operators, loadouts, and abilities constantly introduces new considerations. The thrill of seeing your plan succeed--whether that's a collection of traps that stops the enemy in their tracks, a well-placed breaching hole that sets the stage for an ambush, or two operators' abilities working together to pull the rug out from the opposing team--is what makes Siege not only a compelling shooter but one of the best examples of teamwork, tactics, and crack shooting out there.\n\nDespite its evolution over the past four years, Rainbow Six Siege has always been a battle between attackers and defenders over a single objective. There are five operators per team, each with their own special gadgets that can be used to slow the attackers' assault or poke holes in the defenders' fortifications. Every round, attackers need to move in on a specific objective; depending on the mode, they'll need to sneak in and extract a hostage, create a pathway to secure a specific room, or strategize carefully to defuse a bomb. Bomb is the quintessential Siege mode, as it makes every operator feel viable and balanced. Pushing the objective, finding an opening to plant the defuser, and then protecting said defuser gives the attacking side a steep, rewarding climb to victory, and it's the defenders' job to knock them down and keep them from reaching that summit.");
        jScrollPane1.setViewportView(jTextArea1);

        mainWallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RainbowSixSiegeWallpaper.png"))); // NOI18N
        mainWallpaper.setText("jLabel2");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/r6wallpaper1.jpg"))); // NOI18N
        jLabel4.setText("jLabel3");

        steam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/steam.png"))); // NOI18N
        steam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                steamMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("sansserif", 3, 18)); // NOI18N
        jLabel8.setText("AVAILABLE PLATFORMS:");

        playstation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ps.png"))); // NOI18N
        playstation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playstationMouseClicked(evt);
            }
        });

        xbox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xbox.png"))); // NOI18N
        xbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xboxMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("sansserif", 3, 18)); // NOI18N
        jLabel9.setText("CATEGORY: Tactical FPS, Multiplayer");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/r6meta.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/r6ign.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(mainWallpaper, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 598, Short.MAX_VALUE)
                                    .addComponent(jButton1))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(steam)
                                    .addGap(18, 18, 18)
                                    .addComponent(playstation)
                                    .addGap(18, 18, 18)
                                    .addComponent(xbox)
                                    .addGap(50, 50, 50)
                                    .addComponent(jLabel9)))))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)))
                        .addContainerGap(42, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mainWallpaper)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(playstation)
                                    .addComponent(steam)
                                    .addComponent(xbox)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel9)
                                            .addComponent(jButton1))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(20, 20, 20)))
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MPGMenu mpg = new MPGMenu();
        mpg.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void steamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_steamMouseClicked
        try{
            Desktop.getDesktop().browse(new URL("https://store.steampowered.com/app/359550/Tom_Clancys_Rainbow_Six_Siege/").toURI());
        }
        catch(Exception e)
        {}
    }//GEN-LAST:event_steamMouseClicked

    private void playstationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playstationMouseClicked
        try{
            Desktop.getDesktop().browse(new URL("https://www.playstation.com/en-tr/games/tom-clancys-rainbow-six-siege/#buy-now").toURI());
        }
        catch(Exception e)
        {}
    }//GEN-LAST:event_playstationMouseClicked

    private void xboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xboxMouseClicked
        try{
            Desktop.getDesktop().browse(new URL("https://www.xbox.com/tr-TR/games/store/tom-clancys-rainbow-six-siege/c12t09dsvp8j").toURI());
        }
        catch(Exception e)
        {}
    }//GEN-LAST:event_xboxMouseClicked

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
            java.util.logging.Logger.getLogger(MPG3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MPG3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MPG3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MPG3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MPG3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel mainWallpaper;
    private javax.swing.JLabel playstation;
    private javax.swing.JLabel steam;
    private javax.swing.JLabel xbox;
    // End of variables declaration//GEN-END:variables
}
