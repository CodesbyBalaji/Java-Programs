import java.util.Scanner;
public class Ex3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence (up to 80 characters): ");
        String input = scanner.nextLine();

        String result = deleteVowels(input);
        System.out.println("Result: " + result);
    }
    public static String deleteVowels(String sentence) {
        return sentence.replaceAll("[aeiouAEIOU]", "");
    }
}
