import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][2];

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        int ans = 0;
        int cnt = 0;
        //1이 가위, 2가 바위, 3이 보
        for(int i = 0; i < n; i++) {
            if(arr[i][0] == 1 && arr[i][1] == 3)
            cnt++;
            if(arr[i][0] == 2 && arr[i][1] == 1)
            cnt++;
            if(arr[i][0] == 3 && arr[i][1] == 2)
            cnt++;
        }
        ans = Math.max(ans, cnt);

        cnt = 0;
        //1이 가위, 2가 보, 3이 바위
        for(int i = 0; i < n; i++) {
            if(arr[i][0] == 1 && arr[i][1] == 2)
            cnt++;
            if(arr[i][0] == 2 && arr[i][1] == 3)
            cnt++;
            if(arr[i][0] == 3 && arr[i][1] == 1)
            cnt++;
        }
        ans = Math.max(ans, cnt);

        System.out.println(ans);
    }
}