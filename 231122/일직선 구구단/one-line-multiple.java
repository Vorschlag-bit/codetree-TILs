import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        for(long i =1; i<=n; i++){
            for(long j = 1 ;j<=n; j++){
                System.out.println(i+" * "+j+" = "+i*j);
            }
        }
    }
}