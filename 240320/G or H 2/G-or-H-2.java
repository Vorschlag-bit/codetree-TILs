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

            int pos = Integer.parseInt(st.nextToken());
            char a = st.nextToken().charAt(0);

            if(a == 'G') arr[pos] = 1;
            else arr[pos] = 2;
        }

        int ans = 0;

        for(int i = 0; i <= 100; i++) {
            int Hcnt = 0, Gcnt = 0;
            int size = 0;
            for(int j = i; j <= 100; j++) {
                if(arr[j] != 0) {
                    if(arr[j] == 1) Gcnt++;
                    else Hcnt++;

                    if((Hcnt != 0 && Gcnt == 0) || (Hcnt == 0 && Gcnt != 0)) {
                        size = Math.max(size, j - i);
                    }
                    else if(Hcnt == Gcnt) 
                    size = Math.max(size, j - i - 1);
                }
                else continue;
            }
            ans = Math.max(ans, size);
        }
        if(n == 1) System.out.println(0);
        else System.out.println(ans);
    }
}