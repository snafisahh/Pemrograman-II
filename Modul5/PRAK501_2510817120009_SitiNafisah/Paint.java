package PRAK501_2510817120009_SitiNafisah;

public class Paint {
    private double coverage;

    public Paint(double c) {
        coverage = c;
    }

    public double amount(Shape s) {
        System.out.println("Computing amount for " + s);
        return Math.ceil(s.area() / coverage);
    }
}