package Ch01;

import java.awt.Frame;
import java.awt.Graphics;

public class Jv_1_b2_awt extends Frame {
    public Jv_1_b2_awt(String title) {
        super(title);

        setSize(500, 300);
        setVisible(true);
    }

    public void paint(Graphics g) {
        g.drawString("Welcome to JAVA!", 50, 50);
        g.drawString("Welcome to C++!", 50, 70);
        g.drawString("Welcome to ASP!", 50, 90);
    }

    public static void main(String[] args) {
        new Jv_1_b2_awt("Welcome to Program Language!");
    }
}