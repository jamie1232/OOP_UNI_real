package tutorial05_shapecollection;
import java.util.Scanner;

public class GeometricShapeCollection implements ShapeCollection {
    private GeometricObject[] shapeList;
    private int maxNumShape;
    public static int totalNumShape = 0;

    public GeometricShapeCollection(int listLength) {
        this.maxNumShape = listLength;
        shapeList = new GeometricObject[maxNumShape];
    }

    @Override
    public void addShape(GeometricObject shape) {
        if (totalNumShape < maxNumShape) {
            shapeList[totalNumShape] = shape;
            totalNumShape++;
        } else {
            System.out.println("No more space in the list");
        }
    }

    @Override
    public void printShapeList() {
        for (int i = 0; i < totalNumShape; i++) {
            GeometricObject shape = shapeList[i];
            System.out.println("Shape = " + shape.getShape() +
                               ", Area = " + shape.getArea() +
                               ", Perimeter = " + shape.getPerimeter());
        }
    }

    @Override
    public boolean runMenu() {
        boolean exit = false;
        Scanner s = new Scanner(System.in);

        System.out.println("\nTo Add a new shape press 1");
        System.out.println("To print the list of the shapes press 2");
        System.out.println("To exit press 3");

        int choice = s.nextInt();
        s.nextLine();

        switch (choice) {
            case 1:
                if (GeometricShapeCollection.totalNumShape < maxNumShape) {
                    System.out.println("Press 1 to add a Circle");
                    System.out.println("Press 2 to add a Rectangle");
                    System.out.println("Press 3 to add a Square");
                    int choice2 = s.nextInt();
                    s.nextLine();

                    System.out.println("Enter the colour of your shape:");
                    String colour = s.nextLine();

                    System.out.println("Is it filled? (y/n):");
                    String isFilled = s.nextLine();
                    boolean filled = isFilled.equalsIgnoreCase("y");

                    switch (choice2) {
                        case 1:
                            System.out.println("Enter the radius:");
                            double radius = s.nextDouble();
                            Circle c = new Circle(radius, colour, filled);
                            this.addShape(c);
                            break;
                        case 2:
                            System.out.println("Enter the length:");
                            double length = s.nextDouble();
                            System.out.println("Enter the width:");
                            double width = s.nextDouble();
                            Rectangle r = new Rectangle(length, width, colour, filled);
                            this.addShape(r);
                            break;
                        case 3:
                            System.out.println("Enter the side:");
                            double side = s.nextDouble();
                            Square sq = new Square(side, colour, filled);
                            this.addShape(sq);
                            break;
                        default:
                            System.out.println("Invalid option.");
                    }
                } else {
                    System.out.println("No more space in the list!");
                }
                break;

            case 2:
                this.printShapeList();
                break;

            case 3:
                exit = true;
                break;

            default:
                System.out.println("Invalid input.");
        }
        return exit;
    }
}
