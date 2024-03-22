import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int ans = 10000;
        for(int i = 0; i < n; i++) {
            for(int j = i + t - 1; j < n; j++) {
                int cost = 0;
                for(int k = i; k <= j; k++) {
                    int a = arr[k];
                    if(a > h)
                    while(a > h) {
                        a--;
                        cost++;
                    }
                    else if (a < h)
                    while(a < h) {
                        a++;
                        cost++;
                    }
                }
                ans = Math.min(cost, ans);
            }
        }
        System.out.println(ans);
    }
}