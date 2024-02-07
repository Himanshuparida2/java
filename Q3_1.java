//insertion sorting
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     int A[]= {12,11,13,5,6};
	     for (int i=1;i<A.length;i++) {
	    	 int key=A[i];
	    	 int j=i-1;
	    	 while(j>=0 && A[j]>key){
	    		 A[j+1]=A[j];
	    		 j--;
	    		 
	    	 }
	    	 A[j+1]=key;
	     }
	     for(int j=0;j<A.length;j++) {
	    	 System.out.print(A[j]+" ");
	     }

	}

}
