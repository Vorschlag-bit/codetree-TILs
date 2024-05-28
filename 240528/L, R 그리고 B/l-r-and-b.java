import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[][] arr = new char[10][10];
        
        int Bi = 0, Bj = 0;
        int Li = 0, Lj = 0;
        for(int i = 0; i < 10; i++) {
            String str = br.readLine();
            for(int j = 0; j < 10; j++) {
                arr[i][j] = str.charAt(j);
                if(arr[i][j] == 'B') {
                    Bi = i; Bj = j;
                }
                if(arr[i][j] == 'L') {
                    Li = i; Lj = j;
                }
            }
        }
        int dis = Math.abs(Bi - Li) + Math.abs(Bj - Lj) - 1;
        System.out.print(dis);
    }
}