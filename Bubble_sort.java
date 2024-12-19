package Arrays;

public class Bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {3,4,2,1};
		
		for(int i=0;i<arr.length-1;i++) { // Rounds -1 -> Rounds = length-1 
			for(int j=0;j<arr.length-1;j++) { // Elements  -1  -> to avoid exception
				                              // -i -> 1 element is getting added at 
				                               // its correct order
				
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int num : arr) {
			System.out.print(num+" ");
		}

	}

}
