import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        long n = sc.nextInt();
        long a = 0;
        long cnt=0;
        for(long i = 1; i<=100;i++){
            n/=i;
            cnt+=1;
            if(n<=1){
                System.out.print(cnt);
                break;
            }
        }
    }
}