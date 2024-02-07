import java.util.Arrays;
public class array_reduction {
	public static int [] reduction(int A[]) {
		int count=1,reduction=A[0],n=A.length;
		for(int i=0;i<n;i++) {
			if(A[i]-reduction>0) {
				System.out.println(n-i);
				reduction=A[i];
				count=count++;
			}
			System.out.println(count);
		}
		
			return A;
	}
	public static void main(String[] args) {
		int[]A= {5,1,1,1,2,3,5};
		Arrays.sort(A);
	    int[] result=reduction(A);
		for(int i=0;i<result.length;i++) {
		System.out.print(result[i]+" ");
		}
		int count=1,reduction=A[0],n=A.length;
		for(int i=0;i<n;i++) {
			if(A[i]-reduction>0) {
				System.out.println(n-i);
				reduction=A[i];
				count=count++;
			}
			System.out.println(" "+count+" ");
		}
		for(int j=0;j<A.length;j++) {
		System.out.print(A[j]+" ");
		}
		

	}

}
