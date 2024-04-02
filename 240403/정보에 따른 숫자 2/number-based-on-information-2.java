import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        char[] arr = new char[1001];
        Arrays.fill(arr, ' '); // 배열 초기화

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            char alp = st.nextToken().charAt(0);
            int coor = Integer.parseInt(st.nextToken());
            arr[coor] = alp;
        }
        
        int cnt = 0;

        for (int i = a; i <= b; i++) {
            int k = i;
            int d1 = 10000;
            int d2 = 10000;

            // 'S'와 'N'에 대한 거리 계산
            for (int j = 1; j <= 1000; j++) {
                if (arr[j] == 'S') {
                    int Currd1 = Math.abs(k - j);
                    if (Currd1 < d1)
                        d1 = Currd1;
                } else if (arr[j] == 'N') {
                    int Currd2 = Math.abs(k - j);
                    if (Currd2 < d2)
                        d2 = Currd2;
                }
            }
            // 가까운 거리에 따라 카운트
            if (d1 <= d2)
                cnt++;
        }
        System.out.println(cnt);
    }
}