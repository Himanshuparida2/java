
public class check_reverse {
	public static void printarr(int [] A) {
		for(int i=0;i<A.length;i++) {
			System.out.print(A[i]+" ");
		}
	}

	public static void main(String[] args) {
		int A[]= {1,2,6,5,4};
		int a=0;
		for(int i=0;i<A.length;i++) {
			if(A[a]>A[a+1]) {
				int c;
				c=A[i];
				A[i]=A[i+1];
				A[i+1]=c;
			}
			a++;
		}
		printarr(A);

	}

}
