import java.util.*;
import java.io.*;
public class Main {
    public static int n;
    public static boolean inRange(int x, int y) {
        return (0 <= x && x < n && 0 <= y && y < n);
    }

    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] dx = new int[] {0, 1, 0, -1};
        int[] dy = new int[] {1, 0, -1, 0};

        n = sc.nextInt();

        int[][] arr = new int[n][n];
        int ans = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int x = 0; x < n; x++) {
            for(int y = 0; y < n; y++) {
             int cnt = 0;
            for(int dirNum = 0; dirNum < 4; dirNum++) {
            int nx = x + dx[dirNum], ny = y + dy[dirNum];
            if(inRange(nx, ny)&&arr[nx][ny] == 1)
            cnt++;
        }
        if(cnt >= 3) ans++;
            }
        }
        System.out.println(ans);
    }
}