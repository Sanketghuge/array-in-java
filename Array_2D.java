package Array_revision;
import java.util.*;
public class Array_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of arrays row & column: ");
		
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		int a[][] = new int [r][c];
		
		System.out.println("Enter elements of array: ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		
		
		System.out.println("Display array: ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
