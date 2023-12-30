import java.util.*;
public class Main {
    public static int cal(int n, char s, int m){
        if(s=='+')
        return n+m;
        if(s=='-')
        return n-m;
        if(s=='*')
        return n*m;
        if(s=='/')
        return n/m;
        else
        return 10001;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        char b = sc.next().charAt(0);
        int c = sc.nextInt();

        if(cal(a,b,c)==10001)
        System.out.println("False");
        else
        System.out.println(a+" "+b+" "+c+" = "+cal(a,b,c));
    }
}