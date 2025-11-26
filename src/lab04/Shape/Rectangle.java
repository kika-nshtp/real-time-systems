package lab04.Shape;

public class Rectangle extends Shape{
    public double a;
    public double b;

    public Rectangle(String type, double a, double b){
        super(type);
        this.a = a;
        this.b = b;
    }
    @Override public String getType(){
        return super.getType();
    }
    public double getPerimeter(){
        return (a+b)*2;
    }
    public double getArea(){
        return a*b;
    }
    @Override
    public String toString() {
        return super.toString()+"{"+"a="+a+", b="+b+'\''+'}';
    }
}
