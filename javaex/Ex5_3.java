import java.util.Scanner;

class Department {
    protected String deptName;
    protected String hodName;
    protected int noOfFaculty;
    protected int noOfStudents;
    protected int noOfPrograms;

    public Department(String deptName, String hodName, int noOfFaculty, int noOfStudents, int noOfPrograms) {
        this.deptName = deptName;
        this.hodName = hodName;
        this.noOfFaculty = noOfFaculty;
        this.noOfStudents = noOfStudents;
        this.noOfPrograms = noOfPrograms;
    }

    public void displayDetails() {
        System.out.println("Department: " + deptName);
        System.out.println("HOD: " + hodName);
        System.out.println("No. of Faculty: " + noOfFaculty);
        System.out.println("No. of Students: " + noOfStudents);
        System.out.println("No. of Programs: " + noOfPrograms);
    }
}

class CSEDpt extends Department {
    public CSEDpt(String hodName, int noOfFaculty, int noOfStudents, int noOfPrograms) {
        super("CSE", hodName, noOfFaculty, noOfStudents, noOfPrograms);
    }
}

class AIDSDpt extends Department {
    public AIDSDpt(String hodName, int noOfFaculty, int noOfStudents, int noOfPrograms) {
        super("AI&DS", hodName, noOfFaculty, noOfStudents, noOfPrograms);
    }
}

class CEDpt extends Department {
    public CEDpt(String hodName, int noOfFaculty, int noOfStudents, int noOfPrograms) {
        super("CE", hodName, noOfFaculty, noOfStudents, noOfPrograms);
    }
}

public class Ex5_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Department[] departments = new Department[3];

        for (int i = 0; i < departments.length; i++) {
            System.out.println("Enter details for Department " + (i + 1) + ":");
            System.out.print("HOD Name: ");
            String hodName = scanner.nextLine();
            System.out.print("No. of Faculty: ");
            int noOfFaculty = scanner.nextInt();
            System.out.print("No. of Students: ");
            int noOfStudents = scanner.nextInt();
            System.out.print("No. of Programs: ");
            int noOfPrograms = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (i) {
                case 0:
                    departments[i] = new CSEDpt(hodName, noOfFaculty, noOfStudents, noOfPrograms);
                    break;
                case 1:
                    departments[i] = new AIDSDpt(hodName, noOfFaculty, noOfStudents, noOfPrograms);
                    break;
                case 2:
                    departments[i] = new CEDpt(hodName, noOfFaculty, noOfStudents, noOfPrograms);
                    break;
            }
        }

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Display All Departments");
            System.out.println("2. Display Department Details");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nAll Departments:");
                    for (Department department : departments) {
                        department.displayDetails();
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("\nSelect a Department:");
                    for (int i = 0; i < departments.length; i++) {
                        System.out.println((i + 1) + ". " + departments[i].deptName);
                    }
                    System.out.print("Enter your choice: ");
                    int deptChoice = scanner.nextInt();
                    if (deptChoice >= 1 && deptChoice <= departments.length) {
                        departments[deptChoice - 1].displayDetails();
                    } else {
                        System.out.println("Invalid department choice.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 3);

        scanner.close();
    }
}

