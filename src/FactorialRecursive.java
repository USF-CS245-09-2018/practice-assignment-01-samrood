public class FactorialRecursive implements Factorial {
    public int factorial(int n) {

        if (n <= 1) {
            return n;
        } else {
            return n * factorial(n - 1);
        }
    }
}

