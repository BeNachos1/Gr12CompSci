//Ben Bere
//Learning to use Modulus
//Feb 10 2022
package unit1;

public class Modulus1 {
	public static void main(String[] args) {
		double x = 0, y = 0;
		for (double i = 0; i < 1000; i++) {
			if (i % 101.0 == 0) {
				x = 0;
			}
			if (i % 8.0 == 0) {
				y = 0;
			}

			System.out.printf("%.0f \t %.0f%n", x, y);
			x++;
			y++;
			
			
			

		}

	}
}