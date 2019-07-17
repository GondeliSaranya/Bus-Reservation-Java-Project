package bus.management;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import javax.swing.JLabel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;


public class DeleteBooking extends javax.swing.JInternalFrame {

   
    public DeleteBooking() {
        initComponents();
        fetchBusDetails();
        this.setTitle("Cancel booking");
    }
    
    public void fetchBusDetails()
   {
       try{
    	   String conStr = "jdbc:ucanaccess://E:\\Studies\\java\\Reservation\\src\\BusReservation.accdb;memory=true";
      		Connection conn=DriverManager.getConnection(conStr);
           Statement stat = conn.createStatement();  
            String selectQuery2 = "select * from Bus_booking";
            ResultSet rs2=stat.executeQuery(selectQuery2);
            jTable1.setModel(DbUtils.resultSetToTableModel(rs2));
          
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
        setResizable(true);

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 1089, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(44)
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 415, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(35, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public void infoMessage(String message, String tittle) {
        JOptionPane.showMessageDialog(null, message, tittle, JOptionPane.INFORMATION_MESSAGE);
    }
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int index =jTable1.getSelectedRow();
        TableModel model=jTable1.getModel();
        String busid=(String)model.getValueAt(index,0).toString();
        System.out.println(busid);
        int result = JOptionPane.showConfirmDialog(null,"Are you sure,You want to cancel ? ","Delete Booking Form",JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
        if(result==JOptionPane.OK_OPTION)
        {
            try{
            	String conStr = "jdbc:ucanaccess://E:\\Studies\\java\\Reservation\\src\\BusReservation.accdb;memory=true";
           		Connection conn=DriverManager.getConnection(conStr);
                Statement stat = conn.createStatement();  
            String deleteQuery = "delete from Bus_booking where Booking_id="+busid;
            int i=stat.executeUpdate(deleteQuery);
            String deleteQuery1 = "delete from seat_details where Booking_id="+busid;
            int j=stat.executeUpdate(deleteQuery1);
            if(i==1 && j==1)
            {
                 fetchBusDetails();
                 infoMessage("Yes it is Canceled","Alert !!!");
                
            }
            else
            {
                  infoMessage("Not Canceled","Alert !!!");
            }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        else
        {
            System.out.println("No Action");
        }
        
        
        
        
    }//GEN-LAST:event_jTable1MouseClicked


   
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
