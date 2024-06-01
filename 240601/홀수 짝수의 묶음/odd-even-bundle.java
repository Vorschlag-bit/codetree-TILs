import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        int odd = 0, even = 0;

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i] % 2 == 0) even++;
            else odd++;
        }

        int ans = 0;
        if(even > odd)
        ans = odd * 2 + 1;
        else if(even == 0) {
            if(odd % 3 == 0) ans = (odd / 3) * 2;

            else if(odd % 3 == 1 && odd == 7)
            ans = 3;
            else if(odd % 3 == 1 && odd > 7)
            ans = ((odd - 7) / 3) * 2 + 3;

        }
        else if(odd / 3 == 0) {
            ans = (odd / 3) * 2 + 1;
        }
        else if(odd % 3 == 2) {
            if(even % 2 == 0)
            ans = (odd / 3) * 2 + 2;
            else ans = (odd / 3) * 2 + 1;
        }
        else ans = (odd / 3) * 2 + 1;

        System.out.print(ans);
    }
}