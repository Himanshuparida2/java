import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int fact=fact(n);
		System.out.println("The Factorial is "+fact);
sc.close();
	}
public static int fact(int n) {
	if(n==0) {
		return -1;
	}
	else if(n==1) {
		return n;
	}
	else {
		return fact(n*fact(n-1));
	}
}

}
