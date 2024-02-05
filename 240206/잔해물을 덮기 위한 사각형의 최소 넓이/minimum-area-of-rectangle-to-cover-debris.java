import java.util.*;
import java.io.*;
public class Main {
    static int Max = 2000;
    static int[][] area = new int[Max + 1][Max +1];
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int offset = 1000;
        int cnt = 0;

        for(int i = 1; i <= 2; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken()) + offset;
            int y1 = Integer.parseInt(st.nextToken()) + offset;
            int x2 = Integer.parseInt(st.nextToken()) + offset;
            int y2 = Integer.parseInt(st.nextToken()) + offset;

            for(int j = x1; j < x2; j++) {
                for(int k = y1; k < y2; k++) {
                    area[j][k] = i;
                }
            }
        }
        int minx = Max;
        int maxx = 0;
        int miny = Max;
        int maxy = 0;
        for(int i = 0; i < Max + 1; i++) {
            for(int j = 0; j < Max + 1; j++) {
                if(area[i][j] == 1) {
                    if(i < minx) minx = i;
                    if(i > maxx) maxx = i;
                    if(j < miny) miny = j;
                    if(j > maxy) maxy = j;
                }
            }
        }
        if(minx == Max) System.out.print(0);
        else
        System.out.print((maxx - minx +1)*(maxy - miny +1));
    }
}