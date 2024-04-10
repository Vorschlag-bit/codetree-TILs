import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[101];
        int[] x1 = new int[n];
        int[] x2 = new int[n];

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            x1[i] = Integer.parseInt(st.nextToken());
            x2[i] = Integer.parseInt(st.nextToken());
        }

        boolean Check = false;
        for(int i = 0; i < n; i++){
            int Maxx1 = 0;
            int Minx2 = 100;
            for(int j = 0; j < n; j++) {
            if(i == j) continue;
            Maxx1 = Math.max(Maxx1, x1[j]);
            Minx2 = Math.min(Minx2, x2[j]);
        }
        if(Minx2 >= Maxx1) Check = true;
        }
        if(Check) System.out.print("Yes");
        else System.out.print("No");
    }
}