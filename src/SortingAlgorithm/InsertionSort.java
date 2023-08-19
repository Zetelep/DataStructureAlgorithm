package SortingAlgorithm;

import java.util.Arrays;

public class InsertionSort {
    public static void Insertion_Sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int currentIndex = i;
            while (currentIndex > 0 && arr[currentIndex - 1] > arr[currentIndex]) {
                int temp = arr[currentIndex];
                arr[currentIndex] = arr[currentIndex - 1];
                arr[currentIndex - 1] = temp;
                currentIndex--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 9, 7, 1, 8};
        Insertion_Sort(arr);
    }
}
