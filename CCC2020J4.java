
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static StringTokenizer st;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException{
		String fullStr = br.readLine();
		String cycleStr= br.readLine();
		for (int j = 0; j<cycleStr.length(); j++) {
			for (int i = 0; i < fullStr.length()-cycleStr.length()+1; i++) {
				if (fullStr.substring(i, i+cycleStr.length()).equals(cycleStr)) {
					System.out.println("yes");
					System.exit(0);
				}
			}
			cycleStr = cycleStr.substring(1) + cycleStr.substring(0,1);
		}
		System.out.print("no");
		
 	}
	

	static String next() throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine());
		return st.nextToken();
	}

	static int readInt() throws IOException {
		return Integer.parseInt(next());
	}

}