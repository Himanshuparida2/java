import java.util.Arrays;
public class MergeArray {
	public static void printarr(int A[]) {
		for(int i=0;i<A.length;i++) {
			System.out.print(A[i]+" ");
		}
	}
	public static void main(String[] args) {
		int[]A= {1,5,9,10,15,20};
		int B[]= {2,3,8,13};
		int c;
		int a=0;
		for(int i=0;i<A.length;i++) {
			if(A[a]>B[0]) {
			       c=A[a];
			       A[a]=B[0];
			       B[0]=c;
			       Arrays.sort(B);
			}
			a++;
		}
		System.out.print("First Array -> ");
		printarr(A);
		System.out.println("");
		System.out.print("Second Array -> ");
		printarr(B);
	}

}
