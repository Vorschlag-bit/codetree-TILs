import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[2 * n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < 2 * n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        System.out.print(maxdiff(arr, n));
    }
    public static int maxdiff(int[] arr, int n) {
        int[] diff = new int[n];

        for(int i = 0; i < n; i += 1) {
            diff[i] = Math.abs(arr[i] - arr[i + n]);
        }

        int min = Arrays.stream(diff).min().getAsInt();

        return min;
    }
}