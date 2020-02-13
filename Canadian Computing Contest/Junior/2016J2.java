package computerConest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CCC2016J2 {
	static int [] [] square;
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		square = new int [4] [4];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				square [i] [j] = sc.nextInt();
			}
		}
		int rowSum = rowSum(0);
		int columnSum = columnSum(0);
		boolean isMagic = true;
		for (int i = 1; i < 4; i++) {
			if (rowSum != rowSum(i)) {
				isMagic = false;
			}
			if (columnSum != columnSum(i)) {
				isMagic = false;
			}
		}
		
		if (isMagic) {
			System.out.println("magic");
		}
		else {
			System.out.println("not magic");
		}
		
		

	}
	public static int rowSum(int i) {
		int rowSum = square [0] [i] + square [1] [i] + square [2] [i] + square [3] [i];
		return rowSum;
	}
	
	public static int columnSum(int j) {
		int columnSum = square [j] [0] + square [j] [1] + square [j] [2] + square [j] [3];
		return columnSum;
	}
}