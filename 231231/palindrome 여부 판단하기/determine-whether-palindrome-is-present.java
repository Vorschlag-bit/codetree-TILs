import java.util.*;
public class Main {
    public static boolean palindrome(String A){
        StringBuffer sb = new StringBuffer(A);
        String reversed = sb.reverse().toString();
        if(A.equals(reversed))
        return true;
        else
        return false;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String A = sc.next();

        if(palindrome(A))
        System.out.print("Yes");
        else
        System.out.println("No");
    }
}