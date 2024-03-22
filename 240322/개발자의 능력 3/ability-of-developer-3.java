import java.util.*;
import java.io.*;
public class Main {
    protected static int[] arr = new int[6];
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < 6; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int ans = 100000000;

        for(int i = 0; i < 6; i++)
        for(int j = i + 1; j < 6; j++)
        for(int l = j + 1; l < 6; l++) {
            ans = Math.min(ans, getdiff(i, j, l));
        }
        System.out.println(ans);
    }

    protected static int getdiff(int i, int j, int l) {
        int sum1 = arr[i] + arr[j] + arr[l];
        int sum2 = 0;

        for(int a = 0; a < 6; a++)
        sum2 += arr[a];

        sum2 -= sum1;

        return Math.abs(sum1 - sum2);
    }
}