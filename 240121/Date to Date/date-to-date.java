import java.util.*;
import java.io.*;
public class Main {
    public static int[] dsom = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int m1 = Integer.parseInt(st.nextToken());
        int d1 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());
        
        int TotalDay = 0;
        
        while(!(m1==m2&&d1==d2)){

            TotalDay++;
            d1++;

            if(d1 > dsom[m1]){
                m1++;
                d1 = 1;
            }
        }

        System.out.print(TotalDay + 1);
    }
}