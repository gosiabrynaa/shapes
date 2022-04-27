
import java.awt.geom.Point2D;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class Triangle extends Shape {
    private Point2D.Double a, b, c;
    private Point2D.Double center;


    public Triangle(Point2D.Double center, Point2D.Double a, Point2D.Double b, Point2D.Double c) throws ArithmeticException {
        super(center);
        this.a = a;
        this.b = b;
        this.c = c;
        this.center = center();
        if (area() == 0) {
            throw new ArithmeticException("You can't make a triangle with 0 area");
        }
    }

    public void setA(Point2D.Double a){
        this.a = a;
    }
    public Point2D.Double getA(){
        return a;
    }
    public void setB(Point2D.Double b){
        this.b = b;
    }
    public Point2D.Double getB(){
        return b;
    }
    public void setC(Point2D.Double c){
        this.c = c;
    }
    public Point2D.Double getC(){
        return c;
    }
    public Point2D.Double getCenter(){
        return center();
    }




    private double length2p(Point2D.Double a, Point2D.Double b) {
        double absX = abs(a.x - b.x);
        double absY = abs(a.y - b.y);
        return sqrt(Math.pow(absX, 2) + Math.pow(absY, 2));
    }

    @Override
    public double circumference() {
        double ab = length2p(getA(), getB()), bc = length2p(getB(), getC()), ca = length2p(getC(), getA());
        return ab + bc + ca;
    }

    @Override
    public double area() {
        // Area = [x1(y2-y3)+x2(y3-y1)+x3(y1-y2)]/2
        // Area = [xa(yb-yc)+xb(yc-ya)+xc(ya-yb)]/2

        return abs((getA().x*(getB().y-getC().y))+((getB().x)*((getC().y)-(getA().y))+((getC().x)*((getA().y)-(getB().y))))/2);
    }

    public double area(Point2D.Double a, Point2D.Double b, Point2D.Double c){
        return abs((a.x*(b.y-c.y))+(b.x*(c.y-a.y))+(c.x*(a.y-b.y)))/2;
    }


    @Override
    public Point2D.Double center() {
        // calculation-> Center.x = (a.x+b.x+c.x)/3 ; Center.y = (a.y+b.y+c.y)/3
        double centerX = (getA().x + getB().x + getC().x) / 3;
        double centerY = (getA().y + getB().y + getC().y) / 3;
        return new Point2D.Double(centerX, centerY);
    }

    @Override
    public boolean isInside(Point2D.Double p) {
        // Area = [xa(yp-yc)+xp(yc-ya)+xc(ya-yp)]/2
        double apcArea = area(a, p, c);
        // Area = [xp(yb-yc)+xb(yc-yp)+xc(yp-yb)]/2
        double bpcArea = area(b,p,c);
        // Area = [xa(yb-yp)+xb(yp-ya)+xp(ya-yb)]/2
        double apbArea = area(a,p,b);
        if ((area() == (apcArea+bpcArea+apbArea))){
            return true;
        } else return false;


    }

    @Override
    public double distanceFrom(Point2D.Double p){
        double absX = abs(getCenter().x - p.x);
        double absY = abs(getCenter().y - p.y);
        return sqrt(Math.pow(absX, 2) + Math.pow(absY, 2));
    }

}
