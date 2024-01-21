import java.util.*;
import java.io.*;
public class Main {
    public static int cal(int m, int d) {
        int[] dsom = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int Totalday = 0;

        for(int i = 1; i < m; i++)
        Totalday += dsom[i];

        Totalday += d;

        return Totalday;
    }
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int m1 = Integer.parseInt(st.nextToken());
        int d1 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());
        
        System.out.print(cal(m2, d2) - cal(m1, d1) + 1);
    }
}