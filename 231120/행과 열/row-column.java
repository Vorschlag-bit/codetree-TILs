import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        for(long i = 1;i<=a;i++){
            for(long j = 1; j<=b;j++){
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }
}