/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datashowing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author l2pc210m
 */
public class RetrevingData extends javax.swing.JFrame {
    
   
    /** Creates new form RetrevingData */
    public RetrevingData() {
        initComponents();
        initProduct();
    }
    
    public void initProduct(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/monirul","root","apcl123456");
            PreparedStatement pstmt = con.prepareStatement("SELECT* FROM product");
            
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                Integer i1 = rs.getInt(1);
                item.addItem(i1.toString());
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pn = new javax.swing.JTextField();
        stk = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        up = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        qnt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tp = new javax.swing.JTextField();
        item = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        tid = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        delete = new javax.swing.JTextField();
        btnBuy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Monirul Islam");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Product ID:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Product name:");

        pn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        stk.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Stock");

        up.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Unit price:");

        qnt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        qnt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                qntKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Quantity:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Total price:");

        tp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        item.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        item.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select item" }));
        item.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                itemItemStateChanged(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(153, 0, 204));
        btnSave.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Sell");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("TID:");

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Product ID:");

        btnBuy.setBackground(new java.awt.Color(102, 51, 255));
        btnBuy.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        btnBuy.setForeground(new java.awt.Color(255, 255, 255));
        btnBuy.setText("Buy");
        btnBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pn)
                            .addComponent(item, 0, 213, Short.MAX_VALUE)
                            .addComponent(tid)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(btnSave)
                            .addComponent(jLabel8))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tp, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(qnt, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(up, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(stk, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnDelete))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnBuy)
                                        .addGap(38, 38, 38)))))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(stk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(up, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(qnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSave)
                    .addComponent(btnBuy))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDelete)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void qntKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qntKeyReleased
        // TODO add your handling code here:
        String s1 = up.getText();
        double d1 = Double.parseDouble(s1);
        String s2 = qnt.getText();
        double d2 = Double.parseDouble(s2);
        double d3 = d1*d2;
        String s3 = String.valueOf(d3);
        tp.setText(s3);
        
       
    }//GEN-LAST:event_qntKeyReleased

    private void itemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_itemItemStateChanged
        // TODO add your handling code here:
        
        if(item.getSelectedItem().toString().equals("Select item")){
            pn.setText("");
            stk.setText("");
            up.setText("");
            qnt.setText("");
            tp.setText("");
        }
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/monirul","root","apcl123456");
            PreparedStatement pstmt = con.prepareStatement("SELECT* FROM product WHERE pid=?");
            
            String s1 = item.getSelectedItem().toString();
            pstmt.setString(1,s1);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                String s2 = rs.getString(2);
                pn.setText(s2);
                int i1 = rs.getInt(3);
                stk.setText(String.valueOf(i1));
                double d1 = rs.getDouble(4);
                up.setText(String.valueOf(d1));
                int i2 = rs.getInt(5);
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_itemItemStateChanged

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String s1 = tid.getText();
        int i1 = Integer.parseInt(s1);
        String s2 = item.getSelectedItem().toString();
        int i2 = Integer.parseInt(s2);
        String s3 = pn.getText();
        String s4 = stk.getText();
        int i3 = Integer.parseInt(s4);
        String s5 = up.getText();
        double d1 = Double.parseDouble(s5);
        String s6 = qnt.getText();
        int i4 = Integer.parseInt(s6);
        String s7 = tp.getText();
        double d2 = Double.parseDouble(s7);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/monirul","root","apcl123456");
            PreparedStatement pstmt = con.prepareStatement("INSERT INTO transaction(tid,pid,pname,stock,uprice,quantity,tprice,type) VALUES(?,?,?,?,?,?,?,?)");
            
            pstmt.setInt(1, i1);
            pstmt.setInt(2, i2);
            pstmt.setString(3, s3);
            pstmt.setInt(4, i3);
            pstmt.setDouble(5, d1);
            pstmt.setInt(6, i4);
            pstmt.setDouble(7, d2);
            pstmt.setString(8, "Sold");
            
            int i5 = pstmt.executeUpdate();
             if(i5>0){
                 JOptionPane.showMessageDialog(null, "Data inserted!");
             }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/monirul","root","apcl123456");
            PreparedStatement ps = con.prepareStatement("UPDATE product SET stock=? WHERE pid=?");
            
            String s8 = stk.getText();
            int i6 = Integer.parseInt(s8);
            String s9 = qnt.getText();
            int i7 = Integer.parseInt(s9);
            int i8 = i6-i7;
            String s10 = String.valueOf(i8);
            
            String s11 = item.getSelectedItem().toString();
            
            ps.setString(1, s10);
            ps.setString(2, s11);
            
            int i9 = ps.executeUpdate();
            if(i9>0){
                JOptionPane.showMessageDialog(null, "product updated !");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        String s1 = delete.getText();
        int i1 = Integer.parseInt(s1);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/monirul","root","apcl123456");
            PreparedStatement pstmt = con.prepareStatement("DELETE FROM transaction WHERE pid=?");
            
            pstmt.setInt(1,i1);
            
            int i5 = pstmt.executeUpdate();
             if(i5>0){
                 JOptionPane.showMessageDialog(null, "Data deleted!");
             }
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyActionPerformed
        // TODO add your handling code here:
        String s1 = tid.getText();
        int i1 = Integer.parseInt(s1);
        String s2 = item.getSelectedItem().toString();
        int i2 = Integer.parseInt(s2);
        String s3 = pn.getText();
        String s4 = stk.getText();
        int i3 = Integer.parseInt(s4);
        String s5 = up.getText();
        double d1 = Double.parseDouble(s5);
        String s6 = qnt.getText();
        int i4 = Integer.parseInt(s6);
        String s7 = tp.getText();
        double d2 = Double.parseDouble(s7);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/monirul","root","apcl123456");
            PreparedStatement pstmt = con.prepareStatement("INSERT INTO transaction(tid,pid,pname,stock,uprice,quantity,tprice,type) VALUES(?,?,?,?,?,?,?,?)");
            
            pstmt.setInt(1, i1);
            pstmt.setInt(2, i2);
            pstmt.setString(3, s3);
            pstmt.setInt(4, i3);
            pstmt.setDouble(5, d1);
            pstmt.setInt(6, i4);
            pstmt.setDouble(7, d2);
            pstmt.setString(8, "Buy");
            
            int i5 = pstmt.executeUpdate();
             if(i5>0){
                 JOptionPane.showMessageDialog(null, "Data inserted!");
             }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/monirul","root","apcl123456");
            PreparedStatement ps = con.prepareStatement("UPDATE product SET stock=? WHERE pid=?");
            
            String s8 = stk.getText();
            int i6 = Integer.parseInt(s8);
            String s9 = qnt.getText();
            int i7 = Integer.parseInt(s9);
            int i8 = i6+i7;
            String s10 = String.valueOf(i8);
            
            String s11 = item.getSelectedItem().toString();
            
            ps.setString(1, s10);
            ps.setString(2, s11);
            
            int i9 = ps.executeUpdate();
            if(i9>0){
                JOptionPane.showMessageDialog(null, "product updated !");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnBuyActionPerformed

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
            java.util.logging.Logger.getLogger(RetrevingData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RetrevingData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RetrevingData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RetrevingData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RetrevingData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuy;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JTextField delete;
    private javax.swing.JComboBox<String> item;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField pn;
    private javax.swing.JTextField qnt;
    private javax.swing.JTextField stk;
    private javax.swing.JTextField tid;
    private javax.swing.JTextField tp;
    private javax.swing.JTextField up;
    // End of variables declaration//GEN-END:variables

}
