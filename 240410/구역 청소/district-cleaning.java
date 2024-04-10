import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[101];

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        for(int i = a; i <= b; i++)
        arr[i]++;

        for(int i = c; i <= d; i++)
        arr[i]++;

        int ans = 0;
        for(int i = 0; i <= 100; i++)
        if(arr[i] > 0) ans++;

        System.out.println(ans - 1);
    }
}