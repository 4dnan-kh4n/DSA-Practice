package DSAPractice.Sorting;

import java.util.Arrays;

public class insertionSort {
    public static int[] insertionSort(int[] num){
        int temp = 0;
        for (int i = 1 ; i<num.length; i++){
            int j = i;

            while (j!=0){
                if (num[j] < num[j-1]){
                    temp = num[j];
                    num[j] = num[j-1];
                    num[j-1] = temp;
                    j--;
                }
                else {
                    break;
                }
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,4,5,8,7,6,1};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }
}
