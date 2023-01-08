package reviewspt;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class UCMenu extends javax.swing.JFrame {

    public UCMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BACK = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtamount = new javax.swing.JTextField();
        txtfrom = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtto = new javax.swing.JComboBox<>();
        ConvertButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Price Converter");

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        BACK.setText("BACK");
        BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("ENTER VALUE:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setText("FROM:");

        txtamount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtamountActionPerformed(evt);
            }
        });

        txtfrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "EUR", "GBP", "TRY", "RUB" }));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setText("TO:");

        txtto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "EUR", "GBP", "TRY", "RUB" }));

        ConvertButton.setText("CONVERT");
        ConvertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConvertButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel4.setText("PRICE CONVERTER");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 139, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                389, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(57, 57, 57))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                .createSequentialGroup()
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(ConvertButton)
                                                        .addComponent(BACK, javax.swing.GroupLayout.PREFERRED_SIZE, 82,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(243, 243, 243))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtamount, javax.swing.GroupLayout.PREFERRED_SIZE, 171,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel3)
                                                        .addPreferredGap(
                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtto, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout
                                                        .createSequentialGroup()
                                                        .addComponent(jLabel2)
                                                        .addPreferredGap(
                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtfrom, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel4)
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtamount, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(txtfrom, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(txtto, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33,
                                        Short.MAX_VALUE)
                                .addComponent(ConvertButton)
                                .addGap(62, 62, 62)
                                .addComponent(BACK)
                                .addContainerGap()));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BACKActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_BACKActionPerformed
        HomeScreen hs = new HomeScreen();
        hs.setVisible(true);
        setVisible(false);
    }// GEN-LAST:event_BACKActionPerformed

    double ParseDouble(String strNumber) {
        if (strNumber != null && strNumber.length() > 0) {
            try {
                return Double.parseDouble(strNumber);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Please enter a value!");
                return 0;
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please enter a value!");
            return 0;
        }

    }

    public static final HashMap<String, HashMap<String, Double>> rates = new HashMap<>() {
        {
            put("USD", new HashMap<>() {
                {
                    put("TRY", 18.71);
                    put("EUR", 0.94);
                    put("GBP", 0.83);
                    put("RUB", 72.85);
                }
            });
            put("EUR", new HashMap<>() {
                {
                    put("TRY", 19.88);
                    put("USD", 1.18);
                    put("GBP", 0.88);
                    put("RUB", 77.30);
                }
            });
            put("GBP", new HashMap<>() {
                {
                    put("TRY", 22.60);
                    put("USD", 1.29);
                    put("EUR", 1.14);
                    put("RUB", 88.09);
                }
            });
            put("RUB", new HashMap<>() {
                {
                    put("TRY", 0.26);
                    put("USD", 0.014);
                    put("EUR", 0.013);
                    put("GBP", 0.011);
                }
            });
            put("TRY", new HashMap<>() {
                {
                    put("USD", 0.053);
                    put("EUR", 0.050);
                    put("GBP", 0.044);
                    put("RUB", 3.85);
                }
            });
        }
    };

    private void ConvertButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ConvertButtonActionPerformed
        Double total = 0.0;
        Double amount = ParseDouble(txtamount.getText());

        String from = txtfrom.getSelectedItem().toString();
        String to = txtto.getSelectedItem().toString();

        if (from.equals(to)) {
            JOptionPane.showMessageDialog(this, "You can't convert same units.");
            return;
        }

        total = amount * rates.get(from).get(to);
        JOptionPane.showMessageDialog(this, "Amount will be " + total.toString() + " " + to + ".");
    }// GEN-LAST:event_ConvertButtonActionPerformed

    private void txtamountActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtamountActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtamountActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UCMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UCMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UCMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UCMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UCMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BACK;
    private javax.swing.JButton ConvertButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtamount;
    private javax.swing.JComboBox<String> txtfrom;
    private javax.swing.JComboBox<String> txtto;
    // End of variables declaration//GEN-END:variables
}
