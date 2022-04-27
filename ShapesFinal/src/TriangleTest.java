import org.junit.Test;

import java.awt.geom.Point2D;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

import static junit.framework.TestCase.assertEquals;

public class TriangleTest {
    private Point2D.Double nullCenter = new Point2D.Double();
    //making points
    private Point2D.Double a1 = new Point2D.Double(0,0);
    private Point2D.Double b1 = new Point2D.Double(1,1);
    private Point2D.Double c1 = new Point2D.Double(1,0);
    private Point2D.Double a2 = new Point2D.Double(0,-3);
    private Point2D.Double b2 = new Point2D.Double(2,-3);
    private Point2D.Double c2 = new Point2D.Double(1,-4);
    private Point2D.Double d = new Point2D.Double(0.8,0.2);

    private Triangle testtriangle1 = new Triangle(nullCenter, a1,b1,c1);
    private Triangle testtriangle2 = new Triangle(nullCenter, a2,b2,c2);

    @Test
    public void circumference() {
        assertEquals(3.414, testtriangle1.circumference());
        assertEquals(4.828, testtriangle2.circumference());
    }

    @Test
    public void area() {
        assertEquals(0.5, testtriangle1.area());
        assertEquals(1, testtriangle2.area());
    }



    @Test
    public void center() {
        assertEquals(new Point2D.Double(0.667,0.333), testtriangle1.center());
        assertEquals(new Point2D.Double(1,-3.333), testtriangle2.center());
    }

    @Test
    public void isInside() {
        assertTrue(testtriangle1.isInside(d));
        assertFalse(testtriangle2.isInside(d));

    }

}