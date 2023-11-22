import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        for(long i = 0;i<n;i++){
            for(long j = 1;j<=n-i;j++){
                if(j!=n-i)
                System.out.print((i+1)+" * "+j+" = "+(i+1)*j+" / ");
                else
                System.out.println((i+1)+" * "+j+" = "+(i+1)*j);
            }
        }
    }
}