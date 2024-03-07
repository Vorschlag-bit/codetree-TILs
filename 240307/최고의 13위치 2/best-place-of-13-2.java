import java.util.*;
import java.io.*;
public class Main {
    static final int INT_MIN = Integer.MIN_VALUE;
    static int n = 0;
    static boolean inRange(int x, int y) {
        return 0 <= x && x < n && 0 <= y && y < n;
    }
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
        int Max = INT_MIN;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - 2; j++)
            for(int k = 0; k < n; k++)
            for(int l = 0; l < n - 2; l++) {
                if(i == k && Math.abs(j - l) <= 2) continue;

                int cnt1 = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
                int cnt2 = arr[k][l] + arr[k][l + 1] + arr[k][l + 2];

                Max = Math.max(cnt1 + cnt2, Max);
            }
        }
        System.out.println(Max);
    }
}