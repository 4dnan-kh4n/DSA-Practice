package DSAPractice.Sorting;

import java.util.Arrays;

public class bubbleSort {
    public static int[] bubbleSort(int[] nums) {
        int temp = 0;
        for(int i = 0; i<nums.length;i++){
            for(int j = 1; j<nums.length; j++){
                if(nums[j]<nums[j-1]){
                    temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {7,4,1,5,3};
        System.out.println(Arrays.toString(bubbleSort(nums)));
    }
}