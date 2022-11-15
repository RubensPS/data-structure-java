package src;

public class FibonacciWithRecursion {
    public static void main(String[] args) {
        sequence(10);
    }

    // calculates the fibonacci of the nth element, starting the count at 0
    public static int fibonacci(int n) {
        if (n < 0)
            return -1;
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    //print the sequence from o to n element, starting the count at 0
    public static void sequence(int n) {
        for(int i=0 ; i<=n ; i++) {
            System.out.println(fibonacci(i));
        }
    }

}
