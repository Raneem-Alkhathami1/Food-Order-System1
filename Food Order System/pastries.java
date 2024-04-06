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

public class pastries extends JPanel {

    public final double italian_Pie = 17;
    public final double Cheese_Croissant = 14;
    public final double baguette_Bread = 15;
    private JCheckBox italianPie;
    private JCheckBox Croissant;
    private JCheckBox baguetteBread;
    private JComboBox QuantityBox;
    private JComboBox Quantity_box;
    private JComboBox Quantityb;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private String[] Quantity = {"1", "2", "3", "4", "5"};

    public pastries() {
        setLayout(new GridLayout(3, 1));
        italianPie = new JCheckBox("italian Pie  17");
        Croissant = new JCheckBox("Cheese Croissant  14");
        baguetteBread = new JCheckBox("baguette Bread  15");
        italianPie.setForeground(Color.BLACK);
        Croissant.setForeground(Color.BLACK);
        baguetteBread.setForeground(Color.BLACK);
        italianPie.setBackground(Color.WHITE);
        Croissant.setBackground(Color.WHITE);
        baguetteBread.setBackground(Color.WHITE);
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
        ImageIcon italianPieImage = new ImageIcon("italianPie.png");
        JLabel italianPieLabel = new JLabel(italianPieImage);
        ImageIcon CroissantImage = new ImageIcon("Croissant.png");
        JLabel CroissantLabel = new JLabel(CroissantImage);
        ImageIcon baguetteBreadImage = new ImageIcon("baguetteBread.png");
        JLabel baguetteBreadLabel = new JLabel(baguetteBreadImage);
        setBorder(BorderFactory.createTitledBorder("--Pastries--"));
         setLayout(new BorderLayout());
       panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel1.setBackground(Color.WHITE);
        panel2.setBackground(Color.WHITE);
        panel3.setBackground(Color.WHITE);
        panel1.add(italianPie, BorderLayout.WEST);
        panel1.add(QuantityBox, BorderLayout.EAST);
        panel1.add(italianPieLabel, BorderLayout.CENTER);
        panel2.add(Croissant, BorderLayout.WEST);
        panel2.add(Quantity_box, BorderLayout.EAST);
        panel2.add(CroissantLabel, BorderLayout.CENTER);
        panel3.add(baguetteBread, BorderLayout.WEST);
        panel3.add(Quantityb, BorderLayout.EAST);
        panel3.add(baguetteBreadLabel, BorderLayout.CENTER);
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
    public double getpastries() {
        double pcost = 0.0;
        if (italianPie.isSelected()) {
            pcost += italian_Pie;
        }
        if (Croissant.isSelected()) {
            pcost += Cheese_Croissant;
        }
        if (baguetteBread.isSelected()) {
            pcost += baguette_Bread;
        }
        return pcost;
    }
}
