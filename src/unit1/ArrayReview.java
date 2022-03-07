//Ben Bere
//Feb 15 2022
//Reviewing how arrays work
package unit1;

public class ArrayReview {

	public static void main(String[] args) {
		int [] nums=new int [12];
		
		for (int i=0;i<12;i++ ) {
			nums[i]=(int)(Math.random()*100)+1;
			System.out.print(nums[i]+"\t");
		}
		System.out.println();
		
		int big=0;
		int small=200;
		
		for (int i=0;i<12;i++) {
			if (nums[i]>big) big =nums[i];
			if (nums[i]<small) small =nums[i];
		}
		System.out.printf("The biggest number is %d and the smallest is %d",big,small);

	}

}
