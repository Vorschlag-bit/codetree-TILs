import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[101];

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());

            for(int j = x1; j <= x2; j++) {
                arr[j]++;
            }
        }

        int max = 0;

        for(int i = 0; i < 101; i++) {
            if(arr[i] > max)
            max = arr[i];
        }
        System.out.print(max);
    }
}