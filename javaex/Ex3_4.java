import java.util.Scanner;

public class Ex3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Predefined sequences
        String[] sequences = {
            "aabc",
            "aaaa",
            "abcde",
            "bbccd",
            "ababa"
        };
        System.out.println("Input Sequences:");
        for (int i = 0; i < sequences.length; i++) {
            System.out.println("Sequence " + (i + 1) + ": " + sequences[i]);
        }
        System.out.print("\nEnter a character to search for: ");
        char searchChar = scanner.next().charAt(0);
        int maxOccurrences = 0;
        for (String sequence : sequences) {
            int occurrences = countOccurrences(sequence, searchChar);
            maxOccurrences = Math.max(maxOccurrences, occurrences);
        }
        System.out.println("Character " + searchChar + " occurred a maximum of " + maxOccurrences + " times.");
    }
    private static int countOccurrences(String sequence, char searchChar) {
        int count = 0;
        for (char c : sequence.toCharArray()) {
            if (c == searchChar) {
                count++;
            }
        }
        return count;
    }
}


