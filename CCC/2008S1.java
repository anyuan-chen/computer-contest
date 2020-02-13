package computerConest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC2008S1 {

	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String lowestCity = " ";
		int lowestTemp = Integer.MAX_VALUE;
		String city;
		do {
			
			String [] lulw = br.readLine().split(" ");
			city = lulw [0];
			int temp = Integer.parseInt(lulw [1]);
			if (temp < lowestTemp) {
				lowestTemp = temp;
				lowestCity = city;
			}			
			
		} while (!city.equals("Waterloo"));
		
		
		System.out.println(lowestCity);
		
		
	}

}
