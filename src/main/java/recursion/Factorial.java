package recursion;

public class Factorial {
    public static int factorial(int n){
        if(n==0) return 1;
        return n * factorial(n-1);
    }

    public static int factorialTailRec(int n, int result) {
        if (n==0) return result;
        return factorialTailRec(n-1, n*result);
    }
}
