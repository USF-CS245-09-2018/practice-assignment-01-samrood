public class FibonacciIterative implements Fibonacci {
	public int fibonacci(int n) {

		if (n <= 1) {
			return n;
		}

		int current = 1;
		int previous = 1;


		for (int i = 2; i < n; i++) {
			int temp = current;
			current += previous;
			previous = temp;
		}

		return current;
	}
}