import java.util.*;
public class Main {
    public static int cnt = 0;
    
    public static int check(int n) {
        if(n == 1)
        return cnt;

        if(n%2==0){
            cnt++;
            return check(n/2);
        }
        else {
            cnt++;
            return check(3*n+1);
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(check(n));
    }
}