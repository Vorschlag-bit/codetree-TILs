import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int cnt = 0;
        String winner = "Mee";
        int time = 1;

        int[] a = new int[10000001];
        int[] b = new int[10000001];

        int aT = 0;
        int bT = 0;

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            time += t;

            for(int j = 0; j < t; j++) {
                a[aT+1] = a[aT] + v;
                aT++;
            }
        }
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            time += t;

            for(int j = 0; j < t; j++) {
                b[bT+1] = b[bT] + v;
                bT++;
            }
        }

        for(int i = 1; i <= time; i++) {
            if(a[i] > b[i]) {
                if(winner.equals("B")) cnt++;
                winner = "A";
            }
            else if(b[i] > a[i]) {
                if(winner.equals("A")) cnt++;
                winner = "B";
            }
        }
        System.out.print(cnt);
    }
}