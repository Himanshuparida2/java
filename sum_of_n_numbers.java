import java.util.Scanner; 
public class sum_of_n_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your number:");
		int n=sc.nextInt();
		System.out.println("Sum of n numbers is: "+sum(n));
		sc.close();

	}
	public static int sum(int n) {
		if(n==1) {
			return 1;
		}
		else if(n==0){
			return 0;
		}
		else {
			return n+(sum(n-1));
		}
	}

}
