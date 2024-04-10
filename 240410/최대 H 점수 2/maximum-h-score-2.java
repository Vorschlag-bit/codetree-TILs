import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++)
        arr[i] = Integer.parseInt(st.nextToken());

        int ans = 0;
        for(int h = 0; h <= 100; h++) {
            //h가 될 수 있는지 판별하는 함수
            boolean Check = true;
            int hcnt = 0;
            int lcnt = 0;
            for(int i = 0; i < n; i++) {

                if(arr[i] + 1 == h && lcnt < l) {
                    lcnt++;
                    hcnt++;
                }

                if(arr[i] >= h)
                hcnt++;
            }

            if(hcnt < h) Check = false;
            if(Check)
            ans = Math.max(ans, h);
        }
        System.out.print(ans);
    }
}