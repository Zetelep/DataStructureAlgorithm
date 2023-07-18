package SortingAlgorithm;

import java.util.Arrays;

public class BubbleSort {
    public static void Bubble_Sort(int[] arr){
        int N=arr.length;
        for (int i=0;i<N-1;i++){
            for (int j =0;j<N-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
           }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void Bubble_Sort_optimized(int[] arr){
        int temp, swap = 0, N=arr.length;
        for (int i=0;i<N-1;i++){
            for (int j =0;j<N-i-1;j++){
                if (arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap =1;
                }
            }
            if (swap==0) break;
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
        Bubble_Sort(arr); //[5, 6, 7, 8, 9]
        int[] arr2 = {1,2,4,3,5,6};
        Bubble_Sort_optimized(arr2); //only need 2 iteration since only 1 swap needed and the loops break when no swap occurred
        Bubble_Sort(arr2); //even after the swap, the loop still going til i<N
    }
}