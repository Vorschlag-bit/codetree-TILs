import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int cnt = 0; //index가 어디까지 있는지 표시하기 위한 변수.
        int[] list = new int[30];
        while(true) {
            if(n < 2){
                list[cnt++] = n;
                break;
            }

            list[cnt++] = n%2;
            n /= 2;
        }

        for(int i = cnt - 1; i >= 0; i--) {
            System.out.print(list[i]);
        }
    }
}