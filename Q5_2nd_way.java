import java.util.*;
public class Q5_2nd_way {
public static void rev(int start,int end,int A[]) {
	int j=A.length-2;int []temp=new int[A.length];
	for(int i=start;i<j;i++) {
		for(j=end;i<j;j--) {
			temp[i]=A[j];
			temp[j]=A[i];
			
		}
		for(int k=0;k<temp.length;k++) {
			System.out.print(temp[k]);
		}
		
	}
}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the length of the Array:");
		int l=sc.nextInt();
		int A[]=new int[l];
		System.out.println("Enter the elements of the Array:");
		for (int u=0;u<A.length;u++) {
			A[u]=sc.nextInt();
		}
		System.out.println("Enter where to start:");
		int start=sc.nextInt();
		System.out.println("Enter where to end:");
		int end=sc.nextInt();
		System.out.println(rev(start,end,A));
		sc.close();
	}

}
