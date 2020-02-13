package computerConest;

import java.util.Scanner;

public class CCC13J2 {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		boolean valid = true;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'I') {
				
			}
			else if (str.charAt(i) == 'O') {
				
			}
			else if (str.charAt(i) == 'S') {
				
			}
			else if (str.charAt(i) == 'H') {
				
			}
			else if (str.charAt(i) == 'Z') {
				
			}
			else if (str.charAt(i) == 'X') {
				
			}
			else if (str.charAt(i) == 'N') {
				
			}
			else {
				valid = false;
			}
		}
		if (valid == true) {
			System.out.print("YES");
		}
		else {
			System.out.print("NO");
		}
	}

}
