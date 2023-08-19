package SortingAlgorithm;

import java.util.Arrays;

public class BubbleSort {
    public static void Bubble_Sort(int[] arr) {
    boolean hasSwapped = true;
    while (hasSwapped){
        hasSwapped = false;
        for (int i=0; i < arr.length-1;i++){
            if (arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                hasSwapped= true;
            }
        }
    }
    System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
        Bubble_Sort(arr); //[1, 2, 3, 4, 5, 6]
    }
}