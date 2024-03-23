import java.util.Arrays;
import java.util.Scanner;

public class Ex8_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int numElements = scanner.nextInt();

        int[] arr = new int[numElements];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < numElements; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of threads: ");
        int numThreads = scanner.nextInt();

        scanner.close();

        // Split the array into sub-arrays
        int subArraySize = arr.length / numThreads;
        int[][] subArrays = new int[numThreads][subArraySize];

        for (int i = 0; i < numThreads; i++) {
            System.arraycopy(arr, i * subArraySize, subArrays[i], 0, subArraySize);
        }

        // Create and start sorting threads
        BubbleSortThread[] sortThreads = new BubbleSortThread[numThreads];
        for (int i = 0; i < numThreads; i++) {
            sortThreads[i] = new BubbleSortThread(subArrays[i]);
            sortThreads[i].start();
        }

        // Wait for sorting threads to finish
        try {
            for (int i = 0; i < numThreads; i++) {
                sortThreads[i].join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Merge sorted sub-arrays
        int[] sortedArray = mergeSortedArrays(subArrays);

        // Print the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
    }

    static class BubbleSortThread extends Thread {
        private int[] arr;

        BubbleSortThread(int[] arr) {
            this.arr = arr;
        }

        @Override
        public void run() {
            bubbleSort(arr);
        }

        private void bubbleSort(int[] arr) {
            int n = arr.length;
            boolean swapped;
            do {
                swapped = false;
                for (int i = 1; i < n; i++) {
                    if (arr[i - 1] > arr[i]) {
                        int temp = arr[i - 1];
                        arr[i - 1] = arr[i];
                        arr[i] = temp;
                        swapped = true;
                    }
                }
            } while (swapped);
        }
    }

    private static int[] mergeSortedArrays(int[][] subArrays) {
        int[] mergedArray = new int[subArrays.length * subArrays[0].length];
        int index = 0;

        for (int[] subArray : subArrays) {
            System.arraycopy(subArray, 0, mergedArray, index, subArray.length);
            index += subArray.length;
        }

        Arrays.sort(mergedArray);

        return mergedArray;
    }
}
