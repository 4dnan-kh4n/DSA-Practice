package DSAPractice.Recursion;

public class sumOfnNaturalNumber {
//    public void sum(int i, int num, int sum){
//        if (i>num){
//            System.out.println(sum);
//            return;
//        }
//        sum+=i;
//        sum(i+1,num, sum);
//    }

    //Functional Recursion
    public int functionalRecursion(int n){
        if (n == 0){
            return 0;
        }
        return n + functionalRecursion(n-1);
    }

    public static void main(String[] args) {
        int num = 5, i =1, sum = 0;
        sumOfnNaturalNumber obj = new sumOfnNaturalNumber();
//        obj.sum(i,num, sum);
        System.out.println(obj.functionalRecursion(num));
    }
}
