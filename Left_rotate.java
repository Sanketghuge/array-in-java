package Arrays;

public class Left_rotate {

	public static void main(String[] args) {
		
// Write a program to implement left/rotate shift of array element
		
		
		// Create an array
		int arr[] = {11,22,33,44,55};
		
		System.out.println("Before left shift: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
// step 1 - create temp variable to store 11		
		int temp=arr[0];
		
		
// step 2 -left  shift each element by 1 index		
		for(int i=0;i<arr.length-1;i++) {
			arr[i] = arr[i+1];
			
		}

		
//step 3 -  Replace last value by temp
		arr[arr.length-1] = temp;
		
		
		
// Print an array		
		System.out.println("\nAfter left shift by one: ");
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}
		
		
		// Print an array -> for each
//					for(int num : arr) {
//						System.out.print(num+" ");
//					}

	}

}
