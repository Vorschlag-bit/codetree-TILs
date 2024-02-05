import java.util.*;
import java.io.*;
public class Main {
    static int[][] area = new int[201][201];
    static void Cal(int x, int y) {
        for(int i = x; i < x + 8; i++) {
            for(int j = y; j < y + 8; j++) {
                area[i][j] = 1;
            }
        }
    }
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int offset = 100;
        int cnt = 0;

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken()) + offset;
            int y = Integer.parseInt(st.nextToken()) + offset;

            Cal(x, y);
        }

        for(int i = 0; i <= 200; i++) {
            for(int j = 0; j <= 200; j++) {
                if(area[i][j] == 1) cnt++;
            }
        }
        System.out.print(cnt);
    }
}