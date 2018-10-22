package problem20;

import java.math.BigInteger;

public class Problem20 {

	public static void main(String[] args) {
		int sum = 0;
		BigInteger factorial = BigInteger.valueOf(1);
		for(int i = 100; i > 0; i--) {
			factorial = factorial.multiply(BigInteger.valueOf(i));
		}

		for(int i = 0; i < factorial.toString().length();i++) {
			sum += Integer.parseInt(factorial.toString().substring(i, i+1));
		}
		System.out.println(sum);
	}

}
