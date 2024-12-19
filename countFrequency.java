
package Arrays;
import java.util.*;
public class countFrequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int arr[] = new int[20];
		for(int i=0;i<20;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		
		
		for(int i=0;i<arr.length;i++) {
			int count = 1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
				
			}
			
			if(count>0) {
				System.out.println(arr[i] + " -> " + count);
				i=i+count-1;
			}
		}
		
	}
}
