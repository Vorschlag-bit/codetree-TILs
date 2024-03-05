import java.util.*;
import java.io.*;
public class Main {
    static final int INT_MIN = Integer.MIN_VALUE;
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int Max = INT_MIN;
        for(int i = 0; i < n; i++) {
            for(int j = i + 2; j < n; j++) {
                int sum = arr[i] + arr[j];
                Max = Math.max(sum, Max);
            }
        }
        System.out.print(Max);
    }
}