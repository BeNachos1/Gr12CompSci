//Ben Bere
//February 14 2022
//Using if statements
package unit1;

public class Grades {

	public static void main(String[] args) {
		int mark = 98;
		System.out.println("Your grade is: " + calc(mark));
	}

	static String calc(int mark) {
		String grade = "";

		if (mark < 50)
			grade = "F";
		if (mark >= 50)
			grade = "D";
		if (mark >= 60)
			grade = "C";
		if (mark >= 70)
			grade = "B";
		if (mark >= 80)
			grade = "A";
		if (mark >= 90)
			grade = "A+";

		return grade;
		// System.out.printf("Your mark is %d. That gives you a %s.",mark,grade);

	}
	static String calc2(int mark) {
		String grade = "";
//		String grades[]= {"F","F","F","F","F","F","D","A","A","A","A",};

		if (mark < 50)
			grade = "F";
		if (mark >= 50)
			grade = "D";
		if (mark >= 60)
			grade = "C";
		if (mark >= 70)
			grade = "B";
		if (mark >= 80)
			grade = "A";
		if (mark >= 90)
			grade = "A+";

		return grade;
		// System.out.printf("Your mark is %d. That gives you a %s.",mark,grade);

	}
}