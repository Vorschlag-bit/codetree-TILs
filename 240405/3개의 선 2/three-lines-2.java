import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] x = new int[20];
        int[] y = new int[20];

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }
        int ans = 0;
        for(int i = 0; i <= 10; i++) {
            for(int j = 0; j <= 10; j++) {
                for(int k = 0; k <= 10; k++) {
                   boolean Check = true;
                   // x축 3개로 지나는 경우
                   for(int l = 0; l < n; l++) {
                    if(x[l] == i || x[l] == j || x[l] == k)
                    continue;

                    Check = false;
                   }
                   if(Check) ans = 1;

                   Check = true;
                   //x2 y1로 지나는 경우
                   for(int l = 0; l < n; l++) {
                    if(x[l] == i || x[l] == k || y[l] == j)
                    continue;

                    Check = false;
                   }
                   if(Check) ans = 1;

                   Check = true;
                   //x1 y2로 지나는 경우
                   for(int l = 0; l < n; l++) {
                    if(x[l] == i || y[l] == k || y[l] == j)
                    continue;

                    Check = false;
                   }
                   if(Check) ans = 1;

                   Check = true;
                   //y3로 지나는 경우
                   for(int l = 0; l < n; l++) {
                    if(y[l] == i || y[l] == k || y[l] == j)
                    continue;

                    Check = false;
                   }
                   if(Check) ans = 1;
                }
            }            
        }
        System.out.print(ans);
    }
}