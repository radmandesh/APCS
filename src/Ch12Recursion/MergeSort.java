package Ch12Recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args){
        int[] nums = {1, 7, 3, 8, 4, 1, 7, 3};
        int[] nums1 = Arrays.copyOfRange(nums, 0, nums.length/2);
        int[] nums2 = Arrays.copyOfRange(nums, nums1.length, nums.length);
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        System.out.println(mergeSort(nums)) ;
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
    public static int[] merge(int[] arr1, int[] arr2){
        int i1 = 0, i2 = 0;
        int[] result = new int[arr1.length+arr2.length];
        for(int i = 0; i < result.length; i++){
            if(i2 >= arr2.length || (i1 < arr1.length && arr1[i1] <= arr2[i2])){
                result[i] = arr1[i1];
                i1++;
            }
            else {
                result[i] = arr2[i2];
                i2++;
            }
        }
        return result;
    }

    public static int[] mergeSort(int[] arr){
        int[] nums1 = Arrays.copyOfRange(arr, 0, arr.length/2);
        int[] nums2 = Arrays.copyOfRange(arr, nums1.length, arr.length);
        mergeSort(nums1);
        mergeSort(nums2);
        return merge(nums1, nums2);

    }
}
