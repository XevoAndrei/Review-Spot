
package reviewspt;
import java.awt.Desktop;
import java.net.URL;
/**
 *
 * @author siyah
 */
public class SPG2 extends javax.swing.JFrame {

    /**
     * Creates new form SPG1
     */
    public SPG2() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        steam = new javax.swing.JLabel();
        playstation = new javax.swing.JLabel();
        xbox = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nintendo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1634, 985));
        setResizable(false);

        jButton1.setText("HOME");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setText("THE WITCHER 3: WILD HUNT");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("In The Witcher 3: Wild Hunt, the sacred is always at war with the profane, and beauty is always at war with blood. The series has always contrasted its world's physical glamor with its intrinsic violence, but never has that contrast been this uneasy, this convulsive. That The Witcher 3 depicts the immediate brutality of battle in great detail is not a surprise; many games fill the screen with decapitated heads and gory entrails. It's the way this incredible adventure portrays the personal tragedies and underhanded opportunities that such battles provide that makes it so extraordinary.\n\nIt is more than its thematic turbulence that makes The Witcher 3 extraordinary, actually. Excellence abounds at every turn in this open-world role-playing game: excellent exploration, excellent creature design, excellent combat mechanics, excellent character progression. But the moments that linger are those that reveal the deep ache in the world's inhabitants. In one quest, you reunite two lovers, one of which is now a rotting hag, its tongue lasciviously lolling from its mouth. In another, a corpulent spouse-abuser must find a way to love two different lost souls, each of which test the limits of his affection. Don't worry that these vague descriptions spoil important events: they are simple examples of the obstacles every resident faces. On the isles of Skellige and in the city of Novigrad, there is no joy without parallel sorrow. Every triumph demands a sacrifice.");
        jScrollPane1.setViewportView(jTextArea1);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TheWitcherWallpaper.jpg"))); // NOI18N
        jLabel2.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("sansserif", 3, 18)); // NOI18N
        jLabel8.setText("AVAILABLE PLATFORMS:");

        steam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/steam.png"))); // NOI18N
        steam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                steamMouseClicked(evt);
            }
        });

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
        jLabel9.setText("CATEGORY: ACTION RPG, OPEN WORLD");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reviewwallpapers/witchermeta.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reviewwallpapers/witcher-3-photo-2.jpg"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reviewwallpapers/witcher3ign.png"))); // NOI18N

        nintendo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reviewwallpapers/nintendoswitch.png"))); // NOI18N
        nintendo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nintendoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(steam)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(playstation)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(xbox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nintendo)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel9)
                                .addGap(36, 36, 36)
                                .addComponent(jButton1))
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel1)))
                        .addGap(603, 603, 603))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel11))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(steam)
                                    .addComponent(playstation)
                                    .addComponent(xbox)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(nintendo)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel11)))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SPGMenu spg = new SPGMenu();
        spg.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void steamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_steamMouseClicked
        try{
            Desktop.getDesktop().browse(new URL("https://store.steampowered.com/app/292030/The_Witcher_3_Wild_Hunt/").toURI());
        }
        catch(Exception e)
        {}
    }//GEN-LAST:event_steamMouseClicked

    private void playstationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playstationMouseClicked
        try{
            Desktop.getDesktop().browse(new URL("https://store.playstation.com/tr-tr/concept/204794").toURI());
        }
        catch(Exception e)
        {}
    }//GEN-LAST:event_playstationMouseClicked

    private void xboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xboxMouseClicked
        try{
            Desktop.getDesktop().browse(new URL("https://www.xbox.com/tr-TR/games/store/the-witcher-3-wild-hunt/br765873cqjd").toURI());
        }
        catch(Exception e)
        {}
    }//GEN-LAST:event_xboxMouseClicked

    private void nintendoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nintendoMouseClicked
        try{
            Desktop.getDesktop().browse(new URL("https://www.nintendo.com/store/products/the-witcher-3-wild-hunt-complete-edition-switch/").toURI());
        }
        catch(Exception e)
        {}
    }//GEN-LAST:event_nintendoMouseClicked

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
            java.util.logging.Logger.getLogger(SPG2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SPG2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SPG2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SPG2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SPG2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel nintendo;
    private javax.swing.JLabel playstation;
    private javax.swing.JLabel steam;
    private javax.swing.JLabel xbox;
    // End of variables declaration//GEN-END:variables
}
