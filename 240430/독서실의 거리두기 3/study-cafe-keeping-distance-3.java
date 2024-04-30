import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        String str = br.readLine();

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str.charAt(i) + "");
            // 각 문자를 문자열로 변환 후 정수로 파싱
        }

        // 첫 번째 가장 먼 1쌍 찾기
        int maxDist = 0;
        int start = 0, end = 0;
        for (int i = 0; i < n; i++) {
            // 시작점 찾는 반복문
            for (int j = i + 1; j < n; j++) {
                if (arr[j] - arr[i] == 0) {
                    if (j - i > maxDist) {
                        maxDist = j - i;
                        start = i;
                        end = j;
                    }
                    break;
                }
            }
        }
        // 가운데에 1을 넣기
        int mid = (start + end) / 2;
        arr[mid] = 1;

        // 정답 찾기
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            // 시작점 찾는 반복문
            if(arr[i] == 1)
            for (int j = i + 1; j < n; j++) {
                if(arr[j] == 1) {
                    ans = Math.min(ans, j - i);
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}