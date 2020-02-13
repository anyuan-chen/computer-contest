package computerConest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CCC2014S3 {

	public static void main(String [] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList <Integer> mountain = new ArrayList <Integer>();
		ArrayList <Integer> branch = new ArrayList <Integer>();
		ArrayList <Integer> lake = new ArrayList <Integer>();
		
		
		int amtTests = Integer.parseInt(br.readLine());
		while (amtTests > 0) {
			lake.add(0);
			int amtStuff = Integer.parseInt(br.readLine());
			for (int i = 0; i < amtStuff; i ++) {
				mountain.add(Integer.parseInt(br.readLine()));
			}
			while (mountain.size() != 0) {
				if (mountain.get(0) == lake.get(lake.size()-1) + 1) {
					lake.add(mountain.get(0));
					mountain.remove(0);
				}
				else if (lake.get(lake.size()-1) + 1 == branch.get(0)) {
					lake.add(branch.get(0));
					branch.remove(0);
				}
				else {
					mountain.clear();
					lake.clear();
					branch.clear();
				}
			}
			amtTests--;
		}
	}

}
