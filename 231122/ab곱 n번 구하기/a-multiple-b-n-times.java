import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        for(long i =0;i<n;i++){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long sum = 1;
            for(long j =a;j<=b;j++){
                sum*=j;
            }
            System.out.println(sum);
        }
    }
}