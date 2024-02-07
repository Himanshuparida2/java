import java.util.Scanner;
public class fibonacci {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number till which you want your Fabonacci Series to be: ");
		int n=sc.nextInt();
		System.out.println("The Fabonacci Series is: "+fabo(n));
		sc.close();

	}
	public static int fabo(int n) {
		if(n==0) {
			return 0;
		}
		else if(n==1) {
			return 1;
		}
		else {
			return (fabo(n-1)+fabo(n-2));
		}
		
	}

}
