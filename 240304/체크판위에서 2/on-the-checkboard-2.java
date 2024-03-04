import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        char[][] arr = new char[r][c];
        
        for(int i = 0; i < r; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < c; j++)
            arr[i][j] = st.nextToken().charAt(0);
        }
        int ans = 0;
        for(int i = 1; i < r; i++) {
            for(int j = 1; j < c; j++) {
                //점프 시작한 이후 좌표를 찍을 for문.
                for(int k = i + 1; k < r - 1; k++) {
                    for(int l = j + 1; l < c - 1; l++) {
                        //주어진 규칙에 따라 점프하여 경우의 수 셈
                        if(arr[0][0] != arr[i][j] && arr[i][j] != arr[k][l] && arr[k][l] != arr[r - 1][c - 1])
                        ans++;   
                    }
                }
            }
        }
        System.out.print(ans);
    }
}