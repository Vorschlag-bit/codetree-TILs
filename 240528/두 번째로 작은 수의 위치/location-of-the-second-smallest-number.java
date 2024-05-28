import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        int Min = 100;
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i] < Min)
            Min = arr[i];
        }

        int ans = -1;
        int Sec = 100;
        //2번째로 작은 수 찾기
        for(int i = 0; i < n; i++) {
            if(arr[i] != Min && arr[i] < Sec) {
                Sec = arr[i];
                ans = i + 1;
            }
        }

        //2번째로 작은 수가 여러 개인지 판별
        boolean Check = true;
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] == Sec)
            cnt++;
            if(cnt > 1)
            Check = false;
        }

        if(Sec != 100 && Check)
        System.out.print(ans);
        else System.out.print(-01);
    }
}