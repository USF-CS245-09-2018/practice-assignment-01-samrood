public class FactorialIterative implements Factorial {

	public int factorial(int n){
		if(n <= 1){
			return n;
		}

		int total = 1;
		for(; n>1; n--){
			total = total*n;
		}

		return total;
	}
}