import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n - 1];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n - 1; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 1; i <= n; i++) {
            //첫 번째 arr[0] = i라고 가정하기
            if(i > arr[0]) continue;

            int[] arr2 = new int[n];
            arr2[0] = i;

            for(int j = 1; j < n; j++) {
                arr2[j] = arr[j - 1] - arr2[j - 1];
            }

            boolean Check = true;
            boolean[] exist = new boolean[1001];
            for(int j = 0; j < n; j++) {
                if(arr2[j] <= 0 || arr2[j] > n)
                Check = false;

                else {
                    if(exist[arr2[j]])
                    Check = false;

                    exist[arr2[j]] = true;
                }
            }

            if(Check)
            for(int j = 0; j < n; j++)
            System.out.print(arr2[j] + " ");
        }
    }
}