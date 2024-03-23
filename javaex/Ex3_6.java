import java.util.Arrays;
import java.util.Scanner;

public class Ex3_6 {
    public static void main(String[] args) {
        String[] Names = {"Alice", "John", "Charlie", "Bob"};

        // Perform sorting
        sortAndPrintNames(Names);
    }

    private static void sortAndPrintNames(String[] names) {
        // Sorting the array in ascending order
        Arrays.sort(names);

        // Printing the sorted names
        System.out.println("Sorted Names in Ascending Order:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
