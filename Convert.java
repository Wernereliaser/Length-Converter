/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Converter;

import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Werner
 */
public class Convert extends javax.swing.JFrame {

    /**
     * Creates new form Convert
     */
    public Convert() {
        initComponents();
        ImageIcon image = new ImageIcon("C:/Users/Werner/TheConverter/src/image/conv.png");
        this.setIconImage(image.getImage());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ComboBox1 = new javax.swing.JComboBox<>();
        ComboBox2 = new javax.swing.JComboBox<>();
        TextField1 = new javax.swing.JTextField();
        TextField2 = new javax.swing.JTextField();
        OkButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(287, 308));

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        ComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Millimetre", "Inch", "Centimetre", "Metre", "Kilometre" }));

        ComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Millimetre", "Inch", "Centimetre", "Metre", "Kilometre" }));

        TextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField1ActionPerformed(evt);
            }
        });

        TextField2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N

        OkButton.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        OkButton.setText("OK");
        OkButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                OkButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                OkButtonMouseExited(evt);
            }
        });
        OkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkButtonActionPerformed(evt);
            }
        });

        ClearButton.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        ClearButton.setText("CLEAR");
        ClearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ClearButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ClearButtonMouseExited(evt);
            }
        });
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("LENGTH UNIT CONVERTER");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(TextField1)
                        .addComponent(ComboBox1, 0, 113, Short.MAX_VALUE))
                    .addComponent(OkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(TextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ComboBox2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ClearButton))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OkButton)
                    .addComponent(ClearButton))
                .addContainerGap(124, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField1ActionPerformed

    }//GEN-LAST:event_TextField1ActionPerformed

    private void OkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkButtonActionPerformed
        if (!(TextField1.getText().isEmpty())) {
            try{
            if (ComboBox1.getSelectedItem().toString().equals("Millimetre") && ComboBox2.getSelectedItem().toString().equals("Millimetre")) {
                String i = TextField1.getText();
                double m = Double.parseDouble(i);
                double m2 = m;
                String s = String.valueOf((m2));
                TextField2.setText(s);

            }
            if (ComboBox1.getSelectedItem().toString().equals("Millimetre") && ComboBox2.getSelectedItem().toString().equals("Inch")) {
                DecimalFormat format = new DecimalFormat(".00000");
                String i = TextField1.getText();
                double m = Double.parseDouble(i);
                double m2 = m / 25.4;
                String s = String.valueOf(format.format(m2));
                TextField2.setText(s);
            }
            if (ComboBox1.getSelectedItem().toString().equals("Millimetre") && ComboBox2.getSelectedItem().toString().equals("Centimetre")) {
                DecimalFormat format = new DecimalFormat("##.00");
                String i = TextField1.getText();
               double m = Double.parseDouble(i);
                double m2 = m / 10;
                String s = String.valueOf(format.format(m2));
                TextField2.setText(s);
            }
            if (ComboBox1.getSelectedItem().toString().equals("Millimetre") && ComboBox2.getSelectedItem().toString().equals("Metre")) {
                DecimalFormat format = new DecimalFormat("##.00000");
                String i = TextField1.getText();
                double m = Double.parseDouble(i);
                double m2 = m / 1000;
                String s = String.valueOf(format.format(m2));
                TextField2.setText(s);
            }
            if (ComboBox1.getSelectedItem().toString().equals("Millimetre") && ComboBox2.getSelectedItem().toString().equals("Kilometre")) {
                DecimalFormat format = new DecimalFormat("##.00000");
                String i = TextField1.getText();
               double m = Double.parseDouble(i);
                double m2 = m / 1000000;
                String s = String.valueOf(format.format(m2));
                TextField2.setText(s);
            }//end of MILLIMETER

            if (ComboBox1.getSelectedItem().toString().equals("Inch") && ComboBox2.getSelectedItem().toString().equals("Millimetre")) {
                DecimalFormat format = new DecimalFormat("##.000");
                String i = TextField1.getText();
               double m = Double.parseDouble(i);
                double m2 = m * 25.4;
                String s = String.valueOf(format.format(m2));
                TextField2.setText(s);
            }

            if (ComboBox1.getSelectedItem().toString().equals("Inch") && ComboBox2.getSelectedItem().toString().equals("Inch")) {
                String i = TextField1.getText();
               double m = Double.parseDouble(i);
                String s = String.valueOf((m));
                TextField2.setText(s);
            }
            if (ComboBox1.getSelectedItem().toString().equals("Inch") && ComboBox2.getSelectedItem().toString().equals("Centimetre")) {
                DecimalFormat format = new DecimalFormat("##.00");
                String i = TextField1.getText();
              double m = Double.parseDouble(i);
                double m2 = m * 2.54;
                String s = String.valueOf(format.format(m2));
                TextField2.setText(s);
            }
            if (ComboBox1.getSelectedItem().toString().equals("Inch") && ComboBox2.getSelectedItem().toString().equals("Metre")) {
                DecimalFormat format = new DecimalFormat("##.00");
                String i = TextField1.getText();
                double m = Double.parseDouble(i);
                double m2 = m / 39.37;
                String s = String.valueOf(format.format(m2));
                TextField2.setText(s);
            }
            if (ComboBox1.getSelectedItem().toString().equals("Inch") && ComboBox2.getSelectedItem().toString().equals("Kilometre")) {
                DecimalFormat format = new DecimalFormat("##.00000");
                String i = TextField1.getText();
              double m = Double.parseDouble(i);
                double m2 = m / 39370;
                String s = String.valueOf(format.format(m2));
                TextField2.setText(s);
            } //end of INCH

            if (ComboBox1.getSelectedItem().toString().equals("Centimetre") && ComboBox2.getSelectedItem().toString().equals("Millimetre")) {
                DecimalFormat format = new DecimalFormat("##.00");
                String i = TextField1.getText();
                double m = Double.parseDouble(i);
                double m2 = m * 10;
                String s = String.valueOf(format.format(m2));
                TextField2.setText(s);
            }
            if (ComboBox1.getSelectedItem().toString().equals("Centimetre") && ComboBox2.getSelectedItem().toString().equals("Inch")) {
                DecimalFormat format = new DecimalFormat("##.00000");
                String i = TextField1.getText();
                double m = Double.parseDouble(i);
                double m2 = m / 2.54;
                String s = String.valueOf(format.format(m2));
                TextField2.setText(s);
            }
            if (ComboBox1.getSelectedItem().toString().equals("Centimetre") && ComboBox2.getSelectedItem().toString().equals("Centimetre")) {
                String i = TextField1.getText();
                double m = Double.parseDouble(i);
                String s = String.valueOf((m));
                TextField2.setText(s);
            }
            if (ComboBox1.getSelectedItem().toString().equals("Centimetre") && ComboBox2.getSelectedItem().toString().equals("Metre")) {
                DecimalFormat format = new DecimalFormat("##.00000");
                String i = TextField1.getText();
                double m = Double.parseDouble(i);
                double m2 = m / 100;
                String s = String.valueOf(format.format(m2));
                TextField2.setText(s);
            }
            if (ComboBox1.getSelectedItem().toString().equals("Centimetre") && ComboBox2.getSelectedItem().toString().equals("Kilometre")) {
                DecimalFormat format = new DecimalFormat("##.00000");
                String i = TextField1.getText();
                double m = Double.parseDouble(i);
                double m2 = m / 100000;
                String s = String.valueOf(format.format(m2));
                TextField2.setText(s);

            } //end of CENRIMTRE

            if (ComboBox1.getSelectedItem().toString().equals("Metre") && ComboBox2.getSelectedItem().toString().equals("Millimetre")) {
                DecimalFormat format = new DecimalFormat("##.00");
                String i = TextField1.getText();
                double m = Double.parseDouble(i);
                double m2 = m * 1000;
                String s = String.valueOf(format.format(m2));
                TextField2.setText(s);
            }
            if (ComboBox1.getSelectedItem().toString().equals("Metre") && ComboBox2.getSelectedItem().toString().equals("Inch")) {
                DecimalFormat format = new DecimalFormat("##.00000");
                String i = TextField1.getText();
                double m = Double.parseDouble(i);
                double m2 = m * 39.37;
                String s = String.valueOf(format.format(m2));
                TextField2.setText(s);
            }
            if (ComboBox1.getSelectedItem().toString().equals("Metre") && ComboBox2.getSelectedItem().toString().equals("Centimetre")) {
                DecimalFormat format = new DecimalFormat("##.00000");
                String i = TextField1.getText();
                double m = Double.parseDouble(i);
                double m2 = m * 100;
                String s = String.valueOf(format.format(m2));
                TextField2.setText(s);
            }
            if (ComboBox1.getSelectedItem().toString().equals("Metre") && ComboBox2.getSelectedItem().toString().equals("Metre")) {
                String i = TextField1.getText();
                double m = Double.parseDouble(i);
                String s = String.valueOf((m));
                TextField2.setText(s);
            }
            if (ComboBox1.getSelectedItem().toString().equals("Metre") && ComboBox2.getSelectedItem().toString().equals("Kilometre")) {
                DecimalFormat format = new DecimalFormat("##.00000");
                String i = TextField1.getText();
                double m = Double.parseDouble(i);
                double m2 = m / 1000;
                String s = String.valueOf(format.format(m2));
                TextField2.setText(s);

            }//end of METRE

            if (ComboBox1.getSelectedItem().toString().equals("Kilometre") && ComboBox2.getSelectedItem().toString().equals("Millimetre")) {
                DecimalFormat format = new DecimalFormat("##.00");
                String i = TextField1.getText();
                double m = Double.parseDouble(i);
                double m2 = m * 1000000;
                String s = String.valueOf(format.format(m2));
                TextField2.setText(s);
            }
            if (ComboBox1.getSelectedItem().toString().equals("Kilometre") && ComboBox2.getSelectedItem().toString().equals("Inch")) {
                DecimalFormat format = new DecimalFormat("");
                String i = TextField1.getText();
                double m = Double.parseDouble(i);
                double m2 = m * 39370;
                String s = String.valueOf(format.format(m2));
                TextField2.setText(s);
            }
            if (ComboBox1.getSelectedItem().toString().equals("Kilometre") && ComboBox2.getSelectedItem().toString().equals("Centimetre")) {
                DecimalFormat format = new DecimalFormat("");
                String i = TextField1.getText();
                double m = Double.parseDouble(i);
                double m2 = m * 100000;
                String s = String.valueOf(format.format(m2));
                TextField2.setText(s);
            }
            if (ComboBox1.getSelectedItem().toString().equals("Kilometre") && ComboBox2.getSelectedItem().toString().equals("Metre")) {
                DecimalFormat format = new DecimalFormat("");
                String i = TextField1.getText();
                double m = Double.parseDouble(i);
                double m2 = m * 1000;
                String s = String.valueOf(format.format(m2));
                TextField2.setText(s);

            }
            if (ComboBox1.getSelectedItem().toString().equals("Kilometre") && ComboBox2.getSelectedItem().toString().equals("Kilometre")) {
                String i = TextField1.getText();
                double m = Double.parseDouble(i);
                String s = String.valueOf((m));
                TextField2.setText(s);

            }
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(rootPane, "Enter a value");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Enter a value");
        }

    }//GEN-LAST:event_OkButtonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
   TextField1.setText("");
   TextField2.setText("");
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void OkButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OkButtonMouseEntered
       OkButton.setBackground(Color.blue);
    }//GEN-LAST:event_OkButtonMouseEntered

    private void ClearButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearButtonMouseEntered
       ClearButton.setBackground(Color.blue);
    }//GEN-LAST:event_ClearButtonMouseEntered

    private void OkButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OkButtonMouseExited
     OkButton.setBackground(Color.GRAY);
    }//GEN-LAST:event_OkButtonMouseExited

    private void ClearButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearButtonMouseExited
  ClearButton.setBackground(Color.GRAY);
    }//GEN-LAST:event_ClearButtonMouseExited

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
            java.util.logging.Logger.getLogger(Convert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Convert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Convert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Convert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Convert().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearButton;
    private javax.swing.JComboBox<String> ComboBox1;
    private javax.swing.JComboBox<String> ComboBox2;
    private javax.swing.JButton OkButton;
    private javax.swing.JTextField TextField1;
    private javax.swing.JTextField TextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
