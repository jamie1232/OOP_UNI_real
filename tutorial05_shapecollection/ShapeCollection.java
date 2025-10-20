package tutorial05_shapecollection;

public interface ShapeCollection {
    public abstract void addShape(GeometricObject shape);
    public abstract void printShapeList();
    public abstract boolean runMenu();
}
