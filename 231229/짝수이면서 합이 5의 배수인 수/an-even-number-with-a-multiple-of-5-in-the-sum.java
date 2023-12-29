import java.util.*;
public class Main {
    public static boolean iswhat(int n){
        return n%2==0&&(n/10+n%10)%5==0;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(iswhat(num))
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}