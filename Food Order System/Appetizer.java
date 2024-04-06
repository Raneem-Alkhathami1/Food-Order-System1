package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Appetizer extends JPanel {

    public final double french_fries = 17;
    public final double salad = 14;
    public final double nachos = 15;
    private JCheckBox FrenchFries;
    private JCheckBox Salad;
    private JCheckBox Nachos;
    private JComboBox QuantityBox;
    private JComboBox Quantity_box;
    private JComboBox Quantityb;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private String[] Quantity = {"1", "2", "3", "4", "5"};

    public Appetizer() {
        FrenchFries = new JCheckBox("French Fries  17");
        Salad = new JCheckBox("Salad  14");
        Nachos = new JCheckBox("Nachos  15");
        FrenchFries.setForeground(Color.BLACK);
        Salad.setForeground(Color.BLACK);
        Nachos.setForeground(Color.BLACK);
        FrenchFries.setBackground(Color.WHITE);
        Salad.setBackground(Color.WHITE);
        Nachos.setBackground(Color.WHITE);
        setBackground(Color.WHITE);
        QuantityBox = new JComboBox(Quantity);
        Quantity_box = new JComboBox(Quantity);
        Quantityb = new JComboBox(Quantity);
        QuantityBox.setBackground(Color.WHITE);
        Quantity_box.setBackground(Color.WHITE);
        Quantityb.setBackground(Color.WHITE);
        QuantityBox.addActionListener(new QuantityListener());
        Quantity_box.addActionListener(new QuantityListener());
        Quantityb.addActionListener(new QuantityListener());
        ImageIcon friesImage = new ImageIcon("fries.png");
        JLabel friesLabel = new JLabel(friesImage);
        ImageIcon saladImage = new ImageIcon("salad.png");
        JLabel saladLabel = new JLabel(saladImage);
        ImageIcon NachosImage = new ImageIcon("Nachos.png");
        JLabel NachosLabel = new JLabel(NachosImage);
        setBorder(BorderFactory.createTitledBorder("Appetizer"));
        setLayout(new BorderLayout());
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel1.setBackground(Color.WHITE);
        panel2.setBackground(Color.WHITE);
        panel3.setBackground(Color.WHITE);
        panel1.add(FrenchFries, BorderLayout.WEST);
        panel1.add(QuantityBox, BorderLayout.EAST);
        panel1.add(friesLabel, BorderLayout.CENTER);
        panel2.add(Salad, BorderLayout.WEST);
        panel2.add(Quantity_box, BorderLayout.EAST);
        panel2.add(saladLabel, BorderLayout.CENTER);
        panel3.add(Nachos, BorderLayout.WEST);
        panel3.add(Quantityb, BorderLayout.EAST);
        panel3.add(NachosLabel, BorderLayout.CENTER);
        setLayout(new GridLayout(3, 1));
        add(panel1);
        add(panel2);
        add(panel3);

    }

    private class QuantityListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            double x = (double) QuantityBox.getSelectedItem();
            double y = (double) Quantity_box.getSelectedItem();
            double z = (double) Quantityb.getSelectedItem();

        }
    }

    public double getAppetizer() {
       
        double pcost = 0.0;
        if (FrenchFries.isSelected()) {
            pcost = french_fries;
        }
        if (Salad.isSelected()) {
            pcost = salad;
        }
        if (Nachos.isSelected()) {
            pcost = nachos;
        }
        return pcost;
    }
}
