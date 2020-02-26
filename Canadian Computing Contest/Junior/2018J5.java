import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class GenevaConfection {
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String [] args) throws IOException {
        int numberPages = readInt();
        boolean [] visited = new boolean[numberPages];
        ArrayList <Integer> [] arr = new ArrayList[numberPages];
        for (int i = 0; i < numberPages; i++){
            arr [i] = new ArrayList<>();
            int numberConnections = readInt();
            for (int j = 0; j < numberConnections; j++){
                arr[i].add(readInt()-1);
            }
        }
        int startNode = 0;
        ArrayList<Integer> q = new ArrayList<>();
        q.add(startNode);
        int stepCount = 0;
        int shortestStepCount = 0;
        int currentNode = 1;
        int nextNode = 0;
        boolean shortestFound = false;
        while (!q.isEmpty()){
            int current = q.remove(0);
            visited [current] = true;
            for (int i = 0; i < arr[current].size(); i++){
                if (!visited [arr[current].get(i)]){
                    q.add(arr[current].get(i));
                    nextNode++;
                }
            }
            if (arr[current].size() == 0 && !shortestFound){
                shortestStepCount = stepCount;
                shortestFound = true;
            }
            currentNode--;
            if (currentNode == 0){
                currentNode = nextNode;
                nextNode = 0;
                stepCount++;
            }
        }
        for (int i = 0; i < visited.length; i++){
            if (!visited [i]){
                System.out.println("N");
                System.out.println(shortestStepCount+1);
                System.exit(0);
            }
        }
        System.out.println("Y");
        System.out.println(shortestStepCount+1);
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
