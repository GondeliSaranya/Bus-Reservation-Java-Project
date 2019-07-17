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
import javax.swing.JTable;
import javax.swing.table.TableModel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;


public class MyBooking extends javax.swing.JInternalFrame {

    
    String luser;
    public MyBooking(String loginuser) {
    	setTitle("MY BOOKINGS");
        
        initComponents();
            this.luser=loginuser;
        fetchBookingDetails();
    
        
    }

    
    public void fetchBookingDetails()
   {
       
        String selectQuery2 ;
       try{
    	   String conStr = "jdbc:ucanaccess://E:\\Studies\\java\\Reservation\\src\\BusReservation.accdb;memory=true";
      		Connection conn=DriverManager.getConnection(conStr);
           Statement stat = conn.createStatement();  
          
             selectQuery2 = "select * from bus_booking where booking_user='"+luser+"'";    
          
            ResultSet rs2=stat.executeQuery(selectQuery2);
            jTable1.setModel(DbUtils.resultSetToTableModel(rs2));
        //    jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
   }
    
    @SuppressWarnings("unchecked")
   
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        
        jTable1.setToolTipText("click here for more details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 1086, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        			.addGap(35)
        			.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
   private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int index =jTable1.getSelectedRow();
        TableModel model=jTable1.getModel();
        int bus_no=(Integer) model.getValueAt(index, 4);
       
        String bookingid=(String) model.getValueAt(index, 0).toString();
        int cnt=(Integer) model.getValueAt(index, 2);
        
        ConformBooking sc=new ConformBooking(bus_no,bookingid,(cnt+1));
        sc.setLocationRelativeTo(null);
        sc.setVisible(true);
        
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
}
