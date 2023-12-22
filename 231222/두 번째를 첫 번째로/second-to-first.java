import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        char a = s.charAt(0);
        char b = s.charAt(1);

        char[] arr = s.toCharArray();

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == b)
            arr[i] = a;
        }

        s = String.valueOf(arr);

        System.out.println(s);
    }
}