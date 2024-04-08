import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int ans = 0;
        for(int i = 0; i < n; i++) {
            int cnt = 1;
        for(int j = i + 1; j < n; j++) {
            if(arr[j] - arr[i] <= k) {
                cnt++;
            }
            else break;
        }
        ans = Math.max(cnt, ans);
    }
    System.out.print(ans);
    }
}