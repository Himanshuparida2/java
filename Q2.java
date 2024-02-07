import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		System.out.println("enter Your length of your 2D array:");
		Scanner sc= new Scanner(System.in);
		int l=sc.nextInt();
		int[]A=new int[l];
		System.out.println("Enter The Element of the array:");
		for(int j=0;j<A.length;j++) {
			A[j]=sc.nextInt();
		}
		int max=A[0];
		int min=A[0];
		for(int i=0;i<A.length;i++) {
			if(max<A[i]) {
				max=A[i];
			}
			if(min>A[i]) {
				min=A[i];
			}
		}
		System.out.println("Max in the Array is :"+max+" Min in the Array is: "+min);
        sc.close();

	}

}
