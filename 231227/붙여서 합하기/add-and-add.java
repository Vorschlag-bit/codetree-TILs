import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        int ia = Integer.parseInt(A+B);
        int ib = Integer.parseInt(B+A);

        String a = String.valueOf(ia+ib);

        System.out.println(a);
    }
}