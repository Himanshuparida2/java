import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your Number:");
		int n=sc.nextInt();
		int f=Fabo(n);
		System.out.println("Fabonacci Series: "+f);
		

	}
	public static int Fabo(int n) {
		if(n==0) {
			return 0;
		}
		else if(n==1) {
			return 1;
		}
		else {
			return (Fabo(n-1)+Fabo(n-2));
		}
	}

}
