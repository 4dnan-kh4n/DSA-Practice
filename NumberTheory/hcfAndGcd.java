package DSAPractice.NumberTheory;

class hcfAndGcd{
//    public void gcdGreedy(int num1, int num2){
//        int smaller = num1<num2?num1:num2;
//        int gcd = 0;
//        for (int i = 1 ; i<=smaller; i++){
//            if (num1%i == 0 && num2%i==0){
//                gcd = i;
//            }
//        }
//        System.out.println("The GCD is: " + gcd);
//    }

    public void gcdOptimal(int num1, int num2){
        int mod = 0;
        while (num1>0 && num2>0){
            if (num1>num2){
                num1 = num1%num2;
            }
            else {
                num2 = num2%num1;
            }
        }
        int gcd = num1==0?num2:num1;
        System.out.println("The GCD is: " + gcd);
    }


    public static void main(String[] args) {
        int num1 = 5, num2 = 15;
        hcfAndGcd obj = new hcfAndGcd();
//        obj.gcdGreedy(num1,num2);
        obj.gcdOptimal(num1,num2);

    }
}