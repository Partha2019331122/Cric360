package com.company;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
public class ForthWindow extends JFrame implements ChangeListener{
    private Container c;
    private JLabel j1,j2,j3,j4,j5,j6,j7;
    private JTextField tf1,tf2,tf3,tf4;
    private JButton fixture;
    private ImageIcon icon1;
    private Font f,f1;
    private Cursor curse;
    private JSpinner spinner;
    ForthWindow()
    {
        mthd();
    }
    public void mthd()
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

        j7=new JLabel("Tournament Informations ");
        j7.setFont(f1);
        j7.setBounds(100,25,320,50);
        j7.setForeground(Color.WHITE);
        c.add(j7);

        j1=new JLabel("Tournament Name :");
        j1.setFont(f);
        j1.setBounds(30,85,200,50);
        j1.setForeground(Color.RED);
        c.add(j1);

        tf1=new JTextField();
        tf1.setFont(f);
        tf1.setForeground(Color.BLACK);
        tf1.setBounds(200,85,200,50);
        c.add(tf1);

        j2=new JLabel("Number Of Teams :");
        j2.setFont(f);
        j2.setBounds(30,145,200,50);
        j2.setForeground(Color.RED);
        c.add(j2);

        tf2=new JTextField();
        tf2.setFont(f);
        tf2.setForeground(Color.BLACK);
        tf2.setBounds(200,145,200,50);
        c.add(tf2);

        j3=new JLabel("Total Matches :");
        j3.setFont(f);
        j3.setBounds(30,205,200,50);
        j3.setForeground(Color.RED);
        c.add(j3);

        tf3=new JTextField();
        tf3.setFont(f);
        tf3.setForeground(Color.BLACK);
        tf3.setBounds(200,205,200,50);
        c.add(tf3);

        j6=new JLabel("Number Of Players :");
        j6.setFont(f);
        j6.setBounds(30,265,200,50);
        j6.setForeground(Color.RED);
        c.add(j6);

        tf4=new JTextField();
        tf4.setFont(f);
        tf4.setForeground(Color.BLACK);
        tf4.setBounds(200,265,200,50);
        c.add(tf4);

        j4=new JLabel("Overs per Innings : ");
        j4.setFont(f);
        j4.setBounds(30,325,200,50);
        j4.setForeground(Color.RED);
        c.add(j4);

        j5=new JLabel();
        j5.setFont(f);
        j5.setBounds(30,385,200,50);
        j5.setForeground(Color.RED);
        c.add(j5);

        SpinnerNumberModel value = new SpinnerNumberModel(0,0,50,1);


        spinner = new JSpinner(value);
        spinner.setBounds(200,325,100,50);
        spinner.setFont(f);
        c.add(spinner);

        spinner.addChangeListener((ChangeListener) this);

        fixture=new JButton("Match Fixture");
        fixture.setBounds(200,490,200,40);
        fixture.setBackground(Color.lightGray);
        fixture.setForeground(Color.black);
        fixture.setFont(f);
        fixture.setCursor(curse);
        c.add(fixture);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        String number = spinner.getValue().toString();
        int val = Integer.parseInt(number);
        j5.setText("Overs per Innings : "+val);
    }
    public static void main(String[] args) {

        ForthWindow fr = new ForthWindow();
        fr.setVisible(true);
    }

}
