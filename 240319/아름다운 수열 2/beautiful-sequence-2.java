import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        int[] tmp = new int[m];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr2, 0, m);

        int ans = 0;
        for(int i = 0; i <= n - m; i++) {
            for(int j = 0; j < m; j++)
            tmp[j] = arr1[i + j]; //비교를 할 임의의 배열을 생성 후, arr1에서 m만큼씩 잘라서 넣기.
            Arrays.sort(tmp, 0, m);

            boolean issame = true;
            for(int j = 0; j < m; j++) {
                if(tmp[j] != arr2[j]) {
                    issame = false;
                    break;
                }
            }
            if(issame) ans++;
        }
        System.out.println(ans);
    }
}