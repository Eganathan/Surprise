import java.util.ArrayList;
import java.util.List;

public class FibonacciPrime {

	/*
	 * We will iterate the while loop till the array.size() is equal to 9 on each
	 * iteration we add assign curr by adding fNum and sNum and then assign fNum the
	 * value of sNum and assign the value of curr to sNum now we check if the curr
	 * is prime and if so we add it to the list and increase the counter
	 * 
	 * omce the while loop breaks the val is retured
	 */

	List<Integer> start() {
		List<Integer> val = new ArrayList<>();

		int fNum = 0, sNum = 1, curr;
		while (val.size() < 10) {

			curr = fNum + sNum;
			fNum = sNum;
			sNum = curr;
			if (isPrime(curr))
				val.add(curr);
		}
		return val;
	}

	static boolean isPrime(int n) {

		if (n <= 1)
			return false;

		else if (n == 2)
			return true;

		else if (n % 2 == 0)
			return false;

		for (int i = 3; i <= Math.sqrt(n); i += 2){
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
