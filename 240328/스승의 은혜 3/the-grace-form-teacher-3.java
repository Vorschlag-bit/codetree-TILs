import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[] Price = new int[n];
        int[] Cost = new int[n];

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            Price[i] = Integer.parseInt(st.nextToken());
            Cost[i] = Integer.parseInt(st.nextToken());
        }

        int ans = 0;
        //i번째 상품을 반값한다고 가정, 최대 명수 구하기.
        for(int i = 0; i < n; i++) {
            int cost = Price[i]/2;
            int budget = b - (cost + Cost[i]);
            int cnt = 1;
            for(int j = 0; j < n; j++) {
                if(i == j) continue;

                if(budget - (Price[j] + Cost[j]) < 0)
                continue;

                budget -= (Price[j] + Cost[j]);
                cnt++;
            }
            ans = Math.max(ans, cnt);
        }
        System.out.println(ans);
    }
}