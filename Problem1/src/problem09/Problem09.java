package problem09;

public class Problem09 {

	public static void main(String[] args) {
		for (int i = 1; i < 1000; i++) {
			for (int j = i; j < 1000 - i; j++) {
				int k = 1000 - i - j;
				if (isPythag(i, j, k)) {
					System.out.println(i * j * k);
				}
			}
		}
	}

	public static boolean isPythag(int a, int b, int c) {
		if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
			return true;
		}
		return false;
	}
}
