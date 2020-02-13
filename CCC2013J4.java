package computerConest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class CCC2013J4 {

	public static void main(String [] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int minutes = Integer.parseInt(br.readLine());
		int numberChores = Integer.parseInt(br.readLine());
		ArrayList <Integer> al = new ArrayList <Integer> ();
		for (int i = 0; i < numberChores; i++) {
			al.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(al);
		int possibleChores = 0;
		int totalMinutes = 0;
		for (int i = 0; i < numberChores; i++) {
			if (totalMinutes + al.get(i) <= minutes) {
				totalMinutes += al.get(i);
				possibleChores++;
			}
		}
		System.out.print(possibleChores);
	}

}
