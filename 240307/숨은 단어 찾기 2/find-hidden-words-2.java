import java.util.*;
import java.io.*;

public class Main {
    static int n = 0;
    static int m = 0;
    static int nx = 0;
    static int ny = 0;

    static boolean inRange(int x, int y) {
        return (0 <= x && x < n && 0 <= y && y < m);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        n = Integer.parseInt(input[0]);
        m = Integer.parseInt(input[1]);

        char[][] arr = new char[n][m];
        //탐색 방향에 맞춘 dx, dy설정
        int[] dx = new int[] {0, 1, 1, 1, 0, -1, -1, -1};
        int[] dy = new int[] {1, 1, 0, -1, -1, -1, 0, 1};

        for(int i = 0; i < n; i++) {
            String line = br.readLine();
            for(int j = 0; j < m; j++) {
                arr[i][j] = line.charAt(j);
            }
        }
        int cnt = 0;
        //완전탐색 시작
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(arr[i][j] == 'L') {
                    nx = i; // 전역 변수로 갱신
                    ny = j; // 전역 변수로 갱신
                    for(int dir = 0; dir < 8; dir++) {
                        boolean Check = true;
                        for(int k = 1; k <= 2; k++) {
                            int x = nx + dx[dir] * k;
                            int y = ny + dy[dir] * k;
                            Check &= (inRange(x, y) && arr[x][y] == 'E');
                        }
                        if(Check) {
                            cnt++;
                        }
                    }
                }
            }
        }
        System.out.print(cnt);
    }
}