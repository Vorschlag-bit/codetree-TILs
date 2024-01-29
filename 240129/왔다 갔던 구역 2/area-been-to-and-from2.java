import java.util.*;
import java.io.*;

public class Main {
    public static int cnt = 0;
    public static int here = 1000;

    public static void Findout(int x, String b, int[] arr) {
        if (b.equals("R")) {
            for (int i = here + 1; i <= here + x; i++) {
                arr[i]++;
                if (arr[i] == 2)
                    cnt++;
            }
            here += x;
        } else {
            for (int i = here; i > here - x; i--) {
                arr[i]++;
                if (arr[i] == 2)
                    cnt++;
            }
            here -= x;
        }
    }

    public static int[] arr = new int[2001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int x = a;
            String b = st.nextToken();
            Findout(x, b, arr);
        }
        System.out.print(cnt);
    }
}