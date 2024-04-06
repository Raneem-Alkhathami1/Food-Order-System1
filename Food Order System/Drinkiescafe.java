/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author رنيم
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Drinkiescafe extends JPanel {

    public final double spanish_latte = 16.50;
    public final double hot_chocolate = 20;
    public final double saudi_coffee = 20;
    public final double espresso = 27;
    public final double turkish_Coffee = 27;
    private JCheckBox spanishLatte;
    private JCheckBox hotChocolate;
    private JCheckBox saudiCoffee;
    private JCheckBox espressoo;
    private JCheckBox turkishCoffee;
    private JComboBox QuantitySL;
    private JComboBox QuantityHC;
    private JComboBox QuantitySC;
    private JComboBox QuantityE;
    private JComboBox QuantityTC;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;
    private String[] Quantity = {"1", "2", "3", "4", "5"};

    public Drinkiescafe() {
        setLayout(new GridLayout(5, 1));
        spanishLatte = new JCheckBox("spanish Latte  16.50");
        hotChocolate = new JCheckBox("hot Chocolate  20");
        saudiCoffee = new JCheckBox("saudi Coffee  20");
        espressoo = new JCheckBox("espressoo  27");
        turkishCoffee = new JCheckBox("turkish Coffee  27");
        spanishLatte.setForeground(Color.BLACK);
        hotChocolate.setForeground(Color.BLACK);
        saudiCoffee.setForeground(Color.BLACK);
        espressoo.setForeground(Color.BLACK);
        turkishCoffee.setForeground(Color.BLACK);
        setBackground(Color.WHITE);
        spanishLatte.setBackground(Color.WHITE);
        hotChocolate.setBackground(Color.WHITE);
        saudiCoffee.setBackground(Color.WHITE);
        espressoo.setBackground(Color.WHITE);
        turkishCoffee.setBackground(Color.WHITE);
        QuantitySL = new JComboBox(Quantity);
        QuantityHC = new JComboBox(Quantity);
        QuantitySC = new JComboBox(Quantity);
        QuantityE = new JComboBox(Quantity);
        QuantityTC = new JComboBox(Quantity);
        QuantitySL.setBackground(Color.WHITE);
        QuantityHC.setBackground(Color.WHITE);
        QuantitySC.setBackground(Color.WHITE);
        QuantityE.setBackground(Color.WHITE);
        QuantityTC.setBackground(Color.WHITE);
        QuantitySL.addActionListener(new QuantityListener());
        QuantityHC.addActionListener(new QuantityListener());
        QuantitySC.addActionListener(new QuantityListener());
        QuantityE.addActionListener(new QuantityListener());
        QuantityTC.addActionListener(new QuantityListener());
        ImageIcon spanishLatteImage = new ImageIcon("spanishLatte.png");
        JLabel spanishLatteLabel = new JLabel(spanishLatteImage);
        ImageIcon hotChocolateImage = new ImageIcon("hotChocolate.png");
        JLabel hotChocolateLabel = new JLabel(hotChocolateImage);
        ImageIcon saudiCoffeeImage = new ImageIcon("saudiCoffee.png");
        JLabel saudiCoffeeLabel = new JLabel(saudiCoffeeImage);
        ImageIcon espressooImage = new ImageIcon("espressoo.png");
        JLabel espressooLabel = new JLabel(espressooImage);
        ImageIcon turkishCoffeeImage = new ImageIcon("turkishCoffee.png");
        JLabel turkishCoffeeLabel = new JLabel(turkishCoffeeImage);
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
       setBorder(BorderFactory.createTitledBorder("Drinkies"));
        panel1.add(spanishLatte, BorderLayout.WEST);
        panel1.add(QuantitySL, BorderLayout.EAST);
        panel1.add(spanishLatteLabel, BorderLayout.CENTER);
        panel2.add(hotChocolate, BorderLayout.WEST);
        panel2.add(QuantityHC, BorderLayout.EAST);
        panel2.add(hotChocolateLabel, BorderLayout.CENTER);
        panel3.add(saudiCoffee, BorderLayout.WEST);
        panel3.add(QuantitySC, BorderLayout.EAST);
        panel3.add(saudiCoffeeLabel, BorderLayout.CENTER);
        panel4.add(espressoo, BorderLayout.WEST);
        panel4.add(QuantityE, BorderLayout.EAST);
        panel4.add(espressooLabel, BorderLayout.CENTER);
        panel5.add(turkishCoffee, BorderLayout.WEST);
        panel5.add(QuantityTC, BorderLayout.EAST);
        panel5.add(turkishCoffeeLabel, BorderLayout.CENTER);
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
            double x = (double) QuantitySL.getSelectedItem();
            double y = (double) QuantityHC.getSelectedItem();
            double z = (double) QuantitySC.getSelectedItem();
            double t = (double) QuantityE.getSelectedItem();
            double a = (double) QuantityTC.getSelectedItem();

        }
    }

    public double getDrinkies() {
        double theCost = 0.0;
        if (spanishLatte.isSelected()) {
            theCost += spanish_latte;
        }
        if (hotChocolate.isSelected()) {
            theCost += hot_chocolate;
        }
        if (saudiCoffee.isSelected()) {
            theCost += saudi_coffee;
        }
        if (espressoo.isSelected()) {
            theCost += espresso;
        }
        if (turkishCoffee.isSelected()) {
            theCost += turkish_Coffee;
        }
        return theCost;
    }
}
