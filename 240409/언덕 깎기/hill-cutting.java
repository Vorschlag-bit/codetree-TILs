import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] hills = new int[n];

        for(int i = 0; i < n; i++)
        hills[i] = sc.nextInt();

        int ans = Integer.MAX_VALUE;

        for(int h = 1; h <= 100; h++) {
            int maxh = h + 17;
            int cost = 0;
            for(int i = 0; i < n; i++) {
                if(hills[i] < h)
                cost += (h - hills[i]) * (h - hills[i]);
                if(hills[i] > maxh)
                cost += (hills[i] - maxh) * (hills[i] - maxh);
            }
            ans = Math.min(cost, ans);
        }
        System.out.print(ans);
    }
}