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

        int[] dx = new int[] {0, 1, 0, -1};
        int[] dy = new int[] {1, 0, -1, 0};

        char[][] arr = new char[n][m];
        int x = 0, y = 0, dir = 0;
        int cnt = 1; // 초기값 수정

        // 공백 문자로 배열 초기화
        for (int i = 0; i < n; i++) {
            Arrays.fill(arr[i], ' ');
        }

        // 초기값 설정
        arr[x][y] = 'A';

        for(int i = 2; i <= n * m; i++) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            // 문제 없는지 || 이미 채워져있는지 확인, 있다면 바꿔서 다시 nx, ny설정
            if(!inRange(nx, ny, n, m) || arr[nx][ny] != ' ') {
                dir = (dir + 1) % 4;
                nx = x + dx[dir];
                ny = y + dy[dir];
            }

            // 이상무
            x = nx;
            y = ny;
            arr[x][y] = (char)('A' + cnt);
            cnt++;
            if(cnt == 26)
                cnt = 0; // 26이 아니라 0으로 수정
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}