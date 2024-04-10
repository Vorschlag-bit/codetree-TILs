import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[101];

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int ans = 0;

        //겹칠 경우
        if(c <= a && a <= d || c <= b && b <= d)
        ans = Math.max(d - a, b - c);

        //포함되는 경우
        if(c <= a && b <= d || a <= c && d <= b)
        ans = Math.max(c - d, b - a);

        //안 겹칠 경우
        else ans = (d - c) + (b - a);

        System.out.println(ans);
    }
}