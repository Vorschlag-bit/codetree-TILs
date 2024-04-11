import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        int time = 0;
        int speed = 1;
       
        while (true) {
            time++;
            x -= speed;

            if(x == 0) break;
            
            // 현재 속도에서 1초 후의 거리를 계산하여 최소 거리를 구함
            int nextMinDistance = (speed + 1) * (speed + 2) / 2;
            
            // 남은 거리가 최소 거리보다 크면 속도를 증가시킴
            if (x >= nextMinDistance) {
                speed++;
            }
            else if(x >= speed * (speed + 1) / 2){
                //아무것도 안 함
            }
            // 그 외의 경우에는 속도를 감소시킴
            else speed--;
        }
        System.out.print(time);
    }
}