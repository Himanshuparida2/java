
public class Q1 {
//selection sort
	public static int[] swap(int[] A,int minid) {
		for(int i=0;i<A.length-1;i++) {
			 minid=i;
			for(int j=i+1;j<A.length-1;) {
				if(A[minid]>A[j]) {
					minid=j;
				}
				return swap(A,A[minid]);
			}
		}
		return A;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]= {4,25,12,22,11};
		System.out.println("result: "+swap(A,0));

	}

}
