package SearchAlgorithm;

public class LinearSearch {
    public static int Linear_Search(int[] array, int target) {

        for (int i = 0; i <= array.length; i++) {
            if (array[i] == target) return i;

        }
        return -1;
    }

    public static void main(String[] args) {
       int Array[] = {1,2,3,4,5,7,8};
       int LinearSearchtest = Linear_Search(Array,3);
       System.out.println(LinearSearchtest); // 2
    }
}