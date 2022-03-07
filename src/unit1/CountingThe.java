//Ben Bere
//Feb 22 2022
//Counting how many times "the" is used in a something
package unit1;

public class CountingThe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int pos = 0;
		int count = 0;
		String text1 = "sdkajsbd jrnhebrek the kdfnhdklk The djfdkjfsdjkthesakthethethesd";
		text1 = text1.toLowerCase();

		pos = text1.indexOf("the", pos);
		while (pos != -1) {
			pos = text1.indexOf("the", pos + 1);
			count++;
		}

		System.out.printf("the occured %d times", count);
	}

}
