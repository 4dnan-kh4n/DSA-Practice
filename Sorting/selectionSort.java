package DSAPractice.Sorting;

public class selectionSort {
    public static void selectionSort(int[] arr){
        for (int i = 0; i <= arr.length-2; i++){
            int min = arr[i];
            for (int j = i; j<=arr.length-2; j++){
                if (min>arr[i]){
                    min = arr[i];
                }
                else {
                    min = min;
                }
                System.out.println(min);
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {2,5,7,4,9,1,6};
        selectionSort(arr);
    }
}
