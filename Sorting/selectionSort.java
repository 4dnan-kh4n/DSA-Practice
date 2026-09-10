package DSAPractice.Sorting;

import java.util.Arrays;

public class selectionSort {
    public static int[] selectionSort(int[] arr){
        int temp = 0;
        for (int i = 0; i <= arr.length-2; i++){
            int min = i;
            for (int j = i; j<=arr.length-2; j++){
                if (arr[min]>arr[j]){
                    min = j;
                }
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {2,5,7,4,9,1,6};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
}
