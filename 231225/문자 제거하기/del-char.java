import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int len = s.length();

        while(len > 1){
            int n = sc.nextInt();
           
           if(n >= len)
           n = len - 1;

           s = s.substring(0,n) + s.substring(n+1);
           len--;

            System.out.println(s);
        }
    }
}