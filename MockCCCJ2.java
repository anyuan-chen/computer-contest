package computerConest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MockCCCJ2 {

	public static void main(String [] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int type1 = Integer.parseInt(br.readLine());
		int type2 = Integer.parseInt(br.readLine());
		if (type1 > type2) {
			System.out.println(type1 * Integer.parseInt(br.readLine()));
		}
		else {
			System.out.println(type2 * Integer.parseInt(br.readLine()));
		}
	}

}
