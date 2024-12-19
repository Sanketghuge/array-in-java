package Arrays;

public class Demo123 {

	public static void main(String[] args) {
		
		
		// Regular variables  (4*500) -> 2000 upload & downloads
		
		int sub1=78;
		int sub2=84;
		int sub3=79;
		int sub4=98;
		
//		System.out.println(sub1);
//		System.out.println(sub2);
//		
		
		// Arrays    500  -> 500 uploads and downloads
		
		
		// Creating an array
		int[] subjects = { 78, 84, 79, 98 };
		System.out.println(subjects[0]);
		System.out.println(subjects[1]);
		System.out.println(subjects[2]);
		System.out.println(subjects[3]);
		System.out.println();
		
		// Printing array
		
		for(int i=0; i<=3; i++) {
			System.out.println(subjects[i]);
			
		}
		System.out.println();

		
		// * 500 -> Students / users
		
		// Arrays is nothing but when we store group of elemennts
		// together just the datatype of these elements should be same
		
		// Just the grup of elements shpld similar datatype
		
		// arrays get stored in heap memory
		
		// The actul values are called aas elements
		// the elements have their own address
		// called as index | index statr from 0
		
		// Array is a predefined class
		// With pre define methods
		
		// Index-    0   1   2   3   4  5
		int arr[] = {87, 66, 67, 89, 78,56};
		
		// Printing an array
		for(int i=0; i<=arr.length-1; i++) {
			System.out.println(arr[i]);
		
		}
		System.out.println();
		
		// Length = No of elements 
		// Last index = length - 1
		
		// Printing an array
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		
		System.out.println("Length on an array is : "+arr.length);
		
		System.out.println();
		
		// Character array
		
		char char_arr[] = {'S','A','N','K','E','T'};
		
		for(int i=0; i<char_arr.length; i++) {
			System.out.print(char_arr[i]);
		}
		
		
		
		

	}

}
