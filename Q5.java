import java.util.*;
public class Q5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int j=0;
		System.out.println("Enter the length of the Array:");
		int l=sc.nextInt();
		int A[]=new int[l];
		System.out.println("Enter the elements of the Array:");
		for (int u=0;u<A.length;u++) {
			A[u]=sc.nextInt();
		}
		System.out.println("Enter the number you want to rotate from:");
		int k=sc.nextInt();
		int temp[]=new int[l];
		for(int i=0;i<A.length;i++) {
			temp[i]=A[i];
			
		}
		for(int y=k;y<A.length;y++) {
			temp[j]=A[y];
			j++;
		}
		for(int r=0;r<temp.length;r++) {
		System.out.print(temp[r]+" , ");
		}
		sc.close();

	}

}
