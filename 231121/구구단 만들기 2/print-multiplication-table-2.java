import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        for(long i = 1;i<=4;i++){
            for(long j = b;j>=a;j--){
                System.out.print(j+" * "+2*i+" = "+2*j*i);
                if(j>a)
                System.out.print(" / ");
            }
            System.out.println();
        }
    }
}