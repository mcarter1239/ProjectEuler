package problem23;

public class Problem23 {

	public static void main(String[] args) {
		for(int i = 0; i < 28123; i ++) {
			
		}

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
