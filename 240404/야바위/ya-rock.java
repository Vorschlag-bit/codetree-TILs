import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            a[i] = Integer.parseInt(st.nextToken());
            b[i] = Integer.parseInt(st.nextToken());
            c[i] = Integer.parseInt(st.nextToken());
        }
        int[] arr = new int[4];

        int ans = 0;
        for(int i = 1; i <= 3; i++) {
            int cnt = 0;
            Arrays.fill(arr, 0);
            arr[i] = 1;
            for(int j = 0; j < n; j++) {
                int temp = arr[a[j]];
                arr[a[j]] = arr[b[j]];
                arr[b[j]] = temp;

                if(arr[c[j]] == 1) cnt++;
            }
            ans = Math.max(cnt, ans);
        }
        System.out.println(ans);
    }
}