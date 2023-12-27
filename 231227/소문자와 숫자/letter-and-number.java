import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int len = s.length();

        s = s.toLowerCase();

        for(int i = 0; i<len; i++){
            if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i)))
            System.out.print(s.charAt(i));
        }
    }
}