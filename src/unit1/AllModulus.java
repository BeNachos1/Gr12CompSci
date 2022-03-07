//Ben Bere
//Learning to use Modulus
//Feb 10 2022
package unit1;

public class AllModulus {
	public static void main(String[] args) {
		// Modulus1 code
		for (int i = 0; i < 100; i++) {
			System.out.println(i % 101 + "\t" + i % 8);

		}
		System.out.printf("%n%n");
		// Modulus2 code
		for (int i = 0; i < 200; i++) {
			if (i % 13 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.printf("%n%n");
		// Modulus 3 code
		for (int i = 0; i < 200; i++) {
			System.out.printf("%d\t", i);

			if (i % 12 == 0) {
				System.out.println();
			}

		}
	}

}
