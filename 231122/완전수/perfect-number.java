import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long cnt = 0;
        for(long i =a;i<=b;i++){
            long sum = 0;
            for(long j = 1;j<i;j++){
                if(i%j==0){
                sum+=j;
                if(sum==i)
                cnt++;}
            }
        }
        System.out.print(cnt);
    }
}