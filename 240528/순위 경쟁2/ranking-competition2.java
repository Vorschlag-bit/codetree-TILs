import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int cA = 0, cB = 0;
        int lA = 0, lB = 0;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String c = st.nextToken();
            int s = Integer.parseInt(st.nextToken());
            // 점수 입력
            if (c.equals("A")) cA = lA + s;
            else cB = lB + s;

            // 점수가 바뀌는 경우와 동점이 되는 경우를 모두 처리
            if ((lA >= lB && cA < cB) || (lA <= lB && cA > cB) || (lA != lB && cA == cB)) {
                ans++;
            }

            lA = cA;
            lB = cB;
        }
        // 최종 결과 출력
        System.out.println(ans);
    }
}