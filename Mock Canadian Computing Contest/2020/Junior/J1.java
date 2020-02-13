package computerConest;

import java.util.Scanner;

public class MockCCCJ1 {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		System.out.println(Math.min(Math.min(n1, n2), Math.min(n3, n4)));
		System.out.println(Math.max(Math.max(n1, n2), Math.max(n3, n4)));
		
	}

}
