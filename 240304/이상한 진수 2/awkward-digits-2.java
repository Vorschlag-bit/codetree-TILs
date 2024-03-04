import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int n = str.length();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            int num = (str.charAt(i) - '0');
            arr[i] = num;
        }

        for(int i = 1; i < n; i++) {
            if(arr[i] == 0) {
                arr[i] = 1;
                break;
            }
        }
        int ans = 0;

        for(int i = 0; i < n; i++) {
            ans = ans * 2 + arr[i];
        }
        System.out.print(ans);
    }
}