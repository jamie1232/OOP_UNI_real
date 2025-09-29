package javaapplication2;
// TutorialCircle.java
public class TutorialCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1);

        Circle circle2 = new Circle(8);
        System.out.println(circle2);

        Circle circle3 = new Circle(5, "Red");
        System.out.println(circle3);

        // Change values
        circle3.setRadius(10);
        circle3.setColour("Green");
        System.out.println("Updated circle3: " + circle3);
    }
}