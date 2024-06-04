import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] x = new int[4];
        int[] y = new int[4];

        for(int i = 0; i < 4; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int maxx = 0, maxy = 0, miny = 10, minx = 10;
        for(int i = 0; i < 4; i++) {
            if(maxx < x[i]) maxx = x[i];
            if(maxy < y[i]) maxy = y[i];
            if(minx > x[i]) minx = x[i];
            if(miny > y[i]) miny = y[i];
        }

        int ans = Math.max((maxx -minx), (maxy - miny));
        System.out.println(ans * ans);
    }
}