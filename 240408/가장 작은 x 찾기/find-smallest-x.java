import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] a = new int[n];
        int[] b = new int[n];

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            a[i] = Integer.parseInt(st.nextToken());
            b[i] = Integer.parseInt(st.nextToken());
        }

        int ans = Integer.MAX_VALUE;
        for(int i = 1; i <= 10000; i++) {
            int x = i * 2;
            boolean Check = true;
            for(int j = 0; j < n; j++) {
            if(a[j] > x || b[j] < x) {
                Check = false;
                break;
            }

            x *= 2;
        }
        if(Check) ans = Math.min(ans, i);
        }
        System.out.print(ans);
    }
}