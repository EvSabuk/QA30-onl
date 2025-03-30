package Homework_8.shapes;

public class Circle  extends Shapes{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return radius*radius*Math.PI;
    }

    public double perimeter() {
        return 2*radius*Math.PI;
    }
}
