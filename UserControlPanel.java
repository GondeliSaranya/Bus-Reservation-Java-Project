/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus.management;
import javax.swing.JMenuItem;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class UserControlPanel extends javax.swing.JFrame {

    String luser;
    public UserControlPanel() {
    	initComponents();
        
    }
    public UserControlPanel(String loginUser)
    {
        initComponents();
        this.luser=loginUser;
        String getValue=jLabel1.getText();
        jLabel1.setText(getValue+ " :"+loginUser);
        
        
    }
 
    @SuppressWarnings("unchecked")
 
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Welcome");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1Layout.setHorizontalGroup(
        	jDesktopPane1Layout.createParallelGroup(Alignment.LEADING)
        		.addGap(0, 973, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
        	jDesktopPane1Layout.createParallelGroup(Alignment.LEADING)
        		.addGap(0, 463, Short.MAX_VALUE)
        );
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        
        btnNewBooking = new JButton("New Booking");
        btnNewBooking.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent evt) {
        		
        		 jMenuItem1ActionPerformed(evt);
        	}
        });
        
        
        
        btnMyBookings = new JButton("My Bookings");
        btnMyBookings.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent evt) {
        		
        		jMenuItem2ActionPerformed(evt);
        	}
        });
        
        btnNewButton = new JButton("Cancel Booking");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent evt) {
        		
        		jMenu2ActionPerformed(evt);
        	}
        	
        	
        });
        
        btnLogout = new JButton("Logout");
        btnLogout.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent evt) {
        		
        		 jMenuItem3ActionPerformed(evt);
        	}
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(46)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(btnLogout, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
        						.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        							.addComponent(btnMyBookings, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(btnNewBooking, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
        						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
        					.addGap(44))
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)))
        			.addGap(16)
        			.addComponent(jDesktopPane1, GroupLayout.PREFERRED_SIZE, 1106, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jLabel1)
        					.addGap(50)
        					.addComponent(btnNewBooking, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        					.addGap(59)
        					.addComponent(btnMyBookings, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
        					.addGap(67)
        					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        					.addGap(70)
        					.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(37)
        					.addComponent(jDesktopPane1, GroupLayout.PREFERRED_SIZE, 487, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(19, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
       AddBooking ab=new AddBooking(luser);
        jDesktopPane1.add(ab);
        ab.show();
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
      DeleteBooking db=new DeleteBooking();
      jDesktopPane1.add(db);
      db.show();
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
          dispose();
        UserLogin ul=new UserLogin();
        ul.setLocationRelativeTo(null);
        ul.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        MyBooking mb=new MyBooking(luser);
        jDesktopPane1.add(mb);
        mb.show();
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserControlPanel().setVisible(true);
            }
        });
    }

  
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private JButton btnNewBooking;
    private JButton btnMyBookings;
    private JButton btnNewButton;
    private JButton btnLogout;
}
