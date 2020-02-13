package computerConest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC2000J3 {

	public static void main(String [] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numberQuarter = Integer.parseInt(br.readLine());
		int s1Plays = Integer.parseInt(br.readLine());
		int s2Plays = Integer.parseInt(br.readLine());
		int s3Plays = Integer.parseInt(br.readLine());
		int plays = 0; 
		while (numberQuarter > 0) {
			if (plays%3 == 0 || plays == 0) {

				plays++;
				s1Plays++;
				if (s1Plays%35 == 0) {
					numberQuarter +=30;
				}
				numberQuarter--;
			}
			else if ((plays+1)%3 == 0 || plays == 1) {

				plays++;
				s2Plays++;
				if (s2Plays%100 == 0) {
					numberQuarter += 60;
				}
				numberQuarter--;
			}
			else if ((plays+2)%3 == 0 || plays == 2) {
				plays++;
				s3Plays++;
				if (s3Plays % 10 == 0) {
					numberQuarter += 9;
				}
				numberQuarter--;
			}
		}
		System.out.println("Martha plays " + plays +  " times before going broke.");
	}

}
