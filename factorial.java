import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number you want to find the Factorial of:");
		int n=sc.nextInt();
		System.out.println("The Factorial of the number is: "+fact(n));
		sc.close();

	}
	public static int fact(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		else {
			return n*fact(n-1);
		}
	}

}
