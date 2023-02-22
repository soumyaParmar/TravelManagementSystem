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
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.Image;
import java.sql.*;	
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class DeleteCustomer extends JFrame implements ActionListener {
	private JPanel contentPane;
        Choice c1;
        static String username;
        JLabel lblName,lb3,lblId,l2,lb2,l3,lblName_1,l4,lblGender,l5,lblCountry,l6,lblReserveRoomNumber,l7,lblCheckInStatus,l8,lblDeposite,l9 ;
        JButton b1,btnNewButton,btnExit;
	
	public static void main(String[] args)  {
            new DeleteCustomer(username);
		
	}

	public DeleteCustomer(String username) {
            this.username=username;
		setBounds(580, 220, 850, 550);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/delete.png"));
                Image i3 = i1.getImage().getScaledInstance(300, 300,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel l1 = new JLabel(i2);
                l1.setBounds(500,100,300,300);
                add(l1);
		
		 lblName = new JLabel("DELETE CUSTOMER DETAILS");
		lblName.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
		lblName.setBounds(118, 11, 300, 53);
		contentPane.add(lblName);
                
                 lb3 = new JLabel("Username :");
		lb3.setBounds(35, 70, 200, 14);
		contentPane.add(lb3);
                
                c1 = new Choice();
                Conn c = new Conn();
                try{

                    ResultSet rs = c.s.executeQuery("select * from customer");
                    while(rs.next()){
                        c1.add(rs.getString("username"));
                    }

                    rs.close();
                }catch(SQLException e){}

                c1.setBounds(271, 70, 150, 30);
                add(c1);
                
                 lblId = new JLabel("ID :");
		lblId.setBounds(35, 110, 200, 14);
		contentPane.add(lblId);
                
                 l2 = new JLabel();
		l2.setBounds(271, 110, 200, 14);
		contentPane.add(l2);
                
                 lb2 = new JLabel("Number :");
		lb2.setBounds(35, 150, 200, 14);
		contentPane.add(lb2);
                
                 l3 = new JLabel();
		l3.setBounds(271, 150, 200, 14);
		contentPane.add(l3);
		
		 lblName_1 = new JLabel("Name :");
		lblName_1.setBounds(35, 190, 200, 14);
		contentPane.add(lblName_1);
		
		 l4 = new JLabel();
		l4.setBounds(271, 190, 200, 14);
		contentPane.add(l4);

                
		 lblGender = new JLabel("Gender :");
		lblGender.setBounds(35, 230, 200, 14);
		contentPane.add(lblGender);
                
                 l5 = new JLabel();
		l5.setBounds(271, 230, 200, 14);
		contentPane.add(l5);
                
		 lblCountry = new JLabel("Country :");
		lblCountry.setBounds(35, 270, 200, 14);
		contentPane.add(lblCountry);
                
                 l6 = new JLabel();
		l6.setBounds(271, 270, 200, 14);
		contentPane.add(l6);
		
		 lblReserveRoomNumber = new JLabel("Permanent Address :");
		lblReserveRoomNumber.setBounds(35, 310, 200, 14);
		contentPane.add(lblReserveRoomNumber);
                
                 l7 = new JLabel();
		l7.setBounds(271, 310, 200, 14);
		contentPane.add(l7);
           	
		 lblCheckInStatus = new JLabel("Phone :");
		lblCheckInStatus.setBounds(35, 350, 200, 14);
		contentPane.add(lblCheckInStatus);
                
                 l8 = new JLabel();
		l8.setBounds(271, 350, 200, 14);
		contentPane.add(l8);

		
		 lblDeposite = new JLabel("Email :");
		lblDeposite.setBounds(35, 390, 200, 14);
		contentPane.add(lblDeposite);
		
		 l9 = new JLabel();
		l9.setBounds(271, 390, 200, 14);
		contentPane.add(l9);

		
		 b1 = new JButton("Check");
		b1.addActionListener(this); 
		
		b1.setBounds(425, 70, 80, 22);
                b1.setBackground(Color.BLACK);
                b1.setForeground(Color.WHITE);
		contentPane.add(b1);
		

		 btnNewButton = new JButton("Delete");
		btnNewButton.addActionListener(this);
		
		btnNewButton.setBounds(100, 430, 120, 30);
                btnNewButton.setBackground(Color.BLACK);
                btnNewButton.setForeground(Color.WHITE);
		contentPane.add(btnNewButton);
		
		 btnExit = new JButton("Back");
		btnExit.addActionListener(this);
			
		btnExit.setBounds(260, 430, 120, 30);
                btnExit.setBackground(Color.BLACK);
                btnExit.setForeground(Color.WHITE);
		contentPane.add(btnExit);
                
                getContentPane().setBackground(Color.WHITE);
                setVisible(true);
	}
        
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==b1){
                 Conn c = new Conn();
                           
                            try{
                                String s1 = c1.getSelectedItem(); 
                                ResultSet rs = c.s.executeQuery("select * from customer where username = '"+username+"'");
                                if(rs.next()){
                                    l2.setText(rs.getString(2));  
                                    l3.setText(rs.getString(3));
                                    l4.setText(rs.getString(4));  
                                    l5.setText(rs.getString(5));
                                    l6.setText(rs.getString(6));  
                                    l7.setText(rs.getString(7));
                                    l8.setText(rs.getString(8));  
                                    l9.setText(rs.getString(9));
                                }
                            }catch(Exception ee){ 
                                ee.printStackTrace();
                               
                            }
            }
            else if(e.getSource()==btnNewButton){
                Conn c = new Conn();
                           
                          
                            try{
	    			String s1 = c1.getSelectedItem(); 
                                
                                String q1 = "update from customer where username = '"+lb3.getText()+"'";
                                c.s.executeUpdate(q1);
                                
	    			JOptionPane.showMessageDialog(null, "Customer Detail Deleted Successfully");
                                setVisible(false);
	    		}catch(Exception e1){
	    			e1.printStackTrace();
	    		}
		    		
            }
            else if(e.getSource()==btnExit ){
                setVisible(false);
            }
        }

    
    
}
