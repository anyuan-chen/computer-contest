package computerConest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC2017S1 {

	public static void main(String [] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numberOfGames = Integer.parseInt(br.readLine());
		int [] swifts = new int [numberOfGames];
		int [] semaphores = new int [numberOfGames];
		
		String sl = br.readLine();
		String sp = br.readLine();
		
		String [] temp1 = sl.split(" ");
		String [] temp2 = sp.split(" ");
		
		for (int i = 0; i < numberOfGames; i++) {
			swifts [i] = Integer.parseInt(temp1 [i]);
			semaphores [i] = Integer.parseInt(temp2 [i]);
		}
		
		int swiftTotal = 0;
		int semaphoreTotal = 0;
		int highestDay = 0;
		
		for (int i = 0; i < numberOfGames; i++) {
			swiftTotal += swifts [i];
			semaphoreTotal += semaphores [i];
			if (swiftTotal == semaphoreTotal) {
				highestDay = i+1;
			}
		}
		
		
		
		
		System.out.print(highestDay);
	}

}
