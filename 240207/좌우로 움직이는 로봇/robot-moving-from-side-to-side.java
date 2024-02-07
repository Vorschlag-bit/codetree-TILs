import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] A = new int[1000001];
        int[] B = new int[1000001];
        int cnt = 0;

        int atime = 0;
        int btime = 0;
        int time = 0;

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int t = Integer.parseInt(st.nextToken());
            int d = st.nextToken().equals("R") ? 1 : -1;
            time += t;

            for(int j = 0; j < t; j++) {
                A[atime+1] = A[atime] + 1 * d;
                atime++;
            }
        }
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int t = Integer.parseInt(st.nextToken());
            int d = st.nextToken().equals("R") ? 1 : -1;
            time += t;

            for(int j = 0; j < t; j++) {
                B[btime+1] = B[btime] + 1 * d;
                btime++;
            }
        }

        for(int i = 1; i <= time; i++) {
            if(A[i-1] != B[i-1])
            if(A[i] == B[i]) cnt++;
        }
        System.out.print(cnt);
    }
}