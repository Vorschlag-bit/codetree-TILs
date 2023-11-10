import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long prod =1;
        for(long i =1;i<=b;i++){
            prod*=a;
        }
        System.out.print(prod);
    }
}