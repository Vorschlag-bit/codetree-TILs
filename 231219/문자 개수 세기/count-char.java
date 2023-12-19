import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String str2 = sc.nextLine();

        char[] Arr = str.toCharArray();

        int cnt = 0;

        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)==str2.charAt(0))
            cnt++;
        }
        System.out.print(cnt);
    }
}