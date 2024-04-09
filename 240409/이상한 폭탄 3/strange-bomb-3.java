import java.io.*;
import java.util.*;
public class Main {
    private static int MAX_NUM = 1000000;
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

        int ans = 0; int max = 0;
        for(int j = 0; j < n; j++) {
            int cnt = 0;
            for(int l = j + 1; l < n; l++) {
               if(arr[j] == arr[l] && j - l <= k)
                cnt++;
                }
                if(cnt > max) {
                    max = cnt;
                    ans = arr[j]; 
      }
    }
    System.out.print(ans);
    }
}