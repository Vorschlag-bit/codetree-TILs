import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a1 = Integer.parseInt(st.nextToken());
        int b1 = Integer.parseInt(st.nextToken());
        int c1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int a2 = Integer.parseInt(st.nextToken());
        int b2 = Integer.parseInt(st.nextToken());
        int c2 = Integer.parseInt(st.nextToken());
        
        int cnt = 0;
        for(int i = 1; i <= n; i++)
        for(int j = 1; j <= n; j++)
        for(int l = 1; l <= n; l++) {
            int diff1 = Math.min((n - Math.abs(a1 - i)), Math.abs(a1 - i));
            int diff2 = Math.min((n - Math.abs(b1 - j)), Math.abs(b1 - j));
            int diff3 = Math.min((n - Math.abs(c1 - l)), Math.abs(c1 - l));

            int diff4 = Math.min((n - Math.abs(a2 - i)), Math.abs(a2 - i));
            int diff5 = Math.min((n - Math.abs(b2 - j)), Math.abs(b2 - j));
            int diff6 = Math.min((n - Math.abs(c2 - l)), Math.abs(c2 - l));

            if(diff1 <= 2 && diff2 <= 2 && diff3 <= 2)
            cnt++;
            else if(diff4 <= 2 && diff5 <= 2 && diff6 <= 2)
            cnt++;
        }
        System.out.println(cnt);
    }
}