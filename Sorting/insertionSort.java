package DSAPractice.Sorting;

import java.util.Arrays;

public class insertionSort {
    public static int[] insertionSort(int[] arr){
        for (int i = 0 ; i<arr.length;i++){
            int j = i;
            while(j>0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j]=temp;
                j--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,4,5,8,7,6,1};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }
}
