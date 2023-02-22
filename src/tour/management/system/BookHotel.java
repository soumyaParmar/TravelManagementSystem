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


public class BookHotel extends JFrame implements ActionListener {
	private JPanel contentPane;
        JTextField t1,t2;
        Choice c1,c2,c3;
        static String username;
        JButton b1,btnNewButton,btnExit;
        JLabel lblName,la2,l1,lblId,la3,la4,la5,la6,lbl1,l2,lbl2,l3,lbl3,l4,lblDeposite,l5;

	public static void main(String[] args) {
            new BookHotel(username);
	}

	public BookHotel(String username) {
            this.username=username;
		setBounds(420, 220, 1100, 600);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/skadi.jpeg"));
                Image i3 = i1.getImage().getScaledInstance(500, 300,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel la1 = new JLabel(i2);
                la1.setBounds(450,100,700,300);
                add(la1);
		
		 lblName = new JLabel("BOOK HOTEL");
		lblName.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
		lblName.setBounds(118, 11, 300, 53);
		contentPane.add(lblName);
                
                 la2 = new JLabel("Username :");
		la2.setBounds(35, 70, 200, 14);
		contentPane.add(la2);
                
                 l1 = new JLabel(username);
		l1.setBounds(271, 70, 200, 14);
		contentPane.add(l1);
                
                 lblId = new JLabel("Select Hotel :");
		lblId.setBounds(35, 110, 200, 14);
		contentPane.add(lblId);
                
                c1 = new Choice();
                Conn c = new Conn();
                try{

                    ResultSet rs = c.s.executeQuery("select * from hotels");
                    while(rs.next()){
                        c1.add(rs.getString("name"));
                    }

                    rs.close();
                }catch(SQLException e){}

                c1.setBounds(271, 110, 150, 30);
                add(c1);
                
                 la3 = new JLabel("Total Persons");
		la3.setBounds(35, 150, 200, 14);
		contentPane.add(la3);
                
                t1 = new JTextField();
                t1.setText("0");
		t1.setBounds(271, 150, 150, 20);
		contentPane.add(t1);
		t1.setColumns(10);
                
                 la4 = new JLabel("Number of Days");
                la4.setBounds(35, 190, 200, 14);
		contentPane.add(la4);
		
		t2 = new JTextField();
		t2.setText("0");
		t2.setBounds(271, 190, 150, 20);
		contentPane.add(t2);
		t2.setColumns(10);
		
		 la5 = new JLabel("AC / Non-AC");
		la5.setBounds(35, 230, 200, 14);
		contentPane.add(la5);
                
                c2 = new Choice();
                c2.add("AC");
                c2.add("Non-AC");
                c2.setBounds(271, 230, 150, 30);
                add(c2);

                
		 la6 = new JLabel("Food Included :");
		la6.setBounds(35, 270, 200, 14);
		contentPane.add(la6);
                
                c3 = new Choice();
                c3.add("Yes");
                c3.add("No");
                c3.setBounds(271, 270, 150, 30);
                add(c3);
                
		 lbl1 = new JLabel("ID :");
		lbl1.setBounds(35, 310, 200, 14);
		contentPane.add(lbl1);
                
                 l2 = new JLabel();
		l2.setBounds(271, 310, 200, 14);
		contentPane.add(l2);
		
		 lbl2 = new JLabel("Number :");
		lbl2.setBounds(35, 350, 200, 14);
		contentPane.add(lbl2);
                
                 l3 = new JLabel();
		l3.setBounds(271, 350, 200, 14);
		contentPane.add(l3);
           	
		 lbl3 = new JLabel("Phone :");
		lbl3.setBounds(35, 390, 200, 14);
		contentPane.add(lbl3);
                
                 l4 = new JLabel();
		l4.setBounds(271, 390, 200, 14);
		contentPane.add(l4);

		
		 lblDeposite = new JLabel("Total Price :");
		lblDeposite.setBounds(35, 430, 200, 14);
		contentPane.add(lblDeposite);
		
		 l5 = new JLabel();
		l5.setBounds(271, 430, 200, 14);
                l5.setForeground(Color.RED);
		contentPane.add(l5);
                
                try{

                    ResultSet rs = c.s.executeQuery("select * from customer where username = '"+username+"'");
                    while(rs.next()){
                        l2.setText(rs.getString("id"));
                        l3.setText(rs.getString("number"));
                        l4.setText(rs.getString("phone"));
                        
                    }

                    rs.close();
                }catch(SQLException e){}
                
                 b1 = new JButton("Check Price");
		b1.addActionListener(this);
			
		
		b1.setBounds(50, 470, 120, 30);
                b1.setBackground(Color.BLACK);
                b1.setForeground(Color.WHITE);
		contentPane.add(b1);
		

		 btnNewButton = new JButton("Book");
		btnNewButton.addActionListener(this); 
	
		btnNewButton.setBounds(200, 470, 120, 30);
                btnNewButton.setBackground(Color.BLACK);
                btnNewButton.setForeground(Color.WHITE);
		contentPane.add(btnNewButton);
		
		 btnExit = new JButton("Back");
		btnExit.addActionListener(this);
		
		btnExit.setBounds(350, 470, 120, 30);
                btnExit.setBackground(Color.BLACK);
                btnExit.setForeground(Color.WHITE);
		contentPane.add(btnExit);
                
                getContentPane().setBackground(Color.WHITE);
                setVisible(true);
	}
         public void actionPerformed(ActionEvent e){
             if(e.getSource()==btnNewButton){
                 Conn c = new Conn();
                           
                          
                            try{
	    			String s1 = c1.getSelectedItem(); 
                                
                                String q1 = "insert into bookHotel values('"+l1.getText()+"', '"+c1.getSelectedItem()+"', '"+t1.getText()+"', '"+t2.getText()+"', '"+c2.getSelectedItem()+"', '"+c3.getSelectedItem()+"', '"+l2.getText()+"', '"+l3.getText()+"', '"+l4.getText()+"', '"+l5.getText()+"')";
                                c.s.executeUpdate(q1);
                                
	    			JOptionPane.showMessageDialog(null, "Hotel Booked Successfully");
                                setVisible(false);
                            }catch(Exception ee){
	    			System.out.println(ee.getMessage());
                            }
             }
             else if(e.getSource() == b1){
                 Conn c = new Conn();
                           
                            try{
	    			String s1 = c1.getSelectedItem(); 
                                
                                String q1 = "select * from hotels where name = '"+c1.getSelectedItem()+"'";
                                ResultSet rs = c.s.executeQuery(q1);
                                if(rs.next()){
                                    
                                    int cost = Integer.parseInt(rs.getString("cost_per_day"));
                                    int food = Integer.parseInt(rs.getString("food_charges"));
                                    int ac = Integer.parseInt(rs.getString("ac_charges"));
                                    
                                    int persons = Integer.parseInt(t1.getText());
                                    int days = Integer.parseInt(t2.getText());
                                    
                                    String acprice = c2.getSelectedItem();
                                    String foodprice = c3.getSelectedItem();
                                    
                                    
                                    if(persons * days > 0) {
                                        int total = 0;
                                        total += acprice.equals("AC") ? ac : 1;
                                        total += foodprice.equals("Yes") ? food : 1;
                                        total += cost;
                                        total = total * persons * days;
                                        l5.setText("Rs "+total);
                                    }
                                    
                                    
                                }
                                
	    		}catch(Exception ee){
	    			System.out.println(ee.getMessage());
	    		}
             }
             else if(e.getSource()==btnExit){
                 setVisible(false);
             }
         } 
}
