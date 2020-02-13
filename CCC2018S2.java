package computerConest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC2018S2 {
	static int n;
	static int [] [] grid;
	public static void main(String [] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		grid = new int [n] [n];
		for (int i = 0; i < n; i++) {
			String temp = br.readLine();
			String [] tempArr = temp.split(" ");
		
		}
		boolean condition1 = false;
		boolean condition2 = false;
		while (condition1 == false || condition2 == false){
			condition1 = condition1();
			condition2 = condition2();
			if (condition1 == false || condition2 == false) {
				rotate90();
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j != n-1) {
					System.out.print(grid [i] [j] + " ");
				}
				else {
					System.out.print(grid [i] [j]);
				}
				
			}
			System.out.println();
		}
	}
	public static boolean condition1() {
		boolean cond1 = true;
		for (int i = 0; i < n-1 && cond1 == true; i++) {
			if (grid [i] [0] < grid [i+1] [0]) {
			}
			else {
				cond1 = false;
			}
		}
		return cond1;
	}
	public static boolean condition2() {
		boolean cond2 = true; 
		for (int i = 0; i < n && cond2 == true; i++) {
			for (int j = 0; j < n-1 && cond2 == true; j++) {
				if (grid [i] [j] > grid [i] [j+1]) {
					cond2 = false;
				}	
			}
		}
		return cond2;
	}
	public static void rotate90() {
		for (int i = 0; i < n/2; i++) {
			for (int j = i; j < n-i-1; j++) {
				int temp = grid [i] [j];
				grid [i] [j] = grid [j][n-1-i];
				grid [j][n-1-i] = grid [n-1-i] [n-1-j];
				grid [n-1-i] [n-1-j] = grid [n-1-j] [i];
				grid [n-1-j] [i] = temp;
			}
		}
	}

}
