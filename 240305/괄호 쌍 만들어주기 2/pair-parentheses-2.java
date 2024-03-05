import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int length = str.length();
        int cnt = 0;
        int start = 0;

        for(int i = 0; i < length - 1; i++) {
            if(str.charAt(i) == '(' && str.charAt(i + 1) == '(') {
            start = i;
            }
            else continue;
            for(int j = start + 1; j < length - 1; j++) {
                if(str.charAt(j) == ')' && str.charAt(j + 1) == ')')
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}