import java.util.*;
import java.io.*;
public class Main {
    static int[] dx = new int[] {1, 0, -1, 0};
    static int[] dy = new int[] {0, -1, 0, 1};

    static int Move(char dir) {
        if(dir == 'E')
        return 0;
        else if(dir == 'S')
        return 1;
        else if(dir == 'W')
        return 2;
        else return 3;
    }
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int x = 0, y = 0;
        int time = 0;

        boolean check = false;

        while(n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            char dir = st.nextToken().charAt(0);
            int dis = Integer.parseInt(st.nextToken());
            int distance = Move(dir);

            for(int i = 0; i < dis; i++) {
            x += dx[distance];
            y += dy[distance];
            time++;

            if(x == 0 && y == 0) {
                check = true;
                break;
            }
          }
          if(x == 0 && y == 0) break;
        }
        if(check) System.out.println(time);
        else System.out.println(-1);
    }
}