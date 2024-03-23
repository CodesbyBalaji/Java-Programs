// import java.util.Scanner;
// public class ex2_1{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         // Input the size of the array
//         System.out.print("Enter the size of the array: ");
//         int N = scanner.nextInt();
//         int[] array = new int[N];
//         // Input elements into the array
//         System.out.println("Enter " + N + " elements:");
//         for (int i = 0; i < N; i++) {
//             array[i] = scanner.nextInt();
//         }
//         // Input the number to be searched
//         System.out.print("Enter the number to search: ");
//         int searchNumber = scanner.nextInt();
//         // Close the scanner
//         scanner.close();
//         // Find and count occurrences of the searchNumber in the array
//         int count = 0;
//         for (int i = 0; i < N; i++) {
//             if (array[i] == searchNumber) {
//                 count++;
//             }
//         }
//         if (count > 0) {
//             System.out.println("The number " + searchNumber + " is present in the array.");
//             System.out.println("It appears " + count + " time(s) in the array.");
//         } else {
//             System.out.println("The number " + searchNumber + " is not present in the array.");
//         }
//     }
// }
import java.util.Scanner;

public class ex2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 2, 3, 4, 2}; // Replace with your array
        System.out.print("Enter the number to be searched: ");
        int searchNumber = scanner.nextInt();
        int count = 0;
        
        for (int num : arr) {
            if (num == searchNumber) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println(searchNumber + " appears " + count + " times in the array.");
        } else {
            System.out.println(searchNumber + " is not present in the array.");
        }
    }
}

