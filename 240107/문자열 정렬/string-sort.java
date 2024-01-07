import java.util.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String str = new String(chars);

        System.out.println(str);
    }
}