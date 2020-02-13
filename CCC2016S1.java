package computerConest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC2016S1 {

	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		int astCounter = 0; 
		int ltCounter1 = 0;
		int ltCounter2 = 0;
		for (int i = 0; i < str1.length(); i++) {
			if (str2.charAt(i) == '*') {
				astCounter++;
			}
			if (str1.charAt(i) != '*') {
				ltCounter1++;
			}
			if (str2.charAt(i) != '*') {
				ltCounter2++;
			}
		}	
		if (ltCounter2 > ltCounter1) {
			System.out.print("A");
		}
		else {
			System.out.print("N");
		}
		
		
	}

}
