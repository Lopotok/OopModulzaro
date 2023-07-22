package Shape;

public class Circle implements Formula {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPermiter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
