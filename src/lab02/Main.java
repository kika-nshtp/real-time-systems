package lab02;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(1.5,2.0);
        Circle circle1 = new Circle(point1, 2.3);
        Circle circle2 = new Circle(point1, 1.3);
        Circle[] sp = {circle1,circle2};
        Tester tester1 = new Tester(sp);

    }
}
