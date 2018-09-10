package problem05;

public class Problem05 {

	public static void main(String[] args) {
		int i = 1;
		while (true) {
			for (int j = 1; j <= 20; j++) {
				if (i % j != 0) {
					break;
				} else if (j == 20) {
					System.out.println(i);
				}
			}
			i++;
		}
	}

}
