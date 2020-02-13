package computerConest;
import java.util.Scanner;

public class Victor3 {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfPeople = sc.nextInt();
		int sum = 0;
		int [] arr = new int [numberOfPeople];
		for (int i = 0; i < numberOfPeople; i++) {
			arr [i] = sc.nextInt();
			sum += arr [i];
		}
		int numberPerPerson = sum/numberOfPeople;
		int invalid = 0;
		for (int i = 0; i < numberOfPeople; i++) {
			if (arr [i] != numberPerPerson) {
				invalid++;
			}
		}
		System.out.print(invalid);
	}

}
