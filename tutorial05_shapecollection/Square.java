package tutorial05_shapecollection;

public class Square extends GeometricObject {
    private double side;

    public Square() {
        super();
        this.side = 1.0;
    }

    public Square(double side, String colour, boolean filled) {
        super(colour, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String getShape() {
        return "Square";
    }
}
