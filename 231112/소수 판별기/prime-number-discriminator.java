import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        boolean state = true;
        for(long i = 2;i<n;i++){
            if(n%i==0){
                state = false;
            }
        }
        if(state==true){
            System.out.print("P");
        }
        else System.out.print("C");
    }
}