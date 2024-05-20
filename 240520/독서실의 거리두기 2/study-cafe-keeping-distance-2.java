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
        int maxIdx = 0;
        // 첫번째 케이스: 배열이 0으로 시작할 때, 첫 번째 1의 위치를 찾음
        if (arr[0] == 0) {
            for (int i = 1; i < n; i++) {
                if (arr[i] == 1) {
                    ans = i;
                    maxIdx = 0;
                    break;
                }
            }
        }

        // 두번째 케이스: 배열이 0으로 끝날 때, 마지막 1의 위치를 찾음
        if (arr[n - 1] == 0) {
            for (int i = n - 2; i >= 0; i--) {
                if (arr[i] == 1 && n - 1 - i > ans) {
                    ans = n - 1 - i;
                    maxIdx = n - 1;
                    break;
                }
            }
        }

        // 세번째 케이스: 두 1 사이의 최대 거리 찾기
        int lastOneIndex = -1;
        int ans2 = -1;
        int maxI = 0, maxJ = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                if (lastOneIndex != -1 && i - lastOneIndex > ans2) {
                    ans2 = (i - lastOneIndex);
                    
                    maxI = lastOneIndex;
                    maxJ = i;
                }
                lastOneIndex = i;
            }
        }

        //최적 위치에 1배치
        if(ans >= ans2 / 2)
        arr[maxIdx] = 1;
        else
        arr[maxI + maxJ / 2] = 1;

        int dis = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            if(arr[i] == 1) {
                for(int j = i + 1; j < n; j++) {
                    if(arr[j] == 1)
                    dis = Math.min(dis, j - i);
                }
            }
        }
        System.out.println(dis);
    }
}