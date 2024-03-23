// import java.util.Scanner;
// public class Ex3_1 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter a paragraph of text:");
//         String text = scanner.nextLine();
//         scanner.close();
//         // Calculate the number of spaces
//         int spaces = countSpaces(text);
//         // Calculate the number of words
//         int words = countWords(text);
//         // Calculate the number of characters
//         int characters = countCharacters(text);
//         // Calculate the number of lines   
//         int lines = countLines(text);
//         // Print the results
//         System.out.println("Number of spaces: " + spaces);
//         System.out.println("Number of words: " + words);
//         System.out.println("Number of characters: " + characters);
//         System.out.println("Number of lines: " + lines);
//     }
//     private static int countSpaces(String text) {
//         return text.length() - text.replace(" ", "").length();
//     }
//     private static int countWords(String text) {
//         String[] words = text.trim().split("\\s+");
//         return words.length;
//     }
//     private static int countCharacters(String text) {
//         return text.length();
//     }
//     private static int countLines(String text) {
//         String[] lines = text.split("\r\n|\r|\n");
//         return lines.length;
//     }
// }


import java.util.Scanner;

public class Ex3_1 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);

        // Input a long paragraph of text
        System.out.println("Enter a long paragraph of text (press Enter twice to finish):");
        StringBuilder paragraph = new StringBuilder();
        String line;
        while (true) {
            line = ss.nextLine();
            if (line.isEmpty()) {
                break;
            }
            paragraph.append(line).append("\n");
        }

        // Calculate statistics
        int spaces = paragraph.toString().split("\\s+").length - 1;
        int words = paragraph.toString().split("\\s+").length;
        int characters = paragraph.length();
        int lines = paragraph.toString().split("\n").length;

        // Display the results
        System.out.println("Number of spaces: " + spaces);
        System.out.println("Number of words: " + words);
        System.out.println("Number of characters: " + characters);
        System.out.println("Number of lines: " + lines);

        ss.close();
    }
}
