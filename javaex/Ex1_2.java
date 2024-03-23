import java.util.Scanner;
public class Ex1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of numbers:");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter number " + i + ":");
            int number = sc.nextInt();
            sum += number;
        }
        System.out.println("The sum of the numbers is: " + sum);
    }
}
