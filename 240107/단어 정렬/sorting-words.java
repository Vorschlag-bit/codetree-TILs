import java.util.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] s = new String[n];

        for(int i = 0; i < n; i++){
            s[i] = sc.next();
        }

        Arrays.sort(s);

        for(int i = 0; i < n; i++){
            System.out.println(s[i]);
        }
    }
}