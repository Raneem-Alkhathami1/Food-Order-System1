
package project;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class PriceCafe extends JFrame{
    private JLabel mas;
    private JLabel price1;
    private JLabel tax;
    private JLabel price2;
    private JLabel price1text = new JLabel();
    private JLabel taxtext = new JLabel();
    private JLabel price2text = new JLabel();;
    private JPanel pane = new JPanel();
    private JPanel pane1 = new JPanel();
    private JPanel pane2 = new JPanel();
    private JPanel pane3 = new JPanel();
    private Drinkiescafe Dc;
    private Dessert D ;
    private pastries p;
    private Menu1 menu;
    private final double ATax = 0.15;
    
    public PriceCafe(){
        setTitle("Wherever you are?");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mas = new JLabel("The total price for your choices from our CAFE");
        setLayout(new GridLayout(4, 0));
        pane.add(mas);
        pane.setBackground(Color.WHITE);
        add(pane);
        Dc = new Drinkiescafe();
        D = new Dessert();
        p = new pastries();
        price1 = new JLabel("Price Without Tax: ");
        double total;
        total = Dc.getDrinkies() + D.getDessert() + p.getpastries();
        price1text.setText(Double.toString(total));
        pane1.add(price1);
        pane1.add(price1text);
        pane1.setBackground(Color.WHITE);
        add(pane1);
        tax = new JLabel("The Tax: ");
        double Thetax;
        Thetax = total * ATax;
        taxtext.setText(Double.toString(Thetax));
        pane2.add(tax);
        pane2.add(taxtext);
        pane2.setBackground(Color.WHITE);
        add(pane2);
        price2 = new JLabel("The Total Price: ");
        double pricewithTax;
        pricewithTax = total + Thetax;
        price2text.setText(Double.toString(pricewithTax));
        pane3.add(price2);
        pane3.add(price2text);
        pane3.setBackground(Color.WHITE);
        add(pane3);
        pack();
        setVisible(true);
    }
}
