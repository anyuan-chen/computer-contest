package computerConest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CCC2018S1 {

	public static void main(String [] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] numVillage = new int [Integer.parseInt(br.readLine())];
		
		for (int i = 0; i < numVillage.length; i++) {
			numVillage [i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(numVillage);
		double [] lengths = new double [numVillage.length-1];
		for (int i = 0; i < numVillage.length-1; i++) {
			lengths [i] = Math.abs(numVillage [i+1] - numVillage [i]);
		}
		double [] boundaries = new double [numVillage.length-1];
		for (int i = 0; i < boundaries.length; i++) {
			boundaries [i] = (double) numVillage [i] + lengths [i]/2;
		}
		double smallLength = Integer.MAX_VALUE; 
		for (int i = 0; i < boundaries.length-1; i++) {
			if (smallLength > boundaries [i+1] - boundaries [i]) {
				smallLength = Math.abs(boundaries [i+1] - boundaries [i]);
			}
		}
		
		String smlLength = String.format("%.1f", smallLength);
		System.out.println(smlLength);
	}
}
