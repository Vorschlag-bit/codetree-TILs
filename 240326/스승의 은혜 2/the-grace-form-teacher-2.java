import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[] price = new int[n];

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            price[i] = Integer.parseInt(st.nextToken());
        }
        //오름차순으로 정렬.
        Arrays.sort(price);

        int ans = 0;
        for(int i = 0; i < n; i++) {
            //반값 처리를 할 학생 고르는 반복문.
            int p = price[i]/2;
            int assume = b - p;
            int cnt = 1;
            for(int j = 0; j < n; j++) {
                if(i == j) continue;

                if(price[j] > assume) continue;

                p += price[j];
                assume -= price[j];
                cnt++;
            }
            ans = Math.max(cnt, ans);
        }
        System.out.println(ans);
    }
}