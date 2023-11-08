import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        long a = sc.nextInt();
        long n = sc.nextInt();
        for(long i = 1;i<=n;i++){
            System.out.println(a+i*n);
        }
    }
}