package unit1;

import java.util.Scanner;

public class StringAlgorithmProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter your full name: ");
			String fullName = sc.next();
			System.out.println();
			String names[] = fullName.split(" ");
			
			System.out.println("Your first name is "+names[0]);
			System.out.println("Your last name is "+names[1]);
			
			sc.close();
	}
}
