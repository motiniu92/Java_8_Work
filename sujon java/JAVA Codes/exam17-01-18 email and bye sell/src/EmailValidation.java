
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author l2pc206m
 */
public class EmailValidation extends javax.swing.JFrame {
   // Class.forName("com.mysql.jdbc.Driver");
    Connection con;
    
    public void cdProduct(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/productmine", "root", "apcl123456");
            PreparedStatement ps=con.prepareStatement("select* from Productmine");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
            pid.addItem(""+rs.getInt(1));
            }
        }catch(Exception e){
            e.printStackTrace();
        }    
    }
    
    public EmailValidation() {
        initComponents();
        cdProduct();
    }

    /*
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Stock = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnSell = new javax.swing.JButton();
        btnBuy = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        tid = new javax.swing.JTextField();
        pn = new javax.swing.JTextField();
        up = new javax.swing.JTextField();
        st = new javax.swing.JTextField();
        q = new javax.swing.JTextField();
        tp = new javax.swing.JTextField();
        pid = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("TID");

        jLabel2.setText("PID");

        jLabel3.setText("Product Name");

        jLabel4.setText("Unite Price");

        Stock.setText("Stock");

        jLabel6.setText("Quantity");

        jLabel7.setText("Total Price");

        btnSell.setText("Sell");
        btnSell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSellActionPerformed(evt);
            }
        });

        btnBuy.setText("Bye");
        btnBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyActionPerformed(evt);
            }
        });

        tab.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tab);

        pn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnActionPerformed(evt);
            }
        });

        q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qActionPerformed(evt);
            }
        });
        q.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                qKeyReleased(evt);
            }
        });

        tp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tpActionPerformed(evt);
            }
        });

        pid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Item" }));
        pid.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                pidItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(btnSell)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuy)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Stock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pn, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(up, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(st, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(q, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tp, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tid)
                    .addComponent(pid, 0, 184, Short.MAX_VALUE))
                .addGap(225, 225, 225))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(up, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Stock)
                    .addComponent(st, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(q, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSell)
                    .addComponent(btnBuy))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuyActionPerformed

    private void pnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnActionPerformed

    private void qActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qActionPerformed

    private void tpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tpActionPerformed

    private void pidItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_pidItemStateChanged
         try{
            Class.forName("com.mysql.jdbc.Driver");           
            PreparedStatement pstmt= con.prepareStatement("SELECT* FROM Productmine WHERE pid=?");  
            int id= Integer.parseInt(pid.getSelectedItem().toString());
            pstmt.setInt(1,id);
            ResultSet rs=pstmt.executeQuery();
            while(rs.next()){
                pn.setText(rs.getString(2));            
                up.setText(""+rs.getInt(3));
                st.setText(""+rs.getInt(4));           
            }
        }catch(Exception e){
          e.printStackTrace();
        }
    }//GEN-LAST:event_pidItemStateChanged

    private void qKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qKeyReleased
       tp.setText(""+Integer.parseInt(q.getText())*Integer.parseInt(up.getText()));           
    }//GEN-LAST:event_qKeyReleased

    private void btnSellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSellActionPerformed
                                                 
        // TODO add your handling code here:
        String s1 = tid.getText();
        Integer i1 = Integer.valueOf(s1);
        
        String s2 = pid.getSelectedItem().toString();
        Integer i2 = Integer.valueOf(s2);
        
        String s3 = pn.getText();
        
        String s4 = st.getText();
        Integer i3 = Integer.valueOf(s4);
        
        String s5 = up.getText();
        Double d1 = Double.valueOf(s5);
        
        String s6 =q.getText();
        Integer i4 = Integer.valueOf(s6);
        
        String s7 = tp.getText();
        Double d2 = Double.valueOf(s7);
        
        try{                                
            PreparedStatement ps = con.prepareStatement("INSERT INTO transact(tid,pid,pname,unitprice,quantity,totalprice,type,stock) VALUES(?,?,?,?,?,?,?,?)");           
            ps.setInt(1, i1);
            ps.setInt(2, i2);
            ps.setString(3, s3);
            ps.setInt(4, i3);
            ps.setDouble(5, d1);
            ps.setInt(6, i4);
            ps.setDouble(8, d2);
            ps.setString(7, "Sell");
            
            int i = ps.executeUpdate();
            if(i>0){
                JOptionPane.showMessageDialog(null, "Data inserted !");
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/buysell2", "root", "apcl123456");
            PreparedStatement pst = con.prepareStatement("UPDATE product SET stock=? WHERE pid=?");
            
            String s8 = st.getText();
            int i5 = Integer.parseInt(s8);
            String s9 = q.getText();
            int i6 = Integer.parseInt(s9);
            int i7 = i5-i6;
            String s10 = String.valueOf(i7);
            pst.setString(1, s10);
            
            String s11 = pid.getSelectedItem().toString();
            pst.setString(2, s11);
            
            int i = pst.executeUpdate();
            if(i>0){
                JOptionPane.showMessageDialog(null, "product updated !");
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
       showData();
     
    }//GEN-LAST:event_btnSellActionPerformed

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
            java.util.logging.Logger.getLogger(EmailValidation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmailValidation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmailValidation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmailValidation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmailValidation().setVisible(true);
            }
        });
    }
   public void showData(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            PreparedStatement ps = con.prepareStatement("SELECT* FROM product");

            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            DefaultTableModel dtm = new DefaultTableModel();
            Object[] columnNames = new Object[rsmd.getColumnCount()];
            for(int i=0; i<columnNames.length; i++){
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
             tab.setModel(dtm);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Stock;
    private javax.swing.JButton btnBuy;
    private javax.swing.JButton btnSell;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> pid;
    private javax.swing.JTextField pn;
    private javax.swing.JTextField q;
    private javax.swing.JTextField st;
    private javax.swing.JTable tab;
    private javax.swing.JTextField tid;
    private javax.swing.JTextField tp;
    private javax.swing.JTextField up;
    // End of variables declaration//GEN-END:variables
}
