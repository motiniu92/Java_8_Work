/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailproduct;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author l2pc216m
 */
public class ProductPrice extends javax.swing.JFrame {

    /**
     * Creates new form ProductPrice
     */
    public ProductPrice() {
        initComponents();
        initProduct();
        getContentPane().setBackground(Color.cyan);
    }
    
    public void initProduct(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/buysell3", "root", "apcl123456");
            PreparedStatement ps = con.prepareStatement("SELECT* FROM product");
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Integer i1 = rs.getInt(1);
                item.addItem(i1.toString());
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void showData(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/buysell3", "root", "apcl123456");
            PreparedStatement ps = con.prepareStatement("SELECT* FROM product");
            
            ResultSet rs = null;
            ResultSetMetaData rsmd = null;
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            DefaultTableModel dtm = new DefaultTableModel();
            Object[] columnNames = new Object[rsmd.getColumnCount()];
            for(int i=0; i<rsmd.getColumnCount(); i++){
                columnNames[i] = rsmd.getColumnLabel(i+1);
                dtm.addColumn(columnNames[i]);
            }
            while(rs.next()){
                Object[] data = new Object[rsmd.getColumnCount()];
                for(int i=0; i<data.length; i++){
                    data[i] = rs.getObject(i+1);
                }
                dtm.addRow(data);
            }
            tblProduct.setModel(dtm);
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    public void showData2(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/buysell3", "root", "apcl123456");
            PreparedStatement ps = con.prepareStatement("SELECT* FROM transaction");
            
            ResultSet rs = null;
            ResultSetMetaData rsmd = null;
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            DefaultTableModel dtm = new DefaultTableModel();
            Object[] columnNames = new Object[rsmd.getColumnCount()];
            for(int i=0; i<rsmd.getColumnCount(); i++){
                columnNames[i] = rsmd.getColumnLabel(i+1);
                dtm.addColumn(columnNames[i]);
            }
            while(rs.next()){
                Object[] data = new Object[rsmd.getColumnCount()];
                for(int i=0; i<data.length; i++){
                    data[i] = rs.getObject(i+1);
                }
                dtm.addRow(data);
            }
            tblTran.setModel(dtm);
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    int t_id = 0;
    public void tidAuto(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/buysell3", "root", "apcl123456");
            PreparedStatement ps = con.prepareStatement("SELECT MAX(tid) FROM transaction");
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                t_id = rs.getInt(1)+1;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pn = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        stk = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        qnt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tp = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        up = new javax.swing.JTextField();
        item = new javax.swing.JComboBox<>();
        btnSell = new javax.swing.JButton();
        btnBuy = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduct = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTran = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Monirul Islam");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Product ID:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Product name:");

        pn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Stock:");

        stk.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Quantity:");

        qnt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        qnt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                qntKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Total price:");

        tp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Unit price:");

        up.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        item.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        item.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select item" }));
        item.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                itemItemStateChanged(evt);
            }
        });

