package computerConest;
import java.util.Scanner;

public class Victor1 {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int people = sc.nextInt();
		
		System.out.print(total/people + " ");
		System.out.print(total%people);
	}
}
