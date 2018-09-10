package problem03;

public class Problem03 {

	public static void main(String[] args) {
		int i = 2;
		long n = 600851475143L;

		while (i < Math.sqrt(n)) {
			while ((n % i) == 0) {
				n = n / i;
			}
			i = i + 1;
		}
		System.out.println(n);
	}
}
