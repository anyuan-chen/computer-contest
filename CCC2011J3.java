package computerConest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC2011J3 {
	static String total = "";
	public static void main(String [] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int start1 = Integer.parseInt(br.readLine());
		int start2 = Integer.parseInt(br.readLine());
		calc(start1, start2);
		System.out.print(total);
	}
	public static void calc(int num1, int num2) {
		if (num1 < num2) {
			total += num2;
		}
		else {
			calc(num2, num1-num2);
		}
	}

}
