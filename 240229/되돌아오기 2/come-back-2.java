import java.util.*;
import java.io.*;
public class Main {
    static int[] dx = new int[] {1, 0, -1, 0};
    static int[] dy = new int[] {0, -1, 0, 1};
    static int dirNum = 3;
    static int x, y;
    static int time = 0;
    static int ans = -1;

    static void Dir(char c) {
        if(c == 'R'){
            dirNum = (dirNum + 1) % 4;
            time++;
        }
        else if(c == 'L'){
            dirNum = (dirNum - 1 + 4) % 4;
            time++;
        }
        else {
            x += dx[dirNum];
            y += dy[dirNum];
            time++;
        }
    }

    static boolean Check(int x, int y) {
        if(x == 0 && y == 0) {
            ans = time;
            return true;
        }
        else return false;
    }
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String sen = br.readLine();
        int length = sen.length();

        for(int i = 0; i < length; i++) {
            char c = sen.charAt(i);
            //방향 설정 및 진행
            Dir(c);
             
            boolean check = Check(x, y);
        }

        System.out.print(ans);
    }
}