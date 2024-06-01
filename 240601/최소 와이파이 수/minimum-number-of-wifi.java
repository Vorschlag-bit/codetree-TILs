import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int idx = 0;
        int wifi = 0;
        boolean once = false;
        for(int i = 0; i < n; i++) {
            if(arr[i] == 1 && !once) {
                wifi++;
                once = true;
                //다음 스타트 지점
                idx = i + 2 * m;
            }

            if(i > idx && arr[i] == 1) {
                wifi++;
                idx = i + 2 * m;
            }
        }
        System.out.print(wifi);
    }
}