import java.util.*;
public class Main {
    public static boolean mcheck(int n){
        if(n>=1&&n<=12)
        return true;
        else
        return false;
    }
    public static boolean dcheck(int n, int n1){
        boolean day = false;
        if(n == 1 || n == 3 || n == 5 || n ==7 || n == 8 || n == 10 || n == 12){
            if(n1>=1&&n1<=31)
            day = true;
        }
        if(n == 4 || n == 6 || n == 9 || n == 11){
            if(n1>=1&&n1<=30)
            day = true;
        }
        else
        if(n1>=1&&n1<=28)
        day = true;

        return day;

    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int D = sc.nextInt();

        if(mcheck(M)&&dcheck(M,D))
        System.out.println("Yes");
        else
        System.out.println("No");

    }
}