package JavaArray;

public class PrintGriid {

	public static void main(String[] args) {

		int[][] grid = new int[5][5];

		for (int r = 0; r < 5; r++) {
			for (int c = 0; c < 5; c++) {
				System.out.printf("%2d ", grid[r][c]);
			}
			System.out.println();
		}
	}
}
