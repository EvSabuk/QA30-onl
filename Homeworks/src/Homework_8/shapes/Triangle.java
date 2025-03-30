package Homework_8.shapes;

public class Triangle extends Shapes {
    private double a;
    private  double b;
    private  double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        double halfPerimeter = perimeter() / 2;
        return Math.sqrt( halfPerimeter * (halfPerimeter - a)*(halfPerimeter-b)*(halfPerimeter-c));
    }

    public double perimeter() {
        return a+b+c;
    }

}
