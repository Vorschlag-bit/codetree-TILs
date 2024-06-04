import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] x = new int[4];
        int[] y = new int[4];

        for(int i = 0; i < 4; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int minx = 100, maxy = 0, maxx = 0, miny = 100;
        for(int i = 0; i < 4; i++) {
            if(x[i] < minx) minx = x[i];
            if(y[i] > maxy) maxy = y[i];
            if(x[i] > maxx) maxx = x[i];
            if(y[i] < miny) miny = y[i];
        }

        System.out.print((maxx - minx) * (maxy - miny));
    }
}