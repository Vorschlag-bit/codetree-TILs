import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] dx = new int[] {1, 0, -1, 0};
        int[] dy = new int[] {0, -1, 0, 1};

        String com = sc.next();

        int x = 0;
        int y = 0;
        int index = 0;
        int dirNum = 3;

        for(int i = 0; i < com.length(); i++) {
            char dir = com.charAt(index);

            if(dir == 'R') {
                dirNum = (dirNum + 1) % 4;
            }
            else if(dir == 'L') {
                if(dirNum == 0) {
                    dirNum = (dirNum - 1 + 4) % 4;
                }
                else {
                    dirNum = (dirNum - 1) % 4;
                }
            }
            else {
                x += dx[dirNum];
                y += dy[dirNum];
            }

            index++;
        }
        System.out.print(x + " " + y);
    }
}