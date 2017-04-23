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
        g.setColor(Color.GREEN);
        g.drawOval(100, 100, 200, 200);
        g.fillOval(100, 100, 200, 200);
    }

    public static void main(String args[]) {
        DrawSimpleCircle t = new DrawSimpleCircle();
        t.paint(null);
    }

}
