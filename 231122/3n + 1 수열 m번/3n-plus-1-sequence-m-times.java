import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        long m = sc.nextLong();
        for(long i = 0;i<m;i++){
            long n = sc.nextLong();
            long cnt=0;
            while(n!=1){
            if(n%2==1){
                n=3*n+1;
                cnt++;
            }
            else{
                n/=2;
                cnt++;
            }}
            System.out.println(cnt);
        }
    }
}