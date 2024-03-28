import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int ans = -1;

        for(int i = 0; i < n; i++) {
            int boom = arr[i];
            for(int j = 0; j < n; j++) {
                if(i == j) continue;

                if(boom == arr[j] && Math.abs(i - j) <= k)
                ans = Math.max(ans, arr[i]);
            }
        }
        System.out.println(ans);
    }
}