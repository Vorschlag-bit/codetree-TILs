import java.util.*;
public class Main {
    public static int sum(int n) {
        if(n == 1)
        return 1;
        if(n == 2)
        return 2;

        return sum(n-1) + sum(n/3);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(sum(n));
    }
}