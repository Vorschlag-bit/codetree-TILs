import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        long n = sc.nextInt();
        for(long i = 1; i<=n;i++){
            long a = sc.nextInt();
            if(a%3==0&&a%2==1){
                System.out.println(a);
            }
        }
    }
}