import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int len = s.length();

        for(int i = 0; i<len; i++){
            if(s.charAt(i) == 'e'){
                s = s.substring(0,i) + s.substring(i+1);
                break;
            }
        }

        System.out.println(s);
    }
}