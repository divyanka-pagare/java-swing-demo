package src;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddGui {
    public static void main(String[] args) {
        Addition obj = new Addition();
    }
}

class Addition extends JFrame implements ActionListener {

    JTextField text1;
    JTextField text2;
    JButton button;
    JLabel label;

    public Addition() {

        text1 = new JTextField(20);
        text2 = new JTextField(20);
        button = new JButton("OK");
        label = new JLabel("Result");

        add(text1);
        add(text2);
        add(button);
        add(label);

        button.addActionListener(this); //ActionListerner is an Interface 
        
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent ae) {
        int num1 = Integer.parseInt(text1.getText()); //converting string to integer , by using --> Integer.parseInt() method
        int num2 = Integer.parseInt(text2.getText());
        int result = num1 + num2;
        label.setText("Result: " + result);
    }
}