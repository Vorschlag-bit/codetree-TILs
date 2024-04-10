import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i <= 10000 - k; i++) {
            int min = i;
            int max = i + k;

            int cost = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] < min)
                    cost += Math.abs(min - arr[j]);
                else if (arr[j] > max)
                    cost += Math.abs(max - arr[j]);
            }
            ans = Math.min(cost, ans);
        }
        System.out.print(ans);
    }
}