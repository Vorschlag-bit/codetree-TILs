import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        //텔을 쓰는 경우
        int d1 = Math.min(Math.abs(x - a), Math.abs(y - a));
        d1 += Math.min(Math.abs(x - b), Math.abs(y - b));
        //안 쓰는 경우
        int d2 = Math.abs(a - b);

        int ans = Math.min(d1, d2);

        System.out.print(ans);
    }
}