import java.util.Scanner;

class IncomeTax {
    protected String name;
    protected int age;
    protected double annualIncome;

    public IncomeTax(String name, int age, double annualIncome) {
        this.name = name;
        this.age = age;
        this.annualIncome = annualIncome;
    }

    public double findTax() {
        // This method will be overridden in the derived classes
        return 0.0;
    }

    public void displayTax() {
        // This method will be overridden in the derived classes
    }
}

class ResidentTax extends IncomeTax {
    public ResidentTax(String name, int age, double annualIncome) {
        super(name, age, annualIncome);
    }

    @Override
    public double findTax() {
        double tax = 0.0;
        if (annualIncome <= 250000) {
            tax = 0.0;
        } else if (annualIncome <= 500000) {
            tax = 0.05 * (annualIncome - 250000);
        } else if (annualIncome <= 750000) {
            tax = 12500 + 0.1 * (annualIncome - 500000);
        } else if (annualIncome <= 1000000) {
            tax = 37500 + 0.15 * (annualIncome - 750000);
        } else {
            tax = 75000 + 0.2 * (annualIncome - 1000000);
        }
        return tax;
    }

    @Override
    public void displayTax() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Annual Income: " + annualIncome);
        System.out.println("Tax Amount: " + findTax());
    }
}

class SeniorCitizenTax extends IncomeTax {
    public SeniorCitizenTax(String name, int age, double annualIncome) {
        super(name, age, annualIncome);
    }

    @Override
    public double findTax() {
        double tax = 0.0;
        if (annualIncome <= 300000) {
            tax = 0.0;
        } else if (annualIncome <= 500000) {
            tax = 0.05 * (annualIncome - 300000);
        } else if (annualIncome <= 1000000) {
            tax = 10000 + 0.2 * (annualIncome - 500000);
        } else {
            tax = 110000 + 0.3 * (annualIncome - 1000000);
        }
        return tax;
    }

    @Override
    public void displayTax() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Annual Income: " + annualIncome);
        System.out.println("Tax Amount: " + findTax());
    }
}

public class Ex5_2    {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Resident <60 Years of Age");
            System.out.println("2. Senior Citizen >60 Years of Age");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1 || choice == 2) {
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter age: ");
                int age = scanner.nextInt();
                System.out.print("Enter annual income: ");
                double income = scanner.nextDouble();

                if (choice == 1) {
                    IncomeTax resident = new ResidentTax(name, age, income);
                    resident.displayTax();
                } else {
                    IncomeTax seniorCitizen = new SeniorCitizenTax(name, age, income);
                    seniorCitizen.displayTax();
                }
            } else if (choice != 3) {
                System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 3);

        System.out.println("Exiting the program.");
        scanner.close();
    }
}
