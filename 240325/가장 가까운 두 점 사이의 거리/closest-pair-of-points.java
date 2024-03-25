import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][2];

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
            int x1 = arr[i][0];
            int x2 = arr[j][0];
            int y1 = arr[i][1];
            int y2 = arr[j][1];

            int dis = Math.abs(x1 - x2) * Math.abs(x1 - x2) + Math.abs(y1 - y2) * Math.abs(y1 - y2);
            ans = Math.min(dis, ans);
        }
        }
        System.out.println(ans);
    }
}