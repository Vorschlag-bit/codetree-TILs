import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int cA = 0, cB = 0;
        int lA = 0, lB = 0;
        int ans = 1;

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String c = st.nextToken();
            int s = Integer.parseInt(st.nextToken());
            //점수 입력
            if(c == "A") cA = lA + s;
            else cB = lB + s;

            if((lA >= lB) && cA < cB)
            ans++;
            else if((lA <= lB) && cA > cB)
            ans++;
            else if(lA == lB && (cA > cB || cA < cB))
            ans++;
            else if((lA > lB || lA < lB) && cA == cB)
            ans++;

            lA = cA;
            lB = cB;
        }
        System.out.println(ans);
    }
}