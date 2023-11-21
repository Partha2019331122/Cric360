package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        FirstWindow frame = new FirstWindow();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,500,500);
        frame.setTitle("Cric360");

    }
}
