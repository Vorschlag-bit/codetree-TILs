import java.util.*;
import java.io.*;
public class Main {
    static boolean inRange(int nx, int ny, int n) {
        return (0 <= nx && nx < n && 0 <= ny && ny < n);
    }
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][n];
        int x = n/2, y = n/2, dir = 3;

        int[] dx = new int[] {0, 1, 0, -1};
        int[] dy = new int[] {1, 0, -1, 0};

        st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        int length = str.length();

        //격자에 들어갈 숫자 기록할 반복문
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                int num = Integer.parseInt(st.nextToken());
                arr[i][j] = num;
            }
        }
        //정답 변수
        int ans = arr[x][y];

        for(int i = 0; i < length; i++) {
            char s = str.charAt(i);

            if(s == 'L')
            dir = (dir -1 + 4) % 4;
            else if(s == 'R')
            dir = (dir + 1) % 4;
            else {
                int nx = x + dx[dir];
                int ny = y + dy[dir];
                //격자 범위를 벗어나는지 확인
                if(!inRange(nx, ny, n))
                continue; //벗어나면 무시
                else {
                    x += dx[dir];
                    y += dy[dir];
                    ans += arr[x][y];
                }
            }
        }
        System.out.print(ans);
    }
}