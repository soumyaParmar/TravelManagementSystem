/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tour.management.system;

/**
 *
 * @author soumy
 */
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

public class ForgotPassword extends JFrame implements ActionListener{

    JPanel contentPane;
    JTextField t1,t2,t3,t4,t5;
    JButton b1,b2,b3;
    JLabel l1,l2,l3,l4,l5;

    public static void main(String[] args) {
	new ForgotPassword();
    }

    public ForgotPassword() {

        setBounds(350, 200, 850, 380);
        getContentPane().setBackground(Color.WHITE);
	setLayout(null);
        
        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("icons/forgotpassword.jpg"));
        Image i1 = c1.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        JLabel l6 = new JLabel(i2);
        l6.setBounds(580, 70, 200, 200);
        add(l6);
        
        contentPane = new JPanel();
        contentPane.setLayout(null);
        contentPane.setBounds(30,30,500,280);
        add(contentPane);

	 l1 = new JLabel("Username");
	l1.setFont(new Font("Tahoma", Font.BOLD, 13));
	l1.setBounds(40, 20, 100, 25);
	contentPane.add(l1);
        
        t1 = new JTextField();
	t1.setFont(new Font("Tahoma", Font.BOLD, 13));
	t1.setForeground(new Color(105, 105, 105));
	t1.setBounds(220, 20, 150, 25);
        t1.setBorder(BorderFactory.createEmptyBorder());
	contentPane.add(t1);
	t1.setColumns(10);
        
        b1 = new JButton("Search");
	b1.addActionListener(this);
	b1.setFont(new Font("Tahoma", Font.BOLD, 12));
	b1.setBounds(380, 20, 100, 25);
	b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        contentPane.add(b1);

	 l2 = new JLabel("Name");
	l2.setFont(new Font("Tahoma", Font.BOLD, 13));
	l2.setBounds(40, 60,100,25);
	contentPane.add(l2);
        
        t2 = new JTextField();
	t2.setEditable(false);
        t2.setBounds(220, 60, 150, 25);
	t2.setFont(new Font("Tahoma", Font.BOLD, 13));
        t2.setColumns(10);
        t2.setBorder(BorderFactory.createEmptyBorder());
	t2.setForeground(new Color(165, 42, 42));
	
	contentPane.add(t2);

	l3 = new JLabel("Security Question");
	l3.setFont(new Font("Tahoma", Font.BOLD, 13));
	l3.setBounds(40, 100, 150, 25);
	contentPane.add(l3);
        
        t3 = new JTextField();
	t3.setEditable(false);
	t3.setFont(new Font("Tahoma", Font.BOLD, 12));
	t3.setForeground(new Color(72, 61, 139));
	t3.setBounds(220, 100, 150, 25);
        t3.setBorder(BorderFactory.createEmptyBorder());
	contentPane.add(t3);

	l4 = new JLabel("Answer");
	l4.setFont(new Font("Tahoma", Font.BOLD, 13));
	l4.setBounds(40, 140, 150, 25);
	contentPane.add(l4);
        
        t4 = new JTextField();
	t4.setFont(new Font("Tahoma", Font.BOLD, 13));
	t4.setForeground(new Color(205, 92, 92));
	t4.setBounds(220, 140, 150, 25);
        t4.setBorder(BorderFactory.createEmptyBorder());
	contentPane.add(t4);

	l5 = new JLabel("Password");
	l5.setFont(new Font("Tahoma", Font.BOLD, 13));
	l5.setBounds(40, 180, 150, 25);
	contentPane.add(l5);

	t5 = new JTextField();
	t5.setEditable(false);
	t5.setFont(new Font("Tahoma", Font.BOLD, 13));
	t5.setForeground(new Color(50, 205, 50));
	t5.setBorder(BorderFactory.createEmptyBorder());
	t5.setBounds(220, 180, 150, 25);
	contentPane.add(t5);

	

	b2 = new JButton("Retrieve");
	b2.addActionListener(this);
	b2.setFont(new Font("Tahoma", Font.BOLD, 12));
	b2.setBounds(380, 140, 100, 25);
	b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
	contentPane.add(b2);

	b3 = new JButton("Back");
	b3.addActionListener(this);
	b3.setFont(new Font("Tahoma", Font.BOLD, 13));
	b3.setBounds(300, 230, 100, 25);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
	contentPane.add(b3);

        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        try{
        if(ae.getSource() == b1){
            
                String query = "select * from account where username ='"+t1.getText()+"'  ";
                Conn c= new Conn();
                ResultSet rs = c.s.executeQuery(query);
                
                while(rs.next()){
                    t2.setText(rs.getString("name"));
                    t3.setText(rs.getString("question"));
                }
            
        } if(ae.getSource() == b2){
            
                String query = "SELECT * FROM account where username = '"+t1.getText()+"'AND answer = '"+t4.getText()+"' ";
                Conn c= new Conn();
                ResultSet rs = c.s.executeQuery(query);
                
                while(rs.next()){
                    t5.setText(rs.getString("password"));
                }
            }
         if(ae.getSource()==b3){
            new Login().setVisible(true);
            setVisible(false);
            
        }
        }catch (Exception e){
                e.printStackTrace();
            }
    }
}