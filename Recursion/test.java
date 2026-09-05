package DSAPractice.Recursion;

class test {
    public int fib(int n) {
        int[] f = new int[n];

        f[0] = 0;
        f[1] = 1;
        int i = 0;

        for(i = 2 ; i<n; i++){
            f[i] = f[i-1]+f[i-2];
        }
        return f[i-1];
    }

    public static void main(String[] args) {
        int n = 1;
        test obj = new test();
        System.out.println(obj.fib(n));
    }
}
