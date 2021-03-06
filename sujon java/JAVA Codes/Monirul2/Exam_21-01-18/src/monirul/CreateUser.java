/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monirul;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author l2pc207m
 */
public class CreateUser extends javax.swing.JFrame {

    /**
     * Creates new form CreateUser
     */
    public CreateUser() {
        initComponents();
        getContentPane().setBackground(Color.YELLOW);
    }
    
    public boolean checkEmail(String email){
        boolean result = false;
        String s1 = "[a-z]+[A-Za-z0-9_.]+\\@[A-Za-z]+\\.[A-Za-z]{2,3}";
        if(email.matches(s1)){
            return true;
        }else{
            return false;
        }
    }
    
    public void mail(){
        String sm = em.getText();
        if(checkEmail(sm)){
            
        }else{
            JOptionPane.showMessageDialog(null, "Email wrong format !\nExamp: abc123@mail.com","",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public boolean checkId(String id){
        boolean result = false;
        String r1 = "[0-9]{7}";
        if(id.matches(r1)){
            return true;
        }else{
            return false;
        }
    }
    
    public void mid(){
        String sm1 = sid.getText();
        if(checkId(sm1)){
            
        }else{
            JOptionPane.showMessageDialog(null, "User id wrong !\nEnter 7 digits","",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public boolean checkPassword(String passw){
        boolean result = false;
        String r2 = "[A-Za-z0-9]{6,12}";
        if(passw.matches(r2)){
            return true;
        }else{
            return false;
        }
    }
    
    public void pas(){
        String sm2 = pass.getText();
        if(checkPassword(sm2)){
            
        }else{
            JOptionPane.showMessageDialog(null, "Password wrong !\nCapital,Small, Number(6-12 characters)","",JOptionPane.ERROR_MESSAGE);
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

        jLabel1 = new javax.swing.JLabel();
        sid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sn = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        em = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cont = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        btnUser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("User create");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("User ID:");

        sid.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sidFocusLost(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Password:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Student Name:");

        sn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("E-mail:");

        em.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        em.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                emFocusLost(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Contact:");

        cont.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contActionPerformed(evt);
            }
        });

        pass.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                passFocusLost(evt);
            }
        });

        btnUser.setBackground(new java.awt.Color(0, 102, 153));
        btnUser.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnUser.setForeground(new java.awt.Color(255, 255, 255));
        btnUser.setText("Create User");
        btnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cont)
                            .addComponent(em, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sid, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sn, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(pass)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(btnUser, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(sid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(em, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnUser, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void contActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contActionPerformed

    private void btnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserActionPerformed
        // TODO add your handling code here:
        String m1 = sid.getText();
        String m2 = pass.getText();
        String m3 = sn.getText();
        String m4 = em.getText();
        String m5 = cont.getText();
        if(m1.equals("")){
            JOptionPane.showMessageDialog(null, "You are leaving user id empty !","Error",JOptionPane.ERROR_MESSAGE);
        }else if(m2.equals("")){
            JOptionPane.showMessageDialog(null, "You are leaving password empty !","Error",JOptionPane.ERROR_MESSAGE);
        }else if(m3.equals("")){
            JOptionPane.showMessageDialog(null, "You are leaving name empty !","Error",JOptionPane.ERROR_MESSAGE);
        }else if(m4.equals("")){
            JOptionPane.showMessageDialog(null, "You are leaving email empty !","Error",JOptionPane.ERROR_MESSAGE);
        }else if(m5.equals("")){
            JOptionPane.showMessageDialog(null, "You are leaving contact empty !","Error",JOptionPane.ERROR_MESSAGE);
        
        }else{
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stuinfo", "root", "apcl123456");
                PreparedStatement ps = con.prepareStatement("INSERT INTO student()VALUES(?,?,?,?,?)");
                PreparedStatement ps1 = con.prepareStatement("SELECT S_ID FROM student WHERE S_ID=?");
                ps1.setString(1, sid.getText());
                ResultSet rs = ps1.executeQuery();
                if(rs.next()){
                    JOptionPane.showMessageDialog(null, "User already exists !","",JOptionPane.ERROR_MESSAGE);
                }else{
                    
                    String s1 = sid.getText();
                    ps.setString(1, s1);
                    String s2 = pass.getText();
                    ps.setString(2, s2);
                    String s3 = sn.getText();
                    ps.setString(3, s3);
                    String s4 = em.getText();
                    ps.setString(4, s4);
                    String s5 = cont.getText();
                    ps.setString(5, s5);
                    int i = ps.executeUpdate();
                    if(i>0){
                        JOptionPane.showMessageDialog(null, "User Created !");
                    }
                }

            }catch(Exception e){
                e.printStackTrace();
            }
          
        }
    }//GEN-LAST:event_btnUserActionPerformed

    private void emFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emFocusLost
        // TODO add your handling code here:
        mail();
    }//GEN-LAST:event_emFocusLost

    private void sidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sidFocusLost
        // TODO add your handling code here:
        mid();
    }//GEN-LAST:event_sidFocusLost

    private void passFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFocusLost
        // TODO add your handling code here:
        //pas();
    }//GEN-LAST:event_passFocusLost

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
            java.util.logging.Logger.getLogger(CreateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUser;
    private javax.swing.JTextField cont;
    private javax.swing.JTextField em;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField sid;
    private javax.swing.JTextField sn;
    // End of variables declaration//GEN-END:variables
}
