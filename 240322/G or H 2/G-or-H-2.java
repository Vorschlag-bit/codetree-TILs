import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        char[] arr = new char[101];

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int pos = Integer.parseInt(st.nextToken());
            char a = st.nextToken().charAt(0);

            if(a == 'G') arr[pos] = 1;
            else arr[pos] = 2;
        }

        int ans = 0;

        for(int i = 0; i <= 100; i++) {
            for(int j = i + 1; j <= 100; j++) {
                if(arr[i] == 0 || arr[j] == 0)
                 continue;

                int gcnt = 0, hcnt = 0;

                for(int k = i; k <= j; k++) {
                    if(arr[k] == 1) 
                    gcnt++;
                    if(arr[k] == 2) 
                    hcnt++;
                }

                if(gcnt == 0 || hcnt == 0 || hcnt == gcnt) {
                int size = j - i;
                ans = Math.max(ans, size);
                }
            }
        }


        if(n == 1)
        System.out.println(0);
        else System.out.println(ans);
    }
}