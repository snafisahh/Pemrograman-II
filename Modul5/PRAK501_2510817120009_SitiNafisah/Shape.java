package PRAK501_2510817120009_SitiNafisah;

public  abstract class Shape {
    protected String shapeName;

    public Shape(String n) {
        shapeName = n;
    }

    protected abstract double area();

    public String toString() {
        return shapeName;
    }
}