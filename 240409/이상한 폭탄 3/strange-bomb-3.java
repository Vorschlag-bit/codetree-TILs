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

        int maxcnt = 0; int max = 0;
        for(int i = 0; i < n; i++) {
            int bomb = arr[i];
            int idx = i;
            int cnt = 0;
            for(int j = i + 1; j < n; j++) {
                if(arr[j] == bomb && j - idx <= k) {
                    idx = j;
                    cnt++;
                }
            }
            if(cnt != 0 && cnt >= maxcnt && bomb > max) {
                maxcnt = cnt;
                max = bomb;
            }
        }
        System.out.print(max);
    }
}