import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long cnt = 1;
        long minus = 0;
        for(long i = 0; i<n; i++){
            for(long j = 0; j<n; j++){
                if(i%2==0){
                    System.out.print(cnt+" ");
                    cnt++;
                }
                else{
                System.out.print(cnt+n-2*minus-1+" ");
                cnt++;
                minus++;
                }
            }
            System.out.println();
        }
    }
}