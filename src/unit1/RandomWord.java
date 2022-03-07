//Ben Bere
//Feb 23
//Generates a random 6 character string with 1-2 vowels
package unit1;

public class RandomWord {
	public static void main(String[] args) {

		int vowelCount = (int) (Math.random() * 2) + 1;
		System.out.printf("there are %d vowels\n", vowelCount);

		char vowels[] = { 'a', 'e', 'i', 'o', 'u' };
		char cons[] = { 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x',
				'y', 'z' };
		char c = 0;
		String word = "";

		for (int i = 0; i < 6; i++) {
			int num = (int) (Math.random() * (6 - i)) + 1;
			if (num - vowelCount >= 1) {
				c = cons[(int) (Math.random() * 19)];
			} else {
				c = vowels[(int) (Math.random() * 5)];
				vowelCount--;
			}

			word = word + c;
		}
		System.out.println(word);
	}
}
