import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        boolean state = false;
        for(long i= a; i<=b;i++){
            if(1920%i==0&&2880%i==0){
                state = true;
            }
        }
            if(state==true){
                System.out.print(1);
            }
            else System.out.print(0);
    }
}