package Arrays;

public class Swap {

	public static void main(String[] args) {
		
// Write a program to find and display reverse of an array 
// using third variable  

		int arr[] = {11, 22, 33, 44, 55}; // Create an array
		
		System.out.println("Before swap");
		
		for(int i=0; i<arr.length;i++) {  // Print before swap
			System.out.print(arr[i]+" ");
		}
		
		int start = 0;            
		int end = arr.length-1;    
		
		while(start<end) {     
			
		int temp =arr[start];   
		arr[start]= arr[end];
		arr[end]=temp;
		start++;
		end--;
		
		}
		
		System.out.println("\nAfter swap");
		
		for(int i=0;i<arr.length; i++) { // Print after swap
			System.out.print(arr[i]+" ");
		}
		
		
		
		
		

	}

}
