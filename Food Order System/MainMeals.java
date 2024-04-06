package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainMeals extends JPanel {

    public final double burgerp = 23;
    public final double steakp = 45;
    public final double pastap = 40;
    public final double pizzap = 30;
    public final double ricep = 25;
    private JCheckBox Burger;
    private JCheckBox Steak;
    private JCheckBox Pasta;
    private JCheckBox Pizza;
    private JCheckBox Rice;
    private JComboBox QuantityB;
    private JComboBox QuantityS;
    private JComboBox QuantityPA;
    private JComboBox QuantityPI;
    private JComboBox QuantityR;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;
    private String[] Quantity = {"1", "2", "3", "4", "5"};

    public MainMeals() {
        setLayout(new GridLayout(5, 1));
        Burger = new JCheckBox("Burger  23");
        Steak = new JCheckBox("Steak  45");
        Pasta = new JCheckBox("Pasta  40");
        Pizza = new JCheckBox("Pizza 30");
        Rice = new JCheckBox("Rice  25");
        Burger.setForeground(Color.BLACK);
        Steak.setForeground(Color.BLACK);
        Pasta.setForeground(Color.BLACK);
        Pizza.setForeground(Color.BLACK);
        Rice.setForeground(Color.BLACK);
        Burger.setBackground(Color.WHITE);
        Steak.setBackground(Color.WHITE);
        Pasta.setBackground(Color.WHITE);
        Pizza.setBackground(Color.WHITE);
        Rice.setBackground(Color.WHITE);
        QuantityB = new JComboBox(Quantity);
        QuantityS = new JComboBox(Quantity);
        QuantityPA = new JComboBox(Quantity);
        QuantityPI = new JComboBox(Quantity);
        QuantityR = new JComboBox(Quantity);
        QuantityB.setBackground(Color.WHITE);
        QuantityS.setBackground(Color.WHITE);
        QuantityPA.setBackground(Color.WHITE);
        QuantityPI.setBackground(Color.WHITE);
        QuantityR.setBackground(Color.WHITE);
        QuantityB.addActionListener(new QuantityListener());
        QuantityS.addActionListener(new QuantityListener());
        QuantityPA.addActionListener(new QuantityListener());
        QuantityPI.addActionListener(new QuantityListener());
        QuantityR.addActionListener(new QuantityListener());
        ImageIcon BurgerImage = new ImageIcon("Burger.png");
        JLabel BurgerLabel = new JLabel(BurgerImage);
        ImageIcon SteakImage = new ImageIcon("Steak.png");
        JLabel SteakLabel = new JLabel(SteakImage);
        ImageIcon PastaImage = new ImageIcon("Pasta.png");
        JLabel PastaLabel = new JLabel(PastaImage);
        ImageIcon PizzaImage = new ImageIcon("Pizza.png");
        JLabel PizzaLabel = new JLabel(PizzaImage);
        ImageIcon RiceImage = new ImageIcon("Rice.png");
        JLabel RiceLabel = new JLabel(RiceImage);
        setBorder(BorderFactory.createTitledBorder("Main Meals"));
        setLayout(new BorderLayout());
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        panel5 = new JPanel();
        panel1.setBackground(Color.WHITE);
        panel2.setBackground(Color.WHITE);
        panel3.setBackground(Color.WHITE);
        panel4.setBackground(Color.WHITE);
        panel5.setBackground(Color.WHITE);
        panel1.add(Burger, BorderLayout.WEST);
        panel1.add(QuantityB, BorderLayout.EAST);
        panel1.add(BurgerLabel, BorderLayout.CENTER);
        panel2.add(Steak, BorderLayout.WEST);
        panel2.add(QuantityS, BorderLayout.EAST);
        panel2.add(SteakLabel, BorderLayout.CENTER);
        panel3.add(Pasta, BorderLayout.WEST);
        panel3.add(QuantityPA, BorderLayout.EAST);
        panel3.add(PastaLabel, BorderLayout.CENTER);
        panel4.add(Pizza, BorderLayout.WEST);
        panel4.add(QuantityPI, BorderLayout.EAST);
        panel4.add(PizzaLabel, BorderLayout.CENTER);
        panel5.add(Rice, BorderLayout.WEST);
        panel5.add(QuantityR, BorderLayout.EAST);
        panel5.add(RiceLabel, BorderLayout.CENTER);
        setLayout(new GridLayout(5, 1));
        add(panel1);
        add(panel2);
        add(panel3);
        add(panel4);
        add(panel5);
    }

    private class QuantityListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            double x = (double) QuantityB.getSelectedItem();
            double y = (double) QuantityS.getSelectedItem();
            double z = (double) QuantityPA.getSelectedItem();
            double t = (double) QuantityPI.getSelectedItem();
            double a = (double) QuantityR.getSelectedItem();

        }
    }

    public double getMainMeals() {

        double price = 0.0;
        if (Burger.isSelected()) {
            price = burgerp ;
        }
        if (Steak.isSelected()) {
            price = steakp ;
        }
        if (Pasta.isSelected()) {
            price = pastap ;
        }
        if (Pizza.isSelected()) {
            price = pizzap ;
        }
        if (Rice.isSelected()) {
            price = ricep ;
        }
        return price;
    }
}
