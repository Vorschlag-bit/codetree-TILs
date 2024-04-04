import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int ans = 0;
        for(int i = 0; i * a <= c; i++) {

            int value = a * i;

            int numB = (c - value) / b;

            value += numB * b;
            ans = Math.max(value, ans);
        }
        System.out.println(ans);
    }
}