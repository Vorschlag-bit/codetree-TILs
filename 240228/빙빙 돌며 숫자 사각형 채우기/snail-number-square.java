import java.util.*;
import java.io.*;
public class Main {
    static int n;
    static int m;
    static int[] dx = new int[] {0, 1, 0, -1};
    static int[] dy = new int[] {1, 0, -1, 0};

    static boolean inRange(int x, int y) {
        return (0 <= x && x < n && 0 <= y && y < m);
    }
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];
        int x = 0, y = 0, dirNum = 0;
        
        arr[x][y] = 1;

        for(int i = 2; i <= n * m; i++) {
            //현재 방향 dir을 기준으로 그 다음 위치값 계산.
            int nx = x + dx[dirNum];
            int ny = y + dy[dirNum];

            //더 이상 못 가면 90도 회전.
            if(!inRange(nx, ny) || arr[nx][ny] != 0)
            dirNum = (dirNum + 1) % 4;

            x += dx[dirNum]; y += dy[dirNum];
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