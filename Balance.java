/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Sohail
 */
public class Balance extends javax.swing.JFrame {

    /**
     * Creates new form Balancenquiry
     */
    JDBC db;
    String s3;
    public Balance(String s) {
        initComponents();
        this.setBounds(0,0,510,510);
        db=new JDBC();
        s3=s;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 189, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 120, 90));

        jLabel2.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        jLabel2.setText("Enter Pin Code");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cancle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Proceed");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("F:\\solid5.jpg")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 520, 120));

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("XYZ Bank");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 90, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon("F:\\solid5.jpg")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        String password="",password1;
        String s1=jTextField1.getText();
        if(s3.equals("1")){
        
        if(!s1.equals("")){
        String s2="select * from tbsingup where fdAtmPinCode='"+s1+"'";
        
        try
        {
          db.rs=db.stm.executeQuery(s2);
          db.rs.next();
          password = db.rs.getString(8); 
          
        }
        catch(Exception ec)
        {
            System.out.println(ec);
        }
        
        
        if(!s1.equals(password)){
            JFrame f=new JFrame();
            JOptionPane.showMessageDialog(f,"Wrong PIN");
        
        }else{
        
        
        password1=String.valueOf(password);
        Balancenquiry_1 be_1=new Balancenquiry_1(password1);
        be_1.setVisible(true);
        }
        }
        else{
            JFrame f=new JFrame();
            JOptionPane.showMessageDialog(f,"Field Should Not be Empty");
        
        }
        }
        else{
            
            
            
            
        String s2="select * from tbsingup where fdAtmPinCode='"+s1+"'";
        
        try
        {
          db.rs=db.stm.executeQuery(s2);
          db.rs.next();
          password = db.rs.getString(8); 
          
        }
        catch(Exception ec)
        {
            System.out.println(ec);
        }
            
        String password2=String.valueOf(password);
        Withdrawal w=new Withdrawal(password2);
        w.setVisible(true);
        
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
