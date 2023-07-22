package Shape;

public class Square implements Formula {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getPermiter() {
        return 4 * side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
