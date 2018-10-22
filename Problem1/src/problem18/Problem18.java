package problem18;

public class Problem18 {

	public static void main(String[] args) {
		int[][] pyramid = new int[15][15];

		int[] row0 = { 75 };
		int[] row1 = { 95, 64 };
		int[] row2 = { 17, 47, 82 };
		int[] row3 = { 18, 35, 87, 10 };
		int[] row4 = { 20, 04, 82, 47, 65 };
		int[] row5 = { 19, 01, 23, 75, 03, 34 };
		int[] row6 = { 88, 02, 77, 73, 07, 63, 67 };
		int[] row7 = { 99, 65, 04, 28, 06, 16, 70, 92 };
		int[] row8 = { 41, 41, 26, 56, 83, 40, 80, 70, 33 };
		int[] row9 = { 41, 48, 72, 33, 47, 32, 37, 16, 94, 29 };
		int[] row10 = { 53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14 };
		int[] row11 = { 70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57 };
		int[] row12 = { 91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48 };
		int[] row13 = { 63, 66, 04, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31 };
		int[] row14 = { 04, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 04, 23 };
		pyramid[0] = row0;
		pyramid[1] = row1;
		pyramid[2] = row2;
		pyramid[3] = row3;
		pyramid[4] = row4;
		pyramid[5] = row5;
		pyramid[6] = row6;
		pyramid[7] = row7;
		pyramid[8] = row8;
		pyramid[9] = row9;
		pyramid[10] = row10;
		pyramid[11] = row11;
		pyramid[12] = row12;
		pyramid[13] = row13;
		pyramid[14] = row14;

		for (int i = pyramid.length - 2; i >= 0; i--) {
			for (int j = 0; j < pyramid[i].length; j++) {
				pyramid[i][j] += Math.max(pyramid[i+1][j], pyramid[i+1][j+1]);
			}
		}
		System.out.println(pyramid[0][0]);

	}

}
