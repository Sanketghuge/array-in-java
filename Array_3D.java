package Array_revision;
import java.util.*;

public class Array_3D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter set , row , col:");
		int set = sc.nextInt();
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		int a[][][] = new int[set][r][c];
		System.out.println("Enter elements: ");
		for(int i=0;i<set;i++) {
			for(int j=0;j<r;j++) {
				for(int k=0;k<c;k++) {
					a[i][j][k]=sc.nextInt();
				}
			}
		}
		
		System.out.println();
		
		System.out.println("Output is :");
		for(int i=0;i<set;i++) {
			for(int j=0;j<r;j++) {
				for(int k=0;k<c;k++) {
					System.out.print(a[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		

	}

}
