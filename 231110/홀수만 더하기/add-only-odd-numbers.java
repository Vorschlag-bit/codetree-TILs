import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long sum = 0;
        for(long i=1;i<=n;i++){
            long a = sc.nextInt();
            if(a%2==1&&a%3==0){
                sum+=a;
            }
        }
        System.out.print(sum);
    }
}