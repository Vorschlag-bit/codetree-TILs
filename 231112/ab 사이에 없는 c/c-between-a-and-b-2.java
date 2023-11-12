import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        boolean state = true;
        for(long i =a; i<=b;i++){
            if(i%c==0){
                state = false;
            }
        }
        if(state==true){
                System.out.print("YES");
            }
            else System.out.print("NO");
    }
}