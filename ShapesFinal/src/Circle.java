

import java.awt.geom.Point2D;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class Circle extends Shape {

    public  double radius;
    final double PI = Math.PI;


    public Circle(Point2D.Double center, double radius){
        super(center);
        this.radius = radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setCenter(Point2D.Double center){
        this.center = center;
    }
    public Point2D.Double getCenter(){
        return center;
    }

    @Override
    public double area(){
        return PI*Math.pow(getRadius(),2);
    }

    @Override
    public double circumference(){
        return 2*PI*abs(getRadius());
    }

    @Override
    public boolean isInside(Point2D.Double p){
        boolean inside = false;
        double pDistanceToCenter;
        double normalizedX, normalizedY;

        normalizedX = p.x - getCenter().x;
        normalizedY = p.y - getCenter().y;
        pDistanceToCenter = Math.sqrt(Math.pow(normalizedX, 2) + Math.pow(normalizedY, 2));
        if (pDistanceToCenter <= getRadius()){
            inside = true;
        }
        return inside;
    }

    @Override
    public double distanceFrom(Point2D.Double p){
        double absX = abs(getCenter().x - p.x);
        double absY = abs(getCenter().y - p.y);
        return sqrt(Math.pow(absX, 2) + Math.pow(absY, 2));
    }

    @Override
    public Point2D.Double center(){
        return getCenter();
    }
}
