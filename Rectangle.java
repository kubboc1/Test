public class Rectangle implements  Shape {
    private double a,b;

    public Rectangle(double a, double b) {
    this.a = a;
    this.b = b;
    }


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    @Override
    public double calculateArea() {
        return a * b;
    }

    @Override
    public double calculatePerimeter() {
        return 2*a + 2*b;
    }

    public String toString() {
        return "Area: " + calculateArea() + " Perimiter: " + calculatePerimeter();
    }
}
