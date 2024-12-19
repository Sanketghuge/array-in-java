package Arrays;

public class Right_shift {

	public static void main(String[] args) {
// Write a program to right/ rotate shift of array elements
		
		
		int arr[] = {11,22,33,44,55};
		System.out.println("Before shifting: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		// store temp = 55
		int temp = arr[arr.length-1];
		
		
		// shift right by 1 index
		for(int i=arr.length-1;i>0;i--) {
			arr[i] = arr[i-1];
		}
		
		// replace first element by temp
		arr[0] = temp;
		
		System.out.println();
		
		// print an  array
		System.out.println("After right shifting: ");
		for(int num : arr) {
			System.out.print(num+" ");
		}

	}

}
