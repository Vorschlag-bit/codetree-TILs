import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][n];

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            int Minx = 40000, Miny = 40000;
            int Maxx = 0, Maxy = 0;
            for(int j = 0; j < n; j++) {
                if(i == j) continue;

                Minx = Math.min(Minx, arr[j][0]);
                Miny = Math.min(Miny, arr[j][1]);
                Maxx = Math.max(Maxx, arr[j][0]);
                Maxy = Math.max(Maxy, arr[j][1]);
            }
            int xdis = Maxx - Minx;
            int ydis = Maxy - Miny;

            int s = xdis * ydis;
            ans = Math.min(s, ans);
        }
        System.out.println(ans);
    }
}