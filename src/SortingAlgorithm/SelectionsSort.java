package SortingAlgorithm;

import java.util.Arrays;

public class SelectionsSort {
    public static void Selection_Sort(int[] arr) {
        int N = arr.length;
        int indexMin;
        for (int i=0;i<N;i++){
            indexMin = i;

            for (int j =i+1;j<N;j++){
                if (arr[j]<arr[indexMin]) indexMin =j;
            }
            if (indexMin!=i){
                int temp = arr[indexMin];
                arr[indexMin] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5};
        Selection_Sort(arr); // [5, 6, 7, 8, 9]

    }

}
