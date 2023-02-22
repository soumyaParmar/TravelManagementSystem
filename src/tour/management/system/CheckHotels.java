/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tour.management.system;

/**
 *
 * @author soumy
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class CheckHotels extends JFrame implements Runnable {

    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19;
    JLabel caption;
    Thread th;

    public void run() {
        try {

            l2.setVisible(true);
            caption.setText("Hotel Saphire");
            l2.add(caption);
            Thread.sleep(2300);
            l2.setVisible(false);
            
            l3.setVisible(true);
            caption.setText("Hotel HOP Inn");
            l3.add(caption);
            Thread.sleep(2300);
            l3.setVisible(false);
            
            l4.setVisible(true);
            caption.setText("Auli");
            l4.add(caption);
            Thread.sleep(2300);
            l4.setVisible(false);
            
            l5.setVisible(true);
            caption.setText("Hotel Skadi");
            l5.add(caption);
            Thread.sleep(2300);
            l5.setVisible(false);
            
            l6.setVisible(true);
            caption.setText("Hotel HOP Inn");
            l6.add(caption);
            Thread.sleep(2300);
            l6.setVisible(false);
            
            l7.setVisible(true);
            caption.setText("HOP Inn Camp");
            l7.add(caption);
            Thread.sleep(2300);
            l7.setVisible(false);
            
            l8.setVisible(true);
            caption.setText("Hotel Skadi");
            l8.add(caption);
            Thread.sleep(2300);
            l8.setVisible(false);
            
            l9.setVisible(true);
            caption.setText("Skadi Camp");
            l9.add(caption);
            Thread.sleep(2300);
            l9.setVisible(false);
            
            l10.setVisible(true);
            caption.setText("Negi Camping");
            l10.add(caption);
            Thread.sleep(2300);
            l10.setVisible(false);
            
            l11.setVisible(true);
            caption.setText("Hotel Cliff Top");
            l11.add(caption);
            Thread.sleep(2300);
            l11.setVisible(false);
            
            this.setVisible(false);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public CheckHotels() {

        setBounds(500, 250, 500, 350);
        getContentPane().setBackground(new Color(220, 250, 250));
        
        th = new Thread(this);
    
        caption = new JLabel();
        caption.setBounds(50, 270, 300, 50);
        caption.setForeground(Color.WHITE);
        caption.setFont(new Font("Tahoma", Font.PLAIN, 30));
        add(caption);

        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/saphire.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(500, 350, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l2 = new JLabel(i3);
        l2.setBounds(0, 0, 500, 350);
        add(l2);

        setLayout(null);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/HOP.jpeg"));
        Image i5 = i4.getImage().getScaledInstance(500, 350, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        l3 = new JLabel(i4);
        l3.setBounds(0, 0, 500, 350);
        add(l3);
        l3.setVisible(false);

        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icons/dest8.jpeg"));
        Image i8 = i7.getImage().getScaledInstance(500, 350, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        l4 = new JLabel(i9);
        l4.setBounds(0, 0, 500, 350);
        add(l4);
        l4.setVisible(false);

        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("icons/package1.jpeg"));
        Image i11 = i10.getImage().getScaledInstance(500, 350, Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        l5 = new JLabel(i12);
        l5.setBounds(0, 0, 500, 350);
        add(l5);
        l5.setVisible(false);

        ImageIcon i13 = new ImageIcon(ClassLoader.getSystemResource("icons/package3.jpeg"));
        Image i14 = i13.getImage().getScaledInstance(500, 350, Image.SCALE_DEFAULT);
        ImageIcon i15 = new ImageIcon(i14);
        l6 = new JLabel(i15);
        l6.setBounds(0, 0, 500, 350);
        add(l6);
        l6.setVisible(false);

        ImageIcon i16 = new ImageIcon(ClassLoader.getSystemResource("icons/package2.jpeg"));
        Image i17 = i16.getImage().getScaledInstance(500, 350, Image.SCALE_DEFAULT);
        ImageIcon i18 = new ImageIcon(i17);
        l7 = new JLabel(i18);
        l7.setBounds(0, 0, 500, 350);
        add(l7);
        l7.setVisible(false);

        ImageIcon i19 = new ImageIcon(ClassLoader.getSystemResource("icons/skadi.jpeg"));
        Image i20 = i19.getImage().getScaledInstance(500, 350, Image.SCALE_DEFAULT);
        ImageIcon i21 = new ImageIcon(i20);
        l8 = new JLabel(i21);
        l8.setBounds(0, 0, 500, 350);
        add(l8);
        l8.setVisible(false);

        ImageIcon i22 = new ImageIcon(ClassLoader.getSystemResource("icons/tent.jpg"));
        Image i23 = i22.getImage().getScaledInstance(500, 350, Image.SCALE_DEFAULT);
        ImageIcon i24 = new ImageIcon(i23);
        l9 = new JLabel(i24);
        l9.setBounds(0, 0, 500, 350);
        add(l9);
        l9.setVisible(false);

        ImageIcon i25 = new ImageIcon(ClassLoader.getSystemResource("icons/tent1.jpeg"));
        Image i26 = i25.getImage().getScaledInstance(500, 350, Image.SCALE_DEFAULT);
        ImageIcon i27 = new ImageIcon(i26);
        l10 = new JLabel(i27);
        l10.setBounds(0, 0, 500, 350);
        add(l10);
        l10.setVisible(false);

        ImageIcon i28 = new ImageIcon(ClassLoader.getSystemResource("icons/palace4.jpeg"));
        Image i29 = i28.getImage().getScaledInstance(500, 350, Image.SCALE_DEFAULT);
        ImageIcon i30 = new ImageIcon(i29);
        l11 = new JLabel(i30);
        l11.setBounds(0, 0, 500, 350);
        add(l11);
        l11.setVisible(false);

        th.start();
        setVisible(true);

    }

    public static void main(String args[]) {
        new CheckHotels();

    }

}
