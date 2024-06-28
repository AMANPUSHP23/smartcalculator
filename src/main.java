import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.math.BigDecimal;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author tusha
 */
public class main extends javax.swing.JFrame {
    double num1=0,num2=0;
   String operator = null;
   Connection con = null;
    /**
     * Creates new form main
     */
    public main() {
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

        jLabel1 = new javax.swing.JLabel();
        tf = new javax.swing.JTextField();
        btcon = new javax.swing.JButton();
        btpush = new javax.swing.JButton();
        btfetch = new javax.swing.JButton();
        btequal = new javax.swing.JButton();
        btdbtot = new javax.swing.JButton();
        btplus = new javax.swing.JButton();
        btclear = new javax.swing.JButton();
        btmod = new javax.swing.JButton();
        btclose = new javax.swing.JButton();
        btdot = new javax.swing.JButton();
        btdiv = new javax.swing.JButton();
        bt0 = new javax.swing.JButton();
        bt7 = new javax.swing.JButton();
        bt4 = new javax.swing.JButton();
        bt1 = new javax.swing.JButton();
        bt8 = new javax.swing.JButton();
        btback = new javax.swing.JButton();
        btmult = new javax.swing.JButton();
        bt5 = new javax.swing.JButton();
        bt6 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        btminus = new javax.swing.JButton();
        btback2 = new javax.swing.JButton();
        bt9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("SMART CALCULATOR");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 210, 30));

        tf.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        tf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(tf, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 730, 127));

        btcon.setBackground(new java.awt.Color(0, 255, 51));
        btcon.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        btcon.setText("CONNECT");
        btcon.setToolTipText("");
        btcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btconActionPerformed(evt);
            }
        });
        getContentPane().add(btcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, -1, 90));

        btpush.setBackground(new java.awt.Color(0, 204, 255));
        btpush.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        btpush.setText("PUSH");
        btpush.setToolTipText("");
        btpush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpushActionPerformed(evt);
            }
        });
        getContentPane().add(btpush, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 138, 60));

        btfetch.setBackground(new java.awt.Color(255, 153, 0));
        btfetch.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        btfetch.setText("FETCH");
        btfetch.setToolTipText("");
        btfetch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btfetchActionPerformed(evt);
            }
        });
        getContentPane().add(btfetch, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 310, 138, 60));

        btequal.setBackground(new java.awt.Color(102, 102, 102));
        btequal.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 48)); // NOI18N
        btequal.setForeground(new java.awt.Color(255, 255, 255));
        btequal.setText("=");
        btequal.setToolTipText("");
        btequal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btequalActionPerformed(evt);
            }
        });
        getContentPane().add(btequal, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 138, 110));

        btdbtot.setBackground(new java.awt.Color(0, 255, 204));
        btdbtot.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        btdbtot.setText("DBToT");
        btdbtot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdbtotActionPerformed(evt);
            }
        });
        getContentPane().add(btdbtot, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 120, 60));

        btplus.setBackground(new java.awt.Color(153, 153, 153));
        btplus.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        btplus.setText("+");
        btplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btplusActionPerformed(evt);
            }
        });
        getContentPane().add(btplus, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 429, 120, 60));

        btclear.setBackground(new java.awt.Color(255, 255, 0));
        btclear.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btclear.setText("CLEAR");
        btclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btclearActionPerformed(evt);
            }
        });
        getContentPane().add(btclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 130, 70));

        btmod.setBackground(new java.awt.Color(153, 153, 153));
        btmod.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        btmod.setText("%");
        btmod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmodActionPerformed(evt);
            }
        });
        getContentPane().add(btmod, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 120, 70));

        btclose.setBackground(new java.awt.Color(255, 0, 0));
        btclose.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btclose.setText("CLOSE");
        btclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcloseActionPerformed(evt);
            }
        });
        getContentPane().add(btclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 180, 70));

        btdot.setBackground(new java.awt.Color(204, 204, 204));
        btdot.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        btdot.setText(".");
        btdot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdotActionPerformed(evt);
            }
        });
        getContentPane().add(btdot, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 180, 60));

        btdiv.setBackground(new java.awt.Color(153, 153, 153));
        btdiv.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        btdiv.setText("/");
        btdiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdivActionPerformed(evt);
            }
        });
        getContentPane().add(btdiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 120, 60));

        bt0.setBackground(new java.awt.Color(204, 204, 204));
        bt0.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        bt0.setText("0");
        bt0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt0ActionPerformed(evt);
            }
        });
        getContentPane().add(bt0, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 130, 60));

        bt7.setBackground(new java.awt.Color(204, 204, 204));
        bt7.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        bt7.setText("7");
        bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt7ActionPerformed(evt);
            }
        });
        getContentPane().add(bt7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 180, 60));

        bt4.setBackground(new java.awt.Color(204, 204, 204));
        bt4.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        bt4.setText("4");
        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });
        getContentPane().add(bt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 180, 60));

        bt1.setBackground(new java.awt.Color(204, 204, 204));
        bt1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        bt1.setText("1");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        getContentPane().add(bt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 180, 60));

        bt8.setBackground(new java.awt.Color(204, 204, 204));
        bt8.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        bt8.setText("8");
        bt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt8ActionPerformed(evt);
            }
        });
        getContentPane().add(bt8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 130, 60));

        btback.setBackground(new java.awt.Color(204, 204, 204));
        btback.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        btback.setText("BACK");
        btback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbackActionPerformed(evt);
            }
        });
        getContentPane().add(btback, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 120, 70));

        btmult.setBackground(new java.awt.Color(153, 153, 153));
        btmult.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        btmult.setText("X");
        btmult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmultActionPerformed(evt);
            }
        });
        getContentPane().add(btmult, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 120, 60));

        bt5.setBackground(new java.awt.Color(204, 204, 204));
        bt5.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        bt5.setText("5");
        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });
        getContentPane().add(bt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 130, 60));

        bt6.setBackground(new java.awt.Color(204, 204, 204));
        bt6.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        bt6.setText("6");
        bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt6ActionPerformed(evt);
            }
        });
        getContentPane().add(bt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 120, 60));

        bt2.setBackground(new java.awt.Color(204, 204, 204));
        bt2.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        bt2.setText("2");
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });
        getContentPane().add(bt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 130, 60));

        bt3.setBackground(new java.awt.Color(204, 204, 204));
        bt3.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        bt3.setText("3");
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });
        getContentPane().add(bt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 120, 60));

        btminus.setBackground(new java.awt.Color(153, 153, 153));
        btminus.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        btminus.setText("-");
        btminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btminusActionPerformed(evt);
            }
        });
        getContentPane().add(btminus, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 120, 60));

        btback2.setBackground(new java.awt.Color(255, 255, 0));
        btback2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btback2.setText("CLEAR");
        getContentPane().add(btback2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 130, 70));

        bt9.setBackground(new java.awt.Color(204, 204, 204));
        bt9.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 36)); // NOI18N
        bt9.setText("9");
        bt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt9ActionPerformed(evt);
            }
        });
        getContentPane().add(bt9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 120, 60));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt7ActionPerformed
        tf.setText(tf.getText() + "7");
    }//GEN-LAST:event_bt7ActionPerformed

    private void bt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt8ActionPerformed
        tf.setText(tf.getText() + "8");
    }//GEN-LAST:event_bt8ActionPerformed

    private void bt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt9ActionPerformed
        tf.setText(tf.getText() + "9");
    }//GEN-LAST:event_bt9ActionPerformed

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4ActionPerformed
        tf.setText(tf.getText() + "4");
    }//GEN-LAST:event_bt4ActionPerformed

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt5ActionPerformed
        tf.setText(tf.getText() + "5");
    }//GEN-LAST:event_bt5ActionPerformed

    private void bt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt6ActionPerformed
        tf.setText(tf.getText() + "6");
    }//GEN-LAST:event_bt6ActionPerformed

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        tf.setText(tf.getText() + "1");
    }//GEN-LAST:event_bt1ActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        tf.setText(tf.getText() + "2");
    }//GEN-LAST:event_bt2ActionPerformed

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
        tf.setText(tf.getText() + "3");
    }//GEN-LAST:event_bt3ActionPerformed

    private void btdotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdotActionPerformed
        tf.setText(tf.getText() + ".");
    }//GEN-LAST:event_btdotActionPerformed

    private void bt0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt0ActionPerformed
        tf.setText(tf.getText() + "0");
    }//GEN-LAST:event_bt0ActionPerformed

    private void btfetchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btfetchActionPerformed
        String ph= tf.getText();
        Statement statement = null;
        ResultSet resultSet = null;
        if (con != null) {
            try{
                // Create a statement
            statement = con.createStatement();

            // Execute a query
            String query = "SELECT amt FROM user WHERE phno = '" + ph + "'";
            resultSet = statement.executeQuery(query);

            // Process the result set
            if (resultSet.next()) {
                String amount = resultSet.getString("amt");
                tf.setText(amount);
            } else {
                tf.setText(" No Entries");
                }
               }
               catch(Exception e){
                    //e.printStackTrace();
                   
                   tf.setText(e.getMessage());
                }
            

        }
            else
                tf.setText("Error Connection");
    }//GEN-LAST:event_btfetchActionPerformed

    private void btequalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btequalActionPerformed
        num2 = Double.parseDouble(tf.getText());
        
        double ans=0;
        if(operator.equals("+"))
        {
            ans=num1+num2;
        }
        if(operator.equals("-"))
        {
            ans=num1-num2;
        }
        if(operator.equals("*"))
        {
            ans=num1*num2;
        }
        if(operator.equals("%"))
        {
            ans=num1%num2;
        }
        if (operator.equals("/"))
          {
              
                        if (num2 != 0)
                        {
                            ans = num1 / num2;
                            
                        }
                        else
                        {
                            tf.setText("Error : Division By Zero");
                        }
           
              
          }       
        
        else 
             {
                    tf.setText("Error: Invalid operator");
             }
                
            
        
        tf.setText(""+ans);
        operator = null;
    }//GEN-LAST:event_btequalActionPerformed

    private void btmodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmodActionPerformed
        num1 = Double.parseDouble(tf.getText());
        tf.setText("");
        operator="%";
    }//GEN-LAST:event_btmodActionPerformed

    private void btdivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdivActionPerformed
        num1 = Double.parseDouble(tf.getText());
        tf.setText("");
        operator="/";
    }//GEN-LAST:event_btdivActionPerformed

    private void btmultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmultActionPerformed
        num1 = Double.parseDouble(tf.getText());
        tf.setText("");
        operator="*";
    }//GEN-LAST:event_btmultActionPerformed

    private void btminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btminusActionPerformed
        num1 = Double.parseDouble(tf.getText());
        tf.setText("");
        operator="-"; 
    }//GEN-LAST:event_btminusActionPerformed

    private void btplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btplusActionPerformed
        num1 = Double.parseDouble(tf.getText());
        tf.setText("");
        operator="+"; 
    }//GEN-LAST:event_btplusActionPerformed

    private void btbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbackActionPerformed
       String str = tf.getText();
       tf.setText(str.substring(0,str.length()-1));
    }//GEN-LAST:event_btbackActionPerformed

    private void btclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btclearActionPerformed
        tf.setText("");
    }//GEN-LAST:event_btclearActionPerformed

    private void btcloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcloseActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_btcloseActionPerformed

    private void btconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btconActionPerformed
         String JDBC_URL = "jdbc:mysql://localhost:3306/calculator";
         String JDBC_USER = "root";
         String JDBC_PASSWORD = "mysql";
         
         
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            con = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);

            // If connection is successful
            if (con != null) {
                tf.setText("Connected");
            }
            else
                tf.setText("Error Connection");

        }
         catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Failed to connect to the database.");
            e.printStackTrace();
    }//GEN-LAST:event_btconActionPerformed
    }
    private void btpushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpushActionPerformed
       BigDecimal amount= new BigDecimal(tf.getText());
       
       PreparedStatement pstmt = null;
       String phoneNumber;

       if(con!=null){
           
           try{
                phoneNumber = JOptionPane.showInputDialog(tf, "Enter Phone Number:");
                    
                    if (phoneNumber != null && phoneNumber.matches("\\d{10}")) {
                        
                        JOptionPane.showMessageDialog(tf, "Data successfully inserted!");
                    } else {
                        JOptionPane.showMessageDialog(tf, "Invalid phone number. Please enter a 10-digit number.");
                    }
                    
                    String insertSQL = "INSERT INTO user (phno, amt) VALUES (?, ?)";
                    pstmt = con.prepareStatement(insertSQL);
                    pstmt.setString(1, phoneNumber);
                    pstmt.setBigDecimal(2, amount);
                    pstmt.executeUpdate();
                } 
               
           
           catch(Exception e){
               JOptionPane.showInputDialog(e);
           }
       }
    }//GEN-LAST:event_btpushActionPerformed

    private void btdbtotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdbtotActionPerformed
        
        Statement statement = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        BigDecimal totalAmount = null;
        if (con != null)
        {
            try{
                // Create a statement
                statement = con.createStatement();

                // Execute a query
                String querySQL = "SELECT SUM(amt) AS total_amt FROM user";
                pstmt = con.prepareStatement(querySQL);
                rs = pstmt.executeQuery();
                if (rs.next())
                {
                    totalAmount = rs.getBigDecimal("total_amt");
                 }
            
            }    
                catch (SQLException ex)
                {
                System.out.println("Failed to fetch total amount from the database.");
                ex.printStackTrace();
                } 
                finally {
            // Close the resources
                   try {
                        if (rs != null) rs.close();
                        if (pstmt != null) pstmt.close();
                        if (con != null) con.close();
                    } 
                    catch (SQLException ex)
                    {
                        ex.printStackTrace();
                    }
                }
            tf.setText(totalAmount.toString());
        }
        else
                tf.setText("Error Connection");

        
            
    }//GEN-LAST:event_btdbtotActionPerformed
   
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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt0;
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JButton bt5;
    private javax.swing.JButton bt6;
    private javax.swing.JButton bt7;
    private javax.swing.JButton bt8;
    private javax.swing.JButton bt9;
    private javax.swing.JButton btback;
    private javax.swing.JButton btback2;
    private javax.swing.JButton btclear;
    private javax.swing.JButton btclose;
    private javax.swing.JButton btcon;
    private javax.swing.JButton btdbtot;
    private javax.swing.JButton btdiv;
    private javax.swing.JButton btdot;
    private javax.swing.JButton btequal;
    private javax.swing.JButton btfetch;
    private javax.swing.JButton btminus;
    private javax.swing.JButton btmod;
    private javax.swing.JButton btmult;
    private javax.swing.JButton btplus;
    private javax.swing.JButton btpush;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField tf;
    // End of variables declaration//GEN-END:variables
}
