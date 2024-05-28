import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[][] arr = new char[10][10];
        
        int Bi = 0, Bj = 0;
        int Li = 0, Lj = 0;
        int Ri = 0, Rj = 0;
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
                if(arr[i][j] == 'R') {
                    Ri = i; Rj = j;
                }
            }
        }
        boolean istraight = false;
        boolean jstraight = false;
        if(Li == Bi) istraight = true;
        if(Bj == Lj) jstraight = true;

        int dis = Math.abs(Bi - Li) + Math.abs(Bj - Lj) - 1;
        //i로 일자이면서 l과 b사이에 R이 있는 경우
        if(istraight && (Li > Ri)&&(Ri > Bi) || (Li < Ri)&&(Ri < Bi))
        System.out.print(dis + 2);
        //j로 일자면서 l과 b사이에 R이 있는 경우
        else if(jstraight && (Lj > Rj)&&(Rj > Bj) || (Lj < Rj)&&(Rj < Bj))
        System.out.print(dis + 2);
        else
        System.out.print(dis);
    }
}