package unit1;

import java.util.Scanner;

public class SplittingDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter a number:  ");
		int num = sc.nextInt();
		
		
		int b= num%10;
		int a= (num-b)/10; 
	System.out.printf("The numbers are %d and %d%n",a,b);
	//second method
		 a=0;
		 b=0;
		 System.out.print("Please enter a number:  ");
			 int num2 = sc.nextInt();
		 
		 String numString = String.valueOf(num2);
		 char[] digits1 = numString.toCharArray();
		 a= digits1[0];
		 b=digits1[1];
		 
	      System.out.println("The numbers are "+digits1[0]+" and " +digits1[1]);
	      
	      //third method
	      System.out.print("Please enter a number:  ");
				 Double num3 = sc.nextDouble();
				 
				 a=(int)(num3/10);
				 b=(int)(num3-a*10);
				 
				 System.out.printf("The numbers are %d and %d%n",a,b);
				 sc.close();
	        }
	}

