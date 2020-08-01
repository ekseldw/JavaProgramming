package Ch01;

import java.awt.Frame;
import java.awt.Graphics;

public class Jv_1_2_awt extends Frame {
    public Jv_1_2_awt(String title) {
        super(title);
        setSize(300, 200);
        setVisible(true);
    }

    public void paint(Graphics g) {
        g.drawString("Welcome to JAVA!", 50, 50);
    }

    public static void main(String[] args) {
        new Jv_1_2_awt("Welcome to JAVA!");
    }
}