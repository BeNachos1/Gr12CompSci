//Ben Bere
//Feb 14 2022
//Calculating Roots using the Quadratic Equation
package unit1;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number A:   ");
			double a = sc.nextDouble();
		System.out.print("Enter Number B:   ");
			double b = sc.nextDouble();
		System.out.print("Enter Number C:   ");
			double c = sc.nextDouble();
			sc.close();
		double disc = b*b-4*a*c;	
		
		double x1,x2;
		
		if(disc<0) {
			System.out.println("There are no roots.");
		}
		if(disc == 0) {
			x1=-1*b/(2*a);
			System.out.printf("There is 1 root. x = %f",x1);
		}
		if(disc>0) {
			x1=((-b+Math.sqrt(disc))/(2*a));
			x2=((-b-Math.sqrt(disc))/(2*a));
			System.out.printf("x1= %f x2= %f",x1,x2);
		}

	}

}
