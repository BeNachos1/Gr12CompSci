package unit1;


public class SortingArrays {
	public static void main(String[] args) {
		int nums[] = new int[15];
		
		System.out.print("Selection sort\n");
		for (int i = 0; i < 15; i++) {
			nums[i] = (int) (Math.random() * 100) + 1;
		}
		for (int i = 0; i < nums.length; i++)
			System.out.print(nums[i] + " ");
		System.out.println();
		// selection sort

		for (int k = 0; k < nums.length; k++) {
			int smallest = nums[k];
			int index = k;
			for (int i = k; i < nums.length; i++) {
				if (nums[i] < smallest) {
					smallest = nums[i];
					index = i;

				}
			}

			int temp = nums[k];
			nums[k] = smallest;
			nums[index] = temp;

		}
		for (int i = 0; i < nums.length; i++)
			System.out.print(nums[i] + " ");

		// Insertion Sort

		System.out.print("\n\n\nInsertion sort\n\n");
		for (int i = 0; i < 15; i++) {
			nums[i] = (int) (Math.random() * 100) + 1;
		}

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");

		}
		System.out.println();

		for (int i=1;i<nums.length;i++) {
			int lowest, index;
			lowest = nums[i];
			index = i-1;
			
			while (index>=0 && nums[index] > lowest) {
				nums[index+1] = nums[index];
				index--;
			}
			nums[index+1]=lowest;
		}

		
		for (int i = 0; i < nums.length; i++)
			System.out.print(nums[i] + " ");

	}

}
