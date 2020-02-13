package computerConest;

	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	
	public class MockCCC2019C2J3 {
		public static void main(String [] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String [] thing = br.readLine().split(" ");
			long [] lng = new long [2];
			for (int i = 0; i < 2; i++) {
				lng [i] = Long.parseLong(thing [i]);
			}
			long free = lng [0] / lng[1];
			System.out.print(lng [0] - free);
		}
	}
