import java.util.Scanner;
class InvalidVowelException extends Exception {
    public InvalidVowelException() {
    super("It is Consonants");
    }
}
public class Ex7_3 {
    public static void main(String[] args) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        Scanner scanner = new Scanner(System.in);
    try {
        System.out.print("Enter a character: ");
        char userInput = scanner.next().charAt(0);
        boolean isVowel = false;
        for (char i : vowels) {
        if (userInput == i) {
        isVowel = true;
        break;
    }
}
    if (!isVowel) {
            throw new InvalidVowelException();
    }
    System.out.println("You entered a vowel: " + userInput);
    } catch (InvalidVowelException e) {
        System.err.println("Error: " + e.getMessage());
    } finally {
        scanner.close();
}
}
}
