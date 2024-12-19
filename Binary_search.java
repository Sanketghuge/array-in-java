package Arrays;

public class Binary_search {

	public static void main(String[] args) {

		// BINARY SEAECH
		
		//            0  1  2  3  4
		int arr[] = {11,12,13,14,15};
		
		int element=12;
		int start = 0;
		int end = arr.length-1;
		int mid = (start+end)/2;
		
		// Logic
		while(start<=end) {  // start<=end -> Element should be in between start&end
			if(element<arr[mid]) {
				end = mid-1;
				
			}
			else if(element == arr[mid]){{
				System.out.println("Element found at: "+mid);
				break;
			}
				
			}
			else {
				start = mid+1;
				
			}
			mid = (start + end)/2;

		}
		// opposite of  ->  element should not in start to end
		
		if(start>=end) {
			System.out.println("Element not found in 11 to 15");
		}
		
	
	}
}
