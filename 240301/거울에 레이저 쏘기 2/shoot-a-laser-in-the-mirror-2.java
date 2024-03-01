import java.util.*;
import java.io.*;
public class Main {
    static int dir;
    // /를 만날 때 방향 변화
    static int decision1(int dir) {
        if(dir == '0') {
            dir = 1;
        }
        else if(dir == '1'){
            dir = 0;
        }
        else if(dir == '2'){
            dir = 3;
        }
        else 
        dir = 2;

        return dir;
    }
    // \를 만날 때 방향 변화
    static int decision2(int dir) {
        if(dir == '0'){
            dir = 3;
        }
        else if(dir == '1'){
            dir = 2;
        }
        else if(dir == '2'){
            dir = 1;
        }
        else 
        dir = 0;

        return dir;
    }
    //마지막으로 튕겨 나오는지 확인
    static boolean Check(int nx, int ny, int n) {
        return 0 <= nx && nx < n && 0 <= ny && ny < n;
    }
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());

        char[][] arr = new char[n][n];

        for(int i = 0; i < n; i ++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            for(int j = 0; j < n; j++) {
                char b;
                if(str.charAt(j) == '/')
                b = '/';
                else
                b = '\\';
                arr[i][j] = b;
            }
        }

        int k = Integer.parseInt(br.readLine());
        int i;
        int j;
        //k의 범위에 따른 레이저 들어오는 방향 설정 및 시작 위치 설정
        if(1 <= k && k <= n){
            dir = 0;
            i = 0;
            j = k -1;
        }
        else if(n + 1 <= k && k <= 2 * n){
            dir = 1;
            i = k - n - 1;
            j = n -1;
        }
        else if(2 * n + 1 <= k && k <= 3 * n){
            dir = 2;
            i = n - 1;
            j = 3 * n - k;
        }
        else {
            dir = 3;
            i = 4 * n - k;
            j = 0;
        }
        //dx dy 설정
        int[] dx = new int[] {1, 0, -1, 0};
        int[] dy = new int[] {0, -1, 0, 1};
        int cnt = 0;

        while(true) {
            if(arr[i][j] == '/') {
                dir = decision1(dir);
                cnt++;
            }
            else {
                dir = decision2(dir);
                cnt++;
            }
            i += dx[dir];
            j += dy[dir];

            boolean check = Check(i, j, n);

            if(!check) break;
        }
        System.out.print(cnt);
    }
}