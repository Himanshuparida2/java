import java.util.*;
public class power_of_a_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number: ");
		int x=sc.nextInt();
		System.out.println("Enter your power: ");
		int n=sc.nextInt();
		System.out.println("Result="+ power(x,n));
		sc.close();

	}
	public static int power(int x,int n) {
		if (n==0) {
			return 1;
		}
		else if(n==1) {
			return x;
		}
		else {
			return(x*power(x,n-1));
		}
	}

}
