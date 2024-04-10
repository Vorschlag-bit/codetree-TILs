import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        boolean[] pn = new boolean[11];
        int[] pdir = new int[11];
        int[][] arr = new int[n][2];

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int num = Integer.parseInt(st.nextToken());
            int dir = Integer.parseInt(st.nextToken());
            arr[i][0] = num;
            arr[i][1] = dir;
        }
        int ans = 0;
        for(int i = 0; i < n; i++) {
            int p = arr[i][0];
            int dir = arr[i][1];
            //비둘기가 처음 기록된 거라면 그대로 입력;
            if(pn[p] == false) {
                pn[p] = true;
                pdir[p] = dir;
            }
            //두 번째로 기록된 비둘기고 건너갔다면 카운트.
            else if(pn[p] == true && pdir[p] != dir) {
                pdir[p] = dir;
                ans++;
            }
        }
        System.out.print(ans);
    }
}