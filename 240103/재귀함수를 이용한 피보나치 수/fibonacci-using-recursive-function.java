import java.util.*;
public class Main {
    public static int Pibonacci(int n) {
        if(n == 1)
        return 1;
        if(n == 2)
        return 1;

        return Pibonacci(n-1) + Pibonacci(n-2);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(Pibonacci(n));
    }
}