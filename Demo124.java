package Arrays;

public class Demo124 {

	public static void main(String[] args) {

		
		
		int num1= 10;   // Primitive datatype
		int num2= 20;
		
		int temp = num1;
		num1 =  num2;
		num2 = temp;
		
		System.out.println("Num1: "+num1);
		System.out.println("Num2: "+num2);
		
		
	
	// Write a program to display reversemof an array using third variable	
	
		int arr[] ={10, 20};    // Array
		
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
