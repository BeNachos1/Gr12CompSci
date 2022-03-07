package unit3.unit3ExObject;

class Toyota {
	//global variables are set to be 0 or null;
	
	//1. static variables and constants
	//there is only one copy of these
	static String company = "Ben Car Rentals";
	
	//2. instance variables(not static)
	//each object gets its own copy of these.
	//final means it cannot be changed after it is set
	final String model;
	//means the other class can not effect it
	private int odometer;
	String colour="Blue";
	double fuel = 40.0; //in litres
	
	//3. Constructor(s)
	//Toyota(){
	//	System.out.println("make toyota");
	//}
	Toyota(String m){
		model = m;
		odometer = 25; //default value, driving from factory
	}
	Toyota(String model, int odometer){
		//this makes it refer to variable in the class
		//this.model = model;
		
		//runs the constructor with this name
		this(model);
		this.odometer = odometer; //default value, driving from factory
	}
	//4. Static Methods
	//You don't have to make an object to access them
	//so you can write x=Math.random()
	//as opposed to Random rgen = new Random();
	//				x= rgen.nextInt(100);
	
	
	//5. Instance Methods
	//getters and setters for private variables
	int getOdo() {
		return odometer;
	}
	void setOdo(int odo) {
		//odometer = odo;
		System.out.println("You criminal! this is Forbidden.");
	}
	
	void drive(int km) {
		odometer+=Math.abs(km); //no negative kms
		
	}
	
	//this method must return 1 line of text describing the object
	public String toString() {
		String s = String.format("Model = %s, Odometer = %dkm, Colour = %s.",model,odometer,colour);
		return(s);
		
	}
	
}
