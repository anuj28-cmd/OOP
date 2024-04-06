package OOP.Lab_Exp;
import java.util.Scanner;

class Shape {
    protected double area;


    public void setArea() {
        System.out.println("Area has not been implemented for this shape.");
    }
    
   
    public void getInputs() {
        System.out.println("No inputs required for this shape.");
    }

    public void displayArea() {
        System.out.println("Area: " + area);
    }
}


class Triangle extends Shape {
    private double height;
    private double base;

    @Override
    public void setArea() {
        area = 0.5 * base * height;
    }

    @Override
    public void getInputs() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter height (H) of triangle: ");
        height = scanner.nextDouble();
        System.out.print("Enter base (B) of triangle: ");
        base = scanner.nextDouble();
        scanner.close();
    }
}

// Derived class Square
class Square extends Shape {
    private double side;

    // Overloaded method to set area for square
    @Override
    public void setArea() {
        area = side * side;
    }

    // Method to get inputs for square
    @Override
    public void getInputs() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side (S) of square: ");
        side = scanner.nextDouble();
        scanner.close();
    }
}

// Derived class Circle
class Circle extends Shape {
    private double radius;
    private double pie;

    // Overloaded method to set area for circle
    @Override
    public void setArea() {
        area = pie * radius * radius;
    }

    // Method to get inputs for circle
    @Override
    public void getInputs() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter π (Pie) value: ");
        pie = scanner.nextDouble();
        System.out.print("Enter radius (R) of circle: ");
        radius = scanner.nextDouble();
        scanner.close();
    }
}

// Tester class
public class Lab_exp3 {
    public static void main(String[] args) {
        // Create objects of each shape
        Triangle triangle = new Triangle();
        Square square = new Square();
        Circle circle = new Circle();

        triangle.getInputs();
        square.getInputs();
        circle.getInputs();

        triangle.setArea();
        square.setArea();
        circle.setArea();

        System.out.println("Area of Triangle:");
        triangle.displayArea();
        System.out.println("\nArea of Square:");
        square.displayArea();
        System.out.println("\nArea of Circle:");
        circle.displayArea();
    }
}
