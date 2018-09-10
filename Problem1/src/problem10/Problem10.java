package problem10;

public class Problem10 {

	public static void main(String[] args) {
		// long sum = 0;
		// for (int i = 2; i < 2000000; i++) {
		// if (isPrime(i)) {
		// sum += i;
		// System.out.println(i);
		// }
		// }
		// System.out.println(sum);
		long sum = 0;

		boolean[] sieve = new boolean[2000000];
		for (int i = 0; i < sieve.length; i++) {
			sieve[i] = true;
		}

		for (int i = 2; i < sieve.length; i++) {
			if (sieve[i]) {
				listPrimes(sieve, i);
			}
		}
		for (int i = 2; i < sieve.length; i++) {
			if (sieve[i]) {
				sum += i;
			}
		}
		System.out.println(sum);
		System.out.println("142913828922");

	}

	public static void listPrimes(boolean[] sieve, int x) {
		for (int i = x + x; i < sieve.length; i += x) {
			sieve[i] = false;
		}
	}

//	public static boolean isPrime(int number) {
//		for (int i = 2; i < number; i++) {
//			if (number % i == 0) {
//				return false;
//			}
//		}
//		return true;
//	}
}
