import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        int len = A.length();

        int cnt = 0;

            for(int i = 0; i<A.length(); i++){
                A = A.charAt(len - 1) + A.substring(0, len - 1);
                cnt++;
                if(A.equals(B))
            break;
            }

            if(cnt == len){
            cnt = -1;
            }

        System.out.println(cnt);
    }
}