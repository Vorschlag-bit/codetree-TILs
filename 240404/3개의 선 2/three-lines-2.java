import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] x = new int[n];
        int[] y = new int[n];

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }
        boolean Check = false;
        for(int i = 0; i <= 10; i++) {
            //x축에 평행한 직선을 완전탐색하는 반복문
            int cnt = 0; //직선개수 변수.
            for(int j = 0; j <= 10; j++) {
                //y축에 평행한 직선을 완전탐색하는 반복문
                for(int k = 0; k < n; k++) {
                    if(x[k] == i) cnt++;

                    if(y[k] == j) cnt++;
                }
                if(cnt == 3) Check = true;
            }
        }
        if(Check) System.out.print(1);
        else System.out.print(0);
    }
}