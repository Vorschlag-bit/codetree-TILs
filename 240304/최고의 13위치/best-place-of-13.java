import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][n];

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int maxCnt = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - 2; j++) {
                maxCnt = Math.max(maxCnt, arr[i][j] + arr[i][j + 1] + arr[i][j + 2]);
            }
        }
        System.out.print(maxCnt);
    }
}