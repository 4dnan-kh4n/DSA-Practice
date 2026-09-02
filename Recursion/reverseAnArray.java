package DSAPractice.Recursion;

import java.util.Arrays;

public class reverseAnArray {

    //using for loop
//    public int[] reverseWithForLoop(int[] arr){
//        int start = 0, end = arr.length-1, temp =0;
//        while (start<end){
//            temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }
//        return arr;
//    }

    //using recursion
    public int[] reverseUsingRecursion(int[] arr, int start, int end){
        if (start>=end){
            return arr;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        return reverseUsingRecursion(arr, start+1,end-1);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int start = 0, end = arr.length-1;
        reverseAnArray obj = new reverseAnArray();
//        System.out.println(Arrays.toString(obj.reverseWithForLoop(arr)));
        System.out.println(Arrays.toString(obj.reverseUsingRecursion(arr,start,end)));
    }
}
