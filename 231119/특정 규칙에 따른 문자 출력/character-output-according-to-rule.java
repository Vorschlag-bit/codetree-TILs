import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        for(long i =1;i<=n;i++){
            for(long j = 0;j<n-i;j++){
                System.out.print("  ");
            }
            for(long j =0;j<i;j++){
                System.out.print("@ ");
            }
            System.out.println();
        }
        for(long i = 1;i<=n-1;i++){
            for(long j =n-i;j>=1;j--){
                System.out.print("@ ");
            }
            System.out.println();
        }
    }
}