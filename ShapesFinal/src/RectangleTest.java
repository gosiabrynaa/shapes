import org.junit.Test;


import java.awt.geom.Point2D;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.assertEquals;



class rectangleTest {
    private Point2D.Double center1 = new Point2D.Double(1,0);
    private Point2D.Double center2 = new Point2D.Double(5,5);
    private Point2D.Double center3 = new Point2D.Double(-5,-5);

    private Rectangle testrectangle1 = new Rectangle(center1,1,1);
    private Rectangle testrectangle2 = new Rectangle(center2,2,2);
    private Rectangle testrectangle3 = new Rectangle(center3,1,1);
    private Rectangle testrectangle4 = new Rectangle(center1, 5,5);


    @Test
    void center() {
        assertEquals(center1, testrectangle1.getCenter());
        assertEquals(center2, testrectangle2.getCenter());
        assertEquals(center3, testrectangle3.getCenter());
    }

    @Test
    void area() {
        assertEquals(1, testrectangle1.area());
        assertEquals(25, testrectangle4.area());
        assertEquals(1, testrectangle3.area());
    }

    @Test
    void circumference() {
        assertEquals(4, testrectangle1.circumference());
        assertEquals(8, testrectangle2.circumference());
        assertEquals(20, testrectangle4.circumference());

    }

    @Test
    void isInside() {
        assertTrue(testrectangle1.isInside(center1));
        assertFalse(testrectangle1.isInside(center2));
        assertTrue(testrectangle1.isInside(new Point2D.Double(0.8,0)));
        assertFalse(testrectangle4.isInside(new Point2D.Double(-10,-5)));
    }


}