import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String str = br.readLine();

        for (int i = 0; i < n; i++) {
            arr[i] = str.charAt(i) - '0';
        }

        int ans = 0;

        // 첫번째 케이스: 배열이 0으로 시작할 때, 첫 번째 1의 위치를 찾음
        if (arr[0] == 0) {
            for (int i = 1; i < n; i++) {
                if (arr[i] == 1) {
                    ans = i;
                    break;
                }
            }
        }

        // 두번째 케이스: 배열이 0으로 끝날 때, 마지막 1의 위치를 찾음
        if (arr[n - 1] == 0) {
            for (int i = n - 2; i >= 0; i--) {
                if (arr[i] == 1) {
                    ans = Math.max(n - 1 - i, ans);
                    break;
                }
            }
        }

        // 세번째 케이스: 두 1 사이의 최대 거리 찾기
        int lastOneIndex = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                if (lastOneIndex != -1) {
                    int dist = (i - lastOneIndex) / 2;
                    ans = Math.max(ans, dist);
                }
                lastOneIndex = i;
            }
        }

        System.out.println(ans);
    }
}