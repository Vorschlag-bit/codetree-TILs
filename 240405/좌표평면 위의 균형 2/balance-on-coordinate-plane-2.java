import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[101][101];

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[x][y] = 1;
        }

        int ans = Integer.MAX_VALUE;

        for(int i = 2; i <= 100; i += 2) {
            for(int j = 2; j <= 100; j += 2) {
                //x와 y로 줄을 긋고 총 4개 분면으로 나눈 후
                //각 분면의 최댓값을 구하고 그 최댓값의 최솟값 구하기.

                int Max = 0;
                int Cnt = 0;
                //1사분면부터
                for(int a = 0; a <= i; a++)
                for(int b = 0; b <= j; b++) {
                    if(arr[a][b] == 1) Cnt++;
                }
                Max = Math.max(Cnt, Max);

                Cnt = 0;
                //2사분면
                for(int a = i; a <= 100; a++)
                for(int b = 0; b <= j; b++) {
                    if(arr[a][b] == 1) Cnt++;
                }
                Max = Math.max(Cnt, Max);

                Cnt = 0;
                //3사분면
                for(int a = 0; a <= i; a++)
                for(int b = j; b <= 100; b++) {
                    if(arr[a][b] == 1) Cnt++;
                }
                Max = Math.max(Cnt, Max);

                Cnt = 0;
                //4사분면
                for(int a = i; a <= 100; a++)
                for(int b = j; b <= 100; b++) {
                    if(arr[a][b] == 1) Cnt++;
                }
                Max = Math.max(Cnt, Max);

                ans = Math.min(Max, ans);
            }
        }
        System.out.println(ans);
    }
}