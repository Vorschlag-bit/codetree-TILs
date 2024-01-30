import java.util.*;
import java.io.*;
public class Main {
    static int Max = 100;
    static int[][] area = new int[Max * 2 + 1][Max *2 + 1];
    static int rectangle;

    public static void Cal(int x1, int y1, int x2, int y2) {
        for(int i = x1; i < x2; i++) {
            for(int j = y1; j < y2; j++) {
                area[i][j] = 1;
            }
        }
    }

    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken()) + Max;
            int y1 = Integer.parseInt(st.nextToken()) + Max;
            int x2 = Integer.parseInt(st.nextToken()) + Max;
            int y2 = Integer.parseInt(st.nextToken()) + Max;

            Cal(x1 , y1, x2, y2);
        }
        for(int i = 0; i < Max * 2 +  1; i++) {
            for(int j = 0; j < Max * 2 + 1; j++) {
                if(area[i][j] == 1) rectangle++;
            }
        }
        System.out.print(rectangle);
    }
}