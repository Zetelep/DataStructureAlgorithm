package SearchAlgorithm;

public class BinarySearch {
    public static int Binary_Search(int[] SortedArray,int target){
        int N = SortedArray.length;
        int low = 0;
        int high = N-1;

        while (low<=high){
            int mid = low+(high-low)/2;
            if (SortedArray[mid]<target){
                low=mid+1;
            } else if (SortedArray[mid]>target) {
                high = mid-1;
            } else if (SortedArray[mid] == target) {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,6,7,8,9,12};
        int target = 12;
        int target2 =10;
        int binarySearchTest = Binary_Search(arr,target);
        int binarySearchTest2 = Binary_Search(arr,target2);

        System.out.println(binarySearchTest); // 7
        System.out.println(binarySearchTest2); // -1
    }
}
