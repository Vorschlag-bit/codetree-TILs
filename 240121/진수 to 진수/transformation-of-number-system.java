import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        String n = br.readLine();
        int num = 0;

        for(int i = 0; i < n.length(); i++) {
            num = num * a + (n.charAt(i) - '0');
        }

        int cnt = 0;
        int[] list = new int[50];

        while(true) {
            if(num < b){
                list[cnt++] = num;
                break;
            }

            list[cnt++] = num%b;
            num /= b;
        }

        for(int i = cnt - 1; i >= 0; i--) {
            System.out.print(list[i]);
        }
    }
}