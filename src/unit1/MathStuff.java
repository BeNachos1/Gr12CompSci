package unit1;

public class MathStuff {

	public static void main(String[] args) {
	
		System.out.println("Strange math");
		//int m = 5;
		//int n = 5/ 0;  //will crash program
		//System.out.println("n= " +n);
		
		double x = 5.0;
		double y = x/0.0;
		System.out.println("y = "+y);
		
		long num = 5000000L * 30000L;
		System.out.println(num);
		
		//big doubles
		x=1.7e+308;
		x=x*10;
		System.out.println("bigger than the biggest double: "+x);
		
		//accuracy
		x=1234.0;
		x=x*0.1;
		x=x*0.1;
		System.out.println("x is now " + x);
		
		x=1234.0;
		x=x/10;
		x=x/10;
		System.out.println("x is now " + x);
		
		//How to check if two doubles are equal
		
		if(x==12.34) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
			
		
		
	}

}
