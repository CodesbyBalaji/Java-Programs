import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private int regno;
    private String dept;

    public Student(String name, int regno, String dept) {
        this.name = name;
        this.regno = regno;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRegno() {
        return regno;
    }

    public void setRegno(int regno) {
        this.regno = regno;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                "\n Regno: " + regno +
                "\n Department: " + dept;
    }
}

public class Ex4_2 {
    public static void main(String args[]) {
        Scanner ss = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        while (true) {
            System.out.println("1.Add");
            System.out.println("2.Display");
            System.out.println("3.Exit");
            System.out.println("Enter your choice: ");
            int choice = ss.nextInt();
            ss.nextLine(); // consume newline character
            switch (choice) {
                case 1:
                    System.out.println("Enter your Name: ");
                    String name = ss.nextLine();
                    System.out.println("Enter your Registration number:");
                    int regno = ss.nextInt();
                    ss.nextLine(); // consume newline character
                    System.out.println("Enter your Department: ");
                    String dept = ss.nextLine();
                    Student newStudent = new Student(name, regno, dept);
                    students.add(newStudent);
                    System.out.println("Student details Added Successfully");
                    break;
                case 2:
                    for (Student i : students) {
                        System.out.println(i);
                    }
                    break;
                case 3:
                    System.out.println("Exiting the program......");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
