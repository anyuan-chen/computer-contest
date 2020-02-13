package computerConest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC2011S1 {

	public static void main(String [] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numberRows = Integer.parseInt(br.readLine());
		int sCount = 0;
		int tCount = 0;
		for (int i = 0; i < numberRows; i++) {
			String readLine = br.readLine();
			for (int j = 0; j < readLine.length(); j++) {
				if (readLine.charAt(j) == 's' || readLine.charAt(j) == 'S') {
					sCount++;
				}
				else if (readLine.charAt(j) == 't' || readLine.charAt(j) == 'T') {
					tCount++;
				}
			}
		}
		if (sCount >= tCount) {
			System.out.print("French");
		}
		else {
			System.out.print("English");
		}
	}

}
