package unit3.unit3ExObject;
//Ben Bere
//learning how to create objects with classes
public class Car {
	public static void main(String[] args) {
		//static variable, so I don't need to make an object
		System.out.println(Toyota.company);
		
		Toyota car1 = new Toyota("Yarris");
		
		
		Toyota car2 = new Toyota("Corolla", 5000);
	
		System.out.println(car2.colour);
		System.out.println(car1.model);
		
		System.out.println(car1.toString());
		System.out.println(car2);
		car2.drive(567);
		System.out.println(car2);
	}
}
