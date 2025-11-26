package lab4.Abstract;
import java.lang.Math;

public class Circle1 extends Shape1{
    private double radius;

    public Circle1(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {return radius;}
    public void setRadius(double radius) {this.radius = radius;}

    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle{"+"radius="+radius+'\''+'}';
    }
}
