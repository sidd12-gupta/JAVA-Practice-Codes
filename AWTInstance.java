import java.awt.*;

public class AWTInstance {

    AWTInstance() {
        Frame f = new Frame();
        Button b = new Button("click me");
        b.setBounds(45, 45, 67, 76);
        f.add(b);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        AWTInstance a = new AWTInstance();
    }

}
