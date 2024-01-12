import java.util.*;
import java.io.*;
public class Main {
    public static String[] Weeks = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
    public static int[] days = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static int Cal(int m, int d) {
        int Total = 0;

        for(int i = 1; i < m; i++)
        Total += days[i];

        Total += d;

        return Total;
    }
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int m1= Integer.parseInt(st.nextToken());
        int d1= Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());
        String week = br.readLine();

        int diff = Cal(m2, d2) - Cal(m1, d1);

        int times = diff/7;
        int ex = diff%7;
        if(Arrays.asList(Weeks).indexOf(week) <= ex)
        times++;

        System.out.print(times);
    }
}