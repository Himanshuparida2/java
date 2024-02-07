import java.util.Scanner;
public class Rearrage_sorted_array {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int count=1;
		System.out.println("Enter the length of the Array:");
		int n=sc.nextInt();
		int A[]=new int[n];
		int stop=A.length-1;
		int start=A[0];
		int temp[]=new int[n];
		for(int i=0;i<A.length;i++) {
			A[i]=count;
			count++;
			
		}
		for(int y=0;y<A.length;y++) {
			temp[y]=A[y];
		}
		for(int j=0;j<A.length;j++) {
			if(A.length%2==0) {
				temp[j]=A[stop];
				stop--;
			}
			else {
				temp[j]=A[start];
				start++;
			}
		}
		for(int z=0;z<temp.length;z++) {
			System.out.print(temp[z]+" ");
		}
		sc.close();

	}

}
