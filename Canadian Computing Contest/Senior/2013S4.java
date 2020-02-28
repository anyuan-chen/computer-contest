import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class contests {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[] size;

    public static void main(String[] args) throws IOException {
        int numberStudents = readInt();
        int numberConnections = readInt();
        ArrayList<Integer>[] adj = new ArrayList[numberStudents];
        for (int i = 0; i < numberStudents; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int i = 0; i < numberConnections; i++) {
            int num1 = readInt() - 1;
            int num2 = readInt() - 1;
            adj[num1].add(num2);
        }
        int num1 = readInt() - 1;
        int num2 = readInt() - 1;
        ArrayList<Integer> q = new ArrayList<>();
        boolean[] visited = new boolean[adj.length];
        q.add(num1);
        visited [num1] = true;
        while (!q.isEmpty()) {
            int c = q.remove(0);
            visited [c] = true;
            for (int i = 0; i < adj[c].size(); i++) {
                if (!visited[adj[c].get(i)]) {
                    q.add(adj[c].get(i));
                    if (adj[c].get(i) == num2) {
                        System.out.println("yes");
                        System.exit(0);
                    }
                }
            }
        }
        visited = new boolean[adj.length];
        q = new ArrayList<>();
        q.add(num2);
        visited[num2] = true;
        while (!q.isEmpty()) {
            int c = q.remove(0);
            visited[c] = true;
            for (int i = 0; i < adj[c].size(); i++) {
                if (!visited[adj[c].get(i)]) {
                    q.add(adj[c].get(i));
                    if (adj[c].get(i) == num1) {
                        System.out.println("no");
                        System.exit(0);
                    }
                }
            }
        }
        System.out.println("unknown");
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    static int readInt() throws IOException {
        return Integer.parseInt(next());
    }

    static double readDouble() throws IOException {
        return Double.parseDouble(next());
    }

}
