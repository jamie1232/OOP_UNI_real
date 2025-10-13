package week04tutorial;

public class TestCylinder {

    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder:"
                + " radius=" + c1.getRadius()
                + " height=" + c1.getHeight()
                + " base area=" + c1.getBaseArea()
                + " surface area=" + c1.getArea()
                + " volume=" + c1.getVolume());

        Cylinder c2 = new Cylinder(5.0);
        System.out.println("Cylinder:"
                + " radius=" + c2.getRadius()
                + " height=" + c2.getHeight()
                + " base area=" + c2.getBaseArea()
                + " surface area=" + c2.getArea()
                + " volume=" + c2.getVolume());

        Cylinder c3 = new Cylinder(5.0, 10.0);
        System.out.println("Cylinder:"
                + " radius=" + c3.getRadius()
                + " height=" + c3.getHeight()
                + " base area=" + c3.getBaseArea()
                + " surface area=" + c3.getArea()
                + " volume=" + c3.getVolume());

        // Also demonstrate calling getArea() on a Circle vs Cylinder
        Circle cir = new Circle(5.0, "blue");
        System.out.println("Circle area (should be base area for r=5): " + cir.getArea());
        System.out.println("Cylinder surface area (r=5,h=10) using c3.getArea(): " + c3.getArea());
    }
}
