import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        for(int i = 1; i <= 100; i++) {
            int currcnt = 0; // 내부 루프 밖으로 옮김
            for(int j = 0; j < n; j++) {
                for(int k = j + 1; k < n; k++) {
                    int diff1 = Math.abs(i - arr[j]);
                    int diff2 = Math.abs(arr[k] - i);

                    if(diff1 == diff2) currcnt++;
                }
            }
            cnt = Math.max(cnt, currcnt); // 외부 루프에서 최대값 갱신
        }
        System.out.print(cnt);
    }
}