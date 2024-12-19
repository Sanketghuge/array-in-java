package Arrays;

public class For_each_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4};
		
		// Regular for loop
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		// print an array  -> for each loop
		for(int num : arr) {
			System.out.print(num+" ");
		}

	}

}
