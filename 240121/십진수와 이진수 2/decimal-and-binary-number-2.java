import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String n = st.nextToken();
        int num = 0;

        for(int i = 0; i < n.length(); i++){
            num = num * 2 + (n.charAt(i) - '0');
        }

        num = num * 17;

        int[] list = new int[50];
        int cnt = 0;
        while(true) {
            if(num < 2) {
                list[cnt++] = num;
                break;
            }

            list[cnt++] = num%2;
            num /= 2;
        }

        for(int i = cnt - 1; i >= 0; i--) {
            System.out.print(list[i]);
        }
    }
}