import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        int cnt = 0;
        int ans = 0;
        int[] arr = new int[n];

         st = new StringTokenizer(br.readLine()); // 새로운 입력을 읽기 위해 StringTokenizer를 초기화
        boolean check = false;
        for(int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());
            arr[i] = a;

            if(a > t) check = true;

            if(check) {
                cnt++;
                ans = Math.max(ans, cnt);
            }
            else cnt = 0;
        }
        if(ans == 1) System.out.print(0);
        else System.out.print(ans);
    }
}