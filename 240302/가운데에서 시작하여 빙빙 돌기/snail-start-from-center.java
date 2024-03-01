import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 배열 크기를 입력값에 따라 동적으로 할당
        int[][] arr = new int[n][n];
        int[] dx = new int[] {0, -1, 0, 1};
        int[] dy = new int[] {1, 0, -1, 0};

        int dir = 0;
        int x = n / 2;
        int y = n / 2;
        arr[x][y] = 1;

        int cnt = 1; //짝수 번만큼 입력해야하는 횟수
        int temp = 2; //채울 숫자
        int goal = n * n;

        while (temp <= goal) { // goal까지 채워야 하므로 조건을 수정합니다.
            int num = cnt;
            while (num-- > 0 && temp <= goal) { // 현재 방향으로 num만큼 채우되, goal을 넘어가면 종료합니다.
                x += dx[dir];
                y += dy[dir];
                arr[x][y] = temp;
                temp++;
            }
            dir = (dir + 1) % 4;
            if (dir % 2 == 0) // 짝수 번 방향으로 이동했을 때만 숫자 개수를 증가시킵니다.
                cnt++;
        }

        // 배열 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}