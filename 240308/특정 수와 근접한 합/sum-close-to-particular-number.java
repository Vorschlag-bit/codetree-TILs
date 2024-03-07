import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int Min = 10000;

        for(int i = 0; i < n; i++) {
            //첫번째 숫자 고를 반복문.
            for(int j = i + 1; j < n; j++) {
                //두 번째 숫자 고를 반복문.
                int sum = 0;
                for(int k = 0; k < n; k++) {
                    sum += arr[k];
                }
                sum -= arr[i];
                sum -= arr[j];
                Min = Math.min(Min, Math.abs(sum - s));
            }
        }
        System.out.print(Min);
    }
}