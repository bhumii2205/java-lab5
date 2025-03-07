// Abstract class representing a general Shape
public abstract class Shape {
    protected String shapeName;

    // Constructor to set the shape name
    public Shape(String shape) {
        this.shapeName = shape;
    }

    // Abstract methods
    public abstract void calculateShape();
    public abstract void calculatePerimeter();
}
