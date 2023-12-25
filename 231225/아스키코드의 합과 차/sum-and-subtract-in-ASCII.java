import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char s = sc.next().charAt(0);
        char d = sc.next().charAt(0);

        int a = (int) s;
        int b = (int) d;

        System.out.print(a+b+" ");
        if(a>b)
        System.out.print(a-b);
        else
        System.out.print(b-a);
    }
}