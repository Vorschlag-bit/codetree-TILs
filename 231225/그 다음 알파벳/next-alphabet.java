import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char a = sc.next().charAt(0);

        int b = (int) a;

        if(a=='z')
        System.out.print('a');
        else
        System.out.print((char)(b+1));
    }
}