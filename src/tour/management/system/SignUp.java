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
import javax.swing.border.*;

public class SignUp extends JFrame implements ActionListener{

     JPanel contentPane;
     JTextField textField;
     JTextField textField_1;
     JTextField textField_2;
     JTextField textField_3;
     JButton b1, b2;
     Choice  security;


    public static void main(String[] args) {
        new SignUp();
    }

    public SignUp() {
        setBounds(350, 200, 500, 360);
	getContentPane().setBackground(Color.WHITE);
	setLayout(null);
        
        JPanel panel = new JPanel();
	panel.setBounds(0, 0, 500, 400);
        panel.setBackground(new Color(133,193,233));
        panel.setLayout(null);
	add(panel);
        
        
	JLabel lblUsername = new JLabel("Username :");
	lblUsername.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblUsername.setBounds(50, 20, 125, 25);
	panel.add(lblUsername);
        
        textField = new JTextField();
	textField.setBounds(190, 20, 180, 25);
        textField.setBorder(BorderFactory.createEmptyBorder());
	panel.add(textField);
	textField.setColumns(10);


	JLabel lblName = new JLabel("Name :");
	lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblName.setBounds(50, 60, 125, 25);
	panel.add(lblName);
        
        textField_1 = new JTextField();
	textField_1.setBounds(190, 60, 180, 25);
        textField_1.setBorder(BorderFactory.createEmptyBorder());
	panel.add(textField_1);

	JLabel lblPassword = new JLabel("Password :");
	lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblPassword.setBounds(50, 100, 125, 25);
	panel.add(lblPassword);
        
        textField_2 = new JTextField();
	textField_2.setBounds(190, 100, 180, 25);
        textField_2.setBorder(BorderFactory.createEmptyBorder());
	panel.add(textField_2);
        
        JLabel lblSecurityQuestion = new JLabel("Security Question:");
	lblSecurityQuestion.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblSecurityQuestion.setBounds(50, 140, 140, 25);
	panel.add(lblSecurityQuestion);
        
        security = new Choice();
        security.setBounds(190,140,180,25);
        security.add("Your NickName?");
        security.add("HomeTown ?");
        security.add("Fav Movie");
        security.add("Fav Place");
        panel.add(security);

	JLabel lblAnswer = new JLabel("Answer :");
	lblAnswer.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblAnswer.setBounds(50, 180, 92, 26);
	panel.add(lblAnswer);
        
        textField_3 = new JTextField();
	textField_3.setBounds(190, 180, 180, 25);
        textField_3.setBorder(BorderFactory.createEmptyBorder());
	panel.add(textField_3);

	
        
       
        
 

	b1 = new JButton("Create");
	b1.addActionListener(this);
	b1.setFont(new Font("Tahoma", Font.BOLD, 14));
	b1.setBounds(80, 250, 100, 30);
        b1.setForeground(new Color(133,193,233));
        b1.setBackground(Color.WHITE);
	panel.add(b1);

	b2 = new JButton("Back");
	b2.addActionListener(this);
	b2.setFont(new Font("Tahoma", Font.BOLD, 13));
	b2.setBounds(250, 250, 100, 30);
	b2.setBackground(Color.BLACK);
        b2.setForeground(new Color(133,193,233));
	panel.add(b2);
        
        

        setVisible(true);
	
    }
    
    public void actionPerformed(ActionEvent ae){
         if(ae.getSource() == b1){
             String username  = textField.getText();
             String name = textField_1.getText();
             String pass = textField_2.getText();
             String quest = security.getSelectedItem();
             String ans = textField_3.getText();
             
                String querry = "insert into account values('"+username+"', '"+name+"', '"+pass+"', '"+quest+"', '"+ans+"')";
		
        try{
            Conn con = new Conn();
            con.s.executeUpdate(querry);
            
            JOptionPane.showMessageDialog(null, "Account Created Successfully ");
                setVisible(false);
                new Login();
        }catch(Exception e){
            e.printStackTrace();
        }
       }
         if(ae.getSource() == b2){
                this.setVisible(false);
                new Login().setVisible(true);
			
            }

    }
}