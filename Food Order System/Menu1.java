/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project;

import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Menu1 extends JFrame {

    private WelcomeMessage2 message;
    private Drinkiescafe drink;
    private Dessert dessert;
    private pastries pastrie;
    private PriceCafe pc;
    private JPanel buttonpanel;
    private JButton clucbutton;
    private JButton exitbutton;
    private final double ATax = 0.15;

    public Menu1() {
        setTitle("Wherever you are?");

        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        message = new WelcomeMessage2();
        drink = new Drinkiescafe();
        dessert = new Dessert();
        pastrie = new pastries();
        message.setBackground(Color.WHITE);
        drink.setBackground(Color.WHITE);
        dessert.setBackground(Color.WHITE);
        pastrie.setBackground(Color.WHITE);
        setBackground(Color.WHITE);
        setForeground(Color.BLACK);
        ButtonPanel();
        add(message, BorderLayout.NORTH);
        add(drink, BorderLayout.EAST);
        add(dessert, BorderLayout.CENTER);
        add(pastrie, BorderLayout.WEST);
        add(buttonpanel, BorderLayout.SOUTH);

        pack();
        setVisible(true);
    }

    private void ButtonPanel() {
        buttonpanel = new JPanel();
        ImageIcon image = new ImageIcon("price.png");
        clucbutton = new JButton("Calculate Total Price");
        clucbutton.setIcon(image);
        ImageIcon image2 = new ImageIcon("exit.png");
        exitbutton = new JButton("Exit");
        exitbutton.setIcon(image2);
        clucbutton.setForeground(Color.BLACK);
        exitbutton.setForeground(Color.BLACK);
        clucbutton.addActionListener(new ButtonListener());
        exitbutton.addActionListener(new ExitButtonListener());
        clucbutton.setBackground(Color.WHITE);
        exitbutton.setBackground(Color.WHITE);
        buttonpanel.setBackground(Color.WHITE);
        buttonpanel.add(clucbutton);
        buttonpanel.add(exitbutton);
    }

    private class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            pc = new PriceCafe();

        }
    }

    private class ExitButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //Exit the applicaiton
            System.exit(0);
        }
    }

}
