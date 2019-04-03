package Ch12Recursion;

public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {4, 8, 12, 16, 20};
        System.out.println(search(arr, 12));
    }
    public static int search(int[] arr, int target){
        int mid = (arr.length - 1) / 2;
        int min = 0;
        int max = arr.length - 1;
        int index = -1;
        while(mid != target){
            if(target > mid){
                min = mid + 1;
                mid = (min + max) / 2;
            }
            else if(target < mid){
                max = mid;
                mid = (min + max) / 2;
            }
            index = mid;
        }
        return index;
    }
}
