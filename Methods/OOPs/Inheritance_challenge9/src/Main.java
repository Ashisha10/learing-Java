
//Write a Java program to create a class called Shape
//with methods called getPerimeter() and getArea().
//Create a subclass called Circle that overrides the
//getPerimeter() and getArea() methods to calculate the area and perimeter of a circle.

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(3);
        double area = c.getArea();
        double peri = c.getPeri();
        System.out.println(area + " " + peri);
    }
}