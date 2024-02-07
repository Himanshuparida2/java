
public class Q2 {
//Bubble sort
	public static int[] bubble(int A[]) {
		int max=7;
		if(A[A.length-1]==max) {
			return A;
		}
		else{
		for(int i=0;i<A.length-1;i++) {
			for(int j =0;j<A.length-i-1;j++) {
				if(A[i]>A[j]) {
					int temp=A[i];
					A[i]=A[j];
					A[j]=temp;
				}
			}
		}
		return bubble (A);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {5,1,2,4,3,7,6};
		int []temp=bubble(A);
		for(int i=0;i<temp.length;i++) {
			System.out.print(temp[i]+" , ");
		}
		System.out.println();
	}

}
