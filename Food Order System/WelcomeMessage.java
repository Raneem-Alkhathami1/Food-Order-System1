
package project;
import java.awt.Color;
import javax.swing.*;
public class WelcomeMessage extends JPanel {
    private JLabel welcome;
    public WelcomeMessage(){
        welcome = new JLabel ("Welcome to Whenever You are? restaurant");
        welcome.setForeground(Color.BLACK);
        add(welcome);
    }
    
}
