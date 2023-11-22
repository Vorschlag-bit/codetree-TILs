import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        long start = sc.nextLong();
        long end = sc.nextLong();
        long cut = 0;
        for(long i = start;i<=end;i++){
            long cnt = 0;
            for(long j = 1;j<=i;j++){
                if(i%j==0)
                cnt++;
            }
            if(cnt==3)
            cut++;
        }
        System.out.print(cut);
    }
}