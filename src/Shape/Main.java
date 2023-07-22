package Shape;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(3);
        System.out.println("A kor terulete: " + circle.getArea());
        System.out.println("A kor kerulete: " + circle.getPermiter());

        Square square = new Square(3);
        System.out.println("A negyzet terulete: " + square.getArea());
        System.out.println("A negyzet kerulete: " + square.getPermiter());

        Rectangle rectangle = new Rectangle(3, 5);
        System.out.println("A teglalap terulete:" + rectangle.getArea());
        System.out.println("A teglalap kerulete:" + rectangle.getPermiter());
    }
}
