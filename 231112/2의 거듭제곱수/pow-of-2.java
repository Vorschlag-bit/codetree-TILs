import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long cnt = 0;
        while(n!=1){
            n/=2;
            cnt+=1;
        }
        System.out.print(cnt);
    }
}