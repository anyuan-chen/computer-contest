package computerConest;
import java.util.Scanner;

public class Victor2 {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int [] row1 = new int [5];
		int [] row2 = new int [5];
		for (int i = 0; i < 5; i++) {
			row1 [i] = sc.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			row2 [i] = sc.nextInt();
		}
		int min1 = row1 [0];
		int min2 = row2 [0];
		for (int i = 1; i < row1.length; i++ ) {
			if (min1 > row1 [i]) {
				min1 = row1 [i];
			}
			if (min2 > row2 [i]) {
				min2 = row2 [i];
			}
		}
		int sum1 = 0-min1;
		int sum2 = 0-min2;
		for (int i = 0; i < row1.length; i++) {
			sum1 += row1 [i];
			sum2 +=  row2 [i];
		}
		if (sum1 > sum2) {
			System.out.print(sum1);
		}
		else {
			System.out.print(sum2);
		}
		
	}

}
