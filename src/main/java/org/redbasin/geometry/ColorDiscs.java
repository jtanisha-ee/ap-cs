package org.redbasin.geometry;

import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.Color;

/**
 * Created by manojjoshi on 4/23/17.
 */
public class ColorDiscs extends JFrame {

    public ColorDiscs() {
        setTitle("Tutorial");
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        for (int i = 0; i < 100; i++) {
            g.setColor(new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
            g.drawOval(100+i, 100+i, 200, 200);
            g.fillOval(100+i, 100+i, 200, 200);
        }
    }

    public static void main(String args[]) {
        ColorDiscs t = new ColorDiscs();
        t.paint(null);
    }

}
