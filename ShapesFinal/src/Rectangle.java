
import java.awt.geom.Point2D;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class Rectangle extends Shape {
    private double width, height;
    private Point2D.Double TopLeftPoint, BottomRightPoint;

    public Rectangle(Point2D.Double center, double width, double height) throws IllegalArgumentException{
        super(center);
        this.width = width;
        this.height = height;
        this.TopLeftPoint = new Point2D.Double(center.x-width/2, center.y-height/2);
        this.BottomRightPoint = new Point2D.Double(center.x+width/2, center.y+height/2);

        if (height == 0 && width == 0)

            if (height == 0) {
                throw new IllegalArgumentException("rectangle can't have 0 height.");
            }
        if (width == 0){
            throw new IllegalArgumentException("rectangle can't have 0 width.");
        }
    }

    public void setWidth(double width){
        this.width = width;
    }
    public double getWidth(){
        return width;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
    public Point2D.Double getTopLeftPoint(){
        return TopLeftPoint;
    }
    public Point2D.Double getBottomRightPoint(){
        return BottomRightPoint;
    }
    public void setCenter(Point2D.Double center){
        this.center = center;
    }
    public Point2D.Double getCenter(){
        return center;
    }


    @Override
    public double area(){
        return getWidth()*getHeight();
    }

    @Override
    public double circumference(){
        return 2*(abs(getWidth())+abs(getHeight()));
    }

    @Override
    public boolean isInside(Point2D.Double p){
        boolean inside = false;
        boolean yInside = (getTopLeftPoint().y <= p.y && p.y <= getBottomRightPoint().y);
        boolean xInside = (getTopLeftPoint().x <= p.x && p.x <= getBottomRightPoint().x);
        if (yInside && xInside){
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
