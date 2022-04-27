
import java.awt.geom.Point2D;

public class Main {

    public static void main(String[] args) {


        Point2D.Double PointP = new Point2D.Double();

        //Rectangle
        Point2D.Double RectangleCenter = new Point2D.Double(7,8); //coordinates of center point
        Rectangle rectangle = new Rectangle(RectangleCenter, 3, 4);
        System.out.println("Rectangle dimensions are - "
                + rectangle.getWidth() + "width "
                + rectangle.getHeight() + "height"
                +"\n Area: " + rectangle.area()
                +"\n Center: (" + rectangle.center.x + "," + rectangle.center.y + ")."
                +"\n Circumference: " + rectangle.circumference()
                +"\n Distance to PointP: " + rectangle.distanceFrom(PointP)
                +"\n Center inside: " + rectangle.isInside(rectangle.center)
                +"\n PointP inside?: " + rectangle.isInside(PointP)
                +"\n");

        //Triangle
        Point2D.Double nullCenter = new Point2D.Double();
        Point2D.Double a = new Point2D.Double(-3,2);
        Point2D.Double b = new Point2D.Double(4,5);
        Point2D.Double c = new Point2D.Double(-6,-1);
        Triangle triangle = new Triangle(nullCenter, a,b,c);
        System.out.println("Triangle dimensions are   "

                +"\n Area: " + triangle.area()
                +"\n Center: (" + triangle.getCenter().x + "," + triangle.getCenter().y + ")."
                +"\n Circumference: " + triangle.circumference()
                +"\n Distance to PointP: " + triangle.distanceFrom(PointP)
                +"\n Center inside: " + triangle.isInside(rectangle.center)
                +"\n PointP inside?: " + triangle.isInside(PointP)
                +"\n");


        //Circle
        Point2D.Double circleCenter = new Point2D.Double(5,5);
        Circle circle = new Circle(circleCenter, -5);
        System.out.println("Circle dimensions: " + circle.radius + " radius."
                +"\n Area: " + circle.area()
                +"\n Center: (" + circle.center.x + "," + circle.center.y + ")."
                +"\n Circumference: " + circle.circumference()
                +"\n distance to PointP: " + circle.distanceFrom(PointP)
                +"\n Center inside: " + circle.isInside(rectangle.center)
                +"\n PointP inside: " + circle.isInside(PointP)
                +"\n");

        // Distance between centre points of circle and rectangle
        System.out.println("Distance from center of Circle (" + circle.center.x + "," + circle.center.y + ")"
                + "\n to center of Rectangle (" + rectangle.center.x + "," + rectangle.center.y + "): " + circle.distanceFrom(rectangle.center) + ".");


    }

}
