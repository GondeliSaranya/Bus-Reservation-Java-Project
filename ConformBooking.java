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
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ConformBooking extends javax.swing.JFrame {

	int busno,s1,s2,s3,s4,s5,s6,a1,a2,a3,a4,a5,a6,cnt,count=0;
	String source,dest,depttime,deptdate,p1,p2,p3,p4,p5,p6,g1,g2,g3,g4,g5,g6,bookingid;
	ResultSet rs;
	ResultSet rs1;
	
   
	 public ConformBooking() {
	 
		 initComponents();
	 }
	
    public ConformBooking(int busno,String bookingid,int cnt) {
    	
    	
    		this.busno=busno;
    		this.cnt=cnt;
    		this.bookingid=bookingid;
    		
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

    	setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        
        JLabel label = new JLabel("");
        label.setIcon(new ImageIcon("E:\\Studies\\java\\Reservation\\images1.jpg"));
        
        JLabel lblBookingId = new JLabel("Booking Id");
        
        JLabel lblId = new JLabel("id");
        
        JLabel lblB = new JLabel("Bus No");
        
        JLabel lblBusno = new JLabel("busno");
        
        JLabel lblSource = new JLabel("Source");
        
        JLabel lblSc = new JLabel("sc");
        
        JLabel lblDestination = new JLabel("Destination");
        
        JLabel lblDest = new JLabel("dest");
        
        JLabel lblDepartTime = new JLabel("Depart Time");
        
        JLabel lblDt = new JLabel("dt");
        
        JLabel lblJourneyDate = new JLabel("Journey Date");
        
        JLabel lblJd = new JLabel("jd");
        
        JLabel lblPassenger = new JLabel("Passengers");
        
        JLabel lblP = new JLabel("p1");
        
        JLabel lblP_1 = new JLabel("p2");
        
        JLabel lblP_2 = new JLabel("p3");
        
        JLabel lblP_3 = new JLabel("p4");
        
        JLabel lblP_4 = new JLabel("p5");
        
        JLabel lblP_5 = new JLabel("p6");
        
        JLabel lblAge = new JLabel("age1");
        
        JLabel lblAge_1 = new JLabel("age2");
        
        JLabel lblAge_2 = new JLabel("age3");
        
        JLabel lblAge_3 = new JLabel("age4");
        
        JLabel lblAge_4 = new JLabel("age5");
        
        JLabel lblAge_5 = new JLabel("age6");
        
        JLabel lblG = new JLabel("g1");
        
        JLabel lblG_1 = new JLabel("g2");
        
        JLabel lblG_2 = new JLabel("g3");
        
        JLabel lblG_3 = new JLabel("g4");
        
        JLabel lblG_4 = new JLabel("g5");
        
        JLabel lblG_5 = new JLabel("g6");
        
        JLabel lblBookingConformed = new JLabel("Booking Conformed");
        lblBookingConformed.setFont(new Font("Tahoma", Font.BOLD, 15));
        
        JLabel lblS_15 = new JLabel("Seat No");
        
        JLabel lblS_10 = new JLabel("Gender");
        
        JLabel lblAge_10 = new JLabel("age");
        
        JLabel lblS_2 = new JLabel("s1");
        
        JLabel lblS_3 = new JLabel("s2");
        
        JLabel lblS_4 = new JLabel("s3");
        
        JLabel lblS_5 = new JLabel("s4");
        
        JLabel lblS_6 = new JLabel("s5");
        
        JLabel lblS_7 = new JLabel("s6");
        lblS_7.setFont(new Font("Tahoma", Font.PLAIN, 11));
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("E:\\Studies\\java\\Reservation\\Capture.PNG"));
        
        try{
        	String conStr = "jdbc:ucanaccess://E:\\Studies\\java\\Reservation\\src\\BusReservation.accdb;memory=true";
       		Connection conn=DriverManager.getConnection(conStr);
            Statement stat = conn.createStatement();
            String selectQuery = "select * from bus_details where bus_no ='"+busno+"'";
            System.out.println(selectQuery);
            rs=stat.executeQuery(selectQuery);
            String selectQuery1 = "select * from seat_details where Booking_id ='"+bookingid+"'";
            System.out.println(selectQuery1);
            rs1=stat.executeQuery(selectQuery1);
            System.out.println(cnt);
            while(rs.next())
            {
            source=rs.getString("bus_source");
            dest=rs.getString("bus_dest");
            depttime=rs.getString("depart_time");
            deptdate=rs.getString("depart_date");
            }
            
            switch(cnt)
            {
            case 2:
            	while(rs1.next())
            	{
            	lblP.setText(rs1.getString("name"));
            	lblAge.setText(rs1.getString("age"));
            	lblG.setText(rs1.getString("gender"));
            	lblS_2.setText(rs1.getString("seat_no"));
            	}
        		
        		lblP_1.setVisible(false);
        		lblAge_1.setVisible(false);
        		lblG_1.setVisible(false);
        		
        		lblS_3.setVisible(false);
        		
        		lblP_2.setVisible(false);
        		lblAge_2.setVisible(false);
        		lblG_2.setVisible(false);
        		
        		lblS_4.setVisible(false);
        		
        		lblP_3.setVisible(false);
        		lblAge_3.setVisible(false);
        		lblG_3.setVisible(false);
        		
        		lblS_5.setVisible(false);
        		
        		lblP_4.setVisible(false);
        		lblAge_4.setVisible(false);
        		lblG_4.setVisible(false);
        		
        		lblS_6.setVisible(false);
        		
        		lblP_5.setVisible(false);
        		lblAge_5.setVisible(false);
        		lblG_5.setVisible(false);
        		
        		lblS_7.setVisible(false);
        		break;
        	case 3:
        		while(rs1.next())
        		{
        			count++;
        			if(count==1)
        			{
        				lblP.setText(rs1.getString("name"));
                    	lblAge.setText(rs1.getString("age"));
                    	lblG.setText(rs1.getString("gender"));
                    	lblS_2.setText(rs1.getString("seat_no"));
        			}
        			else if(count==2)
        			{
        				lblP_1.setText(rs1.getString("name"));
                    	lblAge_1.setText(rs1.getString("age"));
                    	lblG_1.setText(rs1.getString("gender"));
                    	lblS_3.setText(rs1.getString("seat_no"));
        			}
        			
        			
        		}
        		
        		lblP_2.setVisible(false);
        		lblAge_2.setVisible(false);
        		lblG_2.setVisible(false);
        		
        		lblS_4.setVisible(false);
        		
        		lblP_3.setVisible(false);
        		lblAge_3.setVisible(false);
        		lblG_3.setVisible(false);
        		
        		lblS_5.setVisible(false);
        		
        		lblP_4.setVisible(false);
        		lblAge_4.setVisible(false);
        		lblG_4.setVisible(false);
        		
        		lblS_6.setVisible(false);
        		
        		lblP_5.setVisible(false);
        		lblAge_5.setVisible(false);
        		lblG_5.setVisible(false);
        		
        		lblS_7.setVisible(false);
        		break;
        	case 4:
        		while(rs1.next())
        		{
        			count++;
        			if(count==1)
        			{
        				lblP.setText(rs1.getString("name"));
                    	lblAge.setText(rs1.getString("age"));
                    	lblG.setText(rs1.getString("gender"));
                    	lblS_2.setText(rs1.getString("seat_no"));
        			}
        			else if(count==2)
        			{
        				lblP_1.setText(rs1.getString("name"));
                    	lblAge_1.setText(rs1.getString("age"));
                    	lblG_1.setText(rs1.getString("gender"));
                    	lblS_3.setText(rs1.getString("seat_no"));
        			}
        			else if(count==3)
        			{
        				lblP_2.setText(rs1.getString("name"));
                    	lblAge_2.setText(rs1.getString("age"));
                    	lblG_2.setText(rs1.getString("gender"));
                    	lblS_4.setText(rs1.getString("seat_no"));
        			}
        			
        			
        		}
        		
        		lblP_3.setVisible(false);
        		lblAge_3.setVisible(false);
        		lblG_3.setVisible(false);
        		
        		lblS_5.setVisible(false);
        		
        		lblP_4.setVisible(false);
        		lblAge_4.setVisible(false);
        		lblG_4.setVisible(false);
        		
        		lblS_6.setVisible(false);
        		
        		lblP_5.setVisible(false);
        		lblAge_5.setVisible(false);
        		lblG_5.setVisible(false);
        		
        		lblS_7.setVisible(false);
        		break;
        	case 5:
        		while(rs1.next())
        		{
        			count++;
        			
        			
        			if(count==1)
        			{
        				lblP.setText(rs1.getString("name"));
                    	lblAge.setText(rs1.getString("age"));
                    	lblG.setText(rs1.getString("gender"));
                    	lblS_2.setText(rs1.getString("seat_no"));
        			}
        			else if(count==2)
        			{
        				lblP_1.setText(rs1.getString("name"));
                    	lblAge_1.setText(rs1.getString("age"));
                    	lblG_1.setText(rs1.getString("gender"));
                    	lblS_3.setText(rs1.getString("seat_no"));
        			}
        			else if(count==3)
        			{
        				lblP_2.setText(rs1.getString("name"));
                    	lblAge_2.setText(rs1.getString("age"));
                    	lblG_2.setText(rs1.getString("gender"));
                    	lblS_4.setText(rs1.getString("seat_no"));
        			}
        			else if(count==4)
        			{
        				lblP_3.setText(rs1.getString("name"));
                    	lblAge_3.setText(rs1.getString("age"));
                    	lblG_3.setText(rs1.getString("gender"));
                    	lblS_5.setText(rs1.getString("seat_no"));
        			}
        			
        			
        		}
        		
        		lblP_4.setVisible(false);
        		lblAge_4.setVisible(false);
        		lblG_4.setVisible(false);
        		
        		lblS_6.setVisible(false);
        		
        		lblP_5.setVisible(false);
        		lblAge_5.setVisible(false);
        		lblG_5.setVisible(false);
        		
        		lblS_7.setVisible(false);
        		break;
        	case 6:
        		while(rs1.next())
        		{
        			count++;
        			if(count==1)
        			{
        				lblP.setText(rs1.getString("name"));
                    	lblAge.setText(rs1.getString("age"));
                    	lblG.setText(rs1.getString("gender"));
                    	lblS_2.setText(rs1.getString("seat_no"));
        			}
        			else if(count==2)
        			{
        				lblP_1.setText(rs1.getString("name"));
                    	lblAge_1.setText(rs1.getString("age"));
                    	lblG_1.setText(rs1.getString("gender"));
                    	lblS_3.setText(rs1.getString("seat_no"));
        			}
        			else if(count==3)
        			{
        				lblP_2.setText(rs1.getString("name"));
                    	lblAge_2.setText(rs1.getString("age"));
                    	lblG_2.setText(rs1.getString("gender"));
                    	lblS_4.setText(rs1.getString("seat_no"));
        			}
        			else if(count==4)
        			{
        				lblP_3.setText(rs1.getString("name"));
                    	lblAge_3.setText(rs1.getString("age"));
                    	lblG_3.setText(rs1.getString("gender"));
                    	lblS_5.setText(rs1.getString("seat_no"));
        			}
        			else if(count==5)
        			{
        				lblP_4.setText(rs1.getString("name"));
                    	lblAge_4.setText(rs1.getString("age"));
                    	lblG_4.setText(rs1.getString("gender"));
                    	lblS_6.setText(rs1.getString("seat_no"));
        			}
        			
        			
        		}
        		lblP_5.setVisible(false);
        		lblAge_5.setVisible(false);
        		lblG_5.setVisible(false);
        		
        		lblS_7.setVisible(false);
        		break;
        		
        	case 7:
        		while(rs1.next())
        		{
        			count++;
        			if(count==1)
        			{
        				lblP.setText(rs1.getString("name"));
                    	lblAge.setText(rs1.getString("age"));
                    	lblG.setText(rs1.getString("gender"));
                    	lblS_2.setText(rs1.getString("seat_no"));
        			}
        			else if(count==2)
        			{
        				lblP_1.setText(rs1.getString("name"));
                    	lblAge_1.setText(rs1.getString("age"));
                    	lblG_1.setText(rs1.getString("gender"));
                    	lblS_3.setText(rs1.getString("seat_no"));
        			}
        			else if(count==3)
        			{
        				lblP_2.setText(rs1.getString("name"));
                    	lblAge_2.setText(rs1.getString("age"));
                    	lblG_2.setText(rs1.getString("gender"));
                    	lblS_4.setText(rs1.getString("seat_no"));
        			}
        			else if(count==4)
        			{
        				lblP_3.setText(rs1.getString("name"));
                    	lblAge_3.setText(rs1.getString("age"));
                    	lblG_3.setText(rs1.getString("gender"));
                    	lblS_5.setText(rs1.getString("seat_no"));
        			}
        			else if(count==5)
        			{
        				lblP_4.setText(rs1.getString("name"));
                    	lblAge_4.setText(rs1.getString("age"));
                    	lblG_4.setText(rs1.getString("gender"));
                    	lblS_6.setText(rs1.getString("seat_no"));
        			}
        			else if(count==6)
        			{
        				lblP_5.setText(rs1.getString("name"));
                    	lblAge_5.setText(rs1.getString("age"));
                    	lblG_5.setText(rs1.getString("gender"));
                    	lblS_7.setText(rs1.getString("seat_no"));
        			}
        			
        			
        		}
        		
        		break;
        	
            	
            }
            
            
            
    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
        
        String id= bookingid;
        lblId.setText((id));
        String bus=String.valueOf(busno);
        lblBusno.setText(bus);
        lblSc.setText(source);
        lblDest.setText(dest);
        lblDt.setText(depttime);
        lblJd.setText(deptdate);
        
        JButton btnNewButton = new JButton("Close");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		dispose();
        	}
        });
        btnNewButton.setBackground(Color.WHITE);
        btnNewButton.setForeground(Color.BLUE);
        
        

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(lblBookingId)
        								.addComponent(lblB)
        								.addComponent(lblSource)
        								.addComponent(lblDestination)
        								.addComponent(lblDepartTime))
        							.addGap(23)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(lblDt)
        								.addComponent(lblDest)
        								.addComponent(lblSc)
        								.addComponent(lblBusno)
        								.addComponent(lblId)))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(lblJourneyDate)
        							.addGap(18)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(lblP_1)
        								.addComponent(lblP_2)
        								.addComponent(lblJd)
        								.addComponent(lblP_3)
        								.addComponent(lblP)
        								.addComponent(lblP_4)
        								.addComponent(lblP_5))))
        					.addGap(8))
        				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addComponent(lblPassenger)
        					.addGap(26)))
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(lblAge_3)
        					.addGap(18)
        					.addComponent(lblG_3))
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addGroup(layout.createSequentialGroup()
        									.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        										.addComponent(lblAge_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        										.addComponent(lblAge, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        									.addGap(18))
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(lblAge_10, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        									.addPreferredGap(ComponentPlacement.RELATED)))
        							.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        								.addGroup(layout.createSequentialGroup()
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addGroup(layout.createParallelGroup(Alignment.LEADING)
        										.addComponent(lblG_2)
        										.addComponent(lblG)
        										.addComponent(lblS_10))
        									.addGap(26)
        									.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        										.addGroup(layout.createParallelGroup(Alignment.LEADING)
        											.addComponent(lblS_3)
        											.addComponent(lblS_4)
        											.addComponent(lblS_2))
        										.addComponent(lblS_15)
        										.addGroup(layout.createParallelGroup(Alignment.LEADING)
        											.addComponent(lblS_6)
        											.addComponent(lblS_5)
        											.addComponent(lblS_7)))
        									.addPreferredGap(ComponentPlacement.RELATED, 46, Short.MAX_VALUE))
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(lblBookingConformed)
        									.addGap(18))))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(lblAge_1)
        							.addGap(18)
        							.addComponent(lblG_1))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(lblAge_4)
        							.addGap(18)
        							.addComponent(lblG_4))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(lblAge_5)
        							.addGap(18)
        							.addComponent(lblG_5)))
        					.addPreferredGap(ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 450, GroupLayout.PREFERRED_SIZE)
        							.addGap(15))
        						.addGroup(layout.createParallelGroup(Alignment.LEADING)
        							.addComponent(btnNewButton)
        							.addComponent(label, GroupLayout.PREFERRED_SIZE, 278, GroupLayout.PREFERRED_SIZE)))))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addGap(15)
        							.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        								.addComponent(lblBookingId)
        								.addComponent(lblId))
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        								.addComponent(lblB)
        								.addComponent(lblBusno))
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        								.addComponent(lblSource)
        								.addComponent(lblSc))
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        								.addComponent(lblDestination)
        								.addComponent(lblDest))
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        								.addComponent(lblDt)
        								.addComponent(lblDepartTime))
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(lblJd)
        								.addComponent(lblJourneyDate)))
        						.addComponent(lblBookingConformed))
        					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblS_15)
        						.addComponent(lblS_10)
        						.addComponent(lblAge_10)
        						.addComponent(lblPassenger))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblS_2)
        						.addComponent(lblAge)
        						.addComponent(lblP)
        						.addComponent(lblG))
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblP_1)
        						.addComponent(lblAge_1)
        						.addComponent(lblG_1)
        						.addComponent(lblS_3))
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblS_4)
        						.addComponent(lblP_2)
        						.addComponent(lblAge_2)
        						.addComponent(lblG_2))
        					.addGap(12))
        				.addComponent(label, GroupLayout.PREFERRED_SIZE, 295, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblP_3)
        						.addComponent(lblAge_3)
        						.addComponent(lblG_3)
        						.addComponent(lblS_5))
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblP_4)
        						.addComponent(lblAge_4)
        						.addComponent(lblG_4)
        						.addComponent(lblS_6))
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblP_5)
        						.addComponent(lblAge_5)
        						.addComponent(lblG_5)
        						.addComponent(lblS_7))
        					.addGap(47))
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(btnNewButton)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
        					.addContainerGap())))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void infoMessage(String message, String tittle) {
        JOptionPane.showMessageDialog(null, message, tittle, JOptionPane.INFORMATION_MESSAGE);
    }

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
            java.util.logging.Logger.getLogger(ConformBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConformBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConformBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConformBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConformBooking().setVisible(true);
            }
        });
    }
}
