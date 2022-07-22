import java.awt.*;

class AWT extends Frame {
    AWT() {
        Button b = new Button("Click me");
        b.setBounds(30, 100, 80, 30);
        add(b);
        setSize(700, 300);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String args[]) {
        AWT a = new AWT();
    }
}
