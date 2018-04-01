package org.redbasin.algorithms.geometry;

// works for rectangles too
/**
 * Created by manojjoshi on 4/1/18.
 */
public class Square {
    Point nw;
    Point ne;
    Point sw;
    Point se;

    public Square(Point nw, Point ne, Point sw, Point se) {
        this.nw = nw;
        this.ne = ne;
        this.sw = sw;
        this.se = se;
    }
    boolean isWithin(Point point) {
        return (point.X >= nw.X && point.X <= ne.X
                && point.Y <= nw.Y && point.Y >= sw.Y);
    }

    boolean intersects(Square other) {
        return isWithin(other.nw) ||
                isWithin(other.ne) ||
                isWithin(other.sw) ||
                isWithin(other.se);
    }

    public static void main(String[] args) {
        Square s1 = new Square(new Point(2, 7),
                new Point(10, 7), new Point(2, -1),
                new Point(10, -1));
        Square s2 = new Square(new Point(20, 70),
                new Point(100, 70), new Point(20, -10),
                new Point(100, -10));
        System.out.println("Intersect? " + s1.intersects(s2));
    }
}
