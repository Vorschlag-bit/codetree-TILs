import java.util.*;
public class Main {
    public static String check(String A){
        int cnt = 0;
        int len = A.length();
        for(int i = 0; i < len - 1; i++){
            if(A.charAt(i) != A.charAt(i+1))
            cnt++;
        }

        if(cnt>0)
        return "Yes";
        else
        return "No";
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String A = sc.next();


        System.out.println(check(A));
    }
}