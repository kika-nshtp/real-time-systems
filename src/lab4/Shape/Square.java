package lab4.Shape;

public class Square extends Shape{
    public double a;
    public double b;

    public Square(String type, double a, double b){
        super(type);
        this.a = a;
        this.b = b;
    }
    @Override
    public String getType() {
        return super.getType();
    }
    public double getArea(){
        return a*b;
    }
    public double getPerimeter(){
        return 2*(a+b);
    }
    @Override
    public String toString(){
        return super.toString()+"{"+"a="+a+", b="+b+'\''+'}';
    }
}
