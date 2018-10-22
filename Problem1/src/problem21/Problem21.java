package problem21;

public class Problem21 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i <= 10000; i++) {
//			System.out.println("d(" + i + ") = " + d(i) + ". d(" + d(i) + ") = " + d(d(i)));
			if (d(d(i)) == i && d(i) != i) {
				sum += i;
				System.out.println(d(i) + " and " + i + " are an amicable pair. " + i + " has been added to sum. Current sum = " + sum);
			}
		}
		System.out.println(sum);
		
	}

	static int d(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		return sum;
	}
}
