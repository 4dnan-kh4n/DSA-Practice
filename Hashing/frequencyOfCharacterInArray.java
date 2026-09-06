package DSAPractice.Hashing;
import java.util.HashMap;

public class frequencyOfCharacterInArray {

    public void frequecyOfChar(char[] arr){
        HashMap<Character , Integer> map = new HashMap<>();

        for (int i = 0 ; i<arr.length; i++){
            if (!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }
            else {
                map.put(arr[i], map.get(arr[i])+1);
            }
        }
        System.out.println(map.keySet().toString());
        System.out.println(map.values().toString());
    }


    public static void main(String[] args) {
        char[] arr = {'a','b','c','e','a','i','c','b'};
        frequencyOfCharacterInArray obj = new frequencyOfCharacterInArray();
        obj.frequecyOfChar(arr);
    }
}
