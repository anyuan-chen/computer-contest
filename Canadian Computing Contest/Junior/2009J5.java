import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class GenevaConfection {
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Integer>[] adj = new ArrayList[50];

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < adj.length; i++) {
            adj[i] = new ArrayList<>();
        }
        adj[1].add(6);
        adj[2].add(6);
        adj[3].add(4);
        adj[3].add(5);
        adj[3].add(6);
        adj[3].add(15);
        adj[4].add(3);
        adj[4].add(5);
        adj[4].add(6);
        adj[5].add(3);
        adj[5].add(3);
        adj[5].add(4);
        adj[5].add(6);
        adj[6].add(1);
        adj[6].add(2);
        adj[6].add(3);
        adj[6].add(4);
        adj[6].add(5);
        adj[6].add(7);
        adj[7].add(6);
        adj[7].add(8);
        adj[8].add(7);
        adj[8].add(9);
        adj[9].add(8);
        adj[9].add(10);
        adj[9].add(12);
        adj[10].add(9);
        adj[10].add(11);
        adj[11].add(10);
        adj[11].add(12);
        adj[12].add(9);
        adj[12].add(11);
        adj[12].add(13);
        adj[13].add(12);
        adj[13].add(14);
        adj[13].add(15);
        adj[14].add(13);
        adj[15].add(3);
        adj[15].add(13);
        adj[16].add(17);
        adj[16].add(18);
        adj[17].add(16);
        adj[17].add(18);
        adj[18].add(16);
        adj[18].add(17);

        while (true) {
            String input = br.readLine();
            if (input.equals("i")) {
                int personx = Integer.parseInt(br.readLine());
                int persony = Integer.parseInt(br.readLine());
                addFriend(personx, persony);
            } else if (input.equals("d")) {
                int personx = Integer.parseInt(br.readLine());
                int persony = Integer.parseInt(br.readLine());
                deleteFriend(personx, persony);
            } else if (input.equals("n")) {
                int personx = Integer.parseInt(br.readLine());
                numberFriend(personx);
            } else if (input.equals("f")) {
                int personx = Integer.parseInt(br.readLine());
                numberExtendedFriend(personx);
            } else if (input.equals(("s"))) {
                int personx = Integer.parseInt(br.readLine());
                int persony = Integer.parseInt(br.readLine());
                degreeSeperation(personx, persony);
            } else {
                System.out.println();
                System.exit(0);
            }
        }

    }

    private static void degreeSeperation(int personx, int persony) {
        ArrayList<Integer> q = new ArrayList<>();
        boolean visited[] = new boolean[adj.length];
        q.add(personx);
        int distance[] = new int[adj.length];
        while (!q.isEmpty()) {
            int num = q.remove(0);
            if (num == persony) {
                System.out.println(distance[num]);
                return;
            }
            for (int i = 0; i < adj[num].size(); i++) {
                if (visited[adj[num].get(i)] == false) {
                    visited[adj[num].get(i)] = true;
                    q.add(adj[num].get(i));
                    distance[adj[num].get(i)] = distance[num] + 1;
                }
            }
        }
        System.out.println("Not connected");
    }

    private static void numberExtendedFriend(int personx) {
        int sum = 0;
        ArrayList<Integer> visited = new ArrayList<>();
        for (int i = 0; i < adj[personx].size(); i++) {
            int person = adj[personx].get(i);
            for (int j = 0; j < adj[person].size(); j++){
                if (!visited.contains(adj[person].get(j))){
                    visited.add(adj[person].get(j));
                }
            }
        }
        if (visited.contains(personx)){
            visited.remove(Integer.valueOf(personx));
        }
        for (int i = 0; i < adj[personx].size(); i++){
            if (visited.contains(adj[personx].get(i))){
                visited.remove(Integer.valueOf(adj[personx].get(i)));
            }
        }
        System.out.println(visited.size());
    }

    private static void numberFriend(int personx) {
        System.out.println(adj[personx].size());
    }

    private static void deleteFriend(int personx, int persony) {
        for (int i = 0; i < adj[personx].size(); i++) {
            if (adj[personx].get(i) == persony) {
                adj[personx].remove(i);
            }
        }
        for (int j = 0; j < adj[persony].size(); j++) {
            if (adj[persony].get(j) == personx) {
                adj[persony].remove(j);
            }
        }
    }

    private static void addFriend(int personx, int persony) {
        adj[personx].add(persony);
        adj[persony].add(personx);
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
