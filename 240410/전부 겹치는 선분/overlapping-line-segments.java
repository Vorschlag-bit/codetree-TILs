import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] x1 = new int[n];
        int[] x2 = new int[n];

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x1[i] = Integer.parseInt(st.nextToken());
            x2[i] = Integer.parseInt(st.nextToken());
        }
        
        int[] arr = new int[101];

        for(int i = 0; i < n; i++) {
            int curx1 = x1[i];
            int curx2 = x2[i];
            for(int j = curx1; j <= curx2; j++)
            arr[j]++;
        }

        boolean Check = false;
        for(int i = 1; i <= 100; i++)
        if(arr[i] == n) Check = true;

        if(Check) System.out.print("Yes");
        else System.out.print("No");
    }
}