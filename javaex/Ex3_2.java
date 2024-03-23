// public class Ex3_2 {
//     public static void main(String[] args) {
//         String input = "Welcome to   Java    Programming  !!";
//         String output = replaceConsecutiveBlanks(input);
//         System.out.println(output);
//     }
//     public static String replaceConsecutiveBlanks(String input) {
//         // Use regular expression to replace two or more consecutive blanks with a single blank
//         String result = input.replaceAll("\\s{2,}", " ");
//         return result;
//     }
// }
import java.util.Scanner;

public class Ex3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a string
        System.out.println("Enter a string with consecutive spaces:");
        String input = scanner.nextLine();

        // Replace consecutive spaces with a single space
        String cleanedString = input.replaceAll(" +", " ");

        // Display the cleaned string
        System.out.println("Cleaned string: " + cleanedString);

        scanner.close();
    }
}






