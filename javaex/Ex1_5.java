import java.util.Scanner;
public class Ex1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        double totalCost = 0;
        while (!exit) {
            System.out.println("Welcome to the OTT Subscription Platform");
            System.out.println("1. Basics - $499");
            System.out.println("2. Kids - $200 + Basics");
            System.out.println("3. Sports - $700 + Basics");
            System.out.println("4. English - $300 + Basics");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    totalCost += 499;
                    System.out.println("Added Basics subscription to your cart.");
                    break;
                case 2:
                    totalCost += 200 + 499;
                    System.out.println("Added Kids subscription to your cart.");
                    break;
                case 3:
                    totalCost += 700 + 499;
                    System.out.println("Added Sports subscription to your cart.");
                    break;
                case 4:
                    totalCost += 300 + 499;
                    System.out.println("Added English subscription to your cart.");
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        System.out.println("Total Cost: $" + totalCost);
        System.out.println("Thank you for using our OTT Subscription Platform!");
        scanner.close();
    }
}
