import java.util.*;
public class Main {
    public static int Arr(int n) {
        if(n==1)
        return 2;
        if(n==2)
        return 4;

        return (Arr(n-1) * Arr(n-2))%100;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(Arr(n));
    }
}