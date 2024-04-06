
package project;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class WelcomeMessage2 extends JPanel {
    private JLabel welcome;
    public WelcomeMessage2(){
        welcome = new JLabel ("Welcome to Whenever You are? Cafes");
        welcome.setForeground(Color.BLACK);
        add(welcome);
    }
    
}
