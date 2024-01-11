import java.util.*;
import java.io.*;
public class Main {
    public static int Cal(int a, int b, int c) {
        return (24 * 60 * a + 60 * b + c) - (11 * 24 * 60 + 60 * 11 + 11); 
    }
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if(Cal(a, b, c) < 0)
        System.out.print(-1);

        System.out.print(Cal(a, b, c));
    }
}