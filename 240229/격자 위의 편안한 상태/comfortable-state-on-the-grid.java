import java.util.*;
import java.io.*;

public class Main {
    static int[] dx = new int[] {0, 1, 0, -1};
    static int[] dy = new int[] {1, 0, -1, 0};
    static int n;

    static boolean inRange(int x, int y) {
        return 0 <= x && x <= n && 0 <= y && y <= n;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n + 1][n + 1];

        while(m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            
            arr[r][c] = 1;
            int cnt = 0;
            
            for(int i = 0; i < 4; i++) {
            int nx = r + dx[i];
            int ny = c + dy[i];
            if(inRange(nx, ny) && arr[nx][ny] == 1){
                cnt++;
            }
            }
            if(cnt == 3) System.out.println(1);
            else System.out.println(0);
        }
    }
}