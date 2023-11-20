import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long cnt=9;
        for(long i = 0; i<n; i++){
            for(long j = 0; j<n; j++){
                System.out.print(cnt);
                cnt--;
                if(cnt==0)
                cnt=9;
            }
            System.out.println();
        }
    }
}