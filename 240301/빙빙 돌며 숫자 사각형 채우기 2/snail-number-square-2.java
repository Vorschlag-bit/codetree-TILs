import java.util.*;
import java.io.*;

public class Main {
    static boolean inRange(int nx, int ny, int n, int m) {
        return 0 <= nx && nx < n && 0 <= ny && ny < m;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];
        int[] dx = new int[] {1, 0, -1, 0};
        int[] dy = new int[] {0, 1, 0, -1};
        int dir = 0;
        int x = 0;
        int y = 0;
        arr[x][y] = 1;

        for (int i = 2; i <= n * m; i++) {
            // 현재 방향을 기준으로 다음 위치값 계산.
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            // 그 다음 위치가 범위를 벗어났는지, 이미 채워져 있다면 반시계 회전.
            if (!inRange(nx, ny, n, m) || arr[nx][ny] != 0)
            dir = (dir + 1) % 4;
            //문제 없다면 dir방향으로 x, y 변경.
            x += dx[dir];
            y += dy[dir];

            arr[x][y] = i;
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}