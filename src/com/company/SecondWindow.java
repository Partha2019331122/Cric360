package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecondWindow  extends JFrame{

    private Container c;
    private JLabel lbl1,lbl2,lbl3,imgLabel;
    private JButton j1,j2,j3;
    private ImageIcon icon1;
    private Font f,f1;
    private Cursor curse;

    SecondWindow()
    {
        method();
    }
    public void method()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(10,10,700,820);
        this.setTitle("Cric360");

        curse=new Cursor(Cursor.HAND_CURSOR);

        f=new Font("Arial",Font.BOLD,17);
        f1=new Font("Arial",Font.BOLD+Font.ITALIC,30);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.black);
        icon1 = new ImageIcon(getClass().getResource("cricket.png"));
        this.setIconImage(icon1.getImage());

        lbl1=new JLabel("Select Mode : ");
        lbl1.setFont(f1);
        lbl1.setBounds(30,440,700,50);
        lbl1.setForeground(Color.blue);
        c.add(lbl1);

        j1=new JButton("Instant Mode");
        j1.setBounds(30,505,200,40);
        j1.setBackground(Color.LIGHT_GRAY);
        j1.setForeground(Color.blue);
        j1.setFont(f);
        j1.setCursor(curse);
        c.add(j1);

        j2=new JButton("Tournament Mode");
        j2.setBounds(30,560,200,40);
        j2.setBackground(Color.lightGray);
        j2.setForeground(Color.blue);
        j2.setFont(f);
        j2.setCursor(curse);
        c.add(j2);

        j3=new JButton("Rules & Regulations");
        j3.setBounds(30,730,200,35);
        j3.setBackground(Color.GRAY);
        j3.setForeground(Color.blue);
        j3.setFont(f);
        j3.setCursor(curse);
        c.add(j3);

        ImageIcon img = new ImageIcon(getClass().getResource("img1.png"));
        imgLabel = new JLabel(img);
        imgLabel.setBounds(30, 5, 640,875);
        c.add(imgLabel);

        j1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                //JOptionPane.showMessageDialog(null,"WELCOME");
                //dispose();
                ThirdWindow frm2 = new ThirdWindow();
                frm2.setVisible(true);
            }
        });

        j2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                //JOptionPane.showMessageDialog(null,"WELCOME");
                //dispose();
                ForthWindow frm3 = new ForthWindow();
                frm3.setVisible(true);
            }
        });

        j3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                //JOptionPane.showMessageDialog(null,"WELCOME");
                //dispose();
                FifthWindow frm4 = new FifthWindow();
                frm4.setVisible(true);
            }
        });
    }


    public static void main(String[] args) {
        SecondWindow frame = new SecondWindow();
        frame.setVisible(true);

    }
}