package Shape;

public class Rectangle implements Formula {

    private double weight;

    private double height;

    public Rectangle(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public double getPermiter() {
        return 2 * (weight + height);
    }

    @Override
    public double getArea() {
        return height * weight;
    }
}
