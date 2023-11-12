import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        long cnt=0;
        boolean state = true;
        for(long i = 1; i<=5;i++){
            long a = sc.nextLong();
            if(a%3!=0){
            state = false;
            break;
        }
        }
        if(state==true){
            System.out.print(1);
        }
        else System.out.print(0);
    }
}