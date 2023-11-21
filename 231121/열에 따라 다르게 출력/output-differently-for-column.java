import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        for(long i = 0;i<n;i++){
            for(long j = 0; j<n;j++){
                if(i==0)
                System.out.print(j+1+" ");
                else if(i%2==0)
                System.out.print((i*n)+j+1+n+" ");
                else
                System.out.print((i*n)+2*(j+1)+" ");
            }
            System.out.println();
        }
    }
}