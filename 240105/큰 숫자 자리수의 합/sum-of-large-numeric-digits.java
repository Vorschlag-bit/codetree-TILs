import java.util.*;
public class Main {
    public static int sum(int n) {
        if(n < 10)
        return n;

        return sum(n/10) + n%10;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int n = n1*n2*n3;

        System.out.print(sum(n));
    }
}