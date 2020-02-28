import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class contests {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[] pr = {1, -1, 0, 0};
    static int[] pc = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        int numberCases = readInt();
        for (int i = 0; i < numberCases; i++) {
            int row = readInt();
            int col = readInt();
            char[][] val = new char[row][col];
            for (int a = 0; a < row; a++) {
                String str = br.readLine();
                for (int b = 0; b < col; b++) {
                    val[a][b] = str.charAt(b);
                }
            }
            ArrayList<Integer> rq = new ArrayList<>();
            ArrayList<Integer> cq = new ArrayList<>();
            boolean[][] visited = new boolean[row][col];
            int[][] distance = new int[row][col];
            rq.add(0, 0);
            cq.add(0, 0);
            visited[0][0] = true;
            distance[0][0] = 1;
            boolean found = false;
            while (!rq.isEmpty()) {
                int cr = rq.remove(0);
                int cc = cq.remove(0);
                visited[cr][cc] = true;
                if (cr == row - 1 && cc == col - 1) {
                    found = true;
                    System.out.println(distance[cr][cc]);
                    break;
                }
                if (val[cr][cc] == '+') {
                    for (int c = 0; c < pr.length; c++) {
                        int tr = cr + pr[c];
                        int tc = cc + pc[c];
                        if (tr >= 0 && tr < row && tc >= 0 && tc < col && !visited[tr][tc] && val[tr][tc] != '*'){
                            rq.add(tr);
                            cq.add(tc);
                            distance[tr][tc] = distance[cr][cc] + 1;
                            visited[tr][tc] = true;
                        }
                    }
                } else if (val[cr][cc] == '-') {
                    for (int c = 0; c < pr.length; c++) {
                        int tc = cc + pc[c];
                        if (tc < 0 || tc >= col || val[cr][tc] == '*') {
                        } else if (!visited[cr][tc]) {
                            rq.add(cr);
                            cq.add(tc);
                            distance[cr][tc] = distance[cr][cc] + 1;
                        }
                    }
                } else if (val[cr][cc] == '|') {
                    for (int c = 0; c < pr.length; c++) {
                        int tr = cr + pr[c];
                        if (tr < 0 || tr >= row || val[tr][cc] == '*') {
                        } else if (!visited[tr][cc]) {
                            rq.add(tr);
                            cq.add(cc);
                            distance[tr][cc] = distance[cr][cc] + 1;
                        }
                    }
                }
            }
            if (!found) {
                System.out.println(-1);
            }
        }
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
