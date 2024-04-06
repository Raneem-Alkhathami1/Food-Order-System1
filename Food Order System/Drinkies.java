package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Drinkies extends JPanel {

    public final double Soft_drinks = 2.50;
    public final double Orange_juice = 20;
    public final double Lemon_juice = 20;
    public final double Berry_Basil_Mojito = 27;
    public final double Ocean_Blue = 27;
    private JCheckBox SoftDrinks;
    private JCheckBox OrangeJuice;
    private JCheckBox LemonJuice;
    private JCheckBox BerryBasilMojito;
    private JCheckBox OceanBlue;
    private JComboBox QuantitySD;
    private JComboBox QuantityOJ;
    private JComboBox QuantityLJ;
    private JComboBox QuantityBBM;
    private JComboBox QuantityOB;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;
    private String[] Quantity = {"1", "2", "3", "4", "5"};

    public Drinkies() {
        SoftDrinks = new JCheckBox("Soft Drinks  2.50");
        OrangeJuice = new JCheckBox("Orange Juice  20");
        LemonJuice = new JCheckBox("Lemon Juice  20");
        BerryBasilMojito = new JCheckBox("Berry Mojito  27");
        OceanBlue = new JCheckBox("Ocean Blue  27");
        SoftDrinks.setForeground(Color.BLACK);
        OrangeJuice.setForeground(Color.BLACK);
        LemonJuice.setForeground(Color.BLACK);
        BerryBasilMojito.setForeground(Color.BLACK);
        OceanBlue.setForeground(Color.BLACK);
        setBackground(Color.WHITE);
        SoftDrinks.setBackground(Color.WHITE);
        OrangeJuice.setBackground(Color.WHITE);
        LemonJuice.setBackground(Color.WHITE);
        BerryBasilMojito.setBackground(Color.WHITE);
        OceanBlue.setBackground(Color.WHITE);
        QuantitySD = new JComboBox(Quantity);
        QuantityOJ = new JComboBox(Quantity);
        QuantityLJ = new JComboBox(Quantity);
        QuantityBBM = new JComboBox(Quantity);
        QuantityOB = new JComboBox(Quantity);
        QuantitySD.setBackground(Color.WHITE);
        QuantityOJ.setBackground(Color.WHITE);
        QuantityLJ.setBackground(Color.WHITE);
        QuantityBBM.setBackground(Color.WHITE);
        QuantityOB.setBackground(Color.WHITE);
        ImageIcon SoftDrinksImage = new ImageIcon("SoftDrinks.png");
        JLabel SoftDrinksLabel = new JLabel(SoftDrinksImage);
        ImageIcon OrangeJuiceImage = new ImageIcon("OrangeJuice.png");
        JLabel OrangeJuiceLabel = new JLabel(OrangeJuiceImage);
        ImageIcon LemonJuiceImage = new ImageIcon("LemonJuice.png");
        JLabel LemonJuiceLabel = new JLabel(LemonJuiceImage);
        ImageIcon MojitoImage = new ImageIcon("Mojito.png");
        JLabel MojitoLabel = new JLabel(MojitoImage);
        ImageIcon OceanBlueImage = new ImageIcon("OceanBlue.png");
        JLabel OceanBlueLabel = new JLabel(OceanBlueImage);
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
        panel1.add(SoftDrinks, BorderLayout.WEST);
        panel1.add(QuantitySD, BorderLayout.EAST);
        panel1.add(SoftDrinksLabel, BorderLayout.CENTER);
        panel2.add(OrangeJuice, BorderLayout.WEST);
        panel2.add(QuantityOJ, BorderLayout.EAST);
        panel2.add(OrangeJuiceLabel, BorderLayout.CENTER);
        panel3.add(LemonJuice, BorderLayout.WEST);
        panel3.add(QuantityLJ, BorderLayout.EAST);
        panel3.add(LemonJuiceLabel, BorderLayout.CENTER);
        panel4.add(BerryBasilMojito, BorderLayout.WEST);
        panel4.add(QuantityBBM, BorderLayout.EAST);
        panel4.add(MojitoLabel, BorderLayout.CENTER);
        panel5.add(OceanBlue, BorderLayout.WEST);
        panel5.add(QuantityOB, BorderLayout.EAST);
        panel5.add(OceanBlueLabel, BorderLayout.CENTER);
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
            double x = (double) QuantitySD.getSelectedItem();
            double y = (double) QuantityOJ.getSelectedItem();
            double z = (double) QuantityLJ.getSelectedItem();
            double t = (double) QuantityBBM.getSelectedItem();
            double a = (double) QuantityOB.getSelectedItem();

        }
    }

    public double getDrinkies() {

        double theCost = 0.0;
        if (SoftDrinks.isSelected()) {
            theCost = Soft_drinks ;
        }
        if (OrangeJuice.isSelected()) {
            theCost = Orange_juice ;
        }
        if (LemonJuice.isSelected()) {
            theCost = Lemon_juice ;
        }
        if (BerryBasilMojito.isSelected()) {
            theCost = Berry_Basil_Mojito ;
        }
        if (OceanBlue.isSelected()) {
            theCost = Ocean_Blue ;
        }
        return theCost;
    }
}
