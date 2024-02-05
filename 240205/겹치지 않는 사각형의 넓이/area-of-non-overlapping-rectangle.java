import java.util.*;
import java.io.*;
public class Main {
    static int[][] AB = new int[2000][2000];
    public static void Cal(int x1, int y1, int x2, int y2) {
        for(int i = x1; i < x2; i++) {
            for(int j = y1; j < y2; j++) {
                AB[i][j] = 1;
            }
        }
    }
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int offset = 1000;
        int cnt = 0;

        for(int i = 0; i < 2; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken()) + offset;
            int y1 = Integer.parseInt(st.nextToken()) + offset;
            int x2 = Integer.parseInt(st.nextToken()) + offset;
            int y2 = Integer.parseInt(st.nextToken()) + offset;

            Cal(x1, y1, x2, y2);
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int x1 = Integer.parseInt(st.nextToken()) + offset;
        int y1 = Integer.parseInt(st.nextToken()) + offset;
        int x2 = Integer.parseInt(st.nextToken()) + offset;
        int y2 = Integer.parseInt(st.nextToken()) + offset;

        for(int i = x1; i < x2; i++) {
            for(int j = y1; j < y2; j++) {
                AB[i][j] = 2;
            }
        }

        for(int i = 0; i < 2000; i++) {
            for(int j = 0; j < 2000; j++) {
                if(AB[i][j] == 1) cnt++;
            }
        }
        System.out.println(cnt);
    }
}