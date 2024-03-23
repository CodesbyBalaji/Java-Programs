public class Ex3_5 {
    public static void main(String[] args) {
        // Default input for testing
        String defaultParagraph = "My name is Balaji and Balaji is From Valparai";
        String defaultWordToSearch = "Balaji";

        // Perform the search
        searchWord(defaultParagraph, defaultWordToSearch);
    }

    private static void searchWord(String text, String word) {
        int occurrences = 0;
        int index = text.indexOf(word);

        while (index != -1) {
            occurrences++;
            System.out.println("Occurrence " + occurrences + ": Position " + index);
            index = text.indexOf(word, index + 1);
        }

        if (occurrences == 0) {
            System.out.println("The word '" + word + "' was not found in the text.");
        } else {
            System.out.println("Total occurrences: " + occurrences);
        }
    }
}
