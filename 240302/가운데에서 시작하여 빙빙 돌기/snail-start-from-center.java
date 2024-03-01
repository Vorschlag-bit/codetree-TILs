import java.util.*;
import java.io.*;
public class Main {
    static boolean inRange(int nx, int ny, int n) {
        return 0 <= nx && nx < n && 0 <= ny && ny < n;
    }
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n + 1][n + 1];

        int[] dx = new int[] {0, -1, 0, 1};
        int[] dy = new int[] {1, 0, -1, 0};
        //배열 시작점설정
        int dir = 0;
        int x = n/2;
        int y = n/2;
        arr[x][y] = 1;
        //2번마다 채워야할 숫자.
        int cnt = 1;
        int temp = 2;
        int goal = n * n;

        while(temp <= goal) {
            //방향전환 횟수 카운팅 변수.
            int dirC = 0;
            while(dirC < 2) {
            int num = cnt;
            //num만큼 1씩 증가하는 숫자 채우기 위한 while문
            while(num-- > 0 && temp <= goal) {
            //범위 확인 후 숫자 채우기
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            if(inRange(nx, ny, n)) {
                x += dx[dir];
                y += dy[dir];
                arr[x][y] = temp;
                temp++;
            }
            }
            //채웠으면 회전
            dir = (dir + 1) % 4;
            dirC++;
            }
            cnt++;
        }
        //정답
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}