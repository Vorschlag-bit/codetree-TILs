import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int ans = 0;
        int[] arr = new int[101];
        for(int i = a; i <= b; i++)
        arr[i]++;

        for(int i = c; i <= d; i++)
        arr[i]++;

        for(int i = 0; i <= 100; i++)
        if(arr[i] > 0) ans++;
        //겹치지 않는 경우만 파악
        if(c > b || a > d)
        System.out.println(ans - 2);
        else System.out.print(ans - 1);
    }
}