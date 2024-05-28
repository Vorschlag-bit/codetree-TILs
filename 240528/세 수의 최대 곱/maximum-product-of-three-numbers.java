import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int Cand1 = 0;
        int Cand2 = 0;

        //오름차순으로 정렬
        Arrays.sort(arr);

        //1번: 양수 3개만 곱해서 최대
        Cand1 = arr[n - 1] * arr[n - 2] * arr[n - 3];
        //2번: 음수 2개 * 양수 곱해서 최대
        Cand2 = arr[0] * arr[1] * arr[n - 1];

        int ans = Math.max(Cand1, Cand2);
        System.out.print(ans);
    }
}