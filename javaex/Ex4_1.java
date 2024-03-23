import java.util.ArrayList;
import java.util.Scanner;
class Employee {
    private String name;
    private int empid;
    private String department;
    private String designation;
    private int experience;
    private double basicPay;
    private double DA;
    private double gradePay;
    private double personalPay;
    private double iTax;
    private double professionalTax;
    private double epf;
    // Constructors, getters, and setters
    public Employee(String name, int empid, String department, String designation, int experience,
                    double basicPay, double DA, double gradePay, double personalPay,
                    double iTax, double professionalTax, double epf) {
        this.name = name;
        this.empid = empid;
        this.department = department;
        this.designation = designation;
        this.experience = experience;
        this.basicPay = basicPay;
        this.DA = DA;
        this.gradePay = gradePay;
        this.personalPay = personalPay;
        this.iTax = iTax;
        this.professionalTax = professionalTax;
        this.epf = epf;
    }
    // Other getter and setter methods

    // Calculate total salary
    public double calculateSalary() {
        return basicPay + DA + gradePay + personalPay - iTax - professionalTax - epf;
    }
    @Override
    public String toString() {
        return "Name: " + name + "\nEmployee ID: " + empid + "\nDepartment: " + department +
                "\nDesignation: " + designation + "\nExperience: " + experience + " years" +
                "\nSalary: " + calculateSalary();
    }
}
public class Ex4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Employee");
            System.out.println("2. Edit Employee Details");
            System.out.println("3. Delete Employee");
            System.out.println("4. Display Employee Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    employees.add(getEmployeeDetailsFromUser());
                    break;
                case 2:
                    editEmployeeDetails(employees);
                    break;
                case 3:
                    deleteEmployee(employees);
                    break;
                case 4:
                    displayEmployeeDetails(employees);
                    break;
                case 5:
                    System.out.println("Exiting the application.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
    private static Employee getEmployeeDetailsFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee Details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Employee ID: ");
        int empid = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Department: ");
        String department = scanner.nextLine();
        System.out.print("Designation: ");
        String designation = scanner.nextLine();
        System.out.print("Experience (in years): ");
        int experience = scanner.nextInt();
        System.out.print("Basic Pay: ");
        double basicPay = scanner.nextDouble();
        System.out.print("DA (Dearness Allowance): ");
        double DA = scanner.nextDouble();
        System.out.print("Grade Pay: ");
        double gradePay = scanner.nextDouble();
        System.out.print("Personal Pay: ");
        double personalPay = scanner.nextDouble();
        System.out.print("Income Tax: ");
        double iTax = scanner.nextDouble();
        System.out.print("Professional Tax: ");
        double professionalTax = scanner.nextDouble();
        System.out.print("EPF (Employee Provident Fund): ");
        double epf = scanner.nextDouble();

        return new Employee(name, empid, department, designation, experience, basicPay, DA,
                gradePay, personalPay, iTax, professionalTax, epf);
    }

    private static void editEmployeeDetails(ArrayList<Employee> employees) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee ID to edit details: ");
        int empid = scanner.nextInt();

        for (Employee employee : employees) {
            if (employee.getEmpid() == empid) {
                System.out.println("Editing details for Employee ID: " + empid);
                employees.remove(employee);
                employees.add(getEmployeeDetailsFromUser());
                System.out.println("Details updated successfully.");
                return;
            }
        }
        System.out.println("Employee with Employee ID " + empid + " not found.");
    }
    private static void deleteEmployee(ArrayList<Employee> employees) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee ID to delete: ");
        int empid = scanner.nextInt();
        for (Employee employee : employees) {
            if (employee.getEmpid() == empid) {
                employees.remove(employee);
                System.out.println("Employee with Employee ID " + empid + " deleted successfully.");
                return;
            }
        }
        System.out.println("Employee with Employee ID " + empid + " not found.");
    }
    private static void displayEmployeeDetails(ArrayList<Employee> employees) {
        System.out.println("\nEmployee Details:");
        for (Employee employee : employees) {
            System.out.println("\n" + employee);
        }
    }
}