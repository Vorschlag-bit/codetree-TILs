import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        int cnt = 0;
        int Max = 0;

        for(int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());

            arr[i] = a;
        }

        for(int i = 0; i < n; i++) {
            if(i == 0 || arr[i] == arr[i-1]) {
                cnt++;
                if(cnt > Max) Max = cnt;
            }
            else if(arr[i] != arr[i - 1]) {
                cnt = 1;
            }
        }
        System.out.print(Max);
    }
}