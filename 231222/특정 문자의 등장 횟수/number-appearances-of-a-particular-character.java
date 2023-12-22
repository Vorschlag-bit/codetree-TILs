import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int cnt1 = 0;

        int cnt2 = 0;

        for(int i = 0; i<s.length()-1; i++){
            if(s.charAt(i)=='e'&&s.charAt(i+1)=='e')
            cnt1++;
            if(s.charAt(i)=='e'&&s.charAt(i+1)=='b')
            cnt2++;
        }

        System.out.print(cnt1+" "+cnt2);
    }
}