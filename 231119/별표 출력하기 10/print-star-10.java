import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        for(long i =1;i<=2*n;i++){
            if(i%2==0){
                for(long j = 1; j<=n+1-(i/2);j++){
                    System.out.print("* ");
                }
            }
            else {
                for(long j = 1;j<=(i+1)/2;j++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}