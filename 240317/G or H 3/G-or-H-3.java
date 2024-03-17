import java.util.*;
import java.io.*;
public class Main {
    static final int R = 10000;
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int k = Integer.parseInt(st.nextToken());

        int[] Leute = new int[R + 1];

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int pos = Integer.parseInt(st.nextToken());
            char a = st.nextToken().charAt(0);

            if(a == 'G')
            Leute[pos] = 1;
            else if(a == 'H')
            Leute[pos] = 2;
        }

        int ans = 0;

        for(int i = 1; i <= R - k - 1; i++) {
            int Maxpoint = 0;
            for(int j = i; j <= i + k; j++)
            Maxpoint += Leute[j];

            ans = Math.max(ans, Maxpoint);
        }
        System.out.println(ans);
    }
}