package PRAK501_2510817120009_SitiNafisah;

public class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double r, double h) {
        super("Cylinder");
        radius = r;
        height = h;
    }

    public double area() {
        return Math.PI * (radius * radius) * height;
    }

    public String toString() {
        return super.toString() + " of radius " + radius + " and height " + height;
    }
}