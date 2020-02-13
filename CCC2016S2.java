package computerConest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class CCC2016S2 {

	public static void main(String [] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int type = Integer.parseInt(br.readLine());
		int amt = Integer.parseInt(br.readLine());
		String [] dmojStr = br.readLine().split(" ");
		String [] pegStr = br.readLine().split(" ");
		int [] dmoj = new int [dmojStr.length];
		int [] peg = new int [dmojStr.length];
		for (int i = 0; i < dmoj.length; i++) {
			dmoj [i] = Integer.parseInt(dmojStr[i]);
			peg [i] = Integer.parseInt(pegStr[i]);
		}
		if (type == 1) {
			Arrays.sort(dmoj);
			Arrays.sort(peg);
			int total = 0; 
			for (int i = 0; i < dmoj.length; i++) {
				if (dmoj [i] > peg [i]) {
					total += dmoj [i];
				}
				else {
					total += peg [i];
				}
			}
			System.out.print(total);
		}
		else {
			Arrays.sort(dmoj);
			boolean sorted = false;
			for (int i = 0; i < peg.length-1 && sorted == false; i++) {
				sorted = true;
				for (int j = 0; j < peg.length-i-1; j++) {
					if (peg [j] < peg [j+1]) {
						int temp = peg [j];
						peg [j] = peg [j+1];
						peg [j+1] = temp;
						sorted = false;
					}
				}
			}
			int total = 0;
			for (int i = 0; i < dmoj.length; i++) {
				if (dmoj [i] > peg [i]) {
					total += dmoj [i];
				}
				else {
					total += peg [i];
				}
			}
			System.out.print(total);
			
		}
	}

}
