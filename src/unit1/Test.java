package unit1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		for (int i = 0; i<word.length();i++) {
			char c = word.charAt(i);
			if ((c-'N')<'A') {
				System.out.print(c);
			}
		}
	}

}
