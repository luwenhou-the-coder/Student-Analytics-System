/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Wenhou Lu
 */
public class SubMenu1Panel extends javax.swing.JPanel {

    /**
     * Creates new form SubMenu1Panel
     */
    public SubMenu1Panel() {
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

        buttonPie = new javax.swing.JButton();
        buttonLine = new javax.swing.JButton();
        buttonColumn = new javax.swing.JButton();

        buttonPie.setBackground(new java.awt.Color(40, 54, 65));
        buttonPie.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buttonPie.setForeground(new java.awt.Color(255, 255, 255));
        buttonPie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pie_chart.png"))); // NOI18N
        buttonPie.setText(" PIE  ");
        buttonPie.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        buttonPie.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonPie.setPreferredSize(new java.awt.Dimension(127, 39));
        buttonPie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPieActionPerformed(evt);
            }
        });

        buttonLine.setBackground(new java.awt.Color(40, 54, 65));
        buttonLine.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buttonLine.setForeground(new java.awt.Color(255, 255, 255));
        buttonLine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/line_chart.png"))); // NOI18N
        buttonLine.setText(" LINE  ");
        buttonLine.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        buttonLine.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonLine.setMaximumSize(new java.awt.Dimension(115, 45));
        buttonLine.setMinimumSize(new java.awt.Dimension(115, 45));
        buttonLine.setName(""); // NOI18N
        buttonLine.setPreferredSize(new java.awt.Dimension(127, 39));
        buttonLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLineActionPerformed(evt);
            }
        });

        buttonColumn.setBackground(new java.awt.Color(40, 54, 65));
        buttonColumn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buttonColumn.setForeground(new java.awt.Color(255, 255, 255));
        buttonColumn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/column_chart.png"))); // NOI18N
        buttonColumn.setText(" COLUMN  ");
        buttonColumn.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        buttonColumn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonColumn.setMaximumSize(new java.awt.Dimension(115, 45));
        buttonColumn.setMinimumSize(new java.awt.Dimension(115, 45));
        buttonColumn.setPreferredSize(new java.awt.Dimension(127, 39));
        buttonColumn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonColumnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonLine, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
            .addComponent(buttonColumn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buttonPie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(buttonColumn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(buttonLine, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(buttonPie, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLineActionPerformed
        // TODO add your handling code here:
        new LineChartFrame().setVisible(true);
    }//GEN-LAST:event_buttonLineActionPerformed

    private void buttonPieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPieActionPerformed

    private void buttonColumnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonColumnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonColumnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonColumn;
    private javax.swing.JButton buttonLine;
    private javax.swing.JButton buttonPie;
    // End of variables declaration//GEN-END:variables
}
