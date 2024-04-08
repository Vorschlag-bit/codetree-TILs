import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] a = new int[m];
        int[] b = new int[m];

        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            a[i] = Integer.parseInt(st.nextToken());
            b[i] = Integer.parseInt(st.nextToken());
        }

        int ans = 0;
        for(int i = 1; i <= n; i++) {
            for(int j = i + 1; j <= n; j++) {
                int cnt = 0;
                for(int k = 0; k < m; k++) {
                    if(a[k] == i && b[k] == j || a[k] == j && b[k] == i) 
                    cnt++;
                }
                ans = Math.max(cnt, ans);
            }
        }
        System.out.println(ans);
    }
}