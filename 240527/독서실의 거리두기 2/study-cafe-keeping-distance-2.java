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
            int d = 0;
            for (int i = 1; i < n; i++) {
                if (arr[i] == 1)
                break;
                d++;
            }
            if(d > ans) {
                ans = d;
                maxIdx = 0;
            }
        }

        // 두번째 케이스: 배열이 0으로 끝날 때, 마지막 1의 위치를 찾음
        if (arr[n - 1] == 0) {
            int d = 0;
            for (int i = n - 1; i >= 0; i--) {
                if (arr[i] == 1)
                break;
                d++;
            }
            if(d > ans) {
                ans = d;
                maxIdx = n - 1;
            }
        }

        // 세번째 케이스: 두 1 사이의 최대 거리 찾기
        int lastOneIndex = -1;
        int ans2 = -1;
        int maxI = 0, maxJ = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                if(lastOneIndex != -1) {
                    int dis = i - lastOneIndex;
                    if(dis > ans2) {
                        ans2 = dis;
                        maxI = lastOneIndex;
                        maxJ = i;
                    }
                }
                lastOneIndex = i;
            }
        }

        //최적 위치에 1배치
        if(ans >= ans2 / 2)
        arr[maxIdx] = 1;
        else
        arr[(maxI + maxJ)/2] = 1;

        int dis = 10000;
        lastOneIndex = -1;
        for(int i = 0; i < n; i++) {
            if(arr[i] == 1) {
                if(lastOneIndex != -1) {
                    dis = Math.min(dis, i - lastOneIndex);
                }
                lastOneIndex = i;
            }
        }
        System.out.println(dis);
    }
}