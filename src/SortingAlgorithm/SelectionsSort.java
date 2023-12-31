package SortingAlgorithm;

import java.util.Arrays;

public class SelectionsSort {
    public static void Selection_Sort(int[] arr) {
        int N = arr.length;
        int indexMin;
        for (int i=0;i<N-1;i++){
            indexMin = i;

            for (int j =i+1;j<N;j++){
                if (arr[j]<arr[indexMin]) indexMin =j;
            }

            int temp = arr[indexMin];
            arr[indexMin] = arr[i];
            arr[i] = temp;

        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {3,6,1,8,4,5};
        Selection_Sort(arr); // [1, 3, 4, 5, 6, 8]
    }

}
