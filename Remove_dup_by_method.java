package Array_revision;

public class Remove_dup_by_method {
	
	public static int Remove (int arr[],int n) {
		
		int j=0;
		
		for(int i=0;i<n-1;i++) {
			if(arr[i]!=arr[i+1]) {
				arr[j]=arr[i];
				j++;
			}
		}
		arr[j] = arr[n-1];
		return j;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10,10,20,30,40,40,50};
		
		int n = arr.length;
		n= Remove(arr,n);
		
		for(int i=0;i<=n;i++) {
			System.out.print(" "+arr[i]);
		}
		
		
		

	}

}
