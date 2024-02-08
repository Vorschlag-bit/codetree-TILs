import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] A = new int[1000005];
        int[] B = new int[1000005];
        int cnt = 0;

        int atime = 0;
        int btime = 0;

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int t = Integer.parseInt(st.nextToken());
            int d = st.nextToken().equals("R") ? 1 : -1;

            for(int j = 0; j < t; j++) {
                A[atime+1] = A[atime] + 1 * d;
                atime++;
            }
        }
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int t = Integer.parseInt(st.nextToken());
            int d = st.nextToken().equals("R") ? 1 : -1;

            for(int j = 0; j < t; j++) {
                B[btime+1] = B[btime] + 1 * d;
                btime++;
            }
        }
        //배열 순회가 끝난 후, 위치 고정을 위한 반복문.
        int Rt = Math.max(atime, btime);
        for(int i = atime; i <= Rt; i++){
            A[atime + 1] = A[atime];
            atime++; 
        }
        for(int i = btime; i <= Rt; i++){
            B[btime + 1] = B[btime];
            btime++;
        }

        for(int i = 1; i <= Rt; i++) {
            if(A[i-1] != B[i-1])
            if(A[i] == B[i]) 
            cnt++;
        }
        System.out.print(cnt);
    }
}