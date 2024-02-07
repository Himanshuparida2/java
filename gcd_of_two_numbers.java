import java.util.*;
public class gcd_of_two_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first no:");
		int a=sc.nextInt();
		System.out.println("Enter The second number:");
		int b=sc.nextInt();
		if(a>b) {
		    System.out.println("GCD ="+gcd(a,b));
		}
		else {
			System.out.println("GCD="+gcd(b,a));
		}
		sc.close();

	}
	public static int gcd(int a, int b) {
		if(b==0) {
			return a;
		}
		else {
			return gcd(b,a%b);
		}
	}

}
