import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int len = s.length();

        String com = sc.next();

        for(int i = 0; i<com.length(); i++){
            if(com.charAt(i)=='L'){
                s = s.substring(1,len) + s.substring(0,1);
            }
            else if(com.charAt(i)=='R')
            s = s.substring(len-1) + s.substring(0,len-1);
        }
        System.out.print(s);
    }
}