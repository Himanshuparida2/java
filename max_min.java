import java.util.Scanner;
public class max_min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of your Array: ");
		int n=sc.nextInt();
		int[]A=new int[n];
		System.out.println("Enter the elements of your Array:");
		for(int i=0;i<A.length;i++) {
			A[i]=sc.nextInt();
		}
		System.out.println("The Maximum element of the Array is:"+max(A));
		System.out.println("The Minimum element of the Array is:"+min(A));
		sc.close();

	}
	public static int max(int A[]) {
		int max=A[0];
		if (A.length==0) {
			return -1;
		}
		else {
			for(int i=0;i<A.length;i++) {
				if(A[i]>max) {
					max=A[i];
				}
			}
			return max;
		}
	}
	public static int min(int A[]) {
		int min=A[0];
		if(A.length==0) {
			return -1;
		}
		else {
			for(int i=0;i<A.length;i++) {
				if(A[i]<min) {
					min=A[i];
				}
			}
			return min;
		}
	}

}
