import java.io.*;
import java.util.*;
public class Main {
    static int ansX = 0;
    static int ansY = 0;
    //검둥이 체크
    private static boolean Check(int x, int y, int[][] arr) {
        int cnt = 1;
        boolean vic = false;
        // 가로 방향 체크.
        for(int i = y + 1; i < 19 - y; i++) {
            if(cnt == 5) {
                ansX = x + 1;
                ansY = i - 2;
                vic = true;
                break;
            }
            if(arr[x][i] == 1) {
                cnt++;
            }
            else {
                cnt = 1;
                break;
            }
        }
        if(vic) return true;
        //세로 방향 체크
        for(int i = x + 1; i < 19 - x; i++) {
            if(cnt == 5) {
                ansX = i - 2;
                ansY = y + 1;
                vic = true;
                break;
            }
            if(arr[i][y] == 1) {
                cnt++;
            }
            else {
                cnt = 1;
                break;
            }
        }
        if(vic) return true;
        //대각선 방향 체크1
        for(int i = 1; i < 6; i++) {
            if (x + i >= 19 || y + i >= 19) // 보드 범위를 초과하면 중지
            break;
            if(cnt == 5) {
                ansX = x + 3;
                ansY = y + 3;
                vic = true;
                break;
            }
            if(arr[x + i][y + i] == 1) {
                cnt++;
            }
            else {
                cnt = 1;
                break;
            }
        }
        if(vic) return true;
        //대각선 방향 체크2
        for(int i = 1; i < 6; i++) {
            if (x + i >= 19 || y - i < 0) // 보드 범위를 초과하면 중지
            break;
            if(cnt == 5) {
                ansX = x + 3;
                ansY = y - 1;
                vic = true;
                break;
            }
            if(arr[x + i][y - i] == 2) {
                cnt++;
            }
            else {
                cnt = 1;
                break;
            }
        }
        if(vic) return true;
        else return false;
    }
    //흰둥이 체크
    private static boolean Check2(int x, int y, int[][] arr) {
        int cnt = 1;
        boolean vic2 = false;
        // 가로 방향 체크.
        for(int i = y + 1; i < 19 - y; i++) {
            if(cnt == 5) {
                ansX = x + 1;
                ansY = i - 2;
                vic2 = true;
                break;
            }
            if(arr[x][i] == 2) {
                cnt++;
            }
            else {
                cnt = 1;
                break;
            }
        }
        if(vic2) return true;
        //세로 방향 체크
        for(int i = x + 1; i < 19 - x; i++) {
            if(cnt == 5) {
                ansX = i - 2;
                ansY = y + 1;
                vic2 = true;
                break;
            }
            if(arr[i][y] == 2) {
                cnt++;
            }
            else {
                cnt = 1;
                break;
            }
        }
        if(vic2) return true;
        //대각선 방향 체크1
        for(int i = 1; i < 6; i++) {
            if (x + i >= 19 || y + i >= 19) // 보드 범위를 초과하면 중지
            break;
            if(cnt == 5) {
                ansX = x + 3;
                ansY = y + 3;
                vic2 = true;
                break;
            }
            if(arr[x + i][y + i] == 2) {
                cnt++;
            }
            else {
                cnt = 1;
                break;
            }
        }
        if(vic2) return true;
        //대각선 방향 체크2
        for(int i = 1; i < 6; i++) {
            if (x + i >= 19 || y - i < 0) // 보드 범위를 초과하면 중지
            break;
            if(cnt == 5) {
                ansX = x + 3;
                ansY = y - 1;
                break;
            }
            if(arr[x + i][y - i] == 2) {
                vic2 = true;
                cnt++;
            }
            else {
                vic2 = false;
                cnt = 1;
                break;
            }
        }
        if(vic2) return true;
        else return false;
    }
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[19][19];
        int ans = 0;

        for(int i = 0; i < 19; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 19; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
       for(int i = 0; i < 19; i++) {
        for(int j = 0; j < 19; j++) {
            if(arr[i][j] == 1) {
                int startX = i;
                int startY = j;
                boolean ans1 = Check(startX, startY, arr);
                if(ans1) ans = 1;
            }
            else if(arr[i][j] == 2) {
                int startX = i;
                int startY = j;
                boolean ans2 = Check2(startX, startY, arr);
                if(ans2) ans = 2;
            }
        }
       }
       if(ans != 0) {
        System.out.println(ans);
        System.out.print(ansX + " " + ansY);
       }
       else System.out.print(ans);
    }
}