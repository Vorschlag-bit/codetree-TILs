import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        for(long j= 1;j<=2*n;j++){
            System.out.print("*");
        }
        System.out.println();
        for(long i = 1; i<n;i++){
            for(long j =i;j<n;j++){
                System.out.print("*");
            }
            for(long j = 1;j<=i;j++){
                System.out.print("  ");
            }
            for(long j = i;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}