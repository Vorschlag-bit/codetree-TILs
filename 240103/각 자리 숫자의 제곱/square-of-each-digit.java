import java.util.*;
public class Main {
    public static int ssum(int n){
        if(n<10)
        return n*n;

        return ssum(n/10) + (n%10)*(n%10);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(ssum(n));
    }
}