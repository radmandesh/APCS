package Ch12Recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args){
        int[] nums = {1, 6, 8, 3, 4, 2};
        int[] nums1 = Arrays.copyOfRange(nums, 0, nums.length/2);
        int[] nums2 = Arrays.copyOfRange(nums, nums1.length, nums.length);
        nums = merge(nums1, nums2);
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + ", ");
        }
    }
    public static int[] merge(int[] arr1, int[] arr2){
        int i1 = 0;
        int i2 = 0;
        int[] result = new int[arr1.length+arr2.length];
        int i = 0;
        while(i1 != arr1.length && i1 != arr2.length){
            if(i1 > i2){
                result[i] = arr1[i1];
                i1++;
            }
            else if(i1 < i2){
                result[i] = arr2[i2];
                i2++;
            }
            else{
                result[i] = arr1[i1];
                i1++;
            }
        }
        return result;
    }

}
