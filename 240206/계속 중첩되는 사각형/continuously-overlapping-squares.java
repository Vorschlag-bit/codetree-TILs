import java.util.*;
import java.io.*;
public class Main {
    static int offset = 100;
    static int Max = 200;
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] area = new int[Max + 1][Max + 1];
        int cnt = 0;

        for(int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken()) + offset;
            int y1 = Integer.parseInt(st.nextToken()) + offset;
            int x2 = Integer.parseInt(st.nextToken()) + offset;
            int y2 = Integer.parseInt(st.nextToken()) + offset;

            for(int j = x1; j < x2; j++) {
                for(int k = y1; k < y2; k++) {
                    if(i%2==1) area[j][k] = 1;
                    else area[j][k] = 2;
                }
            }
        }
        for(int i = 0; i < Max + 1; i++) {
            for(int j = 0; j < Max + 1; j++) {
                if(area[i][j] == 2) cnt++;
            }
        }
        System.out.print(cnt);
    }
}