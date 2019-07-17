/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus.management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Font;


public class UserLogin extends javax.swing.JFrame {

    public UserLogin() {
        initComponents();
    }

    private void initComponents() {
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usernameTF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        passwordPF = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Password");

        usernameTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Reset");

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Create Account");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        passwordPF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        
        lblVasaviBusBooking = new JLabel("Vasavi Bus Booking");
        lblVasaviBusBooking.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(192)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel2)
        				.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE))
        			.addGap(68)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        				.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jButton1)
        					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addComponent(jButton2))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(1)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(usernameTF, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
        						.addComponent(passwordPF)
        						.addComponent(lblVasaviBusBooking))))
        			.addContainerGap(324, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(34)
        			.addComponent(lblVasaviBusBooking)
        			.addGap(77)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel2)
        				.addComponent(usernameTF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel3)
        				.addComponent(passwordPF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jButton1, Alignment.TRAILING)
        				.addComponent(jButton2, Alignment.TRAILING))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jButton3)
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
        NewUser nu=new NewUser();
        nu.setLocationRelativeTo(null);
        nu.setVisible(true);
    }
public void infoMessage(String message, String tittle) {
        JOptionPane.showMessageDialog(null, message, tittle, JOptionPane.INFORMATION_MESSAGE);
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String username = usernameTF.getText();
        String password = passwordPF.getText();
       
        try
        {
        	String conStr = "jdbc:ucanaccess://E:\\Studies\\java\\Reservation\\src\\BusReservation.accdb;memory=true";
       		Connection conn=DriverManager.getConnection(conStr);
            Statement stat = conn.createStatement();       
            String selectQuery = "select * from user_details where username='"+username+"' and password='"+password+"'";
           
            ResultSet rs=stat.executeQuery(selectQuery);
            if(rs.next()){

             infoMessage("Welcome.....", "Alert");
             dispose();
             UserControlPanel ucp=new UserControlPanel(username);
             ucp.setLocationRelativeTo(null);
             ucp.setVisible(true);
    
           }
           else
           {
                 infoMessage("Create New Account", "Welcome Bro !!");
                 dispose();
                 NewUser nu=new NewUser();
                 nu.setLocationRelativeTo(null);
                 nu.setVisible(true);
                 
           }
               
            
        }
        catch(Exception e)
        {
            
        }
    }

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserLogin().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField passwordPF;
    private javax.swing.JTextField usernameTF;
    private JLabel lblVasaviBusBooking;
   
}
