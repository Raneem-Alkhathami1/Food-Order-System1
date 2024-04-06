package project;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Menu extends JFrame {

    private WelcomeMessage w;
    private Drinkies d;
    private MainMeals m;
    private Appetizer a;
    private PriceRes pr;
    private JPanel buttonpanel;
    private JButton clucbutton;
    private JButton exitbutton;
    
    public Menu() {
        setTitle("Wherever you are?");

        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        w = new WelcomeMessage();
        d = new Drinkies();
        m = new MainMeals();
        a = new Appetizer();
        w.setBackground(Color.WHITE);
        d.setBackground(Color.WHITE);
        m.setBackground(Color.WHITE);
        a.setBackground(Color.WHITE);
        setBackground(Color.WHITE);
        setForeground(Color.BLACK);
        ButtonPanel();
        add(w, BorderLayout.NORTH);
        add(d, BorderLayout.EAST);
        add(m, BorderLayout.CENTER);
        add(a, BorderLayout.WEST);
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
          pr = new PriceRes();
        }
    }

    private class ExitButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //Exit the applicaiton
            JOptionPane.showMessageDialog(null, "You Exit From Menus");
            System.exit(0);
        }
    }

   
}
