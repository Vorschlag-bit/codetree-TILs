import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        for(int i = 0; i<s.length(); i++){
            if(Character.isLowerCase(s.charAt(i)))
            System.out.print((char)(s.charAt(i)-32));
            else
            System.out.print((char)(s.charAt(i)+32));
        }
    }
}