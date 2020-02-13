package computerConest;

import java.util.Scanner;

public class CCC2013J3 {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt() + 1;
		boolean repeat;
		do {
			repeat = checkRepeat(number);
			if (repeat == false) {
				System.out.print(number);
			}
			else {
				number++;
			}
		}while (repeat == true);
	}
	
	public static boolean checkRepeat(int number){
		String number2 = Integer.toString(number);
		for (int i = 0; i < number2.length(); i++) {
			String temp = Character.toString(number2.charAt(i));
			for (int j = 0; j < i; j++) {
				if (temp.equals(Character.toString(number2.charAt(j)))) {
					return true;
				}
			}
		
		}
		return false;
	}

}
