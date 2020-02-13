package computerConest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC2018J2 {
	public static void main(String [] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numberOfSpots = Integer.parseInt(br.readLine());
		String park1 = br.readLine();
		String park2 = br.readLine();
		int total = 0;
		for (int i = 0; i < numberOfSpots; i++) {
			if (park1.charAt(i) == park2.charAt(i) && park1.charAt(i) == 'C') {
				total++;
			}
		}
		System.out.println(total);
	}
	
}
