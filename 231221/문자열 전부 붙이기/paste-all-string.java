import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String a = "";

        for(int i = 0; i<n; i++){
            a += sc.next();
        }

        System.out.print(a);
    }
}