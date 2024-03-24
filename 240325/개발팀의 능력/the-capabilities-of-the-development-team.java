import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[5];
        int total = 0;

        for(int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            total += arr[i];
        }

        int minddiff = Integer.MAX_VALUE;
        boolean check = false;
        for(int i = 0; i < 5; i++)
        for(int j = i + 1; j < 5; j++) {
            int sum1 = arr[i] + arr[j];
            for(int a = 0; a < 5; a++){
                if(a == i || a == j)
                continue;

                int sum2 = arr[a];
                int sum3 = total;
                sum3 -= (sum2 + sum1);

                if(sum1 == sum2 || sum2 == sum3 || sum1 == sum3)
                continue;

                int max = Math.max(sum1, Math.max(sum2, sum3));
                int min = Math.min(sum1, Math.min(sum2, sum3));

                minddiff = Math.min(minddiff, max - min);
                check = true;
            }
        }
        if(!check) System.out.println(-1);
        else System.out.println(minddiff);
    }
}