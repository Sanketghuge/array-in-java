package Arrays;

public class Swap2 {

	public static void main(String[] args) {
		
		
// Write a program to find & display array without third variable	
		
		int arr[] = {11,22,33,44,55};
		
		System.out.println("Before swap");
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		System.out.println("\nAfter swap");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}

	}

}
