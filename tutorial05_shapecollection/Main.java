package tutorial05_shapecollection;

public class Main {
    public static void main(String[] args) {
        ShapeCollection system = new GeometricShapeCollection(5);
        boolean exit = false;
        while (!exit) {
            exit = system.runMenu();
        }
    }
}
