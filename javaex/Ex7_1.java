import java.util.Scanner;
class InvalidIntegerException extends Exception {
    public InvalidIntegerException() {
        super("Integer is not in range");
    }
}
public class Ex7_1{
    public static void main(String[] args) {
        try {
            int[] array = initializeArray();
            print(array);
        } catch (InvalidIntegerException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Program completed.");
        }
        
    }
    public static int[] initializeArray() throws InvalidIntegerException {
        int[] array = new int[100];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 100; i++) {
            System.out.print("Enter an integer between 1 and 100: ");
            int input = scanner.nextInt();
            if (input < 1 || input > 100) {
                throw new InvalidIntegerException();
            }
            array[i] = input;
        }
        return array;
    }
    public static void print(int[] array) {
        System.out.println("Array elements:");
        for (int i : array) {
            System.out.println(i);
        }
    }

}

