import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long pr = 1;
        for(long i =a;i<=b;i++){
            pr*=i;
        }
        System.out.print(pr);
    }
}