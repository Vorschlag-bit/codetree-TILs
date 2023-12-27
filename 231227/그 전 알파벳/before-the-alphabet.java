import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char A = sc.next().charAt(0);

        if(A == 'a')
        System.out.println('z');
        else
        System.out.println((char)(A-1));
    }
}