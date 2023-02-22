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
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener
{

	private JPanel panel;
	private JTextField textField;
	private JTextField passwordField;
        private JButton b1,b2,b3;
        static String username;
        


	public Login() {
            this.username=username;
            
	setBackground(new Color(255, 255, 204));	
        setBounds(400, 250, 700, 400);
		
        panel = new JPanel();
	panel.setBackground(Color.WHITE);
	setContentPane(panel);
	panel.setLayout(null);

	JLabel l1 = new JLabel("Username : ");
	l1.setBounds(124, 89, 95, 24);
	panel.add(l1);
        
        textField = new JTextField();
	textField.setBounds(210, 93, 157, 20);
	panel.add(textField);

	JLabel l2 = new JLabel("Password : ");
	l2.setBounds(124, 124, 95, 24);
	panel.add(l2);

	passwordField = new JTextField();
	passwordField.setBounds(210, 128, 157, 20);
	panel.add(passwordField);

	

        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i1 = c1.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        
        
        JLabel l6 = new JLabel(i2);
        l6.setBounds(480, 70, 150, 150);
        add(l6);
        
        
	b1 = new JButton("Login");
	b1.addActionListener((ActionListener) this);       
	b1.setForeground(new Color(46, 139, 87));
	b1.setBackground(new Color(176, 224, 230));
	b1.setBounds(149, 181, 113, 25);
	panel.add(b1);
		
        b2 = new JButton("SignUp");
	b2.addActionListener((ActionListener) this);
	b2.setForeground(new Color(139, 69, 19));
	b2.setBackground(new Color(255, 235, 205));
	b2.setBounds(289, 181, 113, 25);
	panel.add(b2);

	b3 = new JButton("Forgot Password");
	b3.addActionListener((ActionListener) this);
        b3.setForeground(new Color(205, 92, 92));
	b3.setBackground(new Color(253, 245, 230));
	b3.setBounds(199, 231, 179, 25);
	panel.add(b3);

	JLabel l5 = new JLabel("Trouble in Login?");
	l5.setFont(new Font("Tahoma", Font.PLAIN, 15));
	l5.setForeground(new Color(255, 0, 0));
	l5.setBounds(70, 235, 110, 20);
	panel.add(l5);

        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(255, 255, 204));
        panel2.setBounds(24, 40, 434, 263);
        panel.add(panel2);
        
        setVisible(true);
    }
       
     public void actionPerformed(ActionEvent ae){
            if(ae.getSource() == b1){
               
		try {
                    Conn con = new Conn();
                    
                    username = textField.getText();
                    String pass = passwordField.getText();
                    String sql = "select * from account where username='"+username+"' AND password='"+pass+"'";
                    ResultSet rs = con.s.executeQuery(sql);
                    if (rs.next()) {
                        setVisible(false);
                        new Loading(username);
                    } else
			JOptionPane.showMessageDialog(null, "Invalid Login or Password!");
                       
		} catch (Exception e2) {
                    e2.printStackTrace();
		}
            }
            if(ae.getSource() == b2){
                setVisible(false);
	        new SignUp();
		
            }   
            if(ae.getSource() == b3){
                setVisible(false);
		ForgotPassword forgot = new ForgotPassword();
		forgot.setVisible(true);
            }
        }
        
  	public static void main(String[] args) {
                new Login();
	}

}
    
        
   
