import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i < x; i++) {
            int speed = 1;
            int time = 0;
            int road = 0;
            while (road < x) {
                road += speed;

                if (time >= 1 && road < i) {
                    speed++;
                } else if (speed > 1) {
                    speed--;
                }

                time++;
            } 
            if (speed == 1) {
                ans = Math.min(ans, time);
            }
        }

        System.out.print(ans);
    }
}