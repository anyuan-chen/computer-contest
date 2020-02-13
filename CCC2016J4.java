package computerConest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CCC2016J4 {

	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int hr = Integer.parseInt(st.nextToken(":"));
		int min = Integer.parseInt(st.nextToken());
		int rushHourMinutes = 0;
		int rushHourHours = 0;
		
		if (hr > 6 && hr < 10 || hr > 14 && hr <19) {
			if (min == 20) {
				rushHourMinutes += 40;
			}
			else if (min == 40) {
				rushHourMinutes += 20;
			}
			
		}
		
	}
}
