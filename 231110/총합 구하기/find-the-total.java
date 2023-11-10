import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long sum=0;
        for(long i =a;i<=b;i++){
            if(i%6==0&&i%8!=0){
                sum+=i;
            }
        }
        System.out.print(sum);
    }
}