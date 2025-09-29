package javaapplication2;

// Circle.java
public class Circle {
    private double radius;
    private String colour;

    // Constructors
    public Circle() {
        this.radius = 1;
        this.colour = "Blue";
    }

    public Circle(double radius) {
        this.radius = radius;
        this.colour = "Blue";
    }

    public Circle(double radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }

    // Getters
    public double getRadius() {
        return radius;
    }

    public String getColour() {
        return colour;
    }

    // Setters
    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    public void setColour(String newColour) {
        this.colour = newColour;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", colour=" + colour + "]";
    }
}