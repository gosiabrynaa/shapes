import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

import java.awt.geom.Point2D;

import static org.junit.Assert.*;

public class CircleTest {
    //making 3 points
    private Point2D.Double center1 = new Point2D.Double( 1,1);
    private Point2D.Double center2 = new Point2D.Double(2,6);
    private Point2D.Double center3 = new Point2D.Double(-10,7);
    //making 6 test circles with different radiuses
    private Circle testcircle1 = new Circle(center1,1);
    private Circle testcircle2 = new Circle(center2,1);
    private Circle testcircle3 = new Circle(center3,1);
    private Circle testcircle4 = new Circle(center1, 10);
    private Circle testcircle5 = new Circle(center2, -1);
    private Circle testcircle6 = new Circle(center3, -100);



    @Test
    public void area() {
        assertEquals(3.14159, testcircle1.area());
        assertEquals(314.15927, testcircle4.area());
        assertEquals(3.14159, testcircle5.area());
    }

    @Test
    public void circumference() {
        assertEquals(6.28318, testcircle1.circumference());
        assertEquals(62.83185, testcircle4.circumference());
        assertEquals(628.31853, testcircle6.circumference());
    }

    @Test
    public void isInside() {
        assertTrue(testcircle1.isInside(center1));
        assertFalse(testcircle1.isInside(new Point2D.Double(0,-1)));
        assertFalse(testcircle1.isInside(new Point2D.Double(0,-5)));
        assertTrue(testcircle4.isInside(new Point2D.Double(0,1)));
        assertFalse(testcircle4.isInside(new Point2D.Double(0,15)));
        assertTrue(testcircle4.isInside(new Point2D.Double(-1,-1)));
        assertFalse(testcircle2.isInside(new Point2D.Double(-3,0)));
        assertTrue(testcircle2.isInside(new Point2D.Double(2,5.75)));
        assertFalse(testcircle2.isInside(new Point2D.Double(10,2)));
    }

    @Test
    public void distanceFrom() {
        assertEquals(5, testcircle1.distanceFrom(new Point2D.Double(6,1)));
        assertEquals(2, testcircle2.distanceFrom(new Point2D.Double(0,6)));
    }

    @Test
    public void center() {
        assertEquals(center1, testcircle1.getCenter());
        assertEquals(center2, testcircle2.getCenter());
        assertEquals(center3, testcircle3.getCenter());
    }
}