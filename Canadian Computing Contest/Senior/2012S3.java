    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.lang.reflect.Array;
    import java.util.*;

    public class test {
        static StringTokenizer st;
        static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        public static void main(String[] args) throws IOException {
            List<Integer> occurences = new ArrayList<Integer>(1000);
            for (int i = 0; i < 1000; i++){
                occurences.add(0);
            }
            int numberReadings = readInt();
            for (int i = 0; i < numberReadings; i++){
                int spot = readInt()-1;
                occurences.set(spot, occurences.get(spot) + 1);
            }
            int highest = 0;
            int secondHighest = 0;
            List<Integer> high = new ArrayList<Integer>();
            List<Integer> secondHigh = new ArrayList<>();
            for (int i = 0; i < occurences.size(); i++){
                if (occurences.get(i) > highest){
                    highest = occurences.get(i);
                }
                else if (occurences.get(i) > secondHighest){
                    secondHighest = occurences.get(i);
                }
            }
            if (highest == secondHighest){
                for (int i = 0; i < occurences.size(); i++){
                    if (highest == occurences.get(i)){
                        high.add(i);
                    }
                }
                Collections.sort(high);
                System.out.println(high.get(high.size()-1) - high.get(0));
                System.exit(0);
            }
            else{
                for (int i = 0; i < occurences.size(); i++){
                    if (highest == occurences.get(i)){
                        high.add(i);
                    }
                    else if (secondHighest == occurences.get(i)){
                        secondHigh.add(i);
                    }
                }
                Collections.sort(high);
                Collections.sort(secondHigh, Collections.reverseOrder());
                if (high.get(0) - secondHigh.get(secondHigh.size()-1) > secondHigh.get(0) - high.get(high.size()-1)){
                    System.out.println(high.get(0) - secondHigh.get(secondHigh.size()-1));
                }
                else{
                    System.out.println(secondHigh.get(0) - high.get(high.size()-1));
                }
            }

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
