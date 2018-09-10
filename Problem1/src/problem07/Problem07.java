package problem07;

public class Problem07 {

	public static void main(String[] args) {
		int counter = 0;
		int current = 0;
		int check = 2;
		while (counter < 10001) {
			if (isPrime(check)) {
				counter++;
				current = check;
			}
			check++;
		}
		System.out.println(current);

	}

	public static boolean isPrime(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
