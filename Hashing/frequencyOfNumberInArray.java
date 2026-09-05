package DSAPractice.Hashing;

import java.util.HashMap;

public class frequencyOfNumberInArray {
    public void freqOfNumber(int[] arr, int num){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0 ; i<arr.length; i++){
            if (!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else{
                map.put(arr[i], map.get(arr[i])+1);
            }
        }
        System.out.println(map.keySet().toString());
        System.out.println(map.values().toString());
    }

    public static void main(String[] args) {
        int arr[] = {1,20,10,66,3,3,3,10};
        int num = 10;
        frequencyOfNumberInArray obj = new frequencyOfNumberInArray();
        obj.freqOfNumber(arr, num);
    }
}
