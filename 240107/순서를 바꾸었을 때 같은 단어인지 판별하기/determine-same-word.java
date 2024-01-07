import java.util.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String s1 = sc.next();

        boolean check = false;

        char[] char1 = s.toCharArray();
        char[] char2 = s1.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        String ss = new String(char1);
        String ss1 = new String(char2);
        

        if(ss.equals(ss1))
        check = true;

        if(check)
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}