        btnSell.setBackground(new java.awt.Color(102, 0, 153));
        btnSell.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        btnSell.setForeground(new java.awt.Color(255, 255, 255));
        btnSell.setText("Sell");
        btnSell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSellActionPerformed(evt);
            }
        });

        btnBuy.setBackground(new java.awt.Color(204, 0, 51));
        btnBuy.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        btnBuy.setForeground(new java.awt.Color(255, 255, 255));
        btnBuy.setText("Buy");
        btnBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel8.setText("Updated Information:");

        tblProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblProduct);

        tblTran.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblTran);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel1.setText("Transaction:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSell)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuy))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tp)
                            .addComponent(qnt)
                            .addComponent(up)
                            .addComponent(stk)
                            .addComponent(pn)
                            .addComponent(item, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(97, 97, 97))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(jLabel8))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jLabel1)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(stk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(up, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(qnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuy)
                    .addComponent(btnSell))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
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
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/buysell3", "root", "apcl123456");
            PreparedStatement ps = con.prepareStatement("SELECT* FROM product WHERE pid=?");
            
            String s1 = item.getSelectedItem().toString();
            ps.setString(1, s1);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                String s2 = rs.getString(2);
                pn.setText(s2);
                Integer i1 = rs.getInt(3);
                stk.setText(i1.toString());
                Double d1 = rs.getDouble(4);
                up.setText(d1.toString());
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        if(item.getSelectedItem().toString().equals("Select item")){
        pn.setText("");
        stk.setText("");
        up.setText("");
        qnt.setText("");
        tp.setText("");
        }
    }//GEN-LAST:event_itemItemStateChanged

    private void btnSellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSellActionPerformed
        // TODO add your handling code here:
            
            
            String s2 = item.getSelectedItem().toString();
            Integer i2 = Integer.parseInt(s2);
            
            String s3 = pn.getText();
            
            String s4 = stk.getText();
            Integer i3 = Integer.parseInt(s4);
            
            String s5 = up.getText();
            Double d1 = Double.parseDouble(s5);
            
            String s6 = qnt.getText();
            Integer i4 = Integer.parseInt(s6);
            
            String s7 = tp.getText();
            Double d2 = Double.parseDouble(s7);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/buysell3", "root", "apcl123456");
            PreparedStatement ps = con.prepareStatement("INSERT INTO transaction(tid,pid,pname,stock,uprice,quantity,tprice,type) VALUES(?,?,?,?,?,?,?,?)");
            
            tidAuto();
            ps.setInt(1, t_id);
            ps.setInt(2, i2);
            ps.setString(3, s3);
            ps.setInt(4, i3);
            ps.setDouble(5, d1);
            ps.setInt(6, i4);
            ps.setDouble(7, d2);
            ps.setString(8, "Sell");
            
            int i = ps.executeUpdate();
            if(i>0){
                JOptionPane.showMessageDialog(null, "Data inserted !");
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/buysell3", "root", "apcl123456");
            PreparedStatement pst = con.prepareStatement("UPDATE product SET stock=? WHERE pid=?");
            
            String s8 = stk.getText();
            int i5 = Integer.parseInt(s8);
            String s9 = qnt.getText();
            int i6 = Integer.parseInt(s9);
            int i7 = i5-i6;
            String s10 = String.valueOf(i7);
            pst.setString(1, s10);
            
            String s11 = item.getSelectedItem().toString();
            pst.setString(2, s11);
            
            int x = pst.executeUpdate();
            if(x>0){
                JOptionPane.showMessageDialog(null, "product updated !");
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        showData();
        showData2();
        item.setSelectedItem("Select item");
        pn.setText("");
        stk.setText("");
        up.setText("");
        qnt.setText("");
        tp.setText("");
    }//GEN-LAST:event_btnSellActionPerformed

    private void btnBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyActionPerformed
        // TODO add your handling code here:
        
            String s2 = item.getSelectedItem().toString();
            Integer i2 = Integer.parseInt(s2);
            
            String s3 = pn.getText();
            
            String s4 = stk.getText();
            Integer i3 = Integer.parseInt(s4);
            
            String s5 = up.getText();
            Double d1 = Double.parseDouble(s5);
            
            String s6 = qnt.getText();
            Integer i4 = Integer.parseInt(s6);
            
            String s7 = tp.getText();
            Double d2 = Double.parseDouble(s7);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/buysell3", "root", "apcl123456");
            PreparedStatement ps = con.prepareStatement("INSERT INTO transaction(tid,pid,pname,stock,uprice,quantity,tprice,type) VALUES(?,?,?,?,?,?,?,?)");
            
            tidAuto();
            ps.setInt(1, t_id);
            ps.setInt(2, i2);
            ps.setString(3, s3);
            ps.setInt(4, i3);
            ps.setDouble(5, d1);
            ps.setInt(6, i4);
            ps.setDouble(7, d2);
            ps.setString(8, "Buy");
            
            int i = ps.executeUpdate();
            if(i>0){
                JOptionPane.showMessageDialog(null, "Data inserted !");
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/buysell3", "root", "apcl123456");
            PreparedStatement pst = con.prepareStatement("UPDATE product SET stock=? WHERE pid=?");
            
            String s8 = stk.getText();
            int i5 = Integer.parseInt(s8);
            String s9 = qnt.getText();
            int i6 = Integer.parseInt(s9);
            int i7 = i5+i6;
            String s10 = String.valueOf(i7);
            pst.setString(1, s10);
            
            String s11 = item.getSelectedItem().toString();
            pst.setString(2, s11);
            
            int x = pst.executeUpdate();
            if(x>0){
                JOptionPane.showMessageDialog(null, "product updated !");
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        showData();
        showData2();
        item.setSelectedItem("Select item");
        pn.setText("");
        stk.setText("");
        up.setText("");
        qnt.setText("");
        tp.setText("");
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
            java.util.logging.Logger.getLogger(ProductPrice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductPrice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductPrice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductPrice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductPrice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuy;
    private javax.swing.JButton btnSell;
    private javax.swing.JComboBox<String> item;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField pn;
    private javax.swing.JTextField qnt;
    private javax.swing.JTextField stk;
    private javax.swing.JTable tblProduct;
    private javax.swing.JTable tblTran;
    private javax.swing.JTextField tp;
    private javax.swing.JTextField up;
    // End of variables declaration//GEN-END:variables
}
