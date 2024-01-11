import java.util.*;
import java.io.*;
public class Main {
    public static int[] days = new int[] {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static int Day = 0;
    public static String[] Week = new String[] {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

    public static String Cal(int m1, int d1, int m2, int d2) {
        while(true){
            if(m1 > 12)
            break;

            if(m1==m2&&d1==d2)
            break;

            if(m1 > m2&&d1 > d2)
            d1++;   
            Day++;
            if(d1 > days[m1]) {
                m1++;
                d1 = 1;
            }

            
        }
        
        int ex = Day%7;

        return Week[ex];
    }
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m1 = Integer.parseInt(st.nextToken());
        int d1 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());

        System.out.print(Cal(m1, d1, m2, d2));
    }
}