package DSAPractice.Recursion;

public class test {

//    3,2,1
    public void test(int i, int n){
        if (i>n){
            return;
        }
        test(i+1,n);
        System.out.println(i);
    }


    public static void main(String[] args) {
        test obj = new test();
        int n = 3;
        int i = 1;
        obj.test(i,n);
    }
}
