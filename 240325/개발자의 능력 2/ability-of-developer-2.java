import java.util.*;
import java.io.*;
public class Main {
    static int[] arr = new int[6];
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < 6; i++)
        arr[i] = Integer.parseInt(st.nextToken());

        int Mindiff = Integer.MAX_VALUE;

        for(int i = 0; i < 6; i++)
        for(int j = i + 1; j < 6; j++) {
            int sum1 = arr[i] + arr[j];

            for(int a = 0; a < 6; a++)
            for(int b = a + 1; b < 6; b++) {
                if(a == i || b == i || a == j || b == j)
                continue;

                int sum2 = arr[a] + arr[b];
                int sum3 = 0;

                for(int k = 0; k < 6; k++)
                sum3 += arr[k];

                sum3 -= (sum1 + sum2);

                int max = Math.max(sum1, Math.max(sum2, sum3));
                int min = Math.min(sum1, Math.min(sum2, sum3));

                Mindiff = Math.min(Mindiff, max - min);
            }
        }
        System.out.println(Mindiff);
    }
}