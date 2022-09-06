package top50;

public class Fibanacci {
    public static void main(String[] args) {
        System.out.println(fib(40));
        System.out.println(fib2(40));
    }

    public static int fib(int n) {
        if(n == 2 || n == 1) return 1;
        return fib(n-1) + fib(n-2);
    }

    public static int fib2(int n) {
        int res = 1;
        int prev = 1;
        for (int i = 3; i <= n; i++) {
            int prePrev = prev;
            prev = res;
            res = res + prePrev;
        }
        return res;

    }
}
