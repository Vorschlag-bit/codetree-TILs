import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[][] Rank = new int[k][n + 1]; // k번 동안 경기에서 n명의 개발자간의 순위를 기록.

        // 입력 받기
        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                Rank[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            // 개발자 2명을 선택하여 완전 탐색
            for (int j = 1; j <= n; j++) {
                if (i != j) {
                    boolean check = true;
                    // 모든 경기에 대해 확인
                    for (int l = 0; l < k; l++) {
                        int rank1 = 0;
                        int rank2 = 0;
                        for (int h = 1; h <= n; h++) {
                            if (Rank[l][h] == i) rank1 = h;
                            if (Rank[l][h] == j) rank2 = h;
                        }
                        // 한 번이라도 첫 번째 선택한 개발자보다 순위가 낮으면 종료
                        if (rank1 < rank2) {
                            check = false;
                            break;
                        }
                    }
                    // 모든 경기에서 첫 번째 선택한 개발자보다 순위가 높으면 카운트 증가
                    if (check) cnt++;
                }
            }
        }
        System.out.print(cnt);
    }
}