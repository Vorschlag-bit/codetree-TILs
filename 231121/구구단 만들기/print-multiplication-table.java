import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        for(long i = 1;i<10;i++){
            for(long j = 0;j<(b-a)/2+1;j++){
                System.out.print(b-2*j+" * "+i+" = "+(b-2*j)*i);
                if(j<(b-a)/2)
                System.out.print(" / ");
            }
            System.out.println();
        }
    }
}