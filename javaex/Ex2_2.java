// import java.util.Arrays;
// import java.util.Scanner;
// public class Ex2_2{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Input the size of the array
//         System.out.print("Enter the size of the array: ");
//         int N = scanner.nextInt();

//         int[] originalArray = new int[N];
//         int[] ascendingArray = new int[N];
//         int[] descendingArray = new int[N];

//         // Input elements into the originalArray
//         System.out.println("Enter " + N + " elements:");
//         for (int i = 0; i < N; i++) {
//             originalArray[i] = scanner.nextInt();
//         }

//         // Copy elements to the ascendingArray and sort in ascending order
//         System.arraycopy(originalArray, 0, ascendingArray, 0, N);
//         Arrays.sort(ascendingArray);

//         // Copy elements to the descendingArray and sort in descending order
//         System.arraycopy(originalArray, 0, descendingArray, 0, N);
//         Arrays.sort(descendingArray);
//         reverseArray(descendingArray);

//         // Close the scanner
//         scanner.close();

//         // Print the original, ascending, and descending arrays
//         System.out.println("Original Array: " + Arrays.toString(originalArray));
//         System.out.println("Ascending Array: " + Arrays.toString(ascendingArray));
//         System.out.println("Descending Array: " + Arrays.toString(descendingArray));
//     }

//     // Helper method to reverse an array in-place
//     private static void reverseArray(int[] arr) {
//         int start = 0;
//         int end = arr.length - 1;
//         while (start < end) {
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//             start++;
//             end--;
//         }
//     }
// }

import java.util.Arrays;

public class Ex2_2 {
    public static void main(String[] args) {
        int[] sourceArray = {5, 2, 9, 1, 3};
        int N = sourceArray.length;
        
        int[] ascendingArray = Arrays.copyOf(sourceArray, N);
        Arrays.sort(ascendingArray);
        
        int[] descendingArray = Arrays.copyOf(sourceArray, N);
        Arrays.sort(descendingArray);
        for (int i = 0; i < N / 2; i++) {
            int temp = descendingArray[i];
            descendingArray[i] = descendingArray[N - 1 - i];
            descendingArray[N - 1 - i] = temp;
        }
        
        System.out.println("Source Array: " + Arrays.toString(sourceArray));
        System.out.println("Ascending Array: " + Arrays.toString(ascendingArray));
        System.out.println("Descending Array: " + Arrays.toString(descendingArray));
    }
}
