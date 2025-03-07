// Class representing a Cylinder
public class Cylinder extends Shape implements Volume {
    private double radius, height;

    public Cylinder(double radius, double height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    @Override
    public void calculateShape() {
        double area = 2 * Math.PI * radius * (radius + height);
        System.out.println("Surface Area of Cylinder: " + area);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Cylinder has no perimeter.");
    }

    @Override
    public void calculateVolume() {
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume of Cylinder: " + volume);
    }
}
