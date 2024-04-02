import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int cnt = 0;
        for (int i = x; i <= y; i++) {
            int num = i;
            int[] digit = new int[10];
            int alldigits = 0;

            while(num > 0) {
                digit[num % 10]++;
                alldigits++;
                num /= 10;
            }

            boolean Check = false;

            for(int j = 0; j < 10; j++)
            if(digit[j] == alldigits - 1)
            Check = true;

            if(Check) cnt++;
        }
        System.out.println(cnt);
    }
}