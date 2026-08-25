package DSAPractice.NumberTheory;

public class armstrongNumber {
    public static void main(String[] args) {
        int num = 153;
        int temp = num;
        int sum = 0;

        temp = num;
        while(temp!=0){
            int digit = temp%10;
            sum = sum + (int)Math.pow(digit, 3);
            temp/=10;
        }

        if (sum==num){
            System.out.println("Yes This is Armstrong Number");
        }
        else{
            System.out.println("No This is not Armstrong Number");
        }
    }
}
