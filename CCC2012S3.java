package computerConest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CCC2012S3 {

	public static void main(String [] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		List<Integer> lst = new ArrayList <Integer> ();
		for (int i = 0; i < number; i++) {
			lst.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(lst);
		for (int i = 0; i < lst.size(); i++) {
			System.out.println(lst.get(i));
		}

	}

}
