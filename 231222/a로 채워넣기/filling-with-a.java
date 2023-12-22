import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String a = sc.next();

        int l = a.length();

        char[] arr = a.toCharArray();

        arr[1] = 'a';
        arr[l-2] = 'a';

        a = String.valueOf(arr);

        System.out.println(a);
    }
}