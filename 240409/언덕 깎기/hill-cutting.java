import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
        arr[i] = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        int ans = Integer.MAX_VALUE;
        for(int i = 1; i < 10; i++)
        for(int j = 1; j < 10; j++) {
            int low = arr[0] + i;
            int high = arr[n - 1] - j;
            int cost = 0;
            cost += i * i + j * j;
            if(high - low <= 17)
            ans = Math.min(ans, cost);
        }
        System.out.print(ans);
    }
}