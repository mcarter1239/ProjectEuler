package problem02;

public class Problem02 {

	public static void main(String[] args) {
		int sum = 2;
		int current1 = 1;
		int current2 = 2;
		while (current2 < 4000000) {
			int temp = current1 + current2;
			if (temp % 2 == 0) {
				sum += temp;
			}
			current1 = current2;
			current2 = temp;
		}
		System.out.println(sum);
	}

}
