package lab04.Shape;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle("Circle", 5.0);
        Rectangle rectangle = new Rectangle("Rectangle",2.0,3.5);
        Square square = new Square("Square",2.0,4.1);
        System.out.println("Площадь круга = "+circle.getArea());
        System.out.println("Площадь прямоугольника = "+rectangle.getArea());
        System.out.println("Площадь квадрата = "+square.getArea());
        System.out.println("Периметр круга = "+circle.getPerimeter());
        System.out.println("Периметр прямоугольника = "+rectangle.getPerimeter());
        System.out.println("Периметр квадрата = "+square.getPerimeter());
        System.out.println("Типы фигур: "+circle.getType()+", "+rectangle.getType()+", "+square.getType());
        System.out.println(circle.toString());
        System.out.println(rectangle.toString());
        System.out.println(square.toString());
    }
}
