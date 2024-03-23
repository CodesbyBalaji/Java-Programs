import java.util.Scanner;
class Shape {
    protected double dimension1;
    protected double dimension2;

    public void setDimensions(double dim1, double dim2) {
        dimension1 = dim1;
        dimension2 = dim2;
    }

    public double getDimension1() {
        return dimension1;
    }

    public double getDimension2() {
        return dimension2;
    }

    public void findArea() {
        // This method will be overridden in the derived classes
    }

    public void displayArea() {
        // This method will be overridden in the derived classes
    }
}

class Triangle extends Shape {
    @Override
    public void findArea() {
        double area = 0.5 * dimension1 * dimension2;
        System.out.println("Area of Triangle: " + area);
    }

    @Override
    public void displayArea() {
        System.out.println("Triangle Area Displayed");
    }
}

class Rectangle extends Shape {
    @Override
    public void findArea() {
        double area = dimension1 * dimension2;
        System.out.println("Area of Rectangle: " + area);
    }

    @Override
    public void displayArea() {
        System.out.println("Rectangle Area Displayed");
    }
}

public class Ex5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape shape=new Shape();
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Triangle");
            System.out.println("2. Rectangle");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    shape = new Triangle();
                    break;
                case 2:
                    shape = new Rectangle();
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    continue;
            }

            System.out.print("Enter dimension 1: ");
            double dim1 = scanner.nextDouble();
            System.out.print("Enter dimension 2: ");
            double dim2 = scanner.nextDouble();
            shape.setDimensions(dim1, dim2);

            shape.findArea();
            shape.displayArea();

        } while (choice != 3);
    }
}
