import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
            int[] temp = new int[n];
            for(int j = 0; j < n; j++)
                temp[j] = arr[j]; // arr 배열을 temp 배열로 복사
            if (temp[i] == 1)
                continue;

            temp[i] = 1;

            int minDistance = Integer.MAX_VALUE; // 최소 거리를 구하기 위한 변수 초기화

            for(int j = 0; j < n; j++) {
                if(temp[j] == 1) { // 1이면 거리 계산
                    int dis1 = getleft(j, temp);
                    int dis2 = getrigth(j, temp);
                    int minDis = Math.min(dis1, dis2); // 왼쪽과 오른쪽 거리 중 최소값
                    minDistance = Math.min(minDistance, minDis); // 현재까지의 최소 거리 업데이트
                }
            }

            // 최소 거리가 이전에 구한 최대 거리보다 크면 업데이트
            ans = Math.max(minDistance, ans);
        }
        System.out.print(ans);
    }

    // 왼쪽 거리를 구하는 메서드
    private static int getleft(int idx, int[] temp) {
        int dis = Integer.MAX_VALUE;
        for (int i = idx - 1; i >= 0; i--) {
            if (temp[i] == 1) {
                dis = idx - i;
                break;
            }
        }
        return dis;
    }

    // 오른쪽 거리를 구하는 메서드
    private static int getrigth(int idx, int[] temp) {
        int dis = Integer.MAX_VALUE;
        for (int i = idx + 1; i < n; i++) {
            if (temp[i] == 1) {
                dis = i - idx;
                break;
            }
        }
        return dis;
    }
}