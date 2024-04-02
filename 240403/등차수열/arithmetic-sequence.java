import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        for(int i = 1; i <= 100; i++) {
            for(int j = 0; j < n; j++) {
                for(int k = j + 1; k < n; k++) {
                    if(i == j) continue;

                    int diff1 = i - arr[j];

                    int diff2 = arr[k] - i;

                    if(diff1 == diff2) cnt++;
                }
            }
        }
        System.out.print(cnt);
    }
}