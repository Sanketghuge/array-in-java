package Arrays;

public class Basic_sorting {

	public static void main(String[] args) {
		
		// Basic of sorting
		
		// create an array
		
		int arr[] = {3,1,2,4,6,5};
		
		System.out.println("Before sorting: ");
		// print before swap
		for(int num: arr) {
			System.out.print(num+" ");
		}
		
		
		for(int i=0;i<arr.length;i++) {       // element i
			for(int j=i+1;j<arr.length;j++) { // element j
				if (arr[i]>arr[j]) {     // 3>1 - true
					int temp = arr[i];   // temp =3  // swapping 
					arr[i]= arr[j];        // arr[i] = 1
					arr[j]=temp;           // arr[j] =3
				}
			}
		}
		
		System.out.println("\nAfter sorting: ");
		// Print after swap/sort
		for(int num:arr) {
			System.out.print(num+" ");
		}
		
		
		

	}

}
