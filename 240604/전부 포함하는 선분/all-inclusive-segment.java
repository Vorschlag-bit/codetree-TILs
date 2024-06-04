import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[]x1 = new int[n];
        int[]x2 = new int[n];

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            x1[i] = Integer.parseInt(st.nextToken());
            x2[i] = Integer.parseInt(st.nextToken());
        }

        int dis = 100;
        for(int i = 0; i < n; i++) {
            int minx = 100;
            int maxx = 0;
            for(int j = 0; j < n; j++) {
                if(i == j) continue;
                
                if(minx > x1[j]) minx = x1[j];
                if(maxx < x2[j]) maxx = x2[j];
            }

            if(dis > (maxx - minx)) dis = (maxx - minx);
        }

        System.out.println(dis);
    }
}