import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int cnt = 0;
        if(b - a == 2)
            cnt = 1;
            else if(b - a > 2) {
                cnt = 2;
            }
        
        if(c - b == 2) 
            cnt = 1;
            else if(c - b > 2) {
                cnt = 2;
            }
        

        System.out.print(cnt);
    }
}