import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        String a  = sc.next();

        char n = sc.next().charAt(0);

        int index = 0;

        index = a.indexOf(n);

        if(index == -1)
        System.out.println("No");
        else
        System.out.println(index);
    }
}