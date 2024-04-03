import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int ans = 0;
        for(int i = 1; i <= 1000; i++) {
            //빙산 높이 완전탐색.
            int cnt = 0;
            boolean Check = true;
            for(int j = 0; j < n; j++) {
                if(j == n - 1 && arr[j] > 0) {
                    cnt++;
                    break;
                }
                int h = arr[j] - i;
                int h2 = arr[j + 1] - i;

                if(h > 0 && h2 <= 0) cnt++;
                
            }
            ans = Math.max(ans, cnt);
        }
        System.out.println(ans);
    }
}