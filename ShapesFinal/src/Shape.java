
import java.awt.geom.Point2D;

abstract class Shape {
    Point2D.Double center;
    public Shape(Point2D.Double center){
        this.center = center;
    }
    // middle point of the shape
    abstract Point2D.Double center();
    // area of the shape
    abstract double area();
    // circumference of the shape
    abstract double circumference();
    // is point p inside the shape
    abstract boolean isInside(Point2D.Double p);
    // distance from the point p
    abstract double distanceFrom(Point2D.Double p);

}
