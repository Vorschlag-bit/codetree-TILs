import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String A = sc.next();

        String B = sc.next();

        int cnt = 0;

        for(int i = 0; i<A.length()-1; i++){
                if(A.charAt(i)==B.charAt(0)&&A.charAt(i+1)==B.charAt(1))
                cnt++;
            }
        System.out.println(cnt);
    }
}