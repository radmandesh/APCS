package Ch12Recursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {2,6,1,4,7,9,3};
        System.out.println(Arrays.toString(sort(arr)));
    }
    public static int[] sort(int[] arr){
        int smallest = arr[0];
        int bound = 1;
        int temp = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < smallest)
                smallest = arr[i];
        }
        for(int i = 1; i < arr.length; i++){

        }
        return arr;
    }
}
