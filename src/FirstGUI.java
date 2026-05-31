package src;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
public class FirstGUI {
    public static void main(String[] args) {
        Abc obj = new Abc();
        
    }
}

class Abc extends JFrame { // CardLayout 
    public Abc() {

        
        JLabel label = new JLabel("Hello World!");
        JLabel name = new JLabel("Hey, I am Divyanka");

        add(label);
        add(name);
        
        setLayout(new FlowLayout()); //flowLayout, borderLayout, gridLayout, Null
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}