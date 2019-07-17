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
import java.util.LinkedList;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class SeatSelections extends javax.swing.JFrame {
	
	int busno;
	String luser;
	String bookingid;
	int totalfare;
	int avail_seat;
	JLabel lblSeat,lbfare;
	int cnt=1;
	LinkedList<Integer> al=new LinkedList<>();
	int a[] = new int[60];
	

    public SeatSelections() {
        initComponents();
    }
    
    public SeatSelections(int busno,int totalfare,String luser,int avail_seat)
    {
    	//initComponents();
    	this.busno=busno;
    	this.avail_seat=avail_seat;
    	this.totalfare=totalfare;
    	this.luser=luser;
    	initComponents();
    }
    
    @SuppressWarnings("unchecked")
  
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        
        JButton s44 = new JButton("");
        s44.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(cnt>6)
        		{
        			infoMessage("The maximum number of seats that can be selected is 6","alert");
        		}
        		else if(s44.getBackground()==Color.BLACK)
        		{
        			s44.setBackground(Color.WHITE);
        			int fare=Integer.parseInt(lbfare.getText());
            		fare=fare-totalfare;
            		String fares=String.valueOf(fare);
            		lbfare.setText(fares);
            		al.remove(a[44]);
            		cnt--;
        		}
        		else if(s44.getBackground()==Color.WHITE)
        		{
        			
        		s44.setBackground(Color.BLACK);
        		String msg=lblSeat.getText();
        		int fare=Integer.parseInt(lbfare.getText());
        		fare=fare+totalfare;
        		String fares=String.valueOf(fare);
        		lbfare.setText(fares);
        		al.add(44);
        		a[44]=(cnt-1);
        		cnt++;
        	}
        	}
        });
        s44.setForeground(Color.BLACK);
        s44.setBackground(Color.WHITE);
        JButton s43 = new JButton("");
        s43.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(cnt>6)
        		{
        			infoMessage("The maximum number of seats that can be selected is 6","alert");
        		}
        		else if(s43.getBackground()==Color.BLACK)
        		{
        			s43.setBackground(Color.WHITE);
        			int fare=Integer.parseInt(lbfare.getText());
            		fare=fare-totalfare;
            		String fares=String.valueOf(fare);
            		lbfare.setText(fares);
            		al.remove(a[43]);
            		cnt--;
        		}
        		else if(s43.getBackground()==Color.WHITE)
        		{
        			
        		s43.setBackground(Color.BLACK);
        		String msg=lblSeat.getText();
        		int fare=Integer.parseInt(lbfare.getText());
        		fare=fare+totalfare;
        		String fares=String.valueOf(fare);
        		lbfare.setText(fares);
        		al.add(43);
        		a[43]=(cnt-1);
        		cnt++;
        	}
        	}
        });
        s43.setForeground(Color.BLACK);
        s43.setBackground(Color.WHITE);
        JButton s42 = new JButton("");
        s42.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(cnt>6)
        		{
        			infoMessage("The maximum number of seats that can be selected is 6","alert");
        		}
        		else if(s42.getBackground()==Color.BLACK)
        		{
        			s42.setBackground(Color.WHITE);
        			int fare=Integer.parseInt(lbfare.getText());
            		fare=fare-totalfare;
            		String fares=String.valueOf(fare);
            		lbfare.setText(fares);
            		al.remove(a[42]);
            		cnt--;
        		}
        		else if(s42.getBackground()==Color.WHITE)
        		{
        			
        		s42.setBackground(Color.BLACK);
        		String msg=lblSeat.getText();
        		int fare=Integer.parseInt(lbfare.getText());
        		fare=fare+totalfare;
        		String fares=String.valueOf(fare);
        		lbfare.setText(fares);
        		al.add(42);
        		a[42]=(cnt-1);
        		cnt++;
        	}
        	}
        });
        s42.setForeground(Color.BLACK);
        s42.setBackground(Color.WHITE);
        JButton s4 = new JButton("");
        s4.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(cnt>6)
        		{
        			infoMessage("The maximum number of seats that can be selected is 6","alert");
        		}
        		else if(s4.getBackground()==Color.BLACK)
        		{
        			s4.setBackground(Color.WHITE);
        			int fare=Integer.parseInt(lbfare.getText());
            		fare=fare-totalfare;
            		String fares=String.valueOf(fare);
            		lbfare.setText(fares);
            		al.remove(a[4]);
            		cnt--;
        		}
        		else if(s4.getBackground()==Color.WHITE)
        		{
        			
        		s4.setBackground(Color.BLACK);
        		String msg=lblSeat.getText();
        		int fare=Integer.parseInt(lbfare.getText());
        		fare=fare+totalfare;
        		String fares=String.valueOf(fare);
        		lbfare.setText(fares);
        		al.add(4);
        		a[4]=(cnt-1);
        		cnt++;
        	}
        	}
        });
        s4.setForeground(Color.BLACK);
        s4.setBackground(Color.WHITE);
        JButton button_4 = new JButton("");
        
        button_4.setForeground(Color.BLACK);
        button_4.setBackground(Color.WHITE);
        
        JLabel label = new JLabel("Available");
        
        JButton s40 = new JButton("");
        s40.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(cnt>6)
        		{
        			infoMessage("The maximum number of seats that can be selected is 6","alert");
        		}
        		else if(s40.getBackground()==Color.BLACK)
        		{
        			s40.setBackground(Color.WHITE);
        			int fare=Integer.parseInt(lbfare.getText());
            		fare=fare-totalfare;
            		String fares=String.valueOf(fare);
            		lbfare.setText(fares);
            		al.remove(a[40]);
            		cnt--;
        		}
        		else if(s40.getBackground()==Color.WHITE)
        		{
        			
        		s40.setBackground(Color.BLACK);
        		String msg=lblSeat.getText();
        		int fare=Integer.parseInt(lbfare.getText());
        		fare=fare+totalfare;
        		String fares=String.valueOf(fare);
        		lbfare.setText(fares);
        		al.add(40);
        		a[40]=(cnt-1);
        		cnt++;
        	}
        	}
        });
        s40.setForeground(Color.BLACK);
        s40.setBackground(Color.WHITE);
        JButton s39 = new JButton("");
        s39.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(cnt>6)
        		{
        			infoMessage("The maximum number of seats that can be selected is 6","alert");
        		}
        		else if(s39.getBackground()==Color.BLACK)
        		{
        			s39.setBackground(Color.WHITE);
        			int fare=Integer.parseInt(lbfare.getText());
            		fare=fare-totalfare;
            		String fares=String.valueOf(fare);
            		lbfare.setText(fares);
            		al.remove(a[39]);
            		cnt--;
        		}
        		else if(s39.getBackground()==Color.WHITE)
        		{
        			
        		s39.setBackground(Color.BLACK);
        		String msg=lblSeat.getText();
        		int fare=Integer.parseInt(lbfare.getText());
        		fare=fare+totalfare;
        		String fares=String.valueOf(fare);
        		lbfare.setText(fares);
        		al.add(39);
        		a[39]=(cnt-1);
        		cnt++;
        	}
        	}
        });
        s39.setForeground(Color.BLACK);
        s39.setBackground(Color.WHITE);
        JButton s38 = new JButton("");
        s38.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(cnt>6)
        		{
        			infoMessage("The maximum number of seats that can be selected is 6","alert");
        		}
        		else if(s38.getBackground()==Color.BLACK)
        		{
        			s38.setBackground(Color.WHITE);
        			int fare=Integer.parseInt(lbfare.getText());
            		fare=fare-totalfare;
            		String fares=String.valueOf(fare);
            		lbfare.setText(fares);
            		al.remove(a[38]);
            		cnt--;
        		}
        		else if(s38.getBackground()==Color.WHITE)
        		{
        			
        		s38.setBackground(Color.BLACK);
        		String msg=lblSeat.getText();
        		int fare=Integer.parseInt(lbfare.getText());
        		fare=fare+totalfare;
        		String fares=String.valueOf(fare);
        		lbfare.setText(fares);
        		al.add(38);
        		a[38]=(cnt-1);
        		cnt++;
        	}
        	}
        });
        s38.setForeground(Color.BLACK);
        s38.setBackground(Color.WHITE);
        JButton s1 = new JButton("");
        s1.setForeground(Color.BLACK);
        s1.setBackground(Color.WHITE);
        s1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		
        		if(cnt>6)
        		{
        			infoMessage("The maximum number of seats that can be selected is 6","alert");
        		}
        		else if(s1.getBackground()==Color.BLACK)
        		{
        			s1.setBackground(Color.WHITE);
        			int fare=Integer.parseInt(lbfare.getText());
            		fare=fare-totalfare;
            		String fares=String.valueOf(fare);
            		lbfare.setText(fares);
            		al.remove(a[1]);
            		cnt--;
        		}
        		else if(s1.getBackground()==Color.WHITE)
        		{
        			
        		s1.setBackground(Color.BLACK);
        		String msg=lblSeat.getText();
        		int fare=Integer.parseInt(lbfare.getText());
        		fare=fare+totalfare;
        		String fares=String.valueOf(fare);
        		lbfare.setText(fares);
        		al.add(1);
        		a[1]=(cnt-1);
        		cnt++;
        	}
        	}
        });
        s1.setToolTipText("Help text for the button");
        
        JButton button_9 = new JButton("");
        button_9.setBackground(Color.GRAY);
        
        JLabel label_1 = new JLabel("Unavailable");
        
        JButton s36 = new JButton("");
        s36.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(cnt>6)
        		{
        			infoMessage("The maximum number of seats that can be selected is 6","alert");
        		}
        		else if(s36.getBackground()==Color.BLACK)
        		{
        			s36.setBackground(Color.WHITE);
        			int fare=Integer.parseInt(lbfare.getText());
            		fare=fare-totalfare;
            		String fares=String.valueOf(fare);
            		lbfare.setText(fares);
            		al.remove(a[36]);
            		cnt--;
        		}
        		else if(s36.getBackground()==Color.WHITE)
        		{
        			
        		s36.setBackground(Color.BLACK);
        		String msg=lblSeat.getText();
        		int fare=Integer.parseInt(lbfare.getText());
        		fare=fare+totalfare;
        		String fares=String.valueOf(fare);
        		lbfare.setText(fares);
        		al.add(36);
        		a[36]=(cnt-1);
        		cnt++;
        	}
        	}
        });
        s36.setForeground(Color.BLACK);
        s36.setBackground(Color.WHITE);
        JButton s35 = new JButton("");
        s35.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(cnt>6)
        		{
        			infoMessage("The maximum number of seats that can be selected is 6","alert");
        		}
        		else if(s35.getBackground()==Color.BLACK)
        		{
        			s35.setBackground(Color.WHITE);
        			int fare=Integer.parseInt(lbfare.getText());
            		fare=fare-totalfare;
            		String fares=String.valueOf(fare);
            		lbfare.setText(fares);
            		al.remove(a[35]);
            		cnt--;
        		}
        		else if(s35.getBackground()==Color.WHITE)
        		{
        			
        		s35.setBackground(Color.BLACK);
        		String msg=lblSeat.getText();
        		int fare=Integer.parseInt(lbfare.getText());
        		fare=fare+totalfare;
        		String fares=String.valueOf(fare);
        		lbfare.setText(fares);
        		al.add(35);
        		a[35]=(cnt-1);
        		cnt++;
        	}
        	}
        });
        s35.setForeground(Color.BLACK);
        s35.setBackground(Color.WHITE);
        JButton s34 = new JButton("");
        s34.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(cnt>6)
        		{
        			infoMessage("The maximum number of seats that can be selected is 6","alert");
        		}
        		else if(s34.getBackground()==Color.BLACK)
        		{
        			s34.setBackground(Color.WHITE);
        			int fare=Integer.parseInt(lbfare.getText());
            		fare=fare-totalfare;
            		String fares=String.valueOf(fare);
            		lbfare.setText(fares);
            		al.remove(a[34]);
            		cnt--;
        		}
        		else if(s34.getBackground()==Color.WHITE)
        		{
        			
        		s34.setBackground(Color.BLACK);
        		String msg=lblSeat.getText();
        		int fare=Integer.parseInt(lbfare.getText());
        		fare=fare+totalfare;
        		String fares=String.valueOf(fare);
        		lbfare.setText(fares);
        		al.add(34);
        		a[34]=(cnt-1);
        		cnt++;
        	}
        	}
        });
        s34.setForeground(Color.BLACK);
        s34.setBackground(Color.WHITE);
        JButton s5 = new JButton("");
        s5.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(cnt>6)
        		{
        			infoMessage("The maximum number of seats that can be selected is 6","alert");
        		}
        		else if(s5.getBackground()==Color.BLACK)
        		{
        			s5.setBackground(Color.WHITE);
        			int fare=Integer.parseInt(lbfare.getText());
            		fare=fare-totalfare;
            		String fares=String.valueOf(fare);
            		lbfare.setText(fares);
            		al.remove(a[5]);
            		cnt--;
        		}
        		else if(s5.getBackground()==Color.WHITE)
        		{
        			
        		s5.setBackground(Color.BLACK);
        		String msg=lblSeat.getText();
        		int fare=Integer.parseInt(lbfare.getText());
        		fare=fare+totalfare;
        		String fares=String.valueOf(fare);
        		lbfare.setText(fares);
        		al.add(5);
        		a[5]=(cnt-1);
        		cnt++;
        	}
        	}
        });
        s5.setForeground(Color.BLACK);
        s5.setBackground(Color.WHITE);
        JButton button_14 = new JButton("");
         
        button_14.setForeground(Color.BLACK);
        button_14.setBackground(new Color(255, 99, 71));
        
        JLabel label_2 = new JLabel("Ladies");
        
        JButton s32 = new JButton("");
        s32.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(cnt>6)
        		{
        			infoMessage("The maximum number of seats that can be selected is 6","alert");
        		}
        		else if(s32.getBackground()==Color.BLACK)
        		{
        			s32.setBackground(Color.WHITE);
        			int fare=Integer.parseInt(lbfare.getText());
            		fare=fare-totalfare;
            		String fares=String.valueOf(fare);
            		lbfare.setText(fares);
            		al.remove(a[32]);
            		cnt--;
        		}
        		else if(s32.getBackground()==Color.WHITE)
        		{
        			
        		s32.setBackground(Color.BLACK);
        		String msg=lblSeat.getText();
        		int fare=Integer.parseInt(lbfare.getText());
        		fare=fare+totalfare;
        		String fares=String.valueOf(fare);
        		lbfare.setText(fares);
        		al.add(32);
        		a[32]=(cnt-1);
        		cnt++;
        	}
        	}
        });
        s32.setForeground(Color.BLACK);
        s32.setBackground(Color.WHITE);
        JButton s31 = new JButton("");
        s31.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(cnt>6)
        		{
        			infoMessage("The maximum number of seats that can be selected is 6","alert");
        		}
        		else if(s31.getBackground()==Color.BLACK)
        		{
        			s31.setBackground(Color.WHITE);
        			int fare=Integer.parseInt(lbfare.getText());
            		fare=fare-totalfare;
            		String fares=String.valueOf(fare);
            		lbfare.setText(fares);
            		al.remove(a[31]);
            		cnt--;
        		}
        		else if(s31.getBackground()==Color.WHITE)
        		{
        			
        		s31.setBackground(Color.BLACK);
        		String msg=lblSeat.getText();
        		int fare=Integer.parseInt(lbfare.getText());
        		fare=fare+totalfare;
        		String fares=String.valueOf(fare);
        		lbfare.setText(fares);
        		al.add(31);
        		a[31]=(cnt-1);
        		cnt++;
        	}
        		
        	}
        	
        });
        s31.setForeground(Color.BLACK);
        s31.setBackground(Color.WHITE);
        JButton s30 = new JButton("");
        s30.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(cnt>6)
        		{
        			infoMessage("The maximum number of seats that can be selected is 6","alert");
        		}
        		else if(s30.getBackground()==Color.BLACK)
        		{
        			s30.setBackground(Color.WHITE);
        			int fare=Integer.parseInt(lbfare.getText());
            		fare=fare-totalfare;
            		String fares=String.valueOf(fare);
            		lbfare.setText(fares);
            		al.remove(a[30]);
            		cnt--;
        		}
        		else if(s30.getBackground()==Color.WHITE)
        		{
        			
        		s30.setBackground(Color.BLACK);
        		String msg=lblSeat.getText();
        		int fare=Integer.parseInt(lbfare.getText());
        		fare=fare+totalfare;
        		String fares=String.valueOf(fare);
        		lbfare.setText(fares);
        		al.add(30);
        		a[30]=(cnt-1);
        		cnt++;
        	}
        	}
        });
        s30.setForeground(Color.BLACK);
        s30.setBackground(Color.WHITE);
        JButton s9 = new JButton("");
        s9.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(cnt>6)
        		{
        			infoMessage("The maximum number of seats that can be selected is 6","alert");
        		}
        		else if(s9.getBackground()==Color.BLACK)
        		{
        			s9.setBackground(Color.WHITE);
        			int fare=Integer.parseInt(lbfare.getText());
            		fare=fare-totalfare;
            		String fares=String.valueOf(fare);
            		lbfare.setText(fares);
            		al.remove(a[9]);
            		cnt--;
        		}
        		else if(s9.getBackground()==Color.WHITE)
        		{
        			
        		s9.setBackground(Color.BLACK);
        		String msg=lblSeat.getText();
        		int fare=Integer.parseInt(lbfare.getText());
        		fare=fare+totalfare;
        		String fares=String.valueOf(fare);
        		lbfare.setText(fares);
        		al.add(9);
        		a[9]=(cnt-1);
        		cnt++;
        	}
        	}
        });
        s9.setForeground(Color.BLACK);
        s9.setBackground(Color.WHITE);
        JButton s2 = new JButton("");
        s2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(cnt>6)
        		{
        			infoMessage("The maximum number of seats that can be selected is 6","alert");
        		}
        		else if(s2.getBackground()==Color.BLACK)
        		{
        			s2.setBackground(Color.WHITE);
        			int fare=Integer.parseInt(lbfare.getText());
            		fare=fare-totalfare;
            		String fares=String.valueOf(fare);
            		lbfare.setText(fares);
            		al.remove(a[2]);
            		cnt--;
        		}
        		else if(s2.getBackground()==Color.WHITE)
        		{
        			
        		s2.setBackground(Color.BLACK);
        		String msg=lblSeat.getText();
        		int fare=Integer.parseInt(lbfare.getText());
        		fare=fare+totalfare;
        		String fares=String.valueOf(fare);
        		lbfare.setText(fares);
        		al.add(2);
        		a[2]=(cnt-1);
        		cnt++;
        	}
        	}
        });
        s2.setForeground(Color.BLACK);
        s2.setBackground(Color.WHITE);
        JButton s3 = new JButton("");
        s3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(cnt>6)
        		{
        			infoMessage("The maximum number of seats that can be selected is 6","alert");
        		}
        		else if(s3.getBackground()==Color.BLACK)
        		{
        			s3.setBackground(Color.WHITE);
        			int fare=Integer.parseInt(lbfare.getText());
            		fare=fare-totalfare;
            		String fares=String.valueOf(fare);
            		lbfare.setText(fares);
            		al.remove(a[3]);
            		cnt--;
        		}
        		else if(s3.getBackground()==Color.WHITE)
        		{
        			
        		s3.setBackground(Color.BLACK);
        		String msg=lblSeat.getText();
        		int fare=Integer.parseInt(lbfare.getText());
        		fare=fare+totalfare;
        		String fares=String.valueOf(fare);
        		lbfare.setText(fares);
        		al.add(3);
        		a[3]=(cnt-1);
        		cnt++;
        	}
        	}
        });
        s3.setForeground(Color.BLACK);
        s3.setBackground(Color.WHITE);
        JButton s26 = new JButton("");
        s26.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(cnt>6)
        		{
        			infoMessage("The maximum number of seats that can be selected is 6","alert");
        		}
        		else if(s26.getBackground()==Color.BLACK)
        		{
        			s26.setBackground(Color.WHITE);
        			int fare=Integer.parseInt(lbfare.getText());
            		fare=fare-totalfare;
            		String fares=String.valueOf(fare);
            		lbfare.setText(fares);
            		al.remove(a[26]);
            		cnt--;
        		}
        		else if(s26.getBackground()==Color.WHITE)
        		{
        			
        		s26.setBackground(Color.BLACK);
        		String msg=lblSeat.getText();
        		int fare=Integer.parseInt(lbfare.getText());
        		fare=fare+totalfare;
        		String fares=String.valueOf(fare);
        		lbfare.setText(fares);
        		al.add(26);
        		a[26]=(cnt-1);
        		cnt++;
        	}
        	}
        });
        s26.setForeground(Color.BLACK);
        s26.setBackground(Color.WHITE);
        JButton s13 = new JButton("");
        s13.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(cnt>6)
        		{
        			infoMessage("The maximum number of seats that can be selected is 6","alert");
        		}
        		else if(s13.getBackground()==Color.BLACK)
        		{
        			s13.setBackground(Color.WHITE);
        			int fare=Integer.parseInt(lbfare.getText());
            		fare=fare-totalfare;
            		String fares=String.valueOf(fare);
            		lbfare.setText(fares);
            		al.remove(a[13]);
            		cnt--;
        		}
        		else if(s13.getBackground()==Color.WHITE)
        		{
        			
        		s13.setBackground(Color.BLACK);
        		String msg=lblSeat.getText();
        		int fare=Integer.parseInt(lbfare.getText());
        		fare=fare+totalfare;
        		String fares=String.valueOf(fare);
        		lbfare.setText(fares);
        		al.add(13);
        		a[13]=(cnt-1);
        		cnt++;
        	}
        	}
        });
        s13.setForeground(Color.BLACK);
        s13.setBackground(Color.WHITE);
        JButton s28 = new JButton("");
        s28.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(cnt>6)
        		{
        			infoMessage("The maximum number of seats that can be selected is 6","alert");
        		}
        		else if(s28.getBackground()==Color.BLACK)
        		{
        			s28.setBackground(Color.WHITE);
        			int fare=Integer.parseInt(lbfare.getText());
            		fare=fare-totalfare;
            		String fares=String.valueOf(fare);
            		lbfare.setText(fares);
            		al.remove(a[28]);
            		cnt--;
        		}
        		else if(s28.getBackground()==Color.WHITE)
        		{
        			
        		s28.setBackground(Color.BLACK);
        		String msg=lblSeat.getText();
        		int fare=Integer.parseInt(lbfare.getText());
        		fare=fare+totalfare;
        		String fares=String.valueOf(fare);
        		lbfare.setText(fares);
        		al.add(28);
        		a[28]=(cnt-1);
        		cnt++;
        	}
        	}
        });
        s28.setForeground(Color.BLACK);
        s28.setBackground(Color.WHITE);
        JButton s27 = new JButton("");
        s27.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(cnt>6)
        		{
        			infoMessage("The maximum number of seats that can be selected is 6","alert");
        		}
        		else if(s27.getBackground()==Color.BLACK)
        		{
        			s27.setBackground(Color.WHITE);
        			int fare=Integer.parseInt(lbfare.getText());
            		fare=fare-totalfare;
            		String fares=String.valueOf(fare);
            		lbfare.setText(fares);
            		al.remove(a[27]);
            		cnt--;
        		}
        		else if(s27.getBackground()==Color.WHITE)
        		{
        			
        		s27.setBackground(Color.BLACK);
        		String msg=lblSeat.getText();
        		int fare=Integer.parseInt(lbfare.getText());
        		fare=fare+totalfare;
        		String fares=String.valueOf(fare);
        		lbfare.setText(fares);
        		al.add(27);
        		a[27]=(cnt-1);
        		cnt++;
        	}
        	}
        });
        s27.setForeground(Color.BLACK);
        s27.setBackground(Color.WHITE);
        JButton s22 = new JButton("");
        s22.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(cnt>6)
        		{
        			infoMessage("The maximum number of seats that can be selected is 6","alert");
        		}
        		else if(s22.getBackground()==Color.BLACK)
        		{
        			s22.setBackground(Color.WHITE);
        			int fare=Integer.parseInt(lbfare.getText());
            		fare=fare-totalfare;
            		String fares=String.valueOf(fare);
            		lbfare.setText(fares);
            		al.remove(a[22]);
            		cnt--;
        		}
        		else if(s22.getBackground()==Color.WHITE)
        		{
        			
        		s22.setBackground(Color.BLACK);
        		String msg=lblSeat.getText();
        		int fare=Integer.parseInt(lbfare.getText());
        		fare=fare+totalfare;
        		String fares=String.valueOf(fare);
        		lbfare.setText(fares);
        		al.add(22);
        		a[22]=(cnt-1);
        		cnt++;
        	}
        	}
        });
        s22.setForeground(Color.BLACK);
        s22.setBackground(Color.WHITE);
        JButton s17 = new JButton("");
        s17.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(cnt>6)
        		{
        			infoMessage("The maximum number of seats that can be selected is 6","alert");
        		}
        		else if(s17.getBackground()==Color.BLACK)
        		{
        			s17.setBackground(Color.WHITE);
        			int fare=Integer.parseInt(lbfare.getText());
            		fare=fare-totalfare;
            		String fares=String.valueOf(fare);
            		lbfare.setText(fares);
            		al.remove(a[17]);
            		cnt--;
        		}
        		else if(s17.getBackground()==Color.WHITE)
        		{
        			
        		s17.setBackground(Color.BLACK);
        		String msg=lblSeat.getText();
        		int fare=Integer.parseInt(lbfare.getText());
        		fare=fare+totalfare;
        		String fares=String.valueOf(fare);
        		lbfare.setText(fares);
        		al.add(17);
        		a[17]=(cnt-1);
        		cnt++;
        	}
        	}
        });
        s17.setForeground(Color.BLACK);
        s17.setBackground(Color.WHITE);
        JButton s24 = new JButton("");
        s24.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(cnt>6)
        		{
        			infoMessage("The maximum number of seats that can be selected is 6","alert");
        		}
        		else if(s24.getBackground()==Color.BLACK)
        		{
        			s24.setBackground(Color.WHITE);
        			int fare=Integer.parseInt(lbfare.getText());
            		fare=fare-totalfare;
            		String fares=String.valueOf(fare);
            		lbfare.setText(fares);
            		al.remove(a[24]);
            		cnt--;
        		}
        		else if(s24.getBackground()==Color.WHITE)
        		{
        			
        		s24.setBackground(Color.BLACK);
        		String msg=lblSeat.getText();
        		int fare=Integer.parseInt(lbfare.getText());
        		fare=fare+totalfare;
        		String fares=String.valueOf(fare);
        		lbfare.setText(fares);
        		al.add(24);
        		a[24]=(cnt-1);
        		cnt++;
        	}
        	}
        });
        s24.setForeground(Color.BLACK);
        s24.setBackground(Color.WHITE);
        JButton s23 = new JButton("");
        s23.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(cnt>6)
        		{
        			infoMessage("The maximum number of seats that can be selected is 6","alert");
        		}
        		else if(s23.getBackground()==Color.BLACK)
        		{
        			s23.setBackground(Color.WHITE);
        			int fare=Integer.parseInt(lbfare.getText());
            		fare=fare-totalfare;
            		String fares=String.valueOf(fare);
            		lbfare.setText(fares);
            		al.remove(a[23]);
            		cnt--;
        		}
        		else if(s23.getBackground()==Color.WHITE)
        		{
        			
        		s23.setBackground(Color.BLACK);
        		String msg=lblSeat.getText();
        		int fare=Integer.parseInt(lbfare.getText());
        		fare=fare+totalfare;
        		String fares=String.valueOf(fare);
        		lbfare.setText(fares);
        		al.add(23);
        		a[23]=(cnt-1);
        		cnt++;
        	}
        	}
        });
        s23.setForeground(Color.BLACK);
        s23.setBackground(Color.WHITE);
        JButton s18 = new JButton("");
        s18.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(cnt>6)
        		{
        			infoMessage("The maximum number of seats that can be selected is 6","alert");
        		}
        		else if(s18.getBackground()==Color.BLACK)
        		{
        			s18.setBackground(Color.WHITE);
        			int fare=Integer.parseInt(lbfare.getText());
            		fare=fare-totalfare;
            		String fares=String.valueOf(fare);
            		lbfare.setText(fares);
            		al.remove(a[18]);
            		cnt--;
        		}
        		else if(s18.getBackground()==Color.WHITE)
        		{
        			
        		s18.setBackground(Color.BLACK);
        		String msg=lblSeat.getText();
        		int fare=Integer.parseInt(lbfare.getText());
        		fare=fare+totalfare;
        		String fares=String.valueOf(fare);
        		lbfare.setText(fares);
        		al.add(18);
        		a[18]=(cnt-1);
        		cnt++;
        	}
        	}
        });
        s18.setForeground(Color.BLACK);
        s18.setBackground(Color.WHITE);
        JButton s21 = new JButton("");
        s21.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(cnt>6)
        		{
        			infoMessage("The maximum number of seats that can be selected is 6","alert");
        		}
        		else if(s21.getBackground()==Color.BLACK)
        		{
        			s21.setBackground(Color.WHITE);
        			int fare=Integer.parseInt(lbfare.getText());
            		fare=fare-totalfare;
            		String fares=String.valueOf(fare);
            		lbfare.setText(fares);
            		al.remove(a[21]);
            		cnt--;
        		}
        		else if(s21.getBackground()==Color.WHITE)
        		{
        			
        		s21.setBackground(Color.BLACK);
        		String msg=lblSeat.getText();
        		int fare=Integer.parseInt(lbfare.getText());
        		fare=fare+totalfare;
        		String fares=String.valueOf(fare);
        		lbfare.setText(fares);
        		al.add(21);
        		a[21]=(cnt-1);
        		cnt++;
        	}
        	}
        });
        s21.setForeground(Color.BLACK);
        s21.setBackground(Color.WHITE);
        JButton s20 = new JButton("");
        s20.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(cnt>6)
        		{
        			infoMessage("The maximum number of seats that can be selected is 6","alert");
        		}
        		else if(s20.getBackground()==Color.BLACK)
        		{
        			s20.setBackground(Color.WHITE);
        			int fare=Integer.parseInt(lbfare.getText());
            		fare=fare-totalfare;
            		String fares=String.valueOf(fare);
            		lbfare.setText(fares);
            		al.remove(a[20]);
            		cnt--;
        		}
        		else if(s20.getBackground()==Color.WHITE)
        		{
        			
        		s20.setBackground(Color.BLACK);
        		String msg=lblSeat.getText();
        		int fare=Integer.parseInt(lbfare.getText());
        		fare=fare+totalfare;
        		String fares=String.valueOf(fare);
        		lbfare.setText(fares);
        		al.add(20);
        		a[20]=(cnt-1);
        		cnt++;
        	}
        	}
        });
        s20.setForeground(Color.BLACK);
        s20.setBackground(Color.WHITE);
        JButton s19 = new JButton("");
        s19.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(cnt>6)
        		{
        			infoMessage("The maximum number of seats that can be selected is 6","alert");
        		}
        		else if(s19.getBackground()==Color.BLACK)
        		{
        			s19.setBackground(Color.WHITE);
        			int fare=Integer.parseInt(lbfare.getText());
            		fare=fare-totalfare;
            		String fares=String.valueOf(fare);
            		lbfare.setText(fares);
            		al.remove(a[19]);
            		cnt--;
        		}
        		else if(s19.getBackground()==Color.WHITE)
        		{
        			
        		s19.setBackground(Color.BLACK);
        		String msg=lblSeat.getText();
        		int fare=Integer.parseInt(lbfare.getText());
        		fare=fare+totalfare;
        		String fares=String.valueOf(fare);
        		lbfare.setText(fares);
        		al.add(19);
        		a[19]=(cnt-1);
        		cnt++;
        	}
        	}
        });
        s19.setForeground(Color.BLACK);
        s19.setBackground(Color.WHITE);
        JButton s14 = new JButton("");
        s14.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(cnt>6)
        		{
        			infoMessage("The maximum number of seats that can be selected is 6","alert");
        		}
        		else if(s14.getBackground()==Color.BLACK)
        		{
        			s14.setBackground(Color.WHITE);
        			int fare=Integer.parseInt(lbfare.getText());
            		fare=fare-totalfare;
            		String fares=String.valueOf(fare);
            		lbfare.setText(fares);
            		al.remove(a[14]);
            		cnt--;
        		}
        		else if(s14.getBackground()==Color.WHITE)
        		{
        			
        		s14.setBackground(Color.BLACK);
        		String msg=lblSeat.getText();
        		int fare=Integer.parseInt(lbfare.getText());
        		fare=fare+totalfare;
        		String fares=String.valueOf(fare);
        		lbfare.setText(fares);
        		al.add(14);
        		a[14]=(cnt-1);
        		cnt++;
        	}
        	}
        });
        s14.setForeground(Color.BLACK);
        s14.setBackground(Color.WHITE);
        JButton s25 = new JButton("");
        s25.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(cnt>6)
        		{
        			infoMessage("The maximum number of seats that can be selected is 6","alert");
        		}
        		else if(s25.getBackground()==Color.BLACK)
        		{
        			s25.setBackground(Color.WHITE);
        			int fare=Integer.parseInt(lbfare.getText());
            		fare=fare-totalfare;
            		String fares=String.valueOf(fare);
            		lbfare.setText(fares);
            		al.remove(a[25]);
            		cnt--;
        		}
        		else if(s25.getBackground()==Color.WHITE)
        		{
        			
        		s25.setBackground(Color.BLACK);
        		String msg=lblSeat.getText();
        		int fare=Integer.parseInt(lbfare.getText());
        		fare=fare+totalfare;
        		String fares=String.valueOf(fare);
        		lbfare.setText(fares);
        		al.add(25);
        		a[25]=(cnt-1);
        		cnt++;
        	}
        	}
        });
        s25.setForeground(Color.BLACK);
        s25.setBackground(Color.WHITE);
        JButton s16 = new JButton("");
        s16.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(cnt>6)
        		{
        			infoMessage("The maximum number of seats that can be selected is 6","alert");
        		}
        		else if(s16.getBackground()==Color.BLACK)
        		{
        			s16.setBackground(Color.WHITE);
        			int fare=Integer.parseInt(lbfare.getText());
            		fare=fare-totalfare;
            		String fares=String.valueOf(fare);
            		lbfare.setText(fares);
            		al.remove(a[16]);
            		cnt--;
        		}
        		else if(s16.getBackground()==Color.WHITE)
        		{
        			
        		s16.setBackground(Color.BLACK);
        		String msg=lblSeat.getText();
        		int fare=Integer.parseInt(lbfare.getText());
        		fare=fare+totalfare;
        		String fares=String.valueOf(fare);
        		lbfare.setText(fares);
        		al.add(16);
        		a[16]=(cnt-1);
        		cnt++;
        	}
        	}
        });
        s16.setForeground(Color.BLACK);
        s16.setBackground(Color.WHITE);
        JButton s15 = new JButton("");
        s15.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(cnt>6)
        		{
        			infoMessage("The maximum number of seats that can be selected is 6","alert");
        		}
        		else if(s15.getBackground()==Color.BLACK)
        		{
        			s15.setBackground(Color.WHITE);
        			int fare=Integer.parseInt(lbfare.getText());
            		fare=fare-totalfare;
            		String fares=String.valueOf(fare);
            		lbfare.setText(fares);
            		al.remove(a[15]);
            		cnt--;
        		}
        		else if(s15.getBackground()==Color.WHITE)
        		{
        			
        		s15.setBackground(Color.BLACK);
        		String msg=lblSeat.getText();
        		int fare=Integer.parseInt(lbfare.getText());
        		fare=fare+totalfare;
        		String fares=String.valueOf(fare);
        		lbfare.setText(fares);
        		al.add(15);
        		a[15]=(cnt-1);
        		cnt++;
        	}
        	}
        });
        s15.setForeground(Color.BLACK);
        s15.setBackground(Color.WHITE);
        JButton s10 = new JButton("");
        s10.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(cnt>6)
        		{
        			infoMessage("The maximum number of seats that can be selected is 6","alert");
        		}
        		else if(s10.getBackground()==Color.BLACK)
        		{
        			s10.setBackground(Color.WHITE);
        			int fare=Integer.parseInt(lbfare.getText());
            		fare=fare-totalfare;
            		String fares=String.valueOf(fare);
            		lbfare.setText(fares);
            		al.remove(a[10]);
            		cnt--;
        		}
        		else if(s10.getBackground()==Color.WHITE)
        		{
        			
        		s10.setBackground(Color.BLACK);
        		String msg=lblSeat.getText();
        		int fare=Integer.parseInt(lbfare.getText());
        		fare=fare+totalfare;
        		String fares=String.valueOf(fare);
        		lbfare.setText(fares);
        		al.add(10);
        		a[10]=(cnt-1);
        		cnt++;
        	}
        	}
        });
        s10.setForeground(Color.BLACK);
        s10.setBackground(Color.WHITE);
        JButton s29 = new JButton("");
        s29.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(cnt>6)
        		{
        			infoMessage("The maximum number of seats that can be selected is 6","alert");
        		}
        		else if(s29.getBackground()==Color.BLACK)
        		{
        			s29.setBackground(Color.WHITE);
        			int fare=Integer.parseInt(lbfare.getText());
            		fare=fare-totalfare;
            		String fares=String.valueOf(fare);
            		lbfare.setText(fares);
            		al.remove(a[29]);
            		cnt--;
        		}
        		else if(s29.getBackground()==Color.WHITE)
        		{
        			
        		s29.setBackground(Color.BLACK);
        		String msg=lblSeat.getText();
        		int fare=Integer.parseInt(lbfare.getText());
        		fare=fare+totalfare;
        		String fares=String.valueOf(fare);
        		lbfare.setText(fares);
        		al.add(29);
        		a[29]=(cnt-1);
        		cnt++;
        	}
        	}
        });
        s29.setForeground(Color.BLACK);
        s29.setBackground(Color.WHITE);
        JButton s12 = new JButton("");
        s12.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(cnt>6)
        		{
        			infoMessage("The maximum number of seats that can be selected is 6","alert");
        		}
        		else if(s12.getBackground()==Color.BLACK)
        		{
        			s12.setBackground(Color.WHITE);
        			int fare=Integer.parseInt(lbfare.getText());
            		fare=fare-totalfare;
            		String fares=String.valueOf(fare);
            		lbfare.setText(fares);
            		al.remove(a[12]);
            		cnt--;
        		}
        		else if(s12.getBackground()==Color.WHITE)
        		{
        			
        		s12.setBackground(Color.BLACK);
        		String msg=lblSeat.getText();
        		int fare=Integer.parseInt(lbfare.getText());
        		fare=fare+totalfare;
        		String fares=String.valueOf(fare);
        		lbfare.setText(fares);
        		al.add(12);
        		a[12]=(cnt-1);
        		cnt++;
        	}
        	}
        });
        s12.setForeground(Color.BLACK);
        s12.setBackground(Color.WHITE);
        JButton s11 = new JButton("");
        s11.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(cnt>6)
        		{
        			infoMessage("The maximum number of seats that can be selected is 6","alert");
        		}
        		else if(s11.getBackground()==Color.BLACK)
        		{
        			s11.setBackground(Color.WHITE);
        			int fare=Integer.parseInt(lbfare.getText());
            		fare=fare-totalfare;
            		String fares=String.valueOf(fare);
            		lbfare.setText(fares);
            		al.remove(a[11]);
            		cnt--;
        		}
        		else if(s11.getBackground()==Color.WHITE)
        		{
        			
        		s11.setBackground(Color.BLACK);
        		String msg=lblSeat.getText();
        		int fare=Integer.parseInt(lbfare.getText());
        		fare=fare+totalfare;
        		String fares=String.valueOf(fare);
        		lbfare.setText(fares);
        		al.add(11);
        		a[11]=(cnt-1);
        		cnt++;
        	}
        	}
        });
        s11.setForeground(Color.BLACK);
        s11.setBackground(Color.WHITE);
        JButton s6 = new JButton("");
        s6.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(cnt>6)
        		{
        			infoMessage("The maximum number of seats that can be selected is 6","alert");
        		}
        		else if(s6.getBackground()==Color.BLACK)
        		{
        			s6.setBackground(Color.WHITE);
        			int fare=Integer.parseInt(lbfare.getText());
            		fare=fare-totalfare;
            		String fares=String.valueOf(fare);
            		lbfare.setText(fares);
            		al.remove(a[6]);
            		cnt--;
        		}
        		else if(s6.getBackground()==Color.WHITE)
        		{
        			
        		s6.setBackground(Color.BLACK);
        		String msg=lblSeat.getText();
        		int fare=Integer.parseInt(lbfare.getText());
        		fare=fare+totalfare;
        		String fares=String.valueOf(fare);
        		lbfare.setText(fares);
        		al.add(6);
        		a[6]=(cnt-1);
        		cnt++;
        	}
        	}
        });
        s6.setForeground(Color.BLACK);
        s6.setBackground(Color.WHITE);
        JButton s33 = new JButton("");
        s33.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		
        		if(cnt>6)
        		{
        			infoMessage("The maximum number of seats that can be selected is 6","alert");
        		}
        		else if(s33.getBackground()==Color.BLACK)
        		{
        			s33.setBackground(Color.WHITE);
        			int fare=Integer.parseInt(lbfare.getText());
            		fare=fare-totalfare;
            		String fares=String.valueOf(fare);
            		lbfare.setText(fares);
            		al.remove(a[33]);
            		cnt--;
        		}
        		else if(s33.getBackground()==Color.WHITE)
        		{
        			
        		s33.setBackground(Color.BLACK);
        		String msg=lblSeat.getText();
        		int fare=Integer.parseInt(lbfare.getText());
        		fare=fare+totalfare;
        		String fares=String.valueOf(fare);
        		lbfare.setText(fares);
        		al.add(33);
        		a[33]=(cnt-1);
        		cnt++;
        	}
        	}
        });
        s33.setForeground(Color.BLACK);
        s33.setBackground(Color.WHITE);
        JButton s7 = new JButton("");
        s7.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(cnt>6)
        		{
        			infoMessage("The maximum number of seats that can be selected is 6","alert");
        		}
        		else if(s7.getBackground()==Color.BLACK)
        		{
        			s7.setBackground(Color.WHITE);
        			int fare=Integer.parseInt(lbfare.getText());
            		fare=fare-totalfare;
            		String fares=String.valueOf(fare);
            		lbfare.setText(fares);
            		al.remove(a[7]);
            		cnt--;
        		}
        		else if(s7.getBackground()==Color.WHITE)
        		{
        			
        		s7.setBackground(Color.BLACK);
        		String msg=lblSeat.getText();
        		int fare=Integer.parseInt(lbfare.getText());
        		fare=fare+totalfare;
        		String fares=String.valueOf(fare);
        		lbfare.setText(fares);
        		al.add(7);
        		a[7]=(cnt-1);
        		cnt++;
        	}
        	}
        });
        s7.setForeground(Color.BLACK);
        s7.setBackground(Color.WHITE);
        JButton s8 = new JButton("");
        s8.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(cnt>6)
        		{
        			infoMessage("The maximum number of seats that can be selected is 6","alert");
        		}
        		else if(s8.getBackground()==Color.BLACK)
        		{
        			s8.setBackground(Color.WHITE);
        			int fare=Integer.parseInt(lbfare.getText());
            		fare=fare-totalfare;
            		String fares=String.valueOf(fare);
            		lbfare.setText(fares);
            		al.remove(a[8]);
            		cnt--;
        		}
        		else if(s8.getBackground()==Color.WHITE)
        		{
        			
        		s8.setBackground(Color.BLACK);
        		String msg=lblSeat.getText();
        		int fare=Integer.parseInt(lbfare.getText());
        		fare=fare+totalfare;
        		String fares=String.valueOf(fare);
        		lbfare.setText(fares);
        		al.add(8);
        		a[8]=(cnt-1);
        		cnt++;
        	}
        	}
        });
        s8.setForeground(Color.BLACK);
        s8.setBackground(Color.WHITE);
        JButton s37 = new JButton("");
        s37.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(cnt>6)
        		{
        			infoMessage("The maximum number of seats that can be selected is 6","alert");
        		}
        		else if(s37.getBackground()==Color.BLACK)
        		{
        			s37.setBackground(Color.WHITE);
        			int fare=Integer.parseInt(lbfare.getText());
            		fare=fare-totalfare;
            		String fares=String.valueOf(fare);
            		lbfare.setText(fares);
            		al.remove(a[37]);
            		cnt--;
        		}
        		else if(s37.getBackground()==Color.WHITE)
        		{
        			
        		s37.setBackground(Color.BLACK);
        		String msg=lblSeat.getText();
        		int fare=Integer.parseInt(lbfare.getText());
        		fare=fare+totalfare;
        		String fares=String.valueOf(fare);
        		lbfare.setText(fares);
        		al.add(37);
        		a[37]=(cnt-1);
        		cnt++;
        	}
        	}
        });
        s37.setForeground(Color.BLACK);
        s37.setBackground(Color.WHITE);
        JButton s41 = new JButton("");
        s41.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(cnt>6)
        		{
        			infoMessage("The maximum number of seats that can be selected is 6","alert");
        		}
        		else if(s41.getBackground()==Color.BLACK)
        		{
        			s41.setBackground(Color.WHITE);
        			int fare=Integer.parseInt(lbfare.getText());
            		fare=fare-totalfare;
            		String fares=String.valueOf(fare);
            		lbfare.setText(fares);
            		al.remove(a[41]);
            		cnt--;
        		}
        		else if(s41.getBackground()==Color.WHITE)
        		{
        			
        		s41.setBackground(Color.BLACK);
        		String msg=lblSeat.getText();
        		int fare=Integer.parseInt(lbfare.getText());
        		fare=fare+totalfare;
        		String fares=String.valueOf(fare);
        		lbfare.setText(fares);
        		al.add(41);
        		a[41]=(cnt-1);
        		cnt++;
        	}
        	}
        });
        s41.setForeground(Color.BLACK);
        s41.setBackground(Color.WHITE);
        JButton s48 = new JButton("");
        s48.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(cnt>6)
        		{
        			infoMessage("The maximum number of seats that can be selected is 6","alert");
        		}
        		else if(s48.getBackground()==Color.BLACK)
        		{
        			s48.setBackground(Color.WHITE);
        			int fare=Integer.parseInt(lbfare.getText());
            		fare=fare-totalfare;
            		String fares=String.valueOf(fare);
            		lbfare.setText(fares);
            		al.remove(a[48]);
            		cnt--;
        		}
        		else if(s48.getBackground()==Color.WHITE)
        		{
        			
        		s48.setBackground(Color.BLACK);
        		String msg=lblSeat.getText();
        		int fare=Integer.parseInt(lbfare.getText());
        		fare=fare+totalfare;
        		String fares=String.valueOf(fare);
        		lbfare.setText(fares);
        		al.add(48);
        		a[48]=(cnt-1);
        		cnt++;
        	}
        	}
        });
        s48.setForeground(Color.BLACK);
        s48.setBackground(Color.WHITE);
        JButton s47 = new JButton("");
        s47.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		
        		if(cnt>6)
        		{
        			infoMessage("The maximum number of seats that can be selected is 6","alert");
        		}
        		else if(s47.getBackground()==Color.BLACK)
        		{
        			s47.setBackground(Color.WHITE);
        			int fare=Integer.parseInt(lbfare.getText());
            		fare=fare-totalfare;
            		String fares=String.valueOf(fare);
            		lbfare.setText(fares);
            		al.remove(a[47]);
            		cnt--;
        		}
        		else if(s47.getBackground()==Color.WHITE)
        		{
        			
        		s47.setBackground(Color.BLACK);
        		String msg=lblSeat.getText();
        		int fare=Integer.parseInt(lbfare.getText());
        		fare=fare+totalfare;
        		String fares=String.valueOf(fare);
        		lbfare.setText(fares);
        		al.add(47);
        		a[47]=(cnt-1);
        		cnt++;
        	}
        	}
        });
        s47.setForeground(Color.BLACK);
        s47.setBackground(Color.WHITE);
        JButton s51 = new JButton("");
        s51.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(cnt>6)
        		{
        			infoMessage("The maximum number of seats that can be selected is 6","alert");
        		}
        		else if(s51.getBackground()==Color.BLACK)
        		{
        			s51.setBackground(Color.WHITE);
        			int fare=Integer.parseInt(lbfare.getText());
            		fare=fare-totalfare;
            		String fares=String.valueOf(fare);
            		lbfare.setText(fares);
            		al.remove(a[51]);
            		cnt--;
        		}
        		else if(s51.getBackground()==Color.WHITE)
        		{
        			
        		s51.setBackground(Color.BLACK);
        		String msg=lblSeat.getText();
        		int fare=Integer.parseInt(lbfare.getText());
        		fare=fare+totalfare;
        		String fares=String.valueOf(fare);
        		lbfare.setText(fares);
        		al.add(51);
        		a[51]=(cnt-1);
        		cnt++;
        	}
        	}
        });
        s51.setForeground(Color.BLACK);
        s51.setBackground(Color.WHITE);
        JButton s46 = new JButton("");
        s46.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(cnt>6)
        		{
        			infoMessage("The maximum number of seats that can be selected is 6","alert");
        		}
        		else if(s46.getBackground()==Color.BLACK)
        		{
        			s46.setBackground(Color.WHITE);
        			int fare=Integer.parseInt(lbfare.getText());
            		fare=fare-totalfare;
            		String fares=String.valueOf(fare);
            		lbfare.setText(fares);
            		al.remove(a[46]);
            		cnt--;
        		}
        		else if(s46.getBackground()==Color.WHITE)
        		{
        			
        		s46.setBackground(Color.BLACK);
        		String msg=lblSeat.getText();
        		int fare=Integer.parseInt(lbfare.getText());
        		fare=fare+totalfare;
        		String fares=String.valueOf(fare);
        		lbfare.setText(fares);
        		al.add(46);
        		a[46]=(cnt-1);
        		cnt++;
        	}
        	}
        });
        s46.setForeground(Color.BLACK);
        s46.setBackground(Color.WHITE);
        JButton s45 = new JButton("");
        s45.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(cnt>6)
        		{
        			infoMessage("The maximum number of seats that can be selected is 6","alert");
        		}
        		else if(s45.getBackground()==Color.BLACK)
        		{
        			s45.setBackground(Color.WHITE);
        			int fare=Integer.parseInt(lbfare.getText());
            		fare=fare-totalfare;
            		String fares=String.valueOf(fare);
            		lbfare.setText(fares);
            		al.remove(a[45]);
            		cnt--;
        		}
        		else if(s45.getBackground()==Color.WHITE)
        		{
        			
        		s45.setBackground(Color.BLACK);
        		String msg=lblSeat.getText();
        		int fare=Integer.parseInt(lbfare.getText());
        		fare=fare+totalfare;
        		String fares=String.valueOf(fare);
        		lbfare.setText(fares);
        		al.add(45);
        		a[45]=(cnt-1);
        		cnt++;
        	}
        	}
        });
        s45.setForeground(Color.BLACK);
        s45.setBackground(Color.WHITE);
        JButton btnProceed = new JButton("Proceed");
        btnProceed.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent evt) {
        		
        		 jButton1ActionPerformed(evt);
        	}
        });
        
        JButton btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		dispose();
        	}
        });
        
        JLabel lblFares = new JLabel("FARES");
        
        JButton s49 = new JButton("");
        s49.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(cnt>6)
        		{
        			infoMessage("The maximum number of seats that can be selected is 6","alert");
        		}
        		else if(s49.getBackground()==Color.BLACK)
        		{
        			s49.setBackground(Color.WHITE);
        			int fare=Integer.parseInt(lbfare.getText());
            		fare=fare-totalfare;
            		String fares=String.valueOf(fare);
            		lbfare.setText(fares);
            		al.remove(a[49]);
            		cnt--;
        		}
        		else if(s49.getBackground()==Color.WHITE)
        		{
        			
        		s49.setBackground(Color.BLACK);
        		String msg=lblSeat.getText();
        		int fare=Integer.parseInt(lbfare.getText());
        		fare=fare+totalfare;
        		String fares=String.valueOf(fare);
        		lbfare.setText(fares);
        		al.add(49);
        		a[49]=(cnt-1);
        		cnt++;
        	}
        	}
        });
        s49.setForeground(Color.BLACK);
        s49.setBackground(Color.WHITE);
        JButton s50 = new JButton("");
        s50.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(cnt>6)
        		{
        			infoMessage("The maximum number of seats that can be selected is 6","alert");
        		}
        		else if(s50.getBackground()==Color.BLACK)
        		{
        			s50.setBackground(Color.WHITE);
        			int fare=Integer.parseInt(lbfare.getText());
            		fare=fare-totalfare;
            		String fares=String.valueOf(fare);
            		lbfare.setText(fares);
            		al.remove(a[50]);
            		cnt--;
        		}
        		else if(s50.getBackground()==Color.WHITE)
        		{
        			
        		s50.setBackground(Color.BLACK);
        		String msg=lblSeat.getText();
        		int fare=Integer.parseInt(lbfare.getText());
        		fare=fare+totalfare;
        		String fares=String.valueOf(fare);
        		lbfare.setText(fares);
        		al.add(50);
        		a[50]=(cnt-1);
        		cnt++;
        	}
        	}
        });
        s50.setForeground(Color.BLACK);
        s50.setBackground(Color.WHITE);
        JButton s52 = new JButton("");
        s52.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(cnt>6)
        		{
        			infoMessage("The maximum number of seats that can be selected is 6","alert");
        		}
        		else if(s52.getBackground()==Color.BLACK)
        		{
        			s52.setBackground(Color.WHITE);
        			int fare=Integer.parseInt(lbfare.getText());
            		fare=fare-totalfare;
            		String fares=String.valueOf(fare);
            		lbfare.setText(fares);
            		al.remove(a[52]);
            		cnt--;
        		}
        		else if(s52.getBackground()==Color.WHITE)
        		{
        			
        		s52.setBackground(Color.BLACK);
        		String msg=lblSeat.getText();
        		int fare=Integer.parseInt(lbfare.getText());
        		fare=fare+totalfare;
        		String fares=String.valueOf(fare);
        		lbfare.setText(fares);
        		al.add(52);
        		a[52]=(cnt-1);
        		cnt++;
        	}
        	}
        	
        });
        s52.setForeground(Color.BLACK);
        s52.setBackground(Color.WHITE);
        JButton s53 = new JButton("");
        s53.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(cnt>6)
        		{
        			infoMessage("The maximum number of seats that can be selected is 6","alert");
        		}
        		else if(s53.getBackground()==Color.BLACK)
        		{
        			s53.setBackground(Color.WHITE);
        			int fare=Integer.parseInt(lbfare.getText());
            		fare=fare-totalfare;
            		String fares=String.valueOf(fare);
            		lbfare.setText(fares);
            		al.remove(a[53]);
            		cnt--;
        		}
        		else if(s53.getBackground()==Color.WHITE)
        		{
        			
        		s53.setBackground(Color.BLACK);
        		String msg=lblSeat.getText();
        		int fare=Integer.parseInt(lbfare.getText());
        		fare=fare+totalfare;
        		String fares=String.valueOf(fare);
        		lbfare.setText(fares);
        		al.add(53);
        		a[53]=(cnt-1);
        		cnt++;
        	}
        	}
        });
        s53.setForeground(Color.BLACK);
        s53.setBackground(Color.WHITE);
        
      lblSeat = new JLabel("");
        
        lbfare = new JLabel("0");
        
        try
	        {
	        	String conStr = "jdbc:ucanaccess://E:\\Studies\\java\\Reservation\\src\\BusReservation.accdb;memory=true";
	       		Connection conn=DriverManager.getConnection(conStr);
	            Statement stat = conn.createStatement();  
	            String selectQuery="select seat_no from seat_details where bus_no='"+busno+"'";
	           System.out.println(selectQuery);
	           ResultSet rs=stat.executeQuery(selectQuery);
  	            while(rs.next())
  	            {
  	              //  sourceCB.addItem(rs.getString("bus_source"));
  	           int obj= (rs.getInt("seat_no"));
  	           switch (obj) {
			case 1:
				s1.setBackground(Color.GRAY);
				break;
			case 2:
				s2.setBackground(Color.GRAY);
				break;
			case 3:
				s3.setBackground(Color.GRAY);
				break;
			case 4:
				s4.setBackground(Color.GRAY);
				break;
			case 5:
				s5.setBackground(Color.GRAY);
				break;
			case 6:
				s6.setBackground(Color.GRAY);
				break;
			case 7:
				s7.setBackground(Color.GRAY);
				break;
			case 8:
				s8.setBackground(Color.GRAY);
				break;
			case 9:
				s9.setBackground(Color.GRAY);
				break;
			case 10:
				s10.setBackground(Color.GRAY);
				break;
			case 11:
				s11.setBackground(Color.GRAY);
				break;
			case 12:
				s12.setBackground(Color.GRAY);
				break;
			case 13:
				s13.setBackground(Color.GRAY);
				break;
			case 14:
				s14.setBackground(Color.GRAY);
				break;
			case 15:
				s15.setBackground(Color.GRAY);
				break;
			case 16:
				s16.setBackground(Color.GRAY);
				break;
			case 17:
				s17.setBackground(Color.GRAY);
				break;
			case 18:
				s18.setBackground(Color.GRAY);
				break;
			case 19:
				s19.setBackground(Color.GRAY);
				break;
			case 20:
				s20.setBackground(Color.GRAY);
				break;
			case 21:
				s21.setBackground(Color.GRAY);
				break;
			case 22:
				s22.setBackground(Color.GRAY);
				break;
			case 23:
				s23.setBackground(Color.GRAY);
				break;
			case 24:
				s24.setBackground(Color.GRAY);
				break;
			case 25:
				s25.setBackground(Color.GRAY);
				break;
			case 26:
				s26.setBackground(Color.GRAY);
				break;
			case 27:
				s27.setBackground(Color.GRAY);
				break;
			case 28:
				s28.setBackground(Color.GRAY);
				break;
			case 29:
				s29.setBackground(Color.GRAY);
				break;
			case 30:
				s30.setBackground(Color.GRAY);
				break;
			case 31:
				s31.setBackground(Color.GRAY);
				break;
			case 32:
				s32.setBackground(Color.GRAY);
				break;
			case 33:
				s33.setBackground(Color.GRAY);
				break;
			case 34:
				s34.setBackground(Color.GRAY);
				break;
			case 35:
				s35.setBackground(Color.GRAY);
				break;
			case 36:
				s36.setBackground(Color.GRAY);
				break;
			case 37:
				s37.setBackground(Color.GRAY);
				break;
			case 38:
				s38.setBackground(Color.GRAY);
				break;
			case 39:
				s39.setBackground(Color.GRAY);
				break;
			case 40:
				s40.setBackground(Color.GRAY);
				break;
			case 41:
				s41.setBackground(Color.GRAY);
				break;
			case 42:
				s42.setBackground(Color.GRAY);
				break;
			case 43:
				s43.setBackground(Color.GRAY);
				break;
			case 44:
				s44.setBackground(Color.GRAY);
				break;
			case 45:
				s45.setBackground(Color.GRAY);
				break;
			case 46:
				s46.setBackground(Color.GRAY);
				break;
			case 47:
				s47.setBackground(Color.GRAY);
				break;
			case 48:
				s48.setBackground(Color.GRAY);
				break;
			case 49:
				s49.setBackground(Color.GRAY);
				break;
			case 50:
				s50.setBackground(Color.GRAY);
				break;
			case 51:
				s51.setBackground(Color.GRAY);
				break;
			case 52:
				s52.setBackground(Color.GRAY);
				break;
			case 53:
				s53.setBackground(Color.GRAY);
				break;

			default:
				break;
			}
  	           
  	            	
  	                
  	            }
		
	}
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(60)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(s1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(s5, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(s9, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(s13, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(s17, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(s21, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(s25, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(s29, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(s33, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(s37, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(s41, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(s2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(s6, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(s10, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(s14, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(s18, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(s22, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(s26, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(s30, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(s34, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(s38, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(s42, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(s3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(s7, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(s11, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(s15, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(s19, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(s23, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(s27, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(s31, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(s35, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(s39, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(s43, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(s4, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(s8, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(s12, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(s16, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(s20, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addComponent(s24, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addComponent(s28, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addComponent(s32, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
        								.addComponent(btnProceed))
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(btnCancel)
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(s36, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        									.addGap(6)
        									.addComponent(s40, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        									.addPreferredGap(ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
        									.addComponent(s44, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(s47, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(s52, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(s45, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addComponent(s49, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        									.addGap(25)
        									.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
        								.addGroup(layout.createSequentialGroup()
        									.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        										.addComponent(s51, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        										.addGroup(layout.createSequentialGroup()
        											.addComponent(s46, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        											.addPreferredGap(ComponentPlacement.RELATED)
        											.addComponent(s50, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
        									.addPreferredGap(ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
        									.addGroup(layout.createParallelGroup(Alignment.LEADING)
        										.addComponent(button_9, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        										.addComponent(button_14, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))))
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(label_2)
        								.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
        								.addComponent(label)))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(s48, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(s53, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))))
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(lblFares)
        					.addGap(55)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(lbfare, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lblSeat, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE))))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(108, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createParallelGroup(Alignment.LEADING)
        					.addComponent(s45, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        					.addComponent(s41, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        					.addComponent(s37, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        					.addComponent(s33, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        					.addComponent(s29, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        					.addComponent(s25, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        					.addComponent(s21, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        					.addComponent(s17, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        					.addComponent(s13, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        					.addComponent(s9, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        					.addComponent(s5, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        					.addComponent(s1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        					.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        					.addComponent(label, Alignment.TRAILING))
        				.addComponent(s49, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(s2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(s3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(s6, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(s7, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(s10, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(s11, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(s14, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(s15, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(s18, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(s19, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(s22, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(s23, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(s26, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(s27, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(s30, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(s31, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(s34, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(s35, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(s38, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(s39, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(s42, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(s43, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(s46, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        								.addComponent(s50, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
        							.addGap(32)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(s52, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        								.addComponent(s47, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(s12, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        						.addComponent(s53, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        						.addComponent(s8, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        						.addComponent(s16, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        						.addComponent(s20, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        						.addComponent(s24, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        						.addComponent(s28, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        						.addComponent(s32, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        						.addComponent(s36, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        						.addComponent(s40, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        						.addComponent(s44, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        						.addComponent(s48, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        						.addComponent(s4, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(label_1)
        						.addComponent(button_9, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(button_14, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
        						.addComponent(label_2)
        						.addComponent(s51, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))))
        			.addGap(36)
        			.addComponent(lblSeat, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblFares)
        				.addComponent(lbfare, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
        			.addGap(42)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnCancel)
        				.addComponent(btnProceed))
        			.addGap(46))
        );
        getContentPane().setLayout(layout);

        pack();
        
        
       
    }// </editor-fold>//GEN-END:initComponents

    public void infoMessage(String message, String tittle) {
        JOptionPane.showMessageDialog(null, message, tittle, JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    	
    	BookingFormFrame=new JFrame();
        BookingFormPanel=new JPanel();
        gl=new GridLayout(0,6,10,10);
        lb1=new JLabel("Passenger 1");
        lb7=new JLabel("Age");
        lb2=new JLabel("Passenger 2");
        lb8=new JLabel("Age");
        lb3=new JLabel("Passenger 3");
        lb9=new JLabel("Age");
        lb4=new JLabel("Passenger 4");
        lb10=new JLabel("Age");
        lb5=new JLabel("Passenger 5");
        lb11=new JLabel("Age");
        lb6=new JLabel("Passenger 6");
        lb12=new JLabel("Age");
        l7=new JLabel("Price/seat");
        tf1=new JTextField();
        tf2=new JTextField();
        tf3=new JTextField();
        tf4=new JTextField();
        tf5=new JTextField();
        tf6=new JTextField();
        tf7=new JTextField(3);
        tf8=new JTextField(3);
        tf9=new JTextField(3);
        tf10=new JTextField(3);
        tf11=new JTextField(3);
        tf12=new JTextField(3);
        r1=new JRadioButton("Male",true);
        r2=new JRadioButton("Female");
        r3=new JRadioButton("Male",true);
        r4=new JRadioButton("Female");
        r5=new JRadioButton("Male",true);
        r6=new JRadioButton("Female");
        r7=new JRadioButton("Male",true);
        r8=new JRadioButton("Female");
        r9=new JRadioButton("Male",true);
        r10=new JRadioButton("Female");
        r11=new JRadioButton("Male",true);
        r12=new JRadioButton("Female");
        
       
        bg1=new ButtonGroup();
        bg2=new ButtonGroup();
        bg3=new ButtonGroup();
        bg4=new ButtonGroup();
        bg5=new ButtonGroup();
        bg6=new ButtonGroup();
        
        bg1.add(r1);
        bg1.add(r2);
        bg2.add(r3);
        bg2.add(r4);
        bg3.add(r5);
        bg3.add(r6);
        bg4.add(r7);
        bg4.add(r8);
        bg5.add(r9);
        bg5.add(r10);
        bg6.add(r11);
        bg6.add(r12);
        
        if(cnt==1)
        {
        	infoMessage("Please select atleast 1 seat","alert");
        	dispose();
        	SeatSelections sc=new SeatSelections(busno,totalfare,luser,avail_seat);
            sc.setLocationRelativeTo(null);
            sc.setVisible(true);
            
        }
        else
        {
        	switch(cnt)
        	{
        	case 2:
        		lb2.setVisible(false);
        		tf2.setVisible(false);
        		lb8.setVisible(false);
        		tf8.setVisible(false);
        		r3.setVisible(false);
        		r4.setVisible(false);
        		lb3.setVisible(false);
        		tf3.setVisible(false);
        		lb9.setVisible(false);
        		tf9.setVisible(false);
        		r5.setVisible(false);
        		r6.setVisible(false);
        		lb4.setVisible(false);
        		tf4.setVisible(false);
        		lb10.setVisible(false);
        		tf10.setVisible(false);
        		r7.setVisible(false);
        		r8.setVisible(false);
        		lb5.setVisible(false);
        		tf5.setVisible(false);
        		lb11.setVisible(false);
        		tf11.setVisible(false);
        		r9.setVisible(false);
        		r10.setVisible(false);
        		lb6.setVisible(false);
        		tf6.setVisible(false);
        		lb12.setVisible(false);
        		tf12.setVisible(false);
        		r11.setVisible(false);
        		r12.setVisible(false);
        		break;
        	case 3:
        		lb3.setVisible(false);
        		tf3.setVisible(false);
        		lb9.setVisible(false);
        		tf9.setVisible(false);
        		r5.setVisible(false);
        		r6.setVisible(false);
        		lb4.setVisible(false);
        		tf4.setVisible(false);
        		lb10.setVisible(false);
        		tf10.setVisible(false);
        		r7.setVisible(false);
        		r8.setVisible(false);
        		lb5.setVisible(false);
        		tf5.setVisible(false);
        		lb11.setVisible(false);
        		tf11.setVisible(false);
        		r9.setVisible(false);
        		r10.setVisible(false);
        		lb6.setVisible(false);
        		tf6.setVisible(false);
        		lb12.setVisible(false);
        		tf12.setVisible(false);
        		r11.setVisible(false);
        		r12.setVisible(false);
        		break;
        	case 4:
        		lb4.setVisible(false);
        		tf4.setVisible(false);
        		lb10.setVisible(false);
        		tf10.setVisible(false);
        		r7.setVisible(false);
        		r8.setVisible(false);
        		lb5.setVisible(false);
        		tf5.setVisible(false);
        		lb11.setVisible(false);
        		tf11.setVisible(false);
        		r9.setVisible(false);
        		r10.setVisible(false);
        		lb6.setVisible(false);
        		tf6.setVisible(false);
        		lb12.setVisible(false);
        		tf12.setVisible(false);
        		r11.setVisible(false);
        		r12.setVisible(false);
        		break;
        	case 5:
        		lb5.setVisible(false);
        		tf5.setVisible(false);
        		lb11.setVisible(false);
        		tf11.setVisible(false);
        		r9.setVisible(false);
        		r10.setVisible(false);
        		lb6.setVisible(false);
        		tf6.setVisible(false);
        		lb12.setVisible(false);
        		tf12.setVisible(false);
        		r11.setVisible(false);
        		r12.setVisible(false);
        		break;
        	case 6:
        		lb6.setVisible(false);
        		tf6.setVisible(false);
        		lb12.setVisible(false);
        		tf12.setVisible(false);
        		r11.setVisible(false);
        		r12.setVisible(false);
        		break;
        		
        	}
        
        
        BookingFormFrame.getContentPane().add(BookingFormPanel);
        BookingFormPanel.setLayout(gl);
        
        BookingFormPanel.add(lb1);
        BookingFormPanel.add(tf1);
        BookingFormPanel.add(lb7);
        BookingFormPanel.add(tf7);
        BookingFormPanel.add(r1);
        BookingFormPanel.add(r2);
        BookingFormPanel.add(lb2);
        BookingFormPanel.add(tf2);
        BookingFormPanel.add(lb8);
        BookingFormPanel.add(tf8);
        BookingFormPanel.add(r3);
        BookingFormPanel.add(r4);
        BookingFormPanel.add(lb3);
        BookingFormPanel.add(tf3);
        BookingFormPanel.add(lb9);
        BookingFormPanel.add(tf9);
        BookingFormPanel.add(r5);
        BookingFormPanel.add(r6);
        BookingFormPanel.add(lb4);
        BookingFormPanel.add(tf4);
        BookingFormPanel.add(lb10);
        BookingFormPanel.add(tf10);
        BookingFormPanel.add(r7);
        BookingFormPanel.add(r8);
        BookingFormPanel.add(lb5);
        BookingFormPanel.add(tf5);
        BookingFormPanel.add(lb11);
        BookingFormPanel.add(tf11);
        BookingFormPanel.add(r9);
        BookingFormPanel.add(r10);
        BookingFormPanel.add(lb6);
        BookingFormPanel.add(tf6);
        BookingFormPanel.add(lb12);
        BookingFormPanel.add(tf12);
        BookingFormPanel.add(r11);
        BookingFormPanel.add(r12);
         
         int result = JOptionPane.showConfirmDialog(BookingFormFrame,BookingFormPanel,"Booking Form",JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
          if(result==JOptionPane.OK_OPTION)
           {
           
        	   String name1,name2,name3,name4,name5,name6;
        	   
        	   int age1,age2,age3,age4,age5,age6;
        	   String g1,g2,g3,g4,g5,g6;
        	   
        	   int s1,s2,s3,s4,s5,s6;
           
               String booking_user=luser;
              // System.out.println(t1.getText());
               
         
         String insertQuery;
         int i=1,j=1,k=1,l=1,m=1,n=1;
               
                int remaining_seat=avail_seat-(cnt-1);
              int price_paid=(cnt-1)*totalfare;
               try
           {
               	String conStr = "jdbc:ucanaccess://E:\\Studies\\java\\Reservation\\src\\BusReservation.accdb;memory=true";
              		Connection conn=DriverManager.getConnection(conStr);
                   Statement stat = conn.createStatement();  
                   
                   insertQuery = "insert into bus_booking(bus_no,booking_user,Seats,price_paid) values('"+busno+"','" + booking_user + "','" +(cnt-1)  + "','"+price_paid+"')";
                   i= stat.executeUpdate(insertQuery);
                   String selectQuery1 = "select Booking_id from bus_booking where bus_no='"+busno+"' and booking_user='"+booking_user+"' and Seats='"+(cnt-1)+"' and price_paid= '"+price_paid+"'";
                   ResultSet rs=stat.executeQuery(selectQuery1);
                   while(rs.next())
                   {
                   bookingid=rs.getString("Booking_id");
                   }
                   switch(cnt)
                   {
                   case 2:
                	   name1=tf1.getText();
                       age1=Integer.parseInt(tf7.getText());
                       s1=al.get(0);
                      r1.setActionCommand("male");
                      r2.setActionCommand("female");
                      g1= bg1.getSelection().getActionCommand();
                      insertQuery = "insert into seat_details(Booking_id,bus_no,booking_user,name,seat_no,age,gender) values('"+bookingid+"','"+busno+"','" + booking_user + "','" +name1  + "','"+s1+"','" + age1 + "','" + g1 + "')";
          	           i= stat.executeUpdate(insertQuery);
                	   break;
                   case 3:
                	   name1=tf1.getText();
                       age1=Integer.parseInt(tf7.getText());
                      r1.setActionCommand("male");
                      r2.setActionCommand("female");
                      g1= bg1.getSelection().getActionCommand();
                     
                      s1=al.get(0);
                      s2=al.get(1);
                      name2=tf2.getText();
                      age2=Integer.parseInt(tf8.getText());
                     r3.setActionCommand("male");
                     r4.setActionCommand("female");
                     g2= bg2.getSelection().getActionCommand();
                     insertQuery = "insert into seat_details(Booking_id,bus_no,booking_user,name,seat_no,age,gender) values('"+bookingid+"','"+busno+"','" + booking_user + "','" +name1  + "','"+s1+"','" + age1 + "','" + g1 + "')";
       	           i= stat.executeUpdate(insertQuery);
       	           insertQuery = "insert into seat_details(Booking_id,bus_no,booking_user,name,seat_no,age,gender) values('"+bookingid+"','"+busno+"','" + booking_user + "','" +name2  + "','"+s2+"','" + age2 + "','" + g2 + "')";
       	           j= stat.executeUpdate(insertQuery);
                	    break;
                   case 4:
                	   
                	   name1=tf1.getText();
                       age1=Integer.parseInt(tf7.getText());
                      r1.setActionCommand("male");
                      r2.setActionCommand("female");
                      g1= bg1.getSelection().getActionCommand();
                     
                      name2=tf2.getText();
                      age2=Integer.parseInt(tf8.getText());
                     r3.setActionCommand("male");
                     r4.setActionCommand("female");
                     g2= bg2.getSelection().getActionCommand();
                    
                     s1=al.get(0);
                     s2=al.get(1);
                     s3=al.get(2);
                     
                     
                     name3=tf3.getText();
                     age3=Integer.parseInt(tf9.getText());
                    r5.setActionCommand("male");
                    r6.setActionCommand("female");
                    g3= bg3.getSelection().getActionCommand();
                    insertQuery = "insert into seat_details(Booking_id,bus_no,booking_user,name,seat_no,age,gender) values('"+bookingid+"','"+busno+"','" + booking_user + "','" +name1  + "','"+s1+"','" + age1 + "','" + g1 + "')";
     	           i= stat.executeUpdate(insertQuery);
     	           insertQuery = "insert into seat_details(Booking_id,bus_no,booking_user,name,seat_no,age,gender) values('"+bookingid+"','"+busno+"','" + booking_user + "','" +name2  + "','"+s2+"','" + age2 + "','" + g2 + "')";
     	           j= stat.executeUpdate(insertQuery);
     	           insertQuery = "insert into seat_details(Booking_id,bus_no,booking_user,name,seat_no,age,gender) values('"+bookingid+"','"+busno+"','" + booking_user + "','" +name3  + "','"+s3+"','" + age3 + "','" + g3 + "')";
     	           k= stat.executeUpdate(insertQuery);
            	       break;
                   case 5:
                	   name1=tf1.getText();
                       age1=Integer.parseInt(tf7.getText());
                      r1.setActionCommand("male");
                      r2.setActionCommand("female");
                      g1= bg1.getSelection().getActionCommand();
                     
                      name2=tf2.getText();
                      age2=Integer.parseInt(tf8.getText());
                     r3.setActionCommand("male");
                     r4.setActionCommand("female");
                     g2= bg2.getSelection().getActionCommand();
                    
                     name3=tf3.getText();
                     age3=Integer.parseInt(tf9.getText());
                    r5.setActionCommand("male");
                    r6.setActionCommand("female");
                    g3= bg3.getSelection().getActionCommand();
                   
                    s1=al.get(0);
                    s2=al.get(1);
                    s3=al.get(2);
                    s4=al.get(3);
                    
                    name4=tf4.getText();
                    age4=Integer.parseInt(tf10.getText());
                   r7.setActionCommand("male");
                   r8.setActionCommand("female");
                   g4= bg4.getSelection().getActionCommand();
                   insertQuery = "insert into seat_details(Booking_id,bus_no,booking_user,name,seat_no,age,gender) values('"+bookingid+"','"+busno+"','" + booking_user + "','" +name1  + "','"+s1+"','" + age1 + "','" + g1 + "')";
    	           i= stat.executeUpdate(insertQuery);
    	           insertQuery = "insert into seat_details(Booking_id,bus_no,booking_user,name,seat_no,age,gender) values('"+bookingid+"','"+busno+"','" + booking_user + "','" +name2  + "','"+s2+"','" + age2 + "','" + g2 + "')";
    	           j= stat.executeUpdate(insertQuery);
    	           insertQuery = "insert into seat_details(Booking_id,bus_no,booking_user,name,seat_no,age,gender) values('"+bookingid+"','"+busno+"','" + booking_user + "','" +name3  + "','"+s3+"','" + age3 + "','" + g3 + "')";
    	           k= stat.executeUpdate(insertQuery);
    	           insertQuery = "insert into seat_details(Booking_id,bus_no,booking_user,name,seat_no,age,gender) values('"+bookingid+"','"+busno+"','" + booking_user + "','" +name4  + "','"+s4+"','" + age4 + "','" + g4 + "')";
    	           l= stat.executeUpdate(insertQuery);
            	       break;
                   case 6:
                	   name1=tf1.getText();
                       age1=Integer.parseInt(tf7.getText());
                      r1.setActionCommand("male");
                      r2.setActionCommand("female");
                      g1= bg1.getSelection().getActionCommand();
                     
                      name2=tf2.getText();
                      age2=Integer.parseInt(tf8.getText());
                     r3.setActionCommand("male");
                     r4.setActionCommand("female");
                     g2= bg2.getSelection().getActionCommand();
                    
                     name3=tf3.getText();
                     age3=Integer.parseInt(tf9.getText());
                    r5.setActionCommand("male");
                    r6.setActionCommand("female");
                    g3= bg3.getSelection().getActionCommand();
                   
                    name4=tf4.getText();
                    age4=Integer.parseInt(tf10.getText());
                   r7.setActionCommand("male");
                   r8.setActionCommand("female");
                   g4= bg4.getSelection().getActionCommand();
                  
                   s1=al.get(0);
                   s2=al.get(1);
                   s3=al.get(2);
                   s4=al.get(3);
                   s5=al.get(4);
                   name5=tf5.getText();
                   age5=Integer.parseInt(tf11.getText());
                  r9.setActionCommand("male");
                  r10.setActionCommand("female");
                  g5= bg5.getSelection().getActionCommand();
                 
                  insertQuery = "insert into seat_details(Booking_id,bus_no,booking_user,name,seat_no,age,gender) values('"+bookingid+"','"+busno+"','" + booking_user + "','" +name1  + "','"+s1+"','" + age1 + "','" + g1 + "')";
    	           i= stat.executeUpdate(insertQuery);
    	           insertQuery = "insert into seat_details(Booking_id,bus_no,booking_user,name,seat_no,age,gender) values('"+bookingid+"','"+busno+"','" + booking_user + "','" +name2  + "','"+s2+"','" + age2 + "','" + g2 + "')";
    	           j= stat.executeUpdate(insertQuery);
    	           insertQuery = "insert into seat_details(Booking_id,bus_no,booking_user,name,seat_no,age,gender) values('"+bookingid+"','"+busno+"','" + booking_user + "','" +name3  + "','"+s3+"','" + age3 + "','" + g3 + "')";
    	           k= stat.executeUpdate(insertQuery);
    	           insertQuery = "insert into seat_details(Booking_id,bus_no,booking_user,name,seat_no,age,gender) values('"+bookingid+"','"+busno+"','" + booking_user + "','" +name4  + "','"+s4+"','" + age4 + "','" + g4 + "')";
    	           l= stat.executeUpdate(insertQuery);
    	           insertQuery = "insert into seat_details(Booking_id,bus_no,booking_user,name,seat_no,age,gender) values('"+bookingid+"','"+busno+"','" + booking_user + "','" +name5  + "','"+s5+"','" + age5 + "','" + g5 + "')";
 	               m= stat.executeUpdate(insertQuery);
            	       break;
                   case 7:
                	   name1=tf1.getText();
                       age1=Integer.parseInt(tf7.getText());
                      r1.setActionCommand("male");
                      r2.setActionCommand("female");
                      g1= bg1.getSelection().getActionCommand();
                     
                      name2=tf2.getText();
                      age2=Integer.parseInt(tf8.getText());
                     r3.setActionCommand("male");
                     r4.setActionCommand("female");
                     g2= bg2.getSelection().getActionCommand();
                    
                     name3=tf3.getText();
                     age3=Integer.parseInt(tf9.getText());
                    r5.setActionCommand("male");
                    r6.setActionCommand("female");
                    g3= bg3.getSelection().getActionCommand();
                   
                    s1=al.get(0);
                    s2=al.get(1);
                    s3=al.get(2);
                    s4=al.get(3);
                    s5=al.get(4);
                    s6=al.get(5);
                    
                    name4=tf4.getText();
                    age4=Integer.parseInt(tf10.getText());
                   r7.setActionCommand("male");
                   r8.setActionCommand("female");
                   g4= bg4.getSelection().getActionCommand();
                  
                   name5=tf5.getText();
                   age5=Integer.parseInt(tf11.getText());
                  r9.setActionCommand("male");
                  r10.setActionCommand("female");
                  g5= bg5.getSelection().getActionCommand();
                  
                  name6=tf6.getText();
                  age6=Integer.parseInt(tf12.getText());
                 r11.setActionCommand("male");
                 r12.setActionCommand("female");
                 g6= bg6.getSelection().getActionCommand();
                 
                   insertQuery = "insert into seat_details(Booking_id,bus_no,booking_user,name,seat_no,age,gender) values('"+bookingid+"','"+busno+"','" + booking_user + "','" +name1  + "','"+s1+"','" + age1 + "','" + g1 + "')";
     	           i= stat.executeUpdate(insertQuery);
     	           insertQuery = "insert into seat_details(Booking_id,bus_no,booking_user,name,seat_no,age,gender) values('"+bookingid+"','"+busno+"','" + booking_user + "','" +name2  + "','"+s2+"','" + age2 + "','" + g2 + "')";
     	           j= stat.executeUpdate(insertQuery);
     	           insertQuery = "insert into seat_details(Booking_id,bus_no,booking_user,name,seat_no,age,gender) values('"+bookingid+"','"+busno+"','" + booking_user + "','" +name3  + "','"+s3+"','" + age3 + "','" + g3 + "')";
     	           k= stat.executeUpdate(insertQuery);
     	           insertQuery = "insert into seat_details(Booking_id,bus_no,booking_user,name,seat_no,age,gender) values('"+bookingid+"','"+busno+"','" + booking_user + "','" +name4  + "','"+s4+"','" + age4 + "','" + g4 + "')";
     	           l= stat.executeUpdate(insertQuery);
     	           insertQuery = "insert into seat_details(Booking_id,bus_no,booking_user,name,seat_no,age,gender) values('"+bookingid+"','"+busno+"','" + booking_user + "','" +name5  + "','"+s5+"','" + age5 + "','" + g5 + "')";
  	               m= stat.executeUpdate(insertQuery);
  	               insertQuery = "insert into seat_details(Booking_id,bus_no,booking_user,name,seat_no,age,gender) values('"+bookingid+"','"+busno+"','" + booking_user + "','" +name6  + "','"+s6+"','" + age6 + "','" + g6 + "')";
	               n= stat.executeUpdate(insertQuery);
            	       break;   
                   }
            // String insertQuery = "insert into bus_booking(booking_user,journey_date,bus_no,Seats,price_paid,id_no,first_tname,last_name) values('" + booking_user + "','" +depart_date  + "','" + bus + "','" + seat + "','" + price_paid + "','" + id + "','" + first_tname + "','" + last_name + "')";
              
           // int a= stat.executeUpdate(insertQuery);
            System.out.println(1);
            if(i==1 && j==1 && k==1 && l==1&& m==1 && n==1)
            {
              String updateQuery="update bus_details set total_seat='"+remaining_seat+"' where bus_no='"+busno+"'";
              int a=stat.executeUpdate(updateQuery);
              System.out.println(j);
              if(a==1)
              {
            dispose();      
          ConformBooking sc=new ConformBooking(busno,bookingid,cnt);
           sc.setLocationRelativeTo(null);
           sc.setVisible(true);
              
              }
            
             
                  
              
           }
           }
           catch(Exception e)
                   {
                       System.out.println(e);
                   }
               
           }
        
        }	
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
            java.util.logging.Logger.getLogger(SeatSelections.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeatSelections.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeatSelections.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeatSelections.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeatSelections().setVisible(true);
            }
        });
    }
    GridLayout gl; 
    public JFrame BookingFormFrame;
    public JFrame seatselect;
    public JPanel BookingFormPanel;
    public JPanel panel;
    public JLabel l1,l2,l3,l4,l5,l6,l7,l8,l11,l12,l13,l14,l15,l16,l17,l18,seatnoL,idnoL,fnameL,lnameL;
    public JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8,lb9,lb10,lb11,lb12;
    public JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10,tf11,tf12;
    public JRadioButton r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12;
    public ButtonGroup bg1,bg2,bg3,bg4,bg5,bg6;
    public JComboBox seatCB;
    public JTextField t1,t2,t3,t4;
    public JButton btnNewButton;
}
