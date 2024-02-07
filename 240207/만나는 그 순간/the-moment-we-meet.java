import java.util.*;
import java.io.*;
public class Main {
    static int Max = 1000000;
    static int[] amove = new int[Max];
    static int[] bmove = new int[Max];
    static int asecond = 0;
    static int bsecond = 0;
    static int ans = 0;
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for(int i = 0; i < n; i++) {
           st = new StringTokenizer(br.readLine());
           int d = st.nextToken().equals("R") ? 1 : -1;
           int t = Integer.parseInt(st.nextToken());

           for(int j = 0; j < t; j++) {
            amove[asecond + 1] = amove[asecond] + 1 * d;
            asecond++;
        }
        }
        for(int i = 0; i < m; i++) {
           st = new StringTokenizer(br.readLine());
           int d = st.nextToken().equals("R") ? 1 : -1;
           int t = Integer.parseInt(st.nextToken());

           for(int j = 0; j < t; j++) {
            bmove[bsecond + 1] = bmove[bsecond] + 1 * d;
            bsecond++;
        }
        }

        for(int i = 1; i < asecond; i++) {
            if(amove[i] == bmove[i]){;
                ans = i;
                break;
            }
        }
        System.out.print(ans == 0 ? -1 : ans);
    }
}