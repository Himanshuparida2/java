import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the total numbers you want to Add:");
		int n=sc.nextInt();
		int add=0;
		System.out.println("enter your numbers you want to add:");
		for(int i=n;i>0;i--) {
			add+=sc.nextInt();
		}
		System.out.println("total= "+add);
sc.close();
	}

}
