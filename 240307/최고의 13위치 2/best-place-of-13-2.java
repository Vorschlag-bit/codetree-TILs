import java.util.*;
import java.io.*;

public class Main {
    static final int INT_MIN = Integer.MIN_VALUE;
    static int n = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int Max = INT_MIN;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j + 2 < n) { // 수평 방향으로 3칸을 이동할 수 있는 경우에만 진행
                    int cnt = 0;
                    // 첫 번째 격자
                    for (int k = j; k <= j + 2; k++) {
                        if (arr[i][k] == 1) cnt++;
                    }
                    // 두 번째 격자
                    for (int k = j; k <= j + 2; k++) {
                        if (i + 1 < n && arr[i + 1][k] == 1) cnt++;
                    }
                    Max = Math.max(Max, cnt);
                }
            }
        }

        System.out.println(Max);
    }
}