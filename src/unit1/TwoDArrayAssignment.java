package unit1;

public class TwoDArrayAssignment {
	public static void main(String[] args) {
		/*
		 * int [][] sales = new int [5][4]; for (int row=0;row<5;row++) { for (int
		 * column=0;column<4;column++) { sales[row][column] =
		 * (int)(Math.random()*250)+50; } } for (int row=0;row<5;row++) { for (int
		 * column=0;column<4;column++) { System.out.print(sales[row][column]+"\t"); }
		 * System.out.println(); } int grandTotal=0; for (int row=0;row<5;row++) { for
		 * (int column=0;column<4;column++) { grandTotal+=sales[row][column]; } }
		 * System.out.println("The grand total is "+grandTotal);
		 * 
		 * int row2sum=0; for (int column=0;column<4;column++) {
		 * row2sum+=sales[1][column]; }
		 * 
		 * 
		 * System.out.println("The sum of row 2 is "+row2sum);
		 * 
		 * int poorSales=0; for (int row=0;row<5;row++) { for (int
		 * column=0;column<4;column++) { if (sales[row][column]<50)
		 * poorSales+=sales[row][column];
		 * 
		 * } } System.out.println("The total poor sales is "+poorSales); int largest =0;
		 * for (int row=0;row<5;row++) { for (int column=0;column<4;column++) { if
		 * (sales[row][column]>largest) largest=sales[row][column];
		 * 
		 * } } System.out.println("The largest number is "+largest);
		 */
		/*
		 * int[][] data = { { 3, 2, 5 }, { 1, 4, 4, 8, 13 }, { 9, 1, 0, 2 }, { 0, 2, 6,
		 * 3, -1, -8 } };
		 * 
		 * int[] rowSum = new int[4];
		 * 
		 * for (int i = 0; i < data.length; i++) { for (int j = 0; j < data[i].length;
		 * j++) { rowSum[i] += data[i][j]; } System.out.println(rowSum[i]); }
		 */

		int[][] scores = { { 20, -5, 90, 22, 32 }, { 34, 29, -3, 44, 2 }, { 100, 0, 96, 37, -0 } };

	

		for (int j = 0; j < 5; j++) {
			double avg = 0;
			for (int i = 0; i < 3; i++) {
				avg += scores[i][j];
			}
			System.out.println(avg / 3);
		}

	}
}
