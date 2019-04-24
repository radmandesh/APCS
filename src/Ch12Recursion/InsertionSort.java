package Ch12Recursion;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args){
        int[] arr = {2,6,1,4,7,9,3};
        System.out.println(Arrays.toString(sort(arr)));
    }
    public static int[] sort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int j = i;
            while(j > 0 && arr[j-1] > arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j = j-1;
            }
        }
        return arr;
    }
}
