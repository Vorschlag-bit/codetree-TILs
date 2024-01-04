import java.util.*;
public class Main {
    public static int check(int n) {
        if(n==2)
        return 2;
        if(n==1)
        return 1;

        if(n%2==0)
        return check(n-2) + n;
        else
        return check(n-2) + n;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(check(n));
    }
}