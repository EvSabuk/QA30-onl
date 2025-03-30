package Homework_8.shapes;

public class Calculation {
    public static void main(String[] args) {
        Shapes triangle = new Triangle(12.2,31.2,33.1);
        Shapes circle = new Circle(55.1);
        Shapes circleSecond = new Circle(22.1);
        Shapes rectangle = new Rectangle(44.1,66.2);
        Shapes square = new Rectangle(22.2,22.2);

        Shapes[] shapesArray = new Shapes[]{triangle, circle,circleSecond, rectangle, square};

        double totalPerimeter = 0;

        for(Shapes shapes : shapesArray) {
            totalPerimeter += shapes.perimeter();

        }System.out.println("Sum of perimeters: " + totalPerimeter);


    }


}
