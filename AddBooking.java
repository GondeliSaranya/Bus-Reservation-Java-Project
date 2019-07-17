/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus.management;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;

//import javax.persistence.*;
import org.jdesktop.swingx.*;


//import com.healthmarketscience.jackcess.query.Query;
import com.toedter.calendar.*;

import javax.swing.*;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.Font;


public class AddBooking<busmPUEntityManager> extends javax.swing.JInternalFrame {

	private javax.swing.JComboBox<String> sourceCB;
 
    String luser;
    public AddBooking(String loginuser) {
        initComponents();
        busSourceCBFillData();
        busDestinationCBFillData();
        this.luser=loginuser;
        fetchBookingDetails();
       this.setTitle("Add Booking");
        
    }

    public void busSourceCBFillData()
    {
        try{
        	String conStr = "jdbc:ucanaccess://E:\\Studies\\java\\Reservation\\src\\BusReservation.accdb;memory=true";
       		Connection conn=DriverManager.getConnection(conStr);
            Statement stat = conn.createStatement();  
            String selectQuery="select distinct(bus_source) as bus_source from bus_details";
            ResultSet rs=stat.executeQuery(selectQuery);
            while(rs.next())
            {
                sourceCB.addItem(rs.getString("bus_source")); 
            }    
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public void busDestinationCBFillData()
    {
        try{
        	String conStr = "jdbc:ucanaccess://E:\\Studies\\java\\Reservation\\src\\BusReservation.accdb;memory=true";
       		Connection conn=DriverManager.getConnection(conStr);
            Statement stat = conn.createStatement();  
            String selectQuery="select distinct(bus_dest) as bus_dest  from bus_details";
            ResultSet rs=stat.executeQuery(selectQuery);
            while(rs.next())
            {
                destinationCB.addItem(rs.getString("bus_dest"));     
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
   
    @SuppressWarnings("unchecked")
   
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setFont(new Font("Tahoma", Font.BOLD, 13));
        sourceCB = new javax.swing.JComboBox<>();
        sourceCB.setSelectedItem(null);
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setFont(new Font("Tahoma", Font.BOLD, 13));
        destinationCB = new javax.swing.JComboBox();
        destinationCB.setSelectedItem(null);
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setFont(new Font("Tahoma", Font.BOLD, 13));
        jButton1 = new javax.swing.JButton();
        jButton1.setBackground(new Color(255, 255, 255));
        jButton1.setForeground(new Color(0, 0, 0));
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
          fromDP = new JDateChooser();
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setText("Source");

        jLabel2.setText("Destination");

        jLabel3.setText("Date");

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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
       			.addGap(443)
       			.addComponent(jButton1)
       			.addContainerGap(590, Short.MAX_VALUE))
       		.addGroup(layout.createSequentialGroup()
       			.addGap(85)
       			.addComponent(jLabel1)
       			.addGap(18)
       			.addComponent(sourceCB, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
       			.addGap(117)
       			.addComponent(jLabel2)
       			.addGap(18)
       			.addComponent(destinationCB, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
       			.addPreferredGap(ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
       			.addComponent(jLabel3)
       			.addGap(18)
       			.addComponent(fromDP, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
       			.addGap(67))
       		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
       			.addContainerGap(213, Short.MAX_VALUE)
       			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 619, GroupLayout.PREFERRED_SIZE)
       			.addGap(266))
       );
       layout.setVerticalGroup(
       	layout.createParallelGroup(Alignment.LEADING)
       		.addGroup(layout.createSequentialGroup()
       			.addGap(51)
       			.addGroup(layout.createParallelGroup(Alignment.LEADING)
       				.addComponent(fromDP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
       				.addGroup(layout.createSequentialGroup()
       					.addGroup(layout.createParallelGroup(Alignment.LEADING)
       						.addComponent(jLabel3)
       						.addGroup(layout.createParallelGroup(Alignment.BASELINE)
       							.addComponent(jLabel1)
       							.addComponent(sourceCB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
       							.addComponent(jLabel2)
       							.addComponent(destinationCB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
       					.addGap(43)
       					.addComponent(jButton1)))
       			.addGap(48)
       			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 275, GroupLayout.PREFERRED_SIZE)
       			.addContainerGap(59, Short.MAX_VALUE))
       );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public void infoMessage(String message, String tittle) {
        JOptionPane.showMessageDialog(null, message, tittle, JOptionPane.INFORMATION_MESSAGE);
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String source=(String)sourceCB.getSelectedItem();
        String destination=(String)destinationCB.getSelectedItem();
        java.util.Date fromDate=fromDP.getDate();
       // java.util.Date toDate=toDP.getDate();
        
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        String fromDateFormated=sdf.format(fromDate);
      //  String toDateFormated=sdf.format(toDate);
        
      
        
        try{
        	String conStr = "jdbc:ucanaccess://E:\\Studies\\java\\Reservation\\src\\BusReservation.accdb;memory=true";
       		Connection conn=DriverManager.getConnection(conStr);
            Statement stat = conn.createStatement();  
            String selectQuery = "select * from bus_details where bus_source='"+source+"' and bus_dest='"+destination+"' and depart_date ='"+fromDateFormated+"'";
            ResultSet rs=stat.executeQuery(selectQuery);
         
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
           
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

   public void fetchBookingDetails()
   {
       
        String selectQuery2 ;
       try{
    	   String conStr = "jdbc:ucanaccess://E:\\Studies\\java\\Reservation\\src\\BusReservation.accdb;memory=true";
      		Connection conn=DriverManager.getConnection(conStr);
           Statement stat = conn.createStatement();  
            if(luser.equals("admin"))
            {
            selectQuery2 = "select * from bus_booking";
            }
            else
            {
             selectQuery2 = "select * from bus_booking where booking_user='"+luser+"'";    
            }
            ResultSet rs2=stat.executeQuery(selectQuery2);
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
   }
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int index =jTable1.getSelectedRow();
        TableModel model=jTable1.getModel();
        String bus_no=(String) model.getValueAt(index, 1);
       // String movement=(String) model.getValueAt(index, 2);
        String bus_source=(String) model.getValueAt(index, 2);
        String bus_dest=(String) model.getValueAt(index, 3);
        String depart_date=model.getValueAt(index, 4).toString();  
        String depart_time=(String) model.getValueAt(index, 5);
        String price=(String) model.getValueAt(index, 6);
        String avail_seat=(String) model.getValueAt(index, 7);
            String booking_user=luser;
           int bus=Integer.parseInt(bus_no);
    	   SeatSelections sc=new SeatSelections(bus,Integer.parseInt(price),luser,Integer.parseInt(avail_seat));
           sc.setLocationRelativeTo(null);
           sc.setVisible(true);          
    }//GEN-LAST:event_jTable1MouseClicked
    GridLayout gl; 
    public JFrame BookingFormFrame;
    public JFrame seatselect;
    public JPanel BookingFormPanel;
    public JPanel panel;
    public JLabel l1,l2,l3,l4,l5,l6,l7,l8,l11,l12,l13,l14,l15,l16,l17,l18,seatnoL,idnoL,fnameL,lnameL;
    public JComboBox seatCB;
    public JTextField t1,t2,t3,t4;
    public JButton btnNewButton;
    private java.util.List<bus.management.BusBooking> busBookingList;
    private javax.swing.JComboBox destinationCB;
    private JDateChooser fromDP;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
}
