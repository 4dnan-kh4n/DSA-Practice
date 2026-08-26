package DSAPractice.NumberTheory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class printAllDivisors {

    public void findDivisorOnComplexity(int num){
        if (num>0){
            for (int i = 1; i<=num; i++){
                if (num % i == 0){
                    System.out.print(i + ",");
                }
            }
        }
        else {
            System.out.print("Enter Valid Number");
        }
    }

    public void findDivisorOptimized(int num){
        List<Integer> li = new ArrayList<>();
        int sqrRoot = (int)Math.sqrt(num);
        for (int i = 1 ; i<= Math.sqrt(num) ; i++){
            if (num%i==0){
                li.add(i);

                if (i!=num/i){
                    li.add(num/i);
                }
            }
        }
        li.sort(null);
        System.out.print(li);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number whose Divisior you want: ");
        int num = sc.nextInt();

        printAllDivisors obj = new printAllDivisors();
//        obj.findDivisorOnComplexity(num);
        obj.findDivisorOptimized(num);

    }
}
