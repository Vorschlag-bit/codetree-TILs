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
            int x3 = 0;
            int y3 = 0;
            //x축 일치하는 좌표 찾는 반복문
            for(int j = 0; j < n; j++) {
                if(i == j || arr[i][0] != arr[j][0])
                continue;

                x2 = arr[j][0];
                y2 = arr[j][1];
                //y축 일치하는 좌표 찾는 반복문
                for(int k = 0; k < n; k++) {
                    if(k == i || k == j || arr[i][1] != arr[k][1])
                    continue;

                    x3 = arr[k][0];
                    y3 = arr[k][1];

                    int s = (int)Math.abs((x1 * y2 + x2 * y3 + x3 * y1) - (x2 * y1 + x3 * y2 + x1 * y3));
                    ans = Math.max(s, ans);
                }
            }
        }
        System.out.println(ans);
    }
}