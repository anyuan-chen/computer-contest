package computerConest;

import java.util.Scanner;

public class CCC2019J2 {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int amtOfLine = sc.nextInt();
		for (int i = 0; i < amtOfLine; i++) {
			int amt = sc.nextInt();
			String str = sc.nextLine().trim();
			for (int j = 0; j < amt; j++) {
				System.out.print(str);
			}
			System.out.println();
		}
	}

}
