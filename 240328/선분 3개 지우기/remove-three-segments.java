import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][2];

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        //서로 다른 선분 3개를 완전탐색으로 뽑고, 겹치는지 확인.
        int ans = 0;
        for(int i = 0; i < n; i++)
        for(int j = i +1; j < n; j++) {
            for(int k = j + 1; k < n; k++) {
                int[] coordinate = new int[101];
                for(int l = 0; l < n; l++) {
                    if(l == i || l == j || l == k) continue;
                    int x1 = arr[l][0], x2 = arr[l][1];
                    for(int a = x1; a <= x2; a++)
                    coordinate[a]++;
                }
                boolean Check = true;
                for(int a = 0; a <= 100; a++) {
                    if(coordinate[a] > 1) {
                        Check = false;
                        break;
                    }
                }
                if(Check) ans++;
            }
        }
        System.out.print(ans);
    }
}