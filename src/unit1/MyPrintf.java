//Ben Bere
//Learning to use Modulus
//Feb 9 2022
package unit1;

public class MyPrintf {

	public static void main(String[] args) {
		//1
		double x = 1.0/7.0;
		System.out.printf("%.5f%n",x);
		//2
		String name = "Bessy";
		String colour = "brown";
		int weight = 1200;
		System.out.printf("The cow's name is %s, she is %s and weighs %d kg.%n%n",name,colour,weight);
		//3
		int xx = 123;
		System.out.println("| 12345678 |");
		System.out.println("| ======== |");
		System.out.printf("| %8d |%n", xx);
		System.out.printf("| %08d |%n", xx);
		System.out.printf("| %+8d |%n", xx);
		System.out.printf("| %-8d |%n", xx);
		System.out.printf("| %8.1f |%n", (double)xx);
		
		
	}

}
