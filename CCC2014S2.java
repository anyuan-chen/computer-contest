package computerConest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC2014S2 {

	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String [] line1 = br.readLine().split(" ");
		String [] line2 = br.readLine().split(" ");
		for (int i = 0; i < line1.length; i++) {
			if (line1 [i].equals(line2 [i])) {
				System.out.print("bad");
				System.exit(0);
			}
			else {
				for (int j = 0; j < line1.length; j++) {
					if (line1 [i].equals(line2 [j])) {
						for (int a = 0; a < line1.length; a++) {
							if (line1 [a].equals(line2 [j])) {
								if (!line2 [a].equals(line1[i])){
									System.out.print("bad");
									System.exit(0);
								}
							}
						}
					}
					
				}
			}
		}
		System.out.print("good");
		
	
	}	
	

}
