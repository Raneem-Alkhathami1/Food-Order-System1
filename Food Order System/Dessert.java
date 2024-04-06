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

public class Dessert extends JPanel {

    public final double vanillaCookies = 23;
    public final double cherryMuffin = 45;
    public final double frenchMacron = 40;
    public final double chocolateTart = 30;
    public final double StrawberryCheesecake = 25;
    private JCheckBox Cookies;
    private JCheckBox Muffin;
    private JCheckBox Macron;
    private JCheckBox Tart;
    private JCheckBox Cheesecake;
    private JComboBox QuantityCO;
    private JComboBox QuantityMU;
    private JComboBox QuantityMA;
    private JComboBox QuantityT;
    private JComboBox QuantityCC;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;
    private String[] Quantity = {"1", "2", "3", "4", "5"};

    public Dessert() {
        setLayout(new GridLayout(5, 1));
        Cookies = new JCheckBox("vanillaCookies  23");
        Muffin = new JCheckBox("cherryMuffin  45");
        Macron = new JCheckBox("frenchMacron 40");
        Tart = new JCheckBox("chocolateTart  30");
        Cheesecake = new JCheckBox("Cheesecake   25");
        Cookies.setForeground(Color.BLACK);
        Muffin.setForeground(Color.BLACK);
        Macron.setForeground(Color.BLACK);
        Tart.setForeground(Color.BLACK);
        Cheesecake.setForeground(Color.BLACK);
        setBackground(Color.WHITE);
        Cookies.setBackground(Color.WHITE);
        Muffin.setBackground(Color.WHITE);
        Macron.setBackground(Color.WHITE);
        Tart.setBackground(Color.WHITE);
        Cheesecake.setBackground(Color.WHITE);
        QuantityCO = new JComboBox(Quantity);
        QuantityMU = new JComboBox(Quantity);
        QuantityMA = new JComboBox(Quantity);
        QuantityT = new JComboBox(Quantity);
        QuantityCC = new JComboBox(Quantity);
        QuantityCO.setBackground(Color.WHITE);
        QuantityMU.setBackground(Color.WHITE);
        QuantityMA.setBackground(Color.WHITE);
        QuantityT.setBackground(Color.WHITE);
        QuantityCC.setBackground(Color.WHITE);
        QuantityCO.addActionListener(new QuantityListener());
        QuantityMU.addActionListener(new QuantityListener());
        QuantityMA.addActionListener(new QuantityListener());
        QuantityT.addActionListener(new QuantityListener());
        QuantityCC.addActionListener(new QuantityListener());
        ImageIcon CookiesImage = new ImageIcon("Cookies.png");
        JLabel CookiesLabel = new JLabel(CookiesImage);
        ImageIcon MuffinImage = new ImageIcon("Muffin.png");
        JLabel MuffinLabel = new JLabel(MuffinImage);
        ImageIcon MacronImage = new ImageIcon("Macron.png");
        JLabel MacronLabel = new JLabel(MacronImage);
        ImageIcon TartImage = new ImageIcon("Tart.png");
        JLabel TartLabel = new JLabel(TartImage);
        ImageIcon CheesecakeImage = new ImageIcon("Cheesecake.png");
        JLabel CheesecakeLabel = new JLabel(CheesecakeImage);
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
        setBorder(BorderFactory.createTitledBorder("--Main Dessert--"));
        panel1.add(Cookies, BorderLayout.WEST);
        panel1.add(QuantityCO, BorderLayout.EAST);
        panel1.add(CookiesLabel, BorderLayout.CENTER);
        panel2.add(Muffin, BorderLayout.WEST);
        panel2.add(QuantityMU, BorderLayout.EAST);
        panel2.add(MuffinLabel, BorderLayout.CENTER);
        panel3.add(Macron, BorderLayout.WEST);
        panel3.add(QuantityMA, BorderLayout.EAST);
        panel3.add(MacronLabel, BorderLayout.CENTER);
        panel4.add(Tart, BorderLayout.WEST);
        panel4.add(QuantityT, BorderLayout.EAST);
        panel4.add(TartLabel, BorderLayout.CENTER);
        panel5.add(Cheesecake, BorderLayout.WEST);
        panel5.add(QuantityCC, BorderLayout.EAST);
        panel5.add(CheesecakeLabel, BorderLayout.CENTER);
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
            double x = (double) QuantityCO.getSelectedItem();
            double y = (double) QuantityMU.getSelectedItem();
            double z = (double) QuantityMA.getSelectedItem();
            double t = (double) QuantityT.getSelectedItem();
            double a = (double) QuantityCC.getSelectedItem();

        }
    }

    public double getDessert() {
        double price = 0.0;
        if (Cookies.isSelected()) {
            price += vanillaCookies;
        }
        if (Muffin.isSelected()) {
            price += cherryMuffin;
        }
        if (Macron.isSelected()) {
            price += frenchMacron;
        }
        if (Tart.isSelected()) {
            price += chocolateTart;
        }
        if (Cheesecake.isSelected()) {
            price += StrawberryCheesecake;
        }
        return price;
    }
}
