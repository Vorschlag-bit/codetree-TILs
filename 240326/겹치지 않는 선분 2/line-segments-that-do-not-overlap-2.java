import java.util.*;
import java.io.*;

public class Main {
    static final int R = 1000000;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] x1 = new int[n];
        int[] x2 = new int[n];

        // 입력 받기
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x1[i] = Integer.parseInt(st.nextToken());
            x2[i] = Integer.parseInt(st.nextToken());
        }

        int ans = 0;

        // 각 선분에 대해 확인
        for(int i = 0; i < n; i++) {
            boolean isNonOverlap = true; // 겹치지 않는지 여부를 저장하는 변수
            int currentX1 = x1[i]; // 현재 선분의 시작점
            int currentX2 = x2[i]; // 현재 선분의 끝점

            // 다른 선분들과 겹치는지 확인
            for(int j = 0; j < n; j++) {
                if(i == j) continue; // 같은 선분은 건너뜁니다.
                
                int otherX1 = x1[j]; // 다른 선분의 시작점
                int otherX2 = x2[j]; // 다른 선분의 끝점

                // 겹치는지 여부를 확인
                if ((currentX1 <= otherX1 && otherX1 <= currentX2) || 
                    (currentX1 <= otherX2 && otherX2 <= currentX2) ||
                    (otherX1 <= currentX1 && currentX1 <= otherX2) ||
                    (otherX1 <= currentX2 && currentX2 <= otherX2)) {
                    isNonOverlap = false; // 겹치는 선분이 있으면 false로 설정
                    break; // 더 이상 확인할 필요가 없으므로 반복문 종료
                }
            }

            if(isNonOverlap) ans++; // 현재 선분이 겹치지 않는 경우에만 카운트를 증가합니다.
        }

        System.out.println(ans);
    }
}