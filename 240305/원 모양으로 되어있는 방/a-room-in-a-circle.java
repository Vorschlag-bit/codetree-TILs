import java.util.*;
import java.io.*;
public class Main {
    static final int INT_MAX = Integer.MAX_VALUE;

    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
        }

        int ans = INT_MAX;
        //1번 방부터 n번방까지 완전탐색으로 최소 거리 구하기
        for(int i = 0; i < n; i++) {
            //어느 방에서 시작할지 고르는 반복문1.
            int Idx = (n - i) % n;
            int dis = 0;
            for(int j = 0; j < n; j++) {
                //선택한 방 빼고 완전탐색을 하면서 최소거리를 구하는 탐색문2.
                dis += arr[j] * Idx;
                Idx = (Idx + 1) % n;
            }
            ans = Math.min(ans, dis);
        }
        System.out.print(ans);
    }
}