import java.util.*;
import java.io.*;
public class Main {
    public static int x, y;

    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] dx = new int[]{1, -1, 0 ,0};
        int[] dy = new int[]{0, 0, -1, 1};

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            char dir = st.nextToken().charAt(0);
            int dis = Integer.parseInt(st.nextToken());
            int distance;

            if(dir == 'E') {
                distance = 0;
            }
            else if(dir == 'W') {
                distance = 1;
            }
            else if(dir == 'N') {
                distance = 3;
            }
            else distance = 2;

            x += dx[distance] * dis;
            y += dy[distance] * dis;
        }

        System.out.print(x+" "+y);
    }
}