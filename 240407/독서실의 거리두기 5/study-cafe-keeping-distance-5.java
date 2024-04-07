import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int n;
    public static int[] arr;

    private static int getDist() {
        int minD = n;

        for(int i = 0; i < n; i++)
        for(int j = i + 1; j < n; j++) {
            if(arr[i] == 1 && arr[j] == 1)
            minD = Math.min(minD, j - i);
        }
        return minD;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        arr = new int[n];

        String str = br.readLine();

        for (int i = 0; i < n; i++)
            arr[i] = str.charAt(i) - '0';

        int ans = 0;
        for (int i = 0; i < n; i++) {
            // i부터 인덱스로 배열을 돌면서 탐색.
            if(arr[i] == 0) {
                arr[i] = 1;

                ans = Math.max(ans, getDist());

                arr[i] = 0;
            }
        }
        System.out.print(ans);
    }
}