import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n + 1];

        int tar = 0;
        for(int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            tar += arr[i];
        }
        //같아질 수 구하기
        tar /= n;
        int ans = 0;
        //목표보다 arr[n]이 작을 경우 모자란 만큼을 더하면 정답
        for(int i = 1; i <= n; i++) {
            if(arr[i] < tar) {
                ans += tar - arr[i];
            }
        }
        System.out.print(ans);
    }
}