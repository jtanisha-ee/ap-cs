package org.redbasin.geometry;

import javax.swing.*;
import java.awt.*;

/**
 * Created by manojjoshi on 4/23/17.
 */
public class DrawSimpleCircle extends JFrame {
    int x;
    int y;

    /**
     * Constructor is a special method that is called when
     * a new class is created.
     */
    public DrawSimpleCircle(int x, int y) {
        this.x = x;
        this.y = y;
        setTitle("Tutorial");
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        //g.setColor(Color.BLUE);
        for (int i = 0; i < 30; i++) {
            //Color c = new Color(i, i, i);
            g.setColor(new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
            // the 3rd and 4th params deal with size of circles
            // 3rd parameter is horizontal extent, happens to be major
            // 4th param is vertical extent, happens to be minor
            g.drawOval(40+x+i, 40+y+i, 200, 100);
            g.fillOval(80+x+i, 40+y+i, 300, 100);
        }
    }

    public static void main(String args[]) {
        DrawSimpleCircle t = new DrawSimpleCircle(0, 0);
        DrawSimpleCircle t1 = new DrawSimpleCircle(0, 0);
        t.paint(null);
        t1.paint(null);
    }

}
