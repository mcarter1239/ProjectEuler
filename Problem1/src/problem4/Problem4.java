package problem4;

public class Problem4 {

	public static void main(String[] args) {
		int result = 0;
		for(int i = 999; i > 100; i--) {
			for(int j = 999; j > 100; j--) {
				int check = i*j;
				if(isPalindrome(check)) {
					if (check > result) {
						result = check;
					}
				}
			}
		}
		System.out.println(result);
	}

	public static boolean isPalindrome(int number) {
		String num = Integer.toString(number);
		for(int i = 0; i < Integer.toString(number).length(); i++) {
			if(num.charAt(i) != num.charAt(num.length()-1-i)) {
				return false;
			}
		}
		return true;
		
	}
}
