import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        String str = br.readLine();

        for(int i = 0; i < n; i++)
        arr[i] = str.charAt(i) - '0';

        int ans = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] == 1) continue;
            for(int j = i + 1; j < n; j++) {
                if(arr[j] == 1) continue;

                arr[i] = 1; arr[j] = 1;

                ans = Math.max(ans, getDis(arr, n));

                arr[i] = 0; arr[j] = 0;
            }
        }
        System.out.print(ans);
    }
    private static int getDis(int[] arr, int n) {
        int minD = n;

        for(int i = 0; i < n; i++)
        for(int j = i + 1; j < n; j++) {
            if(arr[i] == 1 && arr[j] == 1)
            minD = Math.min(minD, j - i);
        }
        return minD;
    }
}