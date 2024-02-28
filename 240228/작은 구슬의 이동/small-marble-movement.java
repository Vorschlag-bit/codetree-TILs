import java.util.*;
import java.io.*;
public class Main {
    static int n;

    static boolean inRange(int x, int y) {
        return (x > 0 && x < n&&y > 0&&y < n);
    }

    static int Dir(char d) {
        if(d == 'R')
        return 0;
        else if(d == 'L')
        return 3;
        else if(d == 'U')
        return 1;
        else
        return 2;
    }
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        int[] dx = new int[] {0, 1, -1, 0};
        int[] dy = new int[] {1, 0, 0, -1};

        st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        char d = st.nextToken().charAt(0);
        int move = Dir(d);


        for(int i = 0; i < t; i++) {
            int nx = x + dx[move], ny = y + dy[move];

            if(!inRange(nx, ny)) {
                move = 3 - move;
                continue;
            }

            x += dx[move];
            y += dy[move];
        }
        System.out.println(x + " " + y);
    }
}