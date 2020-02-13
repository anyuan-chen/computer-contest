package computerConest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC2016J1 {

	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int winCounter = 0;
		for (int i = 0; i < 6; i++) {
			if (br.readLine().equals("W")) {
				winCounter++;
			}
		}
		if (winCounter > 4) {
			System.out.print(1);
		}
		else if (winCounter > 2) {
			System.out.print(2);
		}
		else if (winCounter > 0) {
			System.out.print(3);
		}
		else {
			System.out.print(-1);
		}
	}
}
