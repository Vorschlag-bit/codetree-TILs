import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        String str = br.readLine();

        for (int i = 0; i < n; i++)
            arr[i] = str.charAt(i) - '0';

        int ans = 0;
        for (int i = 0; i < n; i++) {
            // i부터 인덱스로 배열을 돌면서 탐색.
            if (arr[i] == 1)
                continue;
            int dis1 = getleft(i, arr);
            int dis2 = getrigth(i, arr);

            int Max = Math.min(dis1, dis2);
            ans = Math.max(Max, ans);
        }
        System.out.print(ans);
    }

    private static int getleft(int idx, int[] arr) {
        int dis = Integer.MAX_VALUE;
        for (int i = idx - 1; i >= 0; i--) {
            if (arr[i] == 1) {
                dis = idx - i;
                break;
            }
        }

        return dis;
    }

    private static int getrigth(int idx, int[] arr) {
      int dis = Integer.MAX_VALUE;
        for (int i = idx + 1; i < n; i++) {
            if (arr[i] == 1) {
                dis = i - idx;
                break;
            }
        }

        return dis;
    }
}