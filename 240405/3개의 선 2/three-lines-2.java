import java.io.*;
import java.util.*;
public class Main {
    //1 = x, 0 = y
    static String[] combination = {"xxx", "xxy", "xyy", "yyy", "yyx", "yxy", "xyx", "yxx"};
    static int n;
    static int[][] arr = new int[11][11];
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = 1;
        }
        int ans = 0;
        for(int i = 0; i <= 10; i++) {
            for(int j = 0; j <= 10; j++) {
                if(i == j) continue;
                for(int k = 0; k <= 10; k++) {
                    if(i == k || k == j) continue;
                    ans = drawThreeLines(i, j, k);

                    if(ans == 1) {
                        System.out.println(1);
                        return;
                    }
                }
            }            
        }
        System.out.print(0);
    }
    static int drawThreeLines(int line1, int line2, int line3) {
        for(int i = 0; i < 8; i++) {
            char dir1 = combination[i].charAt(0);
            char dir2 = combination[i].charAt(1);
            char dir3 = combination[i].charAt(2);

            int cnt = 0;
            cnt += drawLine(line1, dir1);
            cnt += drawLine(line2, dir2);
            cnt += drawLine(line3, dir3);

            if(cnt == n) return 1;
        }
        return 0;
    }

    static int drawLine(int line, char dir) {
        int cnt = 0;

        if(dir == 'x') {
            for(int i = 0; i <= 10; i++)
            if(arr[line][i] == 1) cnt++;
        }
        else {
            for(int i = 0; i <= 10; i++)
            if(arr[i][line] == 1) cnt++;
        }

        return cnt;
    }
}