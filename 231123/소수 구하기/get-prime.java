import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        for(long i =1;i<=n;i++){
            long cnt = 0;
            for(long j = 1;j<=i;j++){
                if(i%j==0&&i!=1)
                cnt++;
            }
            if(cnt==2)
            System.out.print(i+" ");
        }
    }
}