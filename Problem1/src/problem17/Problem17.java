package problem17;

public class Problem17 {

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i < 1001; i++) {
			// convert i to string
			String num = Integer.toString(i);

			// convert to four length array
			String[] numArray = new String[4];

			if (num.length() == 1) {
				numArray[0] = "0";
				numArray[1] = "0";
				numArray[2] = "0";
				numArray[3] = num;
			} else if (num.length() == 2) {
				numArray[0] = "0";
				numArray[1] = "0";
				numArray[2] = num.substring(0, 1);
				numArray[3] = num.substring(1);
			} else if (num.length() == 3) {
				numArray[0] = "0";
				numArray[1] = num.substring(0, 1);
				numArray[2] = num.substring(1, 2);
				numArray[3] = num.substring(2);
			} else if (num.length() == 4) {
				numArray[0] = num.substring(0, 1);
				numArray[1] = num.substring(1, 2);
				numArray[2] = num.substring(2, 3);
				numArray[3] = num.substring(3);
			}
			// ------------------------------------------------------------------------------

			// everything above this point works

			// ------------------------------------------------------------------------------

			// add by part of numArray

			// one thousand
			if (i == 1000) {
				sum += 11;
			}
			// hundreds place -> add the "hundred and" or "hundred"
			if (!numArray[1].equals("0")) {
				if (numArray[2].equals("0") && numArray[3].equals("0")) {
					sum += 7;
				} else {
					sum += 10;
				}
			}
			// hundreds place
			if (numArray[1].equals("1")) {
				sum += 3;
			} else if (numArray[1].equals("2")) {
				sum += 3;
			} else if (numArray[1].equals("3")) {
				sum += 5;
			} else if (numArray[1].equals("4")) {
				sum += 4;
			} else if (numArray[1].equals("5")) {
				sum += 4;
			} else if (numArray[1].equals("6")) {
				sum += 3;
			} else if (numArray[1].equals("7")) {
				sum += 5;
			} else if (numArray[1].equals("8")) {
				sum += 5;
			} else if (numArray[1].equals("9")) {
				sum += 4;
			}
			// tens place, break between cases with tens place equals "1" and all other
			// cases
			// eleven, twelve, thirteen, fourteen, fifteen, sixteen, seventeen, eighteen,
			// nineteen
			if (numArray[2].equals("1")) {
				if (numArray[3].equals("0")) {
					sum += 3;
				} else if (numArray[3].equals("1")) {
					sum += 6;
				} else if (numArray[3].equals("2")) {
					sum += 6;
				} else if (numArray[3].equals("3")) {
					sum += 8;
				} else if (numArray[3].equals("4")) {
					sum += 8;
				} else if (numArray[3].equals("5")) {
					sum += 7;
				} else if (numArray[3].equals("6")) {
					sum += 7;
				} else if (numArray[3].equals("7")) {
					sum += 9;
				} else if (numArray[3].equals("8")) {
					sum += 8;
				} else if (numArray[3].equals("9")) {
					sum += 8;
				}
			} else {
				
				//twenty, thirty, forty, fifty, sixty, seventy, eighty, ninety
				if (numArray[2].equals("2")) {
					sum += 6;
				} else if (numArray[2].equals("3")) {
					sum += 6;
				} else if (numArray[2].equals("4")) {
					sum += 5;
				} else if (numArray[2].equals("5")) {
					sum += 5;
				} else if (numArray[2].equals("6")) {
					sum += 5;
				} else if (numArray[2].equals("7")) {
					sum += 7;
				} else if (numArray[2].equals("8")) {
					sum += 6;
				} else if (numArray[2].equals("9")) {
					sum += 6;
				}
				// ones place
				if (numArray[3].equals("1")) {
					sum += 3;
				} else if (numArray[3].equals("2")) {
					sum += 3;
				} else if (numArray[3].equals("3")) {
					sum += 5;
				} else if (numArray[3].equals("4")) {
					sum += 4;
				} else if (numArray[3].equals("5")) {
					sum += 4;
				} else if (numArray[3].equals("6")) {
					sum += 3;
				} else if (numArray[3].equals("7")) {
					sum += 5;
				} else if (numArray[3].equals("8")) {
					sum += 5;
				} else if (numArray[3].equals("9")) {
					sum += 4;
				}
			}

		}

		System.out.println(sum);
	}

}
