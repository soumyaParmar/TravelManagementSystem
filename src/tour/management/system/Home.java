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
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Home extends JFrame implements ActionListener{
    static String username;
    JButton about,UpdatePersonalDetails,ViewPersonalDetails,deletePersonalDetails,CheckPackages,bookPackages,viewPackages,viewHotel,bookHotel,ViewbookHotel,Destination,addup;
    public static void main(String[] args) {
        new Home(username);
    }
    
    public Home(String username) {
        this.username = username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0,0,1600,65);
        add(p1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png" ));
        Image i2 = i1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(5,0,70,70);
        p1.add(icon);
        
        JLabel heading = new JLabel("THANK YOU FOR VISITING");
        heading.setBounds(80,10,500,40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma",Font.BOLD,30));
        p1.add(heading);
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0,65,300,900);
        add(p2);
        
        addup = new JButton("FILL DETAILS HERE");
        addup.setBounds(0,0,300,60);
        addup.setBackground(Color.RED);
        addup.setForeground(Color.WHITE);
        addup.setFont(new Font("Tahoma",Font.BOLD,20));
        addup.addActionListener(this);
        p2.add(addup);
        
        about = new JButton("About us");
        about.setBounds(0,600,300,50);
        about.setBackground(new Color(0,0,102));
        about.setForeground(Color.WHITE);
        about.setFont(new Font("Tahoma",Font.BOLD,20));
        about.addActionListener(this);
        p2.add(about);
        
         UpdatePersonalDetails = new JButton("Update Details");
        UpdatePersonalDetails.setBounds(0,100,300,50);
        UpdatePersonalDetails.setBackground(new Color(0,0,102));
        UpdatePersonalDetails.setForeground(Color.WHITE);
        UpdatePersonalDetails.setFont(new Font("Tahoma",Font.BOLD,20));
        UpdatePersonalDetails.addActionListener(this);
        p2.add(UpdatePersonalDetails);
        
         ViewPersonalDetails = new JButton("View Details");
        ViewPersonalDetails.setBounds(0,150,300,50);
        ViewPersonalDetails.setBackground(new Color(0,0,102));
        ViewPersonalDetails.setForeground(Color.WHITE);
        ViewPersonalDetails.setFont(new Font("Tahoma",Font.BOLD,20));
        ViewPersonalDetails.addActionListener(this);
        p2.add(ViewPersonalDetails);
        
         deletePersonalDetails = new JButton("Delete Details");
        deletePersonalDetails.setBounds(0,200,300,50);
        deletePersonalDetails.setBackground(new Color(0,0,102));
        deletePersonalDetails.setForeground(Color.WHITE);
        deletePersonalDetails.setFont(new Font("Tahoma",Font.BOLD,20));
        deletePersonalDetails.addActionListener(this);
        p2.add(deletePersonalDetails);
        
         CheckPackages = new JButton("Check Packages");
        CheckPackages.setBounds(0,250,300,50);
        CheckPackages.setBackground(new Color(0,0,102));
        CheckPackages.setForeground(Color.WHITE);
        CheckPackages.setFont(new Font("Tahoma",Font.BOLD,20));
        CheckPackages.addActionListener(this);
        p2.add(CheckPackages);
        
         bookPackages = new JButton("Book Packages");
        bookPackages.setBounds(0,300,300,50);
        bookPackages.setBackground(new Color(0,0,102));
        bookPackages.setForeground(Color.WHITE);
        bookPackages.setFont(new Font("Tahoma",Font.BOLD,20));
        bookPackages.addActionListener(this);
        p2.add(bookPackages);  
        
          viewPackages = new JButton("View Packages");
        viewPackages.setBounds(0,350,300,50);
        viewPackages.setBackground(new Color(0,0,102));
        viewPackages.setForeground(Color.WHITE);
        viewPackages.setFont(new Font("Tahoma",Font.BOLD,20));
        viewPackages.addActionListener(this);
        p2.add(viewPackages);  
        
          viewHotel = new JButton("View Hotels");
        viewHotel.setBounds(0,400,300,50);
        viewHotel.setBackground(new Color(0,0,102));
        viewHotel.setForeground(Color.WHITE);
        viewHotel.setFont(new Font("Tahoma",Font.BOLD,20));
        viewHotel.addActionListener(this);
        p2.add(viewHotel);  
        
         bookHotel = new JButton("Book Hotel");
        bookHotel.setBounds(0,450,300,50);
        bookHotel.setBackground(new Color(0,0,102));
        bookHotel.setForeground(Color.WHITE);
        bookHotel.setFont(new Font("Tahoma",Font.BOLD,20));
        bookHotel.addActionListener(this);
        p2.add(bookHotel); 
        
         ViewbookHotel = new JButton("Booked Hotel");
        ViewbookHotel.setBounds(0,500,300,50);
        ViewbookHotel.setBackground(new Color(0,0,102));
        ViewbookHotel.setForeground(Color.WHITE);
        ViewbookHotel.setFont(new Font("Tahoma",Font.BOLD,20));
        ViewbookHotel.addActionListener(this);
        p2.add(ViewbookHotel); 
        
         Destination = new JButton("Destinations");
        Destination.setBounds(0,550,300,50);
        Destination.setBackground(new Color(0,0,102));
        Destination.setForeground(Color.WHITE);
        Destination.setFont(new Font("Tahoma",Font.BOLD,20));
        Destination.addActionListener(this);
        p2.add(Destination);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/dash.jpg" ));
        Image i5 = i4.getImage().getScaledInstance(1650,1000,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel icon1 = new JLabel(i6);
        icon1.setBounds(0,0,1650,1000);
        add(icon1);
        
        JLabel text = new JLabel("Tours And Travel Management System");
        text.setBounds(950,750,1200,70);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("TimesRoman",Font.BOLD,30));
        icon1.add(text);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==addup){
            new AddDetails(username);
        }
        else if(e.getSource()==about){
            About about1 = new About();
        }
        else if(e.getSource()==ViewPersonalDetails ){
             new ViewCustomers(username);
        }
        else if(e.getSource() == UpdatePersonalDetails){
            new UpdateCustomer(username);
        }
        else if(e.getSource()==deletePersonalDetails){
            new DeleteCustomer(username);  
        }
        else if(e.getSource()==CheckPackages){
             new CheckPackage();
        }
        else if(e.getSource()==bookPackages){
            new BookPackage(username);
        }
        else if(e.getSource()==viewPackages){
            new ViewPackage(username);
        }
        else if(e.getSource()==viewHotel){
            new CheckHotels();
        }
        else if(e.getSource()==bookHotel){
            new BookHotel(username);
        }
        else if(e.getSource()==ViewbookHotel){
            new ViewBookedHotel(username);
        }
        else if(e.getSource()==Destination){
            new Destination();
        }
        
    }
}
