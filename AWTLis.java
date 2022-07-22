import java.awt.*;
import java.awt.event.*;

class AWTLis extends Frame implements ActionListener {
    TextField tf;

    AWTLis() {
        tf = new TextField();
        tf.setBounds(45, 50, 60, 100);
        Button b = new Button("Click me");
        b.setBounds(5, 60, 56, 100);

        b.addActionListener(this);

        add(b);
        add(tf);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent a) {
        tf.setText("Welcome");
    }

    public static void main(String[] args) {
        new AWTLis();
    }
}