import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long sum=0;
        long cnt=0;
        double avg;
        for(long i =1;i<=n;i++){
            long a = sc.nextInt();
            if(a>=0&&a<=200){
                sum+=a;
                cnt+=i;
                double avg = (double)sum/cnt;
            }
        }
        System.out.printf("%d %.1f", sum, avg);
    }
}