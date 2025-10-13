package week04tutorial;

/**
 * Cylinder subclass of Circle
 */
public class Cylinder extends Circle {

    private double height;

    // Constructor with default color, radius and height
    public Cylinder() {
        super();
        this.height = 1.0;
    }

    // Constructor with default radius, color but given height
    public Cylinder(double height) {
        super();
        this.height = height;
    }

    // Constructor with default color, but given radius, height
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    // Constructor with radius, height and color
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double h) {
        this.height = h;
    }

    /**
     * Override getArea to return the SURFACE area of the cylinder: surface area
     * = 2 * baseArea + lateralArea = 2 * (πr^2) + (2πr * h)
     */
    @Override
    public double getArea() {
        double r = getRadius();
        double baseArea = Math.PI * r * r;
        double lateral = 2 * Math.PI * r * height;
        return 2 * baseArea + lateral;
    }

    /**
     * getBaseArea returns the base area (πr^2). Useful because getArea() is
     * overridden.
     */
    public double getBaseArea() {
        return super.getArea();
    }

    /**
     * Volume should be base area * height. We must use super.getArea() to get
     * base area because getArea() is overridden in this class to return surface
     * area.
     */
    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + " height=" + height;
    }
}
