import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] x1 = new int[n];
        int[] x2 = new int[n];

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x1[i] = Integer.parseInt(st.nextToken());
            x2[i] = Integer.parseInt(st.nextToken());
        }
        String ans = "No";
        for(int i = 0; i < n; i++) {
            int curx1 = x1[i];
            int curx2 = x2[i];
            boolean Check = true;
            for(int j = 0; j < n; j++) {
                if(curx2 < x1[i] || curx1 > x2[i]) {
                    Check = false;
                    break;
                }
            }
            if(Check) ans = "Yes";
        }
        System.out.print(ans);
    }
}