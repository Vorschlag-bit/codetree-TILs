import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String str = br.readLine();

        int ans = 1;
        for(int i = 1; i < n; i++) {

            boolean Check = false;

            for(int j = 0; j <= n - i; j++)
            for(int k = j + i; k <= n - i; k++) {

                boolean same = true;

                for(int l = 0; l < i; l++) {
                    if(str.charAt(j + l) != str.charAt(k + l))
                    same = false;
                }

                if(same) Check = true;
            }
            if(Check) ans = i + 1;
            else break;
        }
        System.out.println(ans);
    }
}