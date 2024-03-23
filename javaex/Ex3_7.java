import java.util.Scanner;

public class Ex3_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Convert lowercase characters to uppercase
        String convertedString = convertToLowercase(inputString);

        // Print the result
        System.out.println("Converted String: " + convertedString);
    }

    private static String convertToLowercase(String inputString) {
        StringBuilder result = new StringBuilder();

        for (char ch : inputString.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }
}
