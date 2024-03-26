import java.util.*;
import java.io.*;
public class Main {
    static final int R = 1000000;
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

        int ans = 0;
        for(int i = 0; i < n; i++) {
            //가장 먼저 탐색 기준이 될 선 고르는 반복문.
            int a1 = x1[i];
            int a2 = x2[i];
            boolean check = true;
            for(int j = 0; j < n; j++) {
                if(i == j) continue;
                //비교대상을 고르는 반복문
                int b1 = x1[j];
                int b2 = x2[j];

                if((b1 <= a1 && a1 <= b2) && (b1 <= a2 && a2 <= b2))
                check = false;
                else if((b1 <= a1 && a1 <= b2) && (a2 <= b1 && a2 <= b2))
                check = false;
                else if((b1 <= a2 && a2 <= b2) && (b1 <= a1 && b2 <= a1))
                check = false;
                else if((b2 <= a2 && a2 <= b1) && (a1 <= b1 && a1 <= b2))
                check = false;
                else if((b2 <= a1 && b1 <= a1) && (b2 <= a2 && b1 <= a2))
                check = false;
            }
            if(check) ans++;
        }
        System.out.println(ans);
    }
}