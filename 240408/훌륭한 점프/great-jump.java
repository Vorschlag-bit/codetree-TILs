import java.io.*;
import java.util.*;
public class Main {
    static int n;
    static int k;
    static int[] arr;
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        arr = new int[n];
        
        st = new StringTokenizer(br.readLine());
        int Max = 0;
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            Max = Math.max(Max, arr[i]);
        }

        int ans = Max;
        for(int i = Max; i >= Math.max(arr[0], arr[n - 1]); i--) {
            if(Check(i))
            ans = Math.min(ans, i);
        }
        System.out.println(ans);
    }
    private static boolean Check(int Maxv) {
        int cnt = 0;

        int[] instep = new int[n];
        for(int i = 0; i < n; i++) {
            if(arr[i] <= Maxv)
            instep[cnt++] = i;
        }

        for(int i = 1; i < cnt; i++) {
            int dis = instep[i] - instep[i - 1];
            if(dis > k)
            return false;
        }

        return true;
    }
}