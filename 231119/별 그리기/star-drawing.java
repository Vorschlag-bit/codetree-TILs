import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        for(long i =0;i<n;i++){
            for(long j = n-i-1;j>0;j--){
                System.out.print(" ");
            }
            for(long j = 0;j<n-2+2*i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(long i = 0;i<n-1;i++){
            for(long j=0;j<i+1;j++){
                System.out.print(" ");
            }
            for(long j=2*n-3-2*i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}