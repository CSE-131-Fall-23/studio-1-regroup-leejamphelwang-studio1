package studio1;
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The first integer to be averaged?");
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		System.out.println("The second integer to be averaged?");
		int n2 = in.nextInt();
		System.out.println("Average of " + n1+ " and " + n2 + " is "+ (double)(n1+n2)/2);
	}

}
