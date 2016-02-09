
public class Array2D {

	public static void main(String[] args) {
		// 2-dimensionale Arrays

		int[][] numbers = { { 1, 2, 3 }, { 4, 5, 6 } };

		for (int i = 0; i < numbers.length; i++) {

			// System.out.println(numbers[i][0] + "," + numbers[i][1]+ ","
			// +numbers[i][2]);

			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + ",");
			}

			System.out.println();
		}

	}

}
