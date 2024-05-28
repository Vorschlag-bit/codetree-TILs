import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[][] arr = new char[10][10];

        int Bi = 0, Bj = 0;
        int Li = 0, Lj = 0;
        int Ri = 0, Rj = 0;
        for (int i = 0; i < 10; i++) {
            String str = br.readLine();
            for (int j = 0; j < 10; j++) {
                arr[i][j] = str.charAt(j);
                if (arr[i][j] == 'B') {
                    Bi = i; Bj = j;
                }
                if (arr[i][j] == 'L') {
                    Li = i; Lj = j;
                }
                if (arr[i][j] == 'R') {
                    Ri = i; Rj = j;
                }
            }
        }

        boolean istraight = (Li == Bi);
        boolean jstraight = (Lj == Bj);

        int dis = Math.abs(Bi - Li) + Math.abs(Bj - Lj) - 1;

        // 장애물이 같은 줄에 있는지 확인하고 그 사이에 있는지 확인
        if (istraight && (Ri == Bi) && ((Bj < Rj && Rj < Lj) || (Lj < Rj && Rj < Bj))) {
            System.out.print(dis + 2);
        } else if (jstraight && (Rj == Bj) && ((Bi < Ri && Ri < Li) || (Li < Ri && Ri < Bi))) {
            System.out.print(dis + 2);
        } else {
            System.out.print(dis);
        }
    }
}