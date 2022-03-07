//Ben Bere
//Feb 25 2022
//Converts letters to numbers and multiplies them, then prints words with char sums of 1 million +-500
package unit1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MillionWord {

	public static void main(String[] args) {
		try {
			File file = new File("words_alpha.txt");
			Scanner input = new Scanner(file);
			while (input.hasNextLine()) {
				String line = input.nextLine();
				// sets product variable equal to 1 so the first number will be it's own value
				int prod = 1;
				for (int i = 0; i < line.length(); i++) {
					char c = line.charAt(i);

					// converts each character into it's number equivalent
					int n = c - '`';
					prod *= n;
				}
				if (prod > 999500 && prod < 1000500) {
					System.out.printf("%s   \t%d\n", line, prod);
				}

			}
			input.close();
		} catch (FileNotFoundException ex) {
			System.out.println(ex.toString());

		}

	}

}
