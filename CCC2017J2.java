package computerConest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class CCC2017J2{
	public static void main(String [] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long total = 0;
		String currentAdd = br.readLine();
		int amt = Integer.parseInt(br.readLine());
		for (int i = 0; i <= amt; i++) {
			total = total + Long.parseLong(currentAdd);
			currentAdd = currentAdd + "0";
		}
		System.out.println(total);
	}
}