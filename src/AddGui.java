package src;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;

public class AddGui {
    public static void main(String[] args) {
        Addition obj = new Addition();
    }
}

class Addition extends JFrame {
    public Addition() {

        JTextField text1 = new JTextField(20);
        JTextField text2 = new JTextField(20);
        JButton button = new JButton("OK");
        JLabel Label = new JLabel("Result");

        add(text1);
        add(text2);
        add(button);
        add(Label);

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}