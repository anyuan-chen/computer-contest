package computerConest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CCC2017S2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numberWaves = Integer.parseInt(br.readLine());
		String[] mega = br.readLine().split(" ");
		int[] allTide = new int[mega.length];
		for (int i = 0; i < mega.length; i++) {
			allTide[i] = Integer.parseInt(mega[i]);
		}
		Arrays.sort(allTide);

		int[] finalArr = new int[numberWaves];
		int first = (int) Math.floor(allTide.length / 2);
		if (numberWaves % 2 == 0) {
			int amtLow = 0;
			int amtHigh = 1;
			for (int i = 0; i < allTide.length; i++) {
				if (i % 2 != 0) {
					finalArr[i] = allTide[first - 1 + amtHigh];
					amtHigh++;
				} else {
					finalArr[i] = allTide[first - 1 - amtLow];
					amtLow++;
				}
			}

			for (int i = 0; i < finalArr.length; i++) {
				if (i == finalArr.length - 1) {
					System.out.print(finalArr[i]);
				} else {
					System.out.print(finalArr[i] + " ");
				}
			}
		} else {
			int amtLow = 0;
			int amtHigh = 1;
			for (int i = 0; i < allTide.length; i++) {
				if (i == 0) {
					finalArr[i] = allTide[first];
				}
				else {
					if (i % 2 == 1) {
						finalArr[i] = allTide[first + amtHigh];
						amtHigh++;
					} else {
						finalArr[i] = allTide[first - 1 - amtLow];
						amtLow++;
					}
				}
			}

			for (int i = 0; i < finalArr.length; i++) {
				if (i == finalArr.length - 1) {
					System.out.print(finalArr[i]);
				} else {
					System.out.print(finalArr[i] + " ");
				}
			}

		}

	}
}
