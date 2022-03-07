//Ben Bere
//Feb 23 2022
//Adds 1 to every number in a string and reverts 9 back to 0
package unit1;


public class Numbers {
	public static void main(String[] args) {

		String s1 = "blah blah blah 9, blah blah 2";
		String s2 = "";

		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if (Character.isDigit(c) == true) {
				c++;
			}
			if (c == ':') {
				c = 48;
			}
			s2 = s2 + c;

		}
		System.out.println(s1);
		System.out.println(s2);

	}
}
