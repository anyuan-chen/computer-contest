package computerConest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MockCCC2019C1J4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int amtFood = Integer.parseInt(br.readLine());
		String[][] arr = new String[2][4];
		//first row is all the names of food, 2nd is the amount consumed
		arr[1][0] = "0";
		arr[1][1] = "0";
		arr[1][2] = "0";
		arr[1][3] = "0";
		arr[0][0] = "Deluxe Tuna Bitz";
		arr[0][1] = "Bonito Bitz";
		arr[0][2] = "Sashimi";
		arr[0][3] = "Ritzy Bitz";
		
		for (int i = 0; i < amtFood; i++) {
			String str = br.readLine();
			if (str.equals(arr[0][0])) {
				arr[1][0] = Integer.toString(Integer.parseInt(arr[1][0]) + 1);
			} else if (str.equals(arr[0][1])) {
				arr[1][1] = Integer.toString(Integer.parseInt(arr[1][1]) + 1);
			} else if (str.equals(arr[0][2])) {
				arr[1][2] = Integer.toString(Integer.parseInt(arr[1][2]) + 1);
			} else {
				arr[1][3] = Integer.toString(Integer.parseInt(arr[1][3]) + 1);
			}
		}
		//this part is the golden key
		//i assign a b c d so i can sort by alpha if they are equal and they go into the right order
		arr[0][0] = "a";
		arr[0][1] = "b";
		arr[0][2] = "c";
		arr[0][3] = "d";
		//this is just ur avg bbl sort
		for (int i = 0; i < 4 - 1; i++) {
			for (int j = 0; j < 4 - i - 1; j++) {
				//if one value > the other then switch
				if (Integer.parseInt(arr[1][j]) < Integer.parseInt(arr[1][j + 1])) {
					String temp1 = arr[1][j];
					String temp2 = arr[0][j];

					arr[1][j] = arr[1][j + 1];
					arr[0][j] = arr[0][j + 1];

					arr[1][j + 1] = temp1;
					arr[0][j + 1] = temp2;
				} 
				//if they equal but one alpha before the other switch
				else if (Integer.parseInt(arr[1][j]) == Integer.parseInt(arr[1][j + 1])
						&& arr[0][j].compareTo(arr[0][j + 1]) > 0) {
					String temp1 = arr[1][j];
					String temp2 = arr[0][j];

					arr[1][j] = arr[1][j + 1];
					arr[0][j] = arr[0][j + 1];

					arr[1][j + 1] = temp1;
					arr[0][j + 1] = temp2;
				}
			}
		}
		//switch a b c d back to names
		for (int i = 0; i < 4; i++) {
			if (arr[0][i] == "a") {
				arr[0][i] = "Deluxe Tuna Bitz";
			} else if (arr[0][i] == "b") {
				arr[0][i] = "Bonito Bitz";
			} else if (arr[0][i] == "c") {
				arr[0][i] = "Sashimi";
			} else {
				arr[0][i] = "Ritzy Bitz";
			}
		}
		//print em
		for (int i = 0; i < 4; i++) {
			if (i != 4) {
				if (Integer.parseInt(arr[1][i]) != 0) {
					System.out.print(arr[0][i] + " " + arr[1][i]);
					System.out.println();
				}
			} else {
				if (Integer.parseInt(arr[1][i]) != 0) {
					System.out.print(arr[0][i] + " " + arr[1][i]);
				}
			}
		}

	}

}
