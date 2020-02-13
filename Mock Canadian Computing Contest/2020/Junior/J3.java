package computerConest;

import java.util.Scanner;

public class MockCCCJ3 {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		double d = (sc.nextDouble()/2.0 * sc.nextDouble())/2.00;
		d = Math.round(d*100.0)/100.0;
		System.out.printf("%.2f", d);
		System.out.println();
	}

}
