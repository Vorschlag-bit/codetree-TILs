import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int cnt = 0;

        for(int i = x; i <= y; i++) {
            //펠린드롬 저장할 배열 생성, 최대 크기 백만이므로 7
            String num = Integer.toString(i);
            int l = num.length();
            boolean Check = true;
            for(int j = 0; j < l / 2; j++) {
                if(num.charAt(j) != num.charAt(l - j - 1)) {
                    Check = false;
                    break;
                }
            }
            if(Check) cnt++;
        }
        System.out.println(cnt);
    }
}