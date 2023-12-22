import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        char[] arr1 = A.toCharArray();
        char[] arr2 = B.toCharArray();

        arr2[0] = arr1[0];
        arr2[1] = arr1[1];

        B = String.valueOf(arr2);

        System.out.println(B);
    }
}