import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int Max = -1;

        for(int i = 0; i <= n - k; i++) {
            int Sum = 0;
            for(int j = i; j < i + k; j++) {
                Sum += arr[j];
            }
            Max = Math.max(Sum, Max);
        }
        System.out.println(Max);
    }
}