import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        for(long i =1;i<10;i++){
            for(long j =1;j<b/a+1;j++){
                System.out.print((b-2*(j-1))+" * "+i+" = "+(b-2*(j-1))*i);
                if(j<b/a)
                System.out.print(" / ");
            }
            System.out.println();
        }
    }
}