import java.util.*;
import java.io.*;

public class Main {
    public static int weiss = 0;
    public static int dunkel = 0;
    public static int grau = 0;
    public static int start = 100000;

    public static void Findout(int x, String dir, int[] arr) {
        if (dir.equals("R")) {
            for (int i = start; i < start + x; i++) {
                arr[i]++;
                // 수정: arr[i]가 4보다 크면 더 진행하지 않고 다음 반복으로 넘어갑니다.
                if (arr[i] > 4) {
                    continue;
                }
                if (arr[i] == 4) {
                    grau++;
                    // 수정: grau를 증가시키면서 weiss를 감소시킵니다.
                    weiss--;
                    continue;
                }
                if (arr[i] > 1) {
                    dunkel++;
                    // 수정: dunkel을 증가시키면서 weiss를 감소시킵니다.
                    weiss--;
                    continue;
                }
                dunkel++;
            }
            // 수정: start를 x만큼 증가시킵니다.
            start += (x - 1);
        } else {
            for (int i = start; i > start - x; i--) {
                arr[i]++;
                // 수정: arr[i]가 4보다 크면 더 진행하지 않고 다음 반복으로 넘어갑니다.
                if (arr[i] > 4) {
                    continue;
                } else if (arr[i] == 4) {
                    grau++;
                    // 수정: grau를 증가시키면서 dunkel을 감소시킵니다.
                    dunkel--;
                    continue;
                }
                if (arr[i] > 1) {
                    weiss++;
                    // 수정: weiss를 증가시키면서 dunkel을 감소시킵니다.
                    dunkel--;
                    continue;
                }
                weiss++;
            }
            // 수정: start를 x만큼 감소시킵니다.
            start -= (x - 1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[200001];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            String dir = st.nextToken();

            Findout(x, dir, arr);
        }

        System.out.printf("%d %d %d", weiss, dunkel, grau);
    }
}