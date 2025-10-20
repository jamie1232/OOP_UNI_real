package tutorial05_shapecollection;

public abstract class GeometricObject {
    protected String colour;
    protected boolean filled;

    public GeometricObject() {
        this.colour = "undefined";
        this.filled = false;
    }

    public GeometricObject(String colour, boolean filled) {
        this.colour = colour;
        this.filled = filled;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean getFilled() {
        return filled;
    }

    @Override
    public String toString() {
        return "Colour: " + colour + ", Filled: " + filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String getShape();
}
