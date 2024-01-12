import java.util.*;
import java.io.*;
public class Main {
    public static int[] days = new int[] {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static int Day = 0;
    public static String[] Week = new String[] {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

    public static int Cal(int m, int d) {
        int total = 0;

        for(int i = 1; i <= m; i++){
            total += days[i];
        }

        total += d;

        return total;
    }
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m1 = Integer.parseInt(st.nextToken());
        int d1 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());

        int diff = Cal(m2,d2) - Cal(m1, d1);

        while(diff < 0)
        diff += 7;

        System.out.print(Week[diff%7]);
    }
}