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

        int ans = 0;
        for(int i = 0; i < n; i++) {
            int x1 = arr[i][0];
            int y1 = arr[i][1];
            int x2 = 0;
            int y2 = 0;
            for(int j = i + 1; j < n; j++) {
                if(arr[j][0] == x1)
                y2 = arr[j][1];
                if(arr[j][1] == y1)
                x2 = arr[j][0];

                int s = Math.abs(x2 - x1) * Math.abs(y2 - y1);
                ans = Math.max(ans, s);
            }
        }
        System.out.println(ans);
    }
}