//Ben B
//testing Scanner
//Feb 10 2022
package unit1;

import java.util.Scanner;

public class ScannerExample {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("What do you have for lunch?  ");
		String food = sc.next();
		System.out.printf("I like %s too%n",food);

		System.out.print("How many pieces do you have?");
		int num = sc.nextInt();
		
		if (num > 1) {
			System.out.print("Can I buy one? I have $1");
		}
	}

}
