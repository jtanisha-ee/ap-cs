package org.redbasin.geometry;

import javax.swing.*;
import java.awt.*;

/**
 * Created by manojjoshi on 4/23/17.
 */
public class DrawSimpleCircle extends JFrame {

    public DrawSimpleCircle() {
        setTitle("Tutorial");
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        for (int i = 0; i < 50; i++) {
            //Color c = new Color(i, i, i);
            g.setColor(new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
            g.drawOval(40+i, 40+i, 40, 40);
            g.fillOval(40+i, 40+i, 40, 40);
        }
    }

    public static void main(String args[]) {
        DrawSimpleCircle t = new DrawSimpleCircle();
        t.paint(null);
    }

}
