package com.company;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class ThirdWindow  extends JFrame implements ChangeListener {
    private Container c;
    private JLabel j1,j2,j3,j4,j5,j6,j7;
    private JTextField tf1,tf2,tf3;
    private JButton ok;
    private ImageIcon icon1;
    private Font f,f1;
    private Cursor curse;
    private JSpinner spinner;

    ThirdWindow()
    {
        method();
    }
    public void method()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(115,100,550,600);
        this.setTitle("Cric360");

        curse=new Cursor(Cursor.HAND_CURSOR);

        f=new Font("Arial",Font.BOLD,17);
        f1=new Font("Arial",Font.BOLD+Font.ITALIC,25);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.black);
        icon1 = new ImageIcon(getClass().getResource("cricket.png"));
        this.setIconImage(icon1.getImage());

        j7=new JLabel("Match Informations ");
        j7.setFont(f1);
        j7.setBounds(130,25,280,50);
        j7.setForeground(Color.WHITE);
        c.add(j7);


        j1=new JLabel("Team Name 1 : ");
        j1.setFont(f);
        j1.setBounds(30,85,200,50);
        j1.setForeground(Color.RED);
        c.add(j1);

        tf1=new JTextField();
        tf1.setFont(f);
        tf1.setForeground(Color.BLACK);
        tf1.setBounds(200,85,200,50);
        c.add(tf1);

        j2=new JLabel("Team Name 2 : ");
        j2.setFont(f);
        j2.setBounds(30,145,200,50);
        j2.setForeground(Color.RED);
        c.add(j2);

        tf2=new JTextField();
        tf2.setFont(f);
        tf2.setForeground(Color.BLACK);
        tf2.setBounds(200,145,200,50);
        c.add(tf2);

        j3=new JLabel("Number of Players : ");
        j3.setFont(f);
        j3.setBounds(30,205,200,50);
        j3.setForeground(Color.RED);
        c.add(j3);

        tf3=new JTextField();
        tf3.setFont(f);
        tf3.setForeground(Color.BLACK);
        tf3.setBounds(200,205,200,50);
        c.add(tf3);

        j4=new JLabel("Overs per Innings : ");
        j4.setFont(f);
        j4.setBounds(30,265,200,50);
        j4.setForeground(Color.RED);
        c.add(j4);

        j5=new JLabel();
        j5.setFont(f);
        j5.setBounds(30,325,200,50);
        j5.setForeground(Color.RED);
        c.add(j5);

        SpinnerNumberModel value = new SpinnerNumberModel(0,0,50,1);


        spinner = new JSpinner(value);
        spinner.setBounds(200,265,100,50);
        spinner.setFont(f);
        c.add(spinner);

        spinner.addChangeListener(this);

        j6=new JLabel("Do you want to proceed ?");
        j6.setFont(f);
        j6.setBounds(30,385,250,50);
        j6.setForeground(Color.BLUE);
        c.add(j6);


        ok=new JButton("Okay");
        ok.setBounds(200,490,100,40);
        ok.setBackground(Color.lightGray);
        ok.setForeground(Color.black);
        ok.setFont(f);
        ok.setCursor(curse);
        c.add(ok);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        String number = spinner.getValue().toString();
        int val = Integer.parseInt(number);
        j5.setText("Overs per Innings : "+val);
    }

    public static void main(String[] args) {
        ThirdWindow frame = new ThirdWindow();
        frame.setVisible(true);

    }
}