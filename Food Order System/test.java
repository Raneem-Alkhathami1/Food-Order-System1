package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class test extends JFrame {

    private JLabel messageLabel;
    private final int width = 400;
    private final int hight = 200;
    private Menu m;
    private Menu1 m1;
    private JMenuBar menuBar;
    private JMenu Resmenu;
    private JMenu Cafmenu;
    private JLabel page = new JLabel();
    private JPanel panel = new JPanel();
    private JPanel pane2 = new JPanel();

    public test() {
        setTitle("Wherever you are?");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setBackground(Color.WHITE);
        pane2.setBackground(Color.WHITE);
        messageLabel = new JLabel("Welcome to Whenever You are?");
        messageLabel.setPreferredSize(new Dimension(width, hight));
        messageLabel.setForeground(Color.BLACK);
        ImageIcon logoImage = new ImageIcon("logo1.jpg");
        JLabel logoLabel = new JLabel(logoImage);
        panel.add(logoLabel);
        pane2.add(messageLabel);
        bulidMenuBar();
        add(panel);
        pack();
        setVisible(true);
    }

    private void bulidMenuBar() {
        menuBar = new JMenuBar();
        bulidResMenu();
        bulidCafeMenu();
        menuBar.setBackground(Color.WHITE);
        menuBar.add(Resmenu);
        menuBar.add(Cafmenu);
        setJMenuBar(menuBar);
    }

    private void bulidResMenu() {
        Resmenu = new JMenu("Restaurant menu:");
        JMenuItem RESmenu = new JMenuItem("Open menu: ");
        Resmenu.add(RESmenu);
        Resmenu.setMnemonic(KeyEvent.VK_R);
        RESmenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                m = new Menu();
            }
        });
    }

    private void bulidCafeMenu() {
        Cafmenu = new JMenu("Cafe menu:");
        JMenuItem CAFEmenu = new JMenuItem("Open menu: ");
        Cafmenu.add(CAFEmenu);
        Cafmenu.setMnemonic(KeyEvent.VK_C);
        CAFEmenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                m1 = new Menu1();

            }
        });
    }

    public static void main(String[] args) {
        new test();
    }
}
