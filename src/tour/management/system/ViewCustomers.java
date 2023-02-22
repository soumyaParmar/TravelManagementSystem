/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tour.management.system;

/**
 *
 * @author soumy
 */
import java.awt.BorderLayout;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JTable;
import java.sql.*;	
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class ViewCustomers extends JFrame implements ActionListener {
	Connection conn = null;
	private JPanel contentPane;
	private JTable table;
	private JLabel lblAvailability;
	private JLabel lblCleanStatus;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblRoomNumber;
	private JLabel lblId;
        JButton b;
        static String username;
        JLabel lbl1,lbl2,lbl3,lbl4,lbl5,lbl6,lbl7,lbl8,lbl9;
	public static void main(String[] args) {
		new ViewCustomers(username);
	}

        public void actionPerformed(ActionEvent e){
            setVisible(false);
        }
	 ViewCustomers(String username) {
		this.username = username;
		
		setBounds(200, 50, 900, 680);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
                Image i3 = i1.getImage().getScaledInstance(626, 201,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel l1 = new JLabel(i2);
                l1.setBounds(0,450,626,201);
                add(l1);
                
                ImageIcon i4  = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
                Image i5 = i4.getImage().getScaledInstance(626, 201,Image.SCALE_DEFAULT);
                ImageIcon i6 = new ImageIcon(i5);
                JLabel l2 = new JLabel(i6);
                l2.setBounds(615,450,626,201);
                add(l2);
                
		
		lblAvailability = new JLabel("Username");
		lblAvailability.setBounds(30, 50, 150, 25);
		contentPane.add(lblAvailability);
                
                lbl1 = new JLabel();
		lbl1.setBounds(220, 50, 150, 25);
		contentPane.add(lbl1);
		
		lblCleanStatus = new JLabel("Id Type");
		lblCleanStatus.setBounds(30,110 , 150, 25);
		contentPane.add(lblCleanStatus);
                
                lbl2 = new JLabel();
		lbl2.setBounds(220, 110, 150, 25);
		contentPane.add(lbl2);
		
		lblNewLabel = new JLabel("Number");
		lblNewLabel.setBounds(30, 170, 150, 25);
		contentPane.add(lblNewLabel);
                
                lbl3 = new JLabel();
		lbl3.setBounds(220, 170, 150, 25);
		contentPane.add(lbl3);
		
		lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(30,230 , 150, 25);
		contentPane.add(lblNewLabel_1);
                
                lbl4 = new JLabel();
		lbl4.setBounds(220, 230, 150, 25);
		contentPane.add(lbl4);

		
		lblId = new JLabel("Gender");
		lblId.setBounds(30, 290, 150, 25);
		contentPane.add(lblId);
                
                lbl5 = new JLabel();
		lbl5.setBounds(220, 290, 150, 25);
		contentPane.add(lbl5);
                
                JLabel l3 = new JLabel("Country");
		l3.setBounds(500, 50, 150, 25);
		contentPane.add(l3);
                
                lbl6 = new JLabel();
		lbl6.setBounds(690, 50, 150, 25);
		contentPane.add(lbl6);
                
                JLabel l4 = new JLabel("Address");
		l4.setBounds(500, 110, 150, 25);
		contentPane.add(l4);
                
                lbl7 = new JLabel();
		lbl7.setBounds(690, 110, 150, 25);
		contentPane.add(lbl7);
                
                JLabel l5 = new JLabel("Phone");
		l5.setBounds(500, 170, 150, 25);
		contentPane.add(l5);
                
                lbl8 = new JLabel();
		lbl8.setBounds(690, 170, 150, 25);
		contentPane.add(lbl8);
                
                JLabel l6 = new JLabel("Email");
		l6.setBounds(500, 230, 150, 25);
		contentPane.add(l6);
                
                lbl9 = new JLabel( );
		lbl9.setBounds(690, 230, 150, 25);
		contentPane.add(lbl9);
                
                b = new JButton("Back");
                b.setBackground( Color.BLACK);
                b.setForeground(Color.WHITE);
                b.addActionListener(this);
                contentPane.add(b);
                
                try{
                    Conn con = new Conn();
                    String query = "select * from customer where username = '"+username+"' ";
                    ResultSet rs = con.s.executeQuery(query);
                    while(rs.next()){
                        lbl1.setText(rs.getString("username"));
                        lbl2.setText(rs.getString("id"));
                        lbl3.setText(rs.getString("number"));
                        lbl4.setText(rs.getString("name"));
                        lbl5.setText(rs.getString("gender"));
                        lbl6.setText(rs.getString("country"));
                        lbl7.setText(rs.getString("address"));
                        lbl8.setText(rs.getString("phone"));
                        lbl9.setText(rs.getString("email"));
                    }
                }catch(Exception e){
                    e.printStackTrace();
                }
                
                getContentPane().setBackground(Color.WHITE);
                setVisible(true);
	}

}
