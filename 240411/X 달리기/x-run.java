import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        int time = 1;
        int speed = 1;
       
       while(x > 0) {
         if(speed < 1) break;
        time++;
        x -= speed;
        //속도를 1높일 경우 필요한 최소 거리
        int mindis = (speed + 2) * (speed + 1)/2;
        if(mindis < x) {
            speed++;
        }
        //감속
        if(mindis > x) {
            speed--;
        }
       }
       System.out.print(time);
    }
}