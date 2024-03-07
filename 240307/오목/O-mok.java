import java.io.*;
import java.util.*;
public class Main {
    private static final int W = 19;
    private static final int D = 4;
    //검사하는 좌표가 벗어나는지 확인.
    static boolean Inside(int x, int y) {
        return (0 <= x && x < W && 0 <= y && y < 19);
    }
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[19][19];
        int[] dx = new int[] {-1, 0, 1, -1};
        int[] dy = new int[] {0, 1, 1, 1};

        for(int i = 0; i < W; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < W; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
       for(int i = 0; i < W; i++) {
        for(int j = 0; j < W; j++) {
            int cx = i;
            int cy = j;
            int color = arr[i][j];
            if(color == 0) continue;

            for(int dir = 0; dir < D; dir ++) {
                boolean flag = true;
                for(int k = -2; k <= 2; k++) {
                    int x = cx + dx[dir] * k;
                    int y = cy + dy[dir] * k;
                    flag &= Inside(x, y) && (color == arr[x][y]);
                }
                if(flag) {
                    System.out.println(color);
                    System.out.printf("%d %d", (cx + 1), (cy + 1));
                    return;
                }
            }
        }
       }
       System.out.println(0);
    }
}