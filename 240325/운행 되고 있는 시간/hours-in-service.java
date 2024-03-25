import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] A = new int[n];
        int[] B = new int[n];

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            A[i] = Integer.parseInt(st.nextToken());
            B[i] = Integer.parseInt(st.nextToken());
        }

        int ans = 0;
        for(int i = 0; i < n; i++) {
            int[] time = new int[1000 * n];
            for(int j = 0; j < n; j++) {
                if(i == j) continue;

                int x1 = A[j], x2 = B[j];
                for(int k = x1; k < x2; k++) {
                    time[k]++;
                }
            }
            int Maxcnt = 0;
            for(int k = 0; k < 1000 * n; k++) {
                if(time[k] != 0) Maxcnt++;
            }
            ans = Math.max(ans, Maxcnt);
        }
        System.out.println(ans);
    }
}