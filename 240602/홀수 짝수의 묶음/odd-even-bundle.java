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
        while(true) {
            if(ans % 2 == 0) {
                if(even > 0) {
                    even--;
                    ans++;
                }
                else if(odd >= 2) {
                    odd -= 2;
                    ans++;
                }
                else {
                    if(odd == 1)
                    ans--;

                    break;
                }
            }

            else {
                if(odd > 0) {
                    odd--;
                    ans++;
                }
                else {
                    break;
                }
            }
        }
        System.out.print(ans);
    }
}