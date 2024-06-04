import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long[] arr = new long[15];

        long sum = 0;

        for(int i = 0; i < 15; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];
        }

        sum /= 8;

        Arrays.sort(arr);

        long a = arr[0];
        long b = arr[1];
        long c = arr[2];
        long d = sum - (a + b + c);

        System.out.println(a + " " + b + " " + c + " " + d);
    }
}