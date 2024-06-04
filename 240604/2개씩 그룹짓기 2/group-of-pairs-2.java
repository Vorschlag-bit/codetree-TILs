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

        int idx = 2 * n;
        Arrays.sort(arr);

        System.out.print(maxdiff(arr));
    }
    public static int maxdiff(int[] arr) {
        int[] diff = new int[arr.length / 2];

        for(int i = 0; i < arr.length - 1; i += 2) {
            diff[i / 2] = Math.abs(arr[i] - arr[i + 1]);
        }

        int max = Arrays.stream(diff).max().getAsInt();

        return max;
    }
}