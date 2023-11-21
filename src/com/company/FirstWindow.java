package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstWindow  extends JFrame{
     private Container c;
     private JLabel lbl1,lbl2,lbl3;
     private JTextField tf;
     private JButton login,clear;
     private ImageIcon icon1;
     private Font f,f1,f2;
     private JPasswordField pf;

     FirstWindow()
     {
         c = this.getContentPane();
         c.setLayout(null);
         c.setBackground(Color.black);

         icon1 = new ImageIcon(getClass().getResource("cricket.png"));
         this.setIconImage(icon1.getImage());

         f= new Font("Serif",Font.BOLD+Font.ITALIC,30);
         f1= new Font("Arial",Font.BOLD,17);
         f2= new Font("Arial",Font.BOLD,12);

         lbl1 = new JLabel("Cric360");
         lbl1.setBounds(190,20,250,50);
         lbl1.setFont(f);
         lbl1.setForeground(Color.white);
         c.add(lbl1);

         lbl2 = new JLabel("Account Name :");
         lbl2.setBounds(80,130,200,30);
         lbl2.setFont(f1);
         lbl2.setForeground(Color.white);
         c.add(lbl2);

         lbl3 = new JLabel("Password :");
         lbl3.setBounds(80,180,200,30);
         lbl3.setFont(f1);
         lbl3.setForeground(Color.white);
         c.add(lbl3);

         tf= new JTextField();
         tf.setBounds(220,130,120,40);
         tf.setHorizontalAlignment(JTextField.CENTER);
         tf.setBackground(Color.white);
         tf.setForeground(Color.BLACK);
         tf.setFont(f1);
         c.add(tf);

         pf = new JPasswordField();
         pf.setBounds(220,180,120,40);
         pf.setEchoChar('*');
         pf.setFont(f);
         c.add(pf);

         login = new JButton("LOGIN");
         login.setBounds(100,250,90,40);
         login.setFont(f2);
         c.add(login);

         login.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 String name = tf.getText();
                 String pass = pf.getText();

                 if(name.equals("CRIC") && pass.equals("360"))
                 {
                     JOptionPane.showMessageDialog(null,"WELCOME","Successfully login",1);
                     dispose();
                     SecondWindow frm = new SecondWindow();
                     frm.setVisible(true);
                 }
                 else{
                     JOptionPane.showMessageDialog(null,"NOT VALID","Error!",0);
                 }
             }
         });

         clear = new JButton("CLEAR");
         clear.setBounds(260,250,90,40);
         clear.setBackground(Color.WHITE);
         clear.setFont(f2);
         c.add(clear);

         clear.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 tf.setText("");
                 pf.setText("");
             }
         });
     }

    public static void main(String[] args) {
        FirstWindow frame = new FirstWindow();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,500,500);
        frame.setTitle("Cric360");
        frame.setResizable(false);
    }
}
