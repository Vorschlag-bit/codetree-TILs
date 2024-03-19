import java.io.*;
import java.util.*;
public class Main {
    static final int R = 400;
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[R + 1];

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int candy = Integer.parseInt(st.nextToken());
            int pos = Integer.parseInt(st.nextToken());

            arr[pos] += candy;
        }
        int Max = 0;
        for(int i = k; i < R + 1; i++) {//중심점 찾는 반복문.
            int sum = 0;
            for(int j = i - k; j <= i + k; j++) {
                if(j > R) break;
                sum += arr[j];
            }
            Max = Math.max(sum, Max);
        }
        System.out.println(Max);
    }
}