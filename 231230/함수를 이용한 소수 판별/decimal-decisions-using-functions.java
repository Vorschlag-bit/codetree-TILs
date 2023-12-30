import java.util.*;
public class Main {
    public static boolean prime(int n){
        for(int i = 2; i<n; i++){
            if(n%i==0)
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = 0;

        for(int i = a; i<=b; i++){
            if(prime(i)&&i>1)
            sum += i;
        }

        System.out.println(sum);
    }
}