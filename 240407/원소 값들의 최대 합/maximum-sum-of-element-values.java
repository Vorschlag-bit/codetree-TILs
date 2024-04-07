import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n + 1];

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= n; i++)
        arr[i] = Integer.parseInt(st.nextToken());
        
        int ans = 0;
        for(int i = 1; i <= n; i++) {
            //첫번째 인덱스부터 위치값시작.
            int Max = 0;
            int curr = arr[i];
            Max += curr;
            for(int j = 1; j <= m - 1; j++) {
                curr = arr[curr];
                Max += curr;
            }
            ans = Math.max(Max, ans);
        }
        System.out.println(ans);
    }
